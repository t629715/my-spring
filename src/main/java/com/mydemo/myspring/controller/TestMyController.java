package com.mydemo.myspring.controller;

import com.mydemo.myspring.annotation.MyController;
import com.mydemo.myspring.annotation.MyRequestMapping;
import com.mydemo.myspring.annotation.MyResponseBody;

@MyController
@MyRequestMapping("/testController")
public class TestMyController {
    @MyRequestMapping("/test1")
    @MyResponseBody
    public String test1(String msg){
        return msg;
    }
}
