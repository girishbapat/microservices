package com.girishbapat.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.girishbapat.user.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	User findByUserId(Long userId);


}
