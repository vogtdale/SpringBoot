package com.meetup.Dao;

import com.meetup.Model.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenreDao extends JpaRepository<Genre, Integer> {
}
