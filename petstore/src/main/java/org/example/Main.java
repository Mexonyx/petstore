package org.example;

import jakarta.persistence.*;
import org.example.bo.*;
import org.example.bo.enums.FishLivEnv;
import org.example.bo.enums.TypeProduit;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        Address address = new Address("20", "rue des Palmiers", "44200", "Nantes");
        Address address2 = new Address("7", "place du muguet", "37000", "Tours");
        Address address3 = new Address("39", "rue de l'église", "44000", "Nantes");

        em.persist(address);
        em.persist(address2);
        em.persist(address3);

        Product product1 = new Product("EAERT21", "shampooing poils brillants", TypeProduit.cleaning, 12.2);
        Product product2 = new Product("FDSFS32", "Croquettes proplan", TypeProduit.food, 32.1);
        Product product3 = new Product("HJHKJ56", "shampooing poils brillants", TypeProduit.accessory, 20.5);

        em.persist(product1);
        em.persist(product2);
        em.persist(product3);

        List<Product> productSet = new ArrayList<>();
        productSet.add(product1);
        productSet.add(product2);
        productSet.add(product3);

        PetStore petStore = new PetStore("Pet Shop", "Audrey Adde", productSet, address);
        PetStore petStore2 = new PetStore("Shop and Pet", "Inès Boucard", productSet, address2);
        PetStore petStore3 = new PetStore("All for your pet", "Erwann Leducq", productSet, address3);

        em.persist(petStore);
        em.persist(petStore2);
        em.persist(petStore3);

        Fish fish1 = new Fish(new Date(2023, 10, 12), "bleu", petStore, FishLivEnv.fresh_water);
        Fish fish2 = new Fish(new Date(2022, 11, 12), "vert",petStore2,  FishLivEnv.sea_water);
        Fish fish3 = new Fish(new Date(2023, 3, 2), "rouge",petStore3, FishLivEnv.fresh_water);

        em.persist(fish1);
        em.persist(fish2);
        em.persist(fish3);


        Cat cat1 = new Cat(new Date(2023, 3, 2), "bleu", petStore, "GGHYTB21");
        Cat cat2 = new Cat(new Date(2022, 6, 20), "bleu", petStore2, "DGRSGD23");
        Cat cat3 = new Cat(new Date(2021, 9, 3), "bleu", petStore3, "FGFSSGH67");

        em.persist(cat1);
        em.persist(cat2);
        em.persist(cat3);
        
        em.getTransaction().commit();
        em.close();
        emf.close();


    }
}