package com.meetup.Services;

import com.meetup.Dao.CrudRepository;
import com.meetup.Model.PersonneModel;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PersService {

    @Autowired
    CrudRepository crudRepository;

    /*List All Memebers of the a group*/
    public List<PersonneModel> getAll() {
        return this.crudRepository.findAll();
    }
}
