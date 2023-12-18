package com.vti.blogapp.Repository;

import com.vti.blogapp.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>
{

}
