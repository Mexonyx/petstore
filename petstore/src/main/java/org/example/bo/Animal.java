package org.example.bo;


import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Animal {

    @Id
    private int Id;

    @Column
    private Date birthDate;

    @Column
    private String color;

    @ManyToOne
    @JoinColumn(name = "idpetstore")
    private PetStore petStore;

    public Animal() {
    }

    public Animal(Date birthDate, String color, PetStore petStore) {
        this.birthDate = birthDate;
        this.color = color;
        this.petStore = petStore;
    }

    public Animal(int id, Date birthDate, String color, PetStore petStore) {
        Id = id;
        this.birthDate = birthDate;
        this.color = color;
        this.petStore = petStore;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public PetStore getPetStore() {
        return petStore;
    }

    public void setPetStore(PetStore petStore) {
        this.petStore = petStore;
    }
}
