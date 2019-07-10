package com.vitshch.rssagg.service;

import com.vitshch.rssagg.dto.SubscriptionDto;
import com.vitshch.rssagg.entity.SubscriptionEntity;
import com.vitshch.rssagg.repository.SubscriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SubscriptionService {

    private final SubscriptionRepository subscriptionRepository;

    @Autowired
    public SubscriptionService(SubscriptionRepository subscriptionRepository) {
        this.subscriptionRepository = subscriptionRepository;
    }

    public List<SubscriptionDto> getAllSubscriptions() {
        List<SubscriptionEntity> subscriptionEntities = subscriptionRepository.findAll();
        return subscriptionEntities.stream()
                .map(SubscriptionDto::new)
                .collect(Collectors.toList());
    }

    public SubscriptionDto saveSubscription(SubscriptionDto subscription) {
        SubscriptionEntity subscriptionEntity = new SubscriptionEntity();
        subscriptionEntity.setId(subscription.getId());
        subscriptionEntity.setName(subscription.getName());
        subscriptionEntity.setLink(subscription.getLink());
        subscriptionEntity.setDescription(subscription.getDescription());

        SubscriptionEntity createdSubscriptionEntity = subscriptionRepository.save(subscriptionEntity);

        return new SubscriptionDto(createdSubscriptionEntity);
    }
}
