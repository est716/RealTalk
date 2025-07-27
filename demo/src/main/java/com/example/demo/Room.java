package com.example.demo;

import java.util.LinkedList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter

public class Room {
    private String roomId;
    private List<User> users;
    private TalkSpace talkSpace;

    public void addUser(User user) {
        if (users == null) {
            users = new LinkedList<User>();
        }
        users.add(user);
    }

    public void removeUser(User user){
        if(users.contains(user)){
            int index = users.indexOf(user);
            users.remove(index);
        }
    }
}
