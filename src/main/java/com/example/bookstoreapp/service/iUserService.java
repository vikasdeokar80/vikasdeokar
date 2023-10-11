package com.example.bookstoreappp.service;
import com.example.bookstoreappp.dto.LoginDto;
import com.example.bookstoreappp.dto.UserDto;
import com.example.bookstoreappp.model.User;

import java.util.List;
public interface IUserService {
    public Object updateById(int id, UserDto userDto);
    public User register(UserDto userDto);
    public List<User> getAll();
    public User getById(int id);
    public void deleteById(int id);
    public User forgotPassword(String email, String password);
    public Object updateByEmail(String email,UserDto userDto);
    public Object resetPassword(String email,String oldPassword, String newPassword);

    public User getByEmail(String email);
    public Object login(LoginDto loginDto);

      public User updateByEmail(String email);

  // public  updateByEmail(String email, UserDto userDto);

  //public Object updateByEmail(String email, UserDto userDto);
  public Object login(String email, String password);




}
