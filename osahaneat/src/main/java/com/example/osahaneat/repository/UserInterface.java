package com.example.osahaneat.repository;

import com.example.osahaneat.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //đưa lên IOC
public interface UserInterface extends JpaRepository<Users, Integer> {

}
