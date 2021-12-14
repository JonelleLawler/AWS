package com.lawler.jonelle.Database;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cocktail {

    public Cocktail(String name) {
        this.name = name;
    }

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    String name;

    public Long GetId() {
        return id;
    }

    public void SetId(Long id) {
        this.id = id;
    }

    public String GetName()
    {
        return this.name;
    }

    public void SetName(String name)
    {
        this.name = name;
    }

}