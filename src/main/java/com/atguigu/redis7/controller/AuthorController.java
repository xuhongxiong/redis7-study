package com.atguigu.redis7.controller;

import com.atguigu.redis7.mapper.AuthorMapper;
import com.atguigu.redis7.model.Author;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/author")
@Slf4j
@Api(tags = "用户")
public class AuthorController {

    @Autowired
    private AuthorMapper authorMapper;
    @GetMapping("/show")
    @ApiOperation("show")
    public String show(){
        return "show";
    }

    @GetMapping("/query")
    @ApiOperation("查询")
    public List<Author> query(){
        List<Author> authors = authorMapper.queryAuthorList();
        return authors;
    }
}
