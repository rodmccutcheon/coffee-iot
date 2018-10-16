package com.rodmccutcheon.coffeeiot.controllers;

import com.rodmccutcheon.coffeeiot.model.Notification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {

    @Autowired
    private SimpMessagingTemplate template;

    private Notification notification = new Notification(0);

    @GetMapping("/notify")
    public String getNotification() {

        notification.increment();

        template.convertAndSend("/topic/notification", notification);

        return "Notifications successfully sent to Angular !";
    }
}