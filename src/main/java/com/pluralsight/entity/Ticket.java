package com.pluralsight.entity;

import javax.persistence.*;

@Entity
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String title;

    private String description;

    @ManyToOne
    @JoinColumn(name = "application_id")
    private Application application;

    public Ticket() {
    }

    public Ticket(Integer id, String title, String description, Application application) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.application = application;
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

    public Application getApplication() {
        return application;
    }

    public void setApplication(Application application) {
        this.application = application;
    }
}

