package com.example.ForeignAffairsMinistryProject.Models;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.MappedSuperclass;
import java.util.Date;

@Setter
@Getter
@MappedSuperclass
public class BaseEntity {
    @CreatedDate
    Date createdDate;
    @UpdateTimestamp
    Date lastUpdated;
    Boolean isActive;
}