package lk.ijse.gdse66.user_service.repositry;

import lk.ijse.gdse66.user_service.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long> {
}

