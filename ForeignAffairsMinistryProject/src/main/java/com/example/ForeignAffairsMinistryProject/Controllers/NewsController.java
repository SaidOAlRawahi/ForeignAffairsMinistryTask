package com.example.ForeignAffairsMinistryProject.Controllers;

import com.example.ForeignAffairsMinistryProject.Models.New;
import com.example.ForeignAffairsMinistryProject.Models.Policy;
import com.example.ForeignAffairsMinistryProject.Responses.NewsResponse;
import com.example.ForeignAffairsMinistryProject.Responses.PoliciesResponse;
import com.example.ForeignAffairsMinistryProject.Services.NewsService;
import com.example.ForeignAffairsMinistryProject.Services.PoliciesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class NewsController {
    @Autowired
    NewsService newsService;

    @GetMapping
    @RequestMapping("/news")
    public NewsResponse getPoliciesByAttributes(
            @RequestParam(name = "country", required = false) String country,
            @RequestParam(name = "region", required = false) String region,
            @RequestParam(name = "title", required = false) String title) {
        List<New> news = newsService.getPoliciesByAttributes(country, region, title);

        NewsResponse response = new NewsResponse();
        response.setNews(news);

        return response;
    }
}
