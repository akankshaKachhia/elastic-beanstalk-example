package com.aws.elasticBeanstalkDemo.repository;

import com.aws.elasticBeanstalkDemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
