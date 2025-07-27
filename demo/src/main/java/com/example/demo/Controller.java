package com.example.demo;

import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class Controller {
    private ChartService chartService;

    @PostMapping("/createChartService")
    public String createChartService(User user){
        if (this.chartService == null) {
            this.chartService = new ChartService();
        }
        if (user != null && user.getUserId() != null) {
            this.chartService.getRoom().addUser(user);
            return "success";
        }
        return "failure";
    }
    
    @GetMapping("/{roomId}")
    public MessageBody getMessageBody(@PathVariable String roomId) {
        Room room = chartService.getRoom();
        if (room != null && room.getRoomId().equals(roomId)) {
            return new MessageBody(roomId, room.getTalkSpace());
        }
        return null; // or throw an exception
    }



}
