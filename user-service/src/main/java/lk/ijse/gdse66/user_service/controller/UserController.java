package lk.ijse.gdse66.user_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("api/v1/user")
public class UserController {

    @Autowired
    public RestTemplate restTemplate;



}
