package com.study.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BoardController {

    @GetMapping("/board/write") //어떤 url로 접근할것인지 지정하는 어노테이션 //localhost:8090/board/write
    public String boardWriteForm() {

        return "boardWrite";
    }
}
