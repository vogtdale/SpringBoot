package com.meetup.Model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="Events")
@EntityListeners(AuditingEntityListener.class)
public class Events {

    @Column(name="Events_Id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name="TITLE", nullable = true, length = 255)
    private String title;

    @Column(name="DESCRIPTION", nullable = true, length = 255)
    private String description;

    @Column(name="MESSAGES", nullable = true, length = 255)
    private String message;

    @Temporal(TemporalType.DATE)
    Date date;

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
}
