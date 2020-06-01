package com.meetup.Services;

import com.meetup.Dao.UserRepository;
import com.meetup.Model.PersonneModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersService {

    @Autowired
    UserRepository userRepository;

    /*List All Memebers of the a group*/
    public List<PersonneModel> getAll() {
        return this.userRepository.findAll();
    }

    public PersonneModel addPers(PersonneModel personneModel) {
        return this.userRepository.save(personneModel);
    }

    public PersonneModel findPers(Integer id) {
        return this.userRepository.findById(id).get();
    }

    public List<PersonneModel> findAll() {
        return this.userRepository.findAll();
    }

    public PersonneModel save(PersonneModel personneModel) {
        return this.userRepository.save(personneModel);
    }

    public void deletepersonne(Integer id) {
        this.userRepository.deleteById(id);
    }
}
