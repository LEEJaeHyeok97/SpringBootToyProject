package com.study.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BoardController {

    @GetMapping("/") // localhost 8080 역슬래시 경로로 들어 왔을때
    @ResponseBody // 글자를 띄워주는 어노테이션
    public String main() {
        return "Hello World";
    }
}
