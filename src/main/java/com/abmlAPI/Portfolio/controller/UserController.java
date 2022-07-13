package com.abmlAPI.Portfolio.controller;

import com.abmlAPI.Portfolio.model.User;
import com.abmlAPI.Portfolio.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

 
@RestController
//@RequestMapping("/user")
<<<<<<< HEAD
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
=======
//@CrossOrigin(origins = "http://localhost:4200")
@CrossOrigin(origins = "https://portfolio-fe.netlify.app/iniciar-sesion")
>>>>>>> b349e6f317d774754e0c186d4484aa223465876b
public class UserController {
    @Autowired
    public UserRepository userRepo;
    
    @PostMapping("/login")
    public ResponseEntity<?> loginUser(@RequestBody User userData){
        System.out.println(userData);
        User user = userRepo.findByUserId(userData.getUserId());
        if(user.getPassword().equals(userData.getPassword()))
            return ResponseEntity.ok(user);
        
        return (ResponseEntity<?>) ResponseEntity.internalServerError();
        
    }
}
