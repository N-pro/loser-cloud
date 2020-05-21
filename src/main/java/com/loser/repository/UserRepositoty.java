package com.loser.repository;

import com.loser.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * User表操作接口
 */
@Repository
public interface UserRepositoty extends JpaRepository<User,Long>{

    @Query("select t from User t where t.username = :username")
    User findByUserName(@Param("username") String username);
}
