package com.atguigu.redis7.impl;

import com.atguigu.redis7.mapper.AuthorMapper;
import com.atguigu.redis7.model.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AuthorService {
    @Autowired
    private AuthorMapper authorMapper;
    @Transactional
    public List<Author> queryAuthorList(){
        return authorMapper.queryAuthorList();
    }
}
