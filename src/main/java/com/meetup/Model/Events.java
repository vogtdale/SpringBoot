package com.meetup.Model;

import com.fasterxml.jackson.annotation.JsonView;
import com.meetup.views.MyJsonView;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="Events")
@EntityListeners(AuditingEntityListener.class)
public class Events {

    @Column(name="ID")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonView({MyJsonView.Events.class})
    private Integer id;

    @Column(name="TITLE", nullable = true, length = 255)
    @JsonView({MyJsonView.Events.class})
    private String title;

    @Column(name="DESCRIPTION", nullable = true, length = 255)
    @JsonView({MyJsonView.Events.class})
    private String description;

    @Column(name="MESSAGES", nullable = true, length = 255)
    @JsonView({MyJsonView.Events.class})
    private String message;

    @Temporal(TemporalType.DATE)
    @JsonView({MyJsonView.Events.class})
    Date date;


    @ManyToOne
    @JoinColumn(name="groupe_id")
    @JsonView({MyJsonView.Events.class})
    private Groupe groupe;
    

    @ManyToOne
    @JoinColumn(name="pers_id")
    @JsonView({MyJsonView.Events.class})
    private PersonneModel personneModel;

    public Events() {}

    public Events(Integer id, String title, String description, String message, Date date) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.message = message;
        this.date = date;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Groupe getGroupe() {
        return groupe;
    }

    public void setGroupe(Groupe groupe) {
        this.groupe = groupe;
    }

    public PersonneModel getPersonneModel() {
        return personneModel;
    }

    public void setPersonneModel(PersonneModel personneModel) {
        this.personneModel = personneModel;
    }


}
