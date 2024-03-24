package com.patika.kredinbizdeservice.service;



import com.patika.kredinbizdeservice.model.Bank;
import com.patika.kredinbizdeservice.model.CreditCard;
import com.patika.kredinbizdeservice.repository.BankRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankService {

    private final BankRepository bankRepository = new BankRepository();


    public List<Bank> getBanks() {
        return bankRepository.getBankList();
    }

    public List<CreditCard> getCreditCardsAndCampaigns() {
        return bankRepository.getCreditCardsAndCampaigns();
    }
}
