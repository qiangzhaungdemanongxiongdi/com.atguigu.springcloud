package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResulf;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@Slf4j
public class PaymentController {
@Resource
private PaymentService paymentService;

@PostMapping(value = "/payment/create")
     public CommonResulf  create(@RequestBody Payment payment){
          int result = paymentService.create(payment);
                  log.info("******插入结果: " + result);
                  if (result > 0) {
                       return new CommonResulf(200, "插入数据库成功", result);
                  }else {
                       return new CommonResulf(444, "插入数据库失败");
                  }
                  }
     @GetMapping(value = "/payment/get/{id}")
     public CommonResulf<Payment>  getPaymentById(@PathVariable("id") Long id){
          Payment payment = paymentService.getPaymentById(id);
          log.info("******插入结果: " + payment);
          if (payment != null) {
               return new CommonResulf(200, "查询成功", payment);
          }else {
               return new CommonResulf(444, "查询失败" + id,null);
          }
     }

     }







