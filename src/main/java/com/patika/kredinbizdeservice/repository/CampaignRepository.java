package com.patika.kredinbizdeservice.repository;

import com.patika.kredinbizdeservice.model.Campaign;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CampaignRepository {
    private List<Campaign> campaigns = new ArrayList<>();

    public List<Campaign> getCampaignsByDateDesc() {
        return campaigns.stream()
                .sorted(Comparator.comparing(Campaign::getUpdateDate).reversed())
                .collect(Collectors.toList());
    }


}
