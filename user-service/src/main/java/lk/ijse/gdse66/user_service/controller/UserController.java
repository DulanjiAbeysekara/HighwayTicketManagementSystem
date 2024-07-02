package lk.ijse.gdse66.user_service.controller;

import lk.ijse.gdse66.user_service.entity.User;
import lk.ijse.gdse66.user_service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("api/v1/user")
public class UserController {

    public UserController() {
        System.out.println("User Working!");
    }

    @Autowired
    public UserService userService;


    @PostMapping
    public ResponseEntity<User> saveUser(@RequestBody User user){
        return ResponseEntity.ok(userService.saveUser(user));
    }

    @GetMapping
    public  ResponseEntity<User> getUser(@PathVariable Long id){
        return ResponseEntity.ok(userService.getUser(id));
    }

    @GetMapping
    public  ResponseEntity<List<User>> getAllUser(){
         return ResponseEntity.ok(userService.getAllUser());
    }

    @PutMapping
    public ResponseEntity<User> updateUser(@PathVariable Long id,@RequestBody User user){
        return  ResponseEntity.ok(userService.updateUser(id,user));
    }

    @DeleteMapping
    public  ResponseEntity<Void> deleteUser(@PathVariable Long id){
           userService.deleteUser(id);
           return ResponseEntity.noContent().build();
    }
}
