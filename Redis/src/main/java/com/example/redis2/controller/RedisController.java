package com.example.redis2.controller;

import com.example.redis2.Service.RedisPubService;
import com.example.redis2.model.ChatMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class RedisController {
    private final RedisPubService redisPubService;

    @PostMapping("api/chat")
    public String pubSub(@RequestBody ChatMessage chatMessage) {
        //메시지 보내기
        redisPubService.sendMessage(chatMessage);

        return "success";
    }
}
