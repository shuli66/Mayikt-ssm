package com.mayikt.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandler extends BaseController {
    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public Map<String, Object> handleException(HttpServletRequest h, Exception e) {
        System.out.println("自定义异常：" + e);
        return setResultError("系统发生了错误!");
    }
}
