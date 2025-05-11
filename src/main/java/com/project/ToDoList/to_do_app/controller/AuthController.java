package com.project.ToDoList.to_do_app.controller;

import com.project.ToDoList.to_do_app.payload.UserDTO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
public class AuthController {

    @GetMapping("/")
    public String greeting(){
        return "success";
    }

}
