package com.example.bookstoreappp.dto;

import com.example.bookstoreappp.model.Book;

public class ResponseDto {
    private String message;
    private   Object data;

    public ResponseDto(String message, Object data) {
        this.message = message;
        this.data = data;
    }

    public ResponseDto() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResponseDto{" +
                "message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
