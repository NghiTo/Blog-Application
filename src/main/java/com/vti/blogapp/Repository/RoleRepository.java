package com.vti.blogapp.Repository;

import com.vti.blogapp.Entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long>
{
    Role findByType(Role.Type type);
}
