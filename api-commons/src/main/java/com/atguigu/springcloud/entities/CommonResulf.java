package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResulf<T> {

private Integer code;
private String message;
private T   data;

public CommonResulf(Integer code,String message){
    this(code,message,null);
}


}
