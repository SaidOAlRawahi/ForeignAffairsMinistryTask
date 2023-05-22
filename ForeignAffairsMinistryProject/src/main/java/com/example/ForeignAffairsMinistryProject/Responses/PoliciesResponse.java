package com.example.ForeignAffairsMinistryProject.Responses;

import com.example.ForeignAffairsMinistryProject.Models.Policy;

import java.util.List;

public class PoliciesResponse {
    private List<Policy> policies;

    public List<Policy> getPolicies() {
        return policies;
    }

    public void setPolicies(List<Policy> policies) {
        this.policies = policies;
    }
}
