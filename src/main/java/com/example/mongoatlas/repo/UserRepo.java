package com.example.mongoatlas.repo;

import com.example.mongoatlas.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepo extends MongoRepository<User,Integer> {
}
