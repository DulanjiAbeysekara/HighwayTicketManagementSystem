package lk.ijse.gdse66.user_service.service;

import lk.ijse.gdse66.user_service.entity.User;
import lk.ijse.gdse66.user_service.repositry.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public User saveUser(User user){
        return userRepo.save(user);
    }

    public User getUser(Long id){
        return userRepo.findById(id).orElse(null);
    }

    public List<User> getAllUser(){
        return userRepo.findAll();
    }

    public User updateUser(Long id,User user){
        User existingUser=userRepo.findById(id).orElse(null);

        if (existingUser != null){
            existingUser.setUserName(user.getUserName());
            existingUser.setPassword(user.getPassword());

        }
            return null;
    }

    public void deleteUser(Long id){
        userRepo.deleteById(id);
    }
}
