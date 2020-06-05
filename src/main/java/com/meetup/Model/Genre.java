package com.meetup.Model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="Genres")
@EntityListeners(AuditingEntityListener.class)
public class Genre {

    @Column(name="ID")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name="TITLE", nullable = true, length = 255)
    private String title;

    @Column(name="DESCRIPTION", nullable = true, length = 255)
    private String description;

    /*@OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "genre_id", referencedColumnName = "ID")
    private List<Groupe> groupe;*/

    public Genre() {}

    public Genre(Integer id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
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

   /* public List<Groupe> getGroupe() {
        return groupe;
    }

    public void setGroupe(List<Groupe> groupe) {
        this.groupe = groupe;
    }*/
}
