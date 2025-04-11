package com.hasanmumin.ai.controller;

import com.hasanmumin.ai.service.ChatService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequiredArgsConstructor
public class ChatController {

    private final ChatService chatService;

    @PostMapping("/ai")
    public Flux<String> generation(@RequestBody String userInput) {
        return this.chatService.generation(userInput);
    }
}
