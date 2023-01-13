package com.educandoweb.couse.repositories;

import com.educandoweb.couse.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>  {


}
