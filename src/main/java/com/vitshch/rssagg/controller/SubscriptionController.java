package com.vitshch.rssagg.controller;

import com.vitshch.rssagg.dto.SubscriptionDto;
import com.vitshch.rssagg.service.SubscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("subscription")
public class SubscriptionController {

    private final SubscriptionService subscriptionService;

    @Autowired
    public SubscriptionController(SubscriptionService subscriptionService) {
        this.subscriptionService = subscriptionService;
    }

    @GetMapping
    public ResponseEntity<List<SubscriptionDto>> getAllSubscriptions() {
        List<SubscriptionDto> subscriptions = subscriptionService.getAllSubscriptions();
        return ResponseEntity.ok().body(subscriptions);
    }

    @PostMapping
    public ResponseEntity<SubscriptionDto> addSubscription(@RequestBody SubscriptionDto subscription) {
        SubscriptionDto createdSubscriptionDto = subscriptionService.saveSubscription(subscription);
        return ResponseEntity.ok(createdSubscriptionDto);
    }
}
