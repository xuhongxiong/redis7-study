package com.atguigu.redis7.controller;

import com.atguigu.redis7.impl.OrderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/order")
@Slf4j
@Api(tags = "订单")
public class OrderController {
    @Resource
    private OrderService orderService;

    @PostMapping("/add")
    @ApiOperation("新增订单")
    public void addOrder(){
        orderService.addOrder();
    }

    @GetMapping("/order")
    @ApiOperation("查询订单")
    public String getOrderById(@RequestParam Integer id){
        return orderService.getOrderById(id);
    }
}
