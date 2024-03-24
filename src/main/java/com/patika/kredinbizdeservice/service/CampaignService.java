package com.patika.kredinbizdeservice.service;

import com.patika.kredinbizdeservice.model.Campaign;
import com.patika.kredinbizdeservice.repository.CampaignRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CampaignService {
    private final CampaignRepository campaignRepository = new CampaignRepository();


    public List<Campaign> getCampaignsByDateDesc() {
        return campaignRepository.getCampaignsByDateDesc();
    }
}
