package com.example.ForeignAffairsMinistryProject.RequestObjects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class SaveUserObject {

    private String name;
    private String phoneNumber;
    private String email;
    private String nationality;


}
