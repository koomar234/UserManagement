package com.kumar.repository;

import com.kumar.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author RakeshKumar created on 19/07/23
 */
@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
}
