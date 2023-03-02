package org.example.bo;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Cat extends Animal{

    @Column
    private String idShip;

    public Cat() {
    }

    public Cat(Date birthDate, String color, PetStore petStore, String idShip) {
        super(birthDate, color, petStore);
        this.idShip = idShip;
    }

    public Cat(int id, Date birthDate, String color, PetStore petStore, String idShip) {
        super(id, birthDate, color, petStore);
        this.idShip = idShip;
    }

    public String getIdShip() {
        return idShip;
    }

    public void setIdShip(String idShip) {
        this.idShip = idShip;
    }
}
