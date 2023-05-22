package com.example.ForeignAffairsMinistryProject.Controllers;

import com.example.ForeignAffairsMinistryProject.Models.Policy;
import com.example.ForeignAffairsMinistryProject.Responses.PoliciesResponse;
import com.example.ForeignAffairsMinistryProject.Services.PoliciesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/policies")
public class PoliciesController {

    @Autowired
    PoliciesService policiesService;

    @GetMapping
    @RequestMapping("/policies")
    public PoliciesResponse getPoliciesByAttributes(
            @RequestParam(name = "country", required = false) String country,
            @RequestParam(name = "region", required = false) String region,
            @RequestParam(name = "topic", required = false) String topic) {
        List<Policy> policies = policiesService.getPoliciesByAttributes(country, region, topic);

        PoliciesResponse response = new PoliciesResponse();
        response.setPolicies(policies);

        return response;
    }
}
