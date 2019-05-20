package com.vitshch.rssagg.controller;

import com.vitshch.rssagg.service.ChannelService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeedController {

    private final ChannelService channelService;

    public FeedController(ChannelService channelService) {
        this.channelService = channelService;
    }

    @GetMapping("/")
    public ResponseEntity getChannel() {
        return ResponseEntity.ok()
                .body(channelService.getChannels());
    }

}
