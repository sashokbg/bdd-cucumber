package bg.alexander.repository;


import bg.alexander.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long>{
}
