package com.example.ForeignAffairsMinistryProject.Responses;

import com.example.ForeignAffairsMinistryProject.Models.New;
import com.example.ForeignAffairsMinistryProject.Models.Policy;

import java.util.List;

public class NewsResponse {
    private List<New> news;

    public List<New> getNews() {
        return news;
    }

    public void setNews(List<New> news) {
        this.news = news;
    }
}
