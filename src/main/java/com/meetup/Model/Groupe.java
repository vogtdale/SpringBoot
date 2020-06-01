package com.meetup.Model;

import com.fasterxml.jackson.annotation.JsonView;
import com.meetup.views.MyJsonView;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Entity
@Table(name="Groups")
@EntityListeners(AuditingEntityListener.class)
public class Groupe {

    @Column(name="ID")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name="TITLE", nullable = true, length = 255)
    private String title;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="genres_id")
    private Genre genre;



    @OneToMany(mappedBy = "groupe")
    @JsonView({MyJsonView.Events.class})
    private Set<Events> events = new HashSet<>();


    public Groupe() {}

    public Groupe(Integer id, String title, String description) {
        this.id = id;
        this.title = title;

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

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Set<Events> getEvents() {
        return events;
    }

    public void setEvents(Set<Events> events) {
        this.events = events;
    }
}
