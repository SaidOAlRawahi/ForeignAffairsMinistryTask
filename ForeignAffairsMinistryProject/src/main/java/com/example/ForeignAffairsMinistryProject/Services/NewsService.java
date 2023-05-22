package com.example.ForeignAffairsMinistryProject.Services;

import com.example.ForeignAffairsMinistryProject.Models.New;
import com.example.ForeignAffairsMinistryProject.Repositories.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsService {
    @Autowired
    NewsRepository newsRepository;


    public List<New> getPoliciesByAttributes(String country, String region, String title) {
        return newsRepository.findByAttributes(country, region, title);
    }
}
