package com.restapi.restapi.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Students {
    
    @Id
    private int id;
    private String name;
    private String branch;


    public Students(int id, String name, String branch) {
        this.id = id;
        this.name = name;
        this.branch = branch;
    }

    public Students(){
        super();
    }


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return this.branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", branch='" + getBranch() + "'" +
            "}";
    }

}
