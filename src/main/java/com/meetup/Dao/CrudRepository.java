package com.meetup.Dao;

import com.meetup.Model.PersonneModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CrudRepository extends JpaRepository<PersonneModel, Integer> {
}
