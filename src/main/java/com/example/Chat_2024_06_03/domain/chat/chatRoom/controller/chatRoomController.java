package com.example.Chat_2024_06_03.domain.chat.chatRoom.controller;

import lombok.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class chatRoomController {
    @GetMapping("/chat/room/1")
    @ResponseBody
    public String showRoom(){
        return "1번 채팅방입니다.";

    }

}
