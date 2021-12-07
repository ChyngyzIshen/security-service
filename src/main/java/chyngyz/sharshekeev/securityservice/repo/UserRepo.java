package chyngyz.sharshekeev.securityservice.repo;

import chyngyz.sharshekeev.securityservice.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
