package bg.alexander.service;

import bg.alexander.model.User;
import bg.alexander.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public User findUser(Long id){
        return repository.findOne(id);
    }
}
