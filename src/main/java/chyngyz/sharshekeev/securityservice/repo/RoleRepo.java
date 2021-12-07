package chyngyz.sharshekeev.securityservice.repo;

import chyngyz.sharshekeev.securityservice.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
