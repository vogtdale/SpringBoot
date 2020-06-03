package com.meetup.Services;

import com.meetup.Dao.UserRepository;
import com.meetup.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    /*List All Memebers of the a group*/


    public User findPers(Integer id) {
        return this.userRepository.findById(id).get();
    }

    public List<User> findAll() {
        return this.userRepository.findAll();
    }

    public User save(User user) {
        return this.userRepository.save(user);
    }

    public void deletepersonne(Integer id) {
        this.userRepository.deleteById(id);
    }
}
