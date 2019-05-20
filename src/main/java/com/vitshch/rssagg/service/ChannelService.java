package com.vitshch.rssagg.service;

import com.vitshch.rssagg.entity.Channel;
import com.vitshch.rssagg.repository.ChannelRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChannelService {

    private final ChannelRepository channelRepository;

    public ChannelService(ChannelRepository channelRepository) {
        this.channelRepository = channelRepository;
    }

    public List<Channel> getChannels() {
        return channelRepository.findAll();
    }
}
