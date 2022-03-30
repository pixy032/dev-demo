package com.example.demo.entity;

import java.util.Date;
import lombok.Data;

@Data
public class UserEntity {

    public Integer id;

    public String username;

    public String password;

    public String email;

    public Date time;
}
