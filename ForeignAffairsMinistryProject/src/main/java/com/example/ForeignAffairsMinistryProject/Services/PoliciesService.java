package com.example.ForeignAffairsMinistryProject.Services;

import com.example.ForeignAffairsMinistryProject.Models.New;
import com.example.ForeignAffairsMinistryProject.Models.Policy;
import com.example.ForeignAffairsMinistryProject.Repositories.NewsRepository;
import com.example.ForeignAffairsMinistryProject.Repositories.PoliciesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

@Service
public class PoliciesService {
    @Autowired
    PoliciesRepository policiesRepository;


    public List<Policy> getPoliciesByAttributes(String country, String region, String topic) {
        return policiesRepository.findByAttributes(country, region, topic);
    }
}
