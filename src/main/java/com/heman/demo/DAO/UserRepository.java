package com.heman.demo.DAO;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.heman.demo.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
		
}
