package com.example.ForeignAffairsMinistryProject.Controllers;

import com.example.ForeignAffairsMinistryProject.RequestObjects.SaveUserObject;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class APIController {

    @GetMapping("getAll/{username}")
    public String getUsers (@PathVariable String username, @RequestParam("id") int id) {
        return "All Users with " +username+"  returned with Id: " + id;
    }

    @PostMapping("save")
    public String saveUsers(@RequestBody SaveUserObject request) {

        return "User Name  " + request.getName();
    }
}
