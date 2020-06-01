package com.meetup.Dao;

import com.meetup.Model.Groupe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupeDao extends JpaRepository<Groupe, Integer> {
}
