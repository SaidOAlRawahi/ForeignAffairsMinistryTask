package com.example.ForeignAffairsMinistryProject.Repositories;

import com.example.ForeignAffairsMinistryProject.Models.New;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewsRepository extends JpaRepository<New,Integer> {
}
