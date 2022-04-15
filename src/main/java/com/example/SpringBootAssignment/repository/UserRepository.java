package com.example.SpringBootAssignment.repository;

import com.example.SpringBootAssignment.bean.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
        User findByName(String name);
}
