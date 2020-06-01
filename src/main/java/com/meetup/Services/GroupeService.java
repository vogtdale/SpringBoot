package com.meetup.Services;

import com.meetup.Dao.EventsDao;
import com.meetup.Dao.GroupeDao;
import com.meetup.Model.Events;
import com.meetup.Model.Groupe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupeService {

    @Autowired
    GroupeDao groupeDao;

    /*List ts les group*/
    public List<Groupe> getAll() {
        return this.groupeDao.findAll();
    }

    public Groupe addGropues(Groupe events) {
        return this.groupeDao.save(events);
    }

    public Groupe findGroupes(Integer id) {
        return this.groupeDao.findById(id).get();
    }


    public List<Groupe> findAll() {
        return this.groupeDao.findAll();
    }

    public Groupe save(Groupe events) {
        return this.groupeDao.save(events);
    }

    public void delete(Integer id) {
        this.groupeDao.deleteById(id);
    }
}
