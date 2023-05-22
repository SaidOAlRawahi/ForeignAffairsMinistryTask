package com.example.ForeignAffairsMinistryProject.Repositories;

import com.example.ForeignAffairsMinistryProject.Models.Policy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PoliciesRepository extends JpaRepository<Policy,Integer> {
    @Query("SELECT p FROM Policy p WHERE (:country IS NULL OR p.country = :country) " +
            "AND (:region IS NULL OR p.region = :region) " +
            "AND (:topic IS NULL OR p.topic = :topic)")
    List<Policy> findByAttributes(String country, String region, String topic);
}
