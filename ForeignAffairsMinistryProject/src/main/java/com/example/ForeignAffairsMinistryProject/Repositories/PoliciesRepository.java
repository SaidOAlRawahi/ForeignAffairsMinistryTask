package com.example.ForeignAffairsMinistryProject.Repositories;

import com.example.ForeignAffairsMinistryProject.Models.Policy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PoliciesRepository extends JpaRepository<Policy,Integer> {
}
