package com.meetup.Model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name="Groups")
@EntityListeners(AuditingEntityListener.class)
public class Groupe {

    @Column(name="Groupe_Id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name="TITLE", nullable = true, length = 255)
    private String title;

    /*@OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="geid", referencedColumnName = "Groupe_Id" )
    private List<Events> evt;*/

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


    /*public List<Events> getEvt() {
        return evt;
    }

    public void setEvt(List<Events> evt) {
        this.evt = evt;
    }*/
}
