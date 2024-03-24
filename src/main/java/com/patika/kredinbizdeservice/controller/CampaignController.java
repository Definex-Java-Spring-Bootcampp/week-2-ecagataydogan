package com.patika.kredinbizdeservice.controller;


import com.patika.kredinbizdeservice.model.Campaign;
import com.patika.kredinbizdeservice.service.CampaignService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/campaigns")
public class CampaignController {
    private final CampaignService campaignService;

    public CampaignController(CampaignService campaignService) {
        this.campaignService = campaignService;
    }

    public List<Campaign> getCampaignsByDateDesc() {
        return campaignService.getCampaignsByDateDesc();
    }

}
