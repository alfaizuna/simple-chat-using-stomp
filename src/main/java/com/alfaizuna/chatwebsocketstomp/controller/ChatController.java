package com.alfaizuna.chatwebsocketstomp.controller;

import com.alfaizuna.chatwebsocketstomp.dto.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {

    @MessageMapping("/chat")
    @SendTo("/topic/chat")
    public Message chat(Message message) {
        return message;
    }
}
