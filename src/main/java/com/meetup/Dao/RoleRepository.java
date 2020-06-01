package com.meetup.Dao;

import java.util.Optional;


import com.meetup.Model.ERole;
import com.meetup.Model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}