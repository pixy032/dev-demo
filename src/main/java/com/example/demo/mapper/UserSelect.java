package com.example.demo.mapper;

import com.example.demo.entity.UserEntity;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserSelect {

    List<UserEntity> selectByName(Integer id);
}
