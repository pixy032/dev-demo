package com.example.demo;

import com.example.demo.entity.UserEntity;
import com.example.demo.mapper.UserSelect;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemoApplication {

    @Autowired
    private UserSelect userSelect;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @RequestMapping("/")
    public String index() {
        List<UserEntity> userEntity = userSelect.selectByName(3);

        return userEntity.toString();
    }
}
