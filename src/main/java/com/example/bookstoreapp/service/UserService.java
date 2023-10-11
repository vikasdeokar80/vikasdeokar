package com.example.bookstoreappp.service;
import com.example.bookstoreappp.dto.LoginDto;
import com.example.bookstoreappp.dto.ResponseDto;
import com.example.bookstoreappp.dto.UserDto;
import com.example.bookstoreappp.model.User;
import com.example.bookstoreappp.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService  implements IUserService {

    @Autowired
    UserRepo userRepo;


    @Override
    public User register(UserDto userDto){
        User user= new User(userDto);
        System.out.println(user);
        return userRepo.save(user);

    };

    @Override
    public List<User> getAll(){
        return userRepo.findAll();
    }

    @Override
    public User getById(int id){
        if (userRepo.existsById(id)) {
            return userRepo.findById(id).get();}
        return userRepo.findById(id).get();
    }

    @Override
    public User getByEmail(String email){
        User user =  userRepo.findUserByEmail(email);
        return user;
    }



    @Override
    public Object updateByEmail(String email, UserDto userDto) {
        User user = userRepo.findUserByEmail(email);
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        user.setEmail(userDto.getEmail());
        user.setAddress(userDto.getAddress());
        user.setDOB(userDto.getDOB());
        user.setPassword(userDto.getPassword());

        User user1 = userRepo.save(user);
        ResponseDto responseDto = new ResponseDto("User updated successfully",user1);
        return new ResponseEntity<>(responseDto,HttpStatus.ACCEPTED);


    }
    @Override
    public Object updateById(int id, UserDto userDto) {
        if (userRepo.existsById(id)) {
            User user = new User(userDto);
            user.setUserId(id);
            User user1 = userRepo.save(user);
            ResponseDto responseDto = new ResponseDto("Data updated", user1);
            return new ResponseEntity<>(responseDto, HttpStatus.OK);

        } else {
            return "enter correct id";
        }

    }



    @Override
    public User forgotPassword(String email, String password){
        User user = userRepo.findByEmail(email);
        user.setPassword(password);
        return userRepo.save(user);
    }


    public Object login(LoginDto loginDto) {
        User user = userRepo.findByEmail(loginDto.getEmail());
        if (user.getPassword().equals(loginDto.getPassword())){

            return "Login success";
        }
        else return "Enter correct email id";

    }

    @Override
    public User updateByEmail(String email) {
        return null;
    }

    @Override
    public Object login(String email, String password) {
        return null;
    }

    @Override
    public void deleteById(int id) {
        userRepo.deleteById(id);
    }

    public Object resetPassword(String email,String oldPassword, String newPassword){
        User user = userRepo.findByEmail(email);
        if (oldPassword.equals(user.getPassword())){
            user.setPassword(newPassword);
            userRepo.save(user);
            return true;
        }
        return false;
    }



}
