package com.vitshch.rssagg.service;

import com.vitshch.rssagg.entity.SubscriptionEntity;
import com.vitshch.rssagg.repository.SubscriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubscriptionService {

    private final SubscriptionRepository subscriptionRepository;

    @Autowired
    public SubscriptionService(SubscriptionRepository subscriptionRepository) {
        this.subscriptionRepository = subscriptionRepository;
    }

    public List<SubscriptionEntity> getAllSubscriptions() {
        return subscriptionRepository.findAll();
    }
}
