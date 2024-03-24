package com.patika.kredinbizdeservice.repository;

import com.patika.kredinbizdeservice.model.Application;

import java.util.ArrayList;
import java.util.List;

public class ApplicationRepository {
    List<Application> applications = new ArrayList<>();

    public void save(Application application) {
        applications.add(application);
    }
}
