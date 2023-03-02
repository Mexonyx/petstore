package org.example.bo;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class PetStore {

    @Id
    private int id;

    @Column
    private String name;

    @OneToOne(mappedBy = "petstore")
    private Address address;

    @ManyToMany
    @JoinTable(name = "petstorsproduct",
            joinColumns=@JoinColumn(name = "idpetstore", referencedColumnName = "id"),
            inverseJoinColumns=@JoinColumn(name = "idproduct", referencedColumnName = "id"))
    private List<Product> products;

    public PetStore() {
    }

    public PetStore(String name, Address address, List<Product> products) {
        this.name = name;
        this.address = address;
        this.products = products;
    }

    public PetStore(int id, String name, Address address, List<Product> products) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.products = products;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
