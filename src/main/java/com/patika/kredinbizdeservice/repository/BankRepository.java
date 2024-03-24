package com.patika.kredinbizdeservice.repository;


import com.patika.kredinbizdeservice.model.Bank;
import com.patika.kredinbizdeservice.model.CreditCard;

import java.util.ArrayList;
import java.util.List;

public class BankRepository {
    private List<Bank> bankList = new ArrayList<>();

    public List<Bank> getBankList() {
        return bankList;
    }

    public List<CreditCard> getCreditCardsAndCampaigns() {
        List<CreditCard> creditCards = new ArrayList<>();
        for (Bank bank : bankList) {
            creditCards.addAll(bank.getCreditCards());
        }
        return creditCards;
    }

}
