package com.meetup.Model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="PersMeetup")
@EntityListeners(AuditingEntityListener.class)
public class PersonneModel {
    @Column(name="ID")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name="NAME", nullable = true, length = 255)
    private String name;

    @Column(name="SURNAME", nullable = true, length = 255)
    private String surname;

    @Column (name="EMAIL", nullable = true,length = 255)
    private String email;

    @Column (name="GENDER",nullable = true,length=1)
    private String gender;

    @ManyToMany
    @JoinColumn(name="groupe_id")
    private List<Groupe> groupe;

    public PersonneModel() {}

    public PersonneModel(Integer id, String name, String surname, String email, String gender, String psswd) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.gender = gender;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}
