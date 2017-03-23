package bg.alexander.controllers;

import bg.alexander.model.User;
import bg.alexander.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping("/user/{id}")
    public User findUser(@PathVariable("id") Long id){
        return service.findUser(id);
    }
}
