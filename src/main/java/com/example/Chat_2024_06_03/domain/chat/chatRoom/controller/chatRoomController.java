package com.example.Chat_2024_06_03.domain.chat.chatRoom.controller;

import lombok.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/chat/room")
public class chatRoomController {
    @GetMapping("{roomId}")
    @ResponseBody
    public String showRoom(
            @PathVariable("roomId") final long roomId,
            @RequestParam(value = "writerName",defaultValue = "NoName") final String writerName

    ){
        return "%d번 채팅방입니다. writer : %s".formatted(roomId, writerName);

    }
    @GetMapping("/make")
    @ResponseBody
    public String showMake(){
        return """
                <form action="">
                  <div>
                    <input type="text">
                  </div>
                  <div>
                    <input type="submit">
                  </div>
                </form>
              """.stripIndent();
    }
    

}
