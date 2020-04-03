package com.meetup.Services;

import com.meetup.Dao.CrudRepository;
import com.meetup.Model.PersonneModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersService {

    @Autowired
    CrudRepository crudRepository;

    /*List All Memebers of the a group*/
    public List<PersonneModel> getAll() {
        return this.crudRepository.findAll();
    }

    public PersonneModel addPers(PersonneModel personneModel) {
        return this.crudRepository.save(personneModel);
    }

    public List<PersonneModel> findAll() {
        return this.crudRepository.findAll();
    }

    public PersonneModel save(PersonneModel personneModel) {
        return this.crudRepository.save(personneModel);
    }

    public PersonneModel delete(Integer id) {
        return this.crudRepository.findById(id).get();
    }
}
