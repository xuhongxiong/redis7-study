package com.atguigu.redis7.mapper;


import com.atguigu.redis7.model.Author;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
//@Repository
public interface AuthorMapper {
    public List<Author> queryAuthorList();
}
