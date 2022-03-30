package com.example.demo.entity;

import java.util.Date;
import lombok.Data;

@Data
public class UserEntity {

    public Integer id;

    public String name;

    public String email;

    public Date time;
}
