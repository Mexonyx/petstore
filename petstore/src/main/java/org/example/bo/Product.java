package org.example.bo;

import jakarta.persistence.*;
import org.example.bo.enums.TypeProduit;
import java.util.List;

@Entity(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String code;
    @Column
    private String label;
    @Column
    private TypeProduit prodType;

    @Column
    private Double price;
    @ManyToMany(mappedBy = "products")
    private List<PetStore> petStores;

    public Product() {
    }

    public Product(String code, String label, TypeProduit prodType, double price) {
        this.code = code;
        this.label = label;
        this.prodType = prodType;
        this.price = price;
    }

    public Product(int id, String code, String label, TypeProduit prodType, double price) {
        this.id = id;
        this.code = code;
        this.label = label;
        this.prodType = prodType;
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
