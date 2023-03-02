package org.example.bo;

import jakarta.persistence.*;
import org.example.bo.enums.TypeProduit;
import java.util.List;

@Entity
public class Product {

    @Id
    private int id;

    @Column
    private String code;

    @Column
    private String label;

    @Enumerated(EnumType.STRING)
    private TypeProduit prodType;

    @ManyToMany(mappedBy = "petstore")
    private List<PetStore> petStores;

    @Column
    private double price;

    public Product() {
    }

    public Product(String code, String label, TypeProduit prodType, List<PetStore> petStores, double price) {
        this.code = code;
        this.label = label;
        this.prodType = prodType;
        this.petStores = petStores;
        this.price = price;
    }

    public Product(int id, String code, String label, TypeProduit prodType, List<PetStore> petStores, double price) {
        this.id = id;
        this.code = code;
        this.label = label;
        this.prodType = prodType;
        this.petStores = petStores;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public TypeProduit getProdType() {
        return prodType;
    }

    public void setProdType(TypeProduit prodType) {
        this.prodType = prodType;
    }

    public List<PetStore> getPetStores() {
        return petStores;
    }

    public void setPetStores(List<PetStore> petStores) {
        this.petStores = petStores;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
