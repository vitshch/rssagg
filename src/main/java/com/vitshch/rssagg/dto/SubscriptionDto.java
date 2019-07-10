package com.vitshch.rssagg.dto;

import com.vitshch.rssagg.entity.SubscriptionEntity;

public class SubscriptionDto {

    private Integer id;
    private String name;
    private String link;
    private String description;

    public SubscriptionDto() {
    }

    public SubscriptionDto(SubscriptionEntity subscriptionEntity) {
        this.id = subscriptionEntity.getId();
        this.name = subscriptionEntity.getName();
        this.link = subscriptionEntity.getLink();
        this.description = subscriptionEntity.getDescription();
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
