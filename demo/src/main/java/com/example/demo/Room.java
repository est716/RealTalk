package com.example.demo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

import lombok.Getter;

@Getter
public class Room {
    private String roomId;
    private List<User> users;
    private TalkSpace talkSpace;

    public Room() {
        this.roomId = UUID.randomUUID().toString();
        this.users = new LinkedList<User>();
        this.talkSpace = new TalkSpace(new ArrayList<String>());
    }

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
