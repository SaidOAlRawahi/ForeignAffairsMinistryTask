package com.example.ForeignAffairsMinistryProject.Repositories;

import com.example.ForeignAffairsMinistryProject.Models.New;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NewsRepository extends JpaRepository<New,Integer> {
    @Query("SELECT p FROM New p WHERE (:country IS NULL OR p.country = :country) " +
            "AND (:region IS NULL OR p.region = :region) " +
            "AND (:title IS NULL OR p.title = :title)")
    List<New> findByAttributes(String country, String region, String title);
}
