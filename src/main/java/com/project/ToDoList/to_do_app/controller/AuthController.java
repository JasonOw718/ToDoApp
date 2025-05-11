package com.project.ToDoList.to_do_app.controller;

import com.project.ToDoList.to_do_app.payload.UserDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
public class AuthController {

    @GetMapping("/")
    public String greeting(){
        return "success";
    }

    @PostMapping("login")
    public String login(@RequestBody UserDTO userDTO){
        return "Login Success";
    }
}
