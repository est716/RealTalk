package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class MessageBody {
    private String roomId;
    private TalkSpace talkSpace;
}
