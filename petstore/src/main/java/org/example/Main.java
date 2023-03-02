package org.example;

import jakarta.persistence.*;
import org.example.bo.Address;
import org.example.bo.Product;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        Address ad = new Address( "9", "St Herblain","44000","Nantes");
        em.persist(ad);

        //Livre l = em.find(Livre.class, 4);
        //System.out.println(l);

        //créer un livre

        //Livre livreACreer = new Livre("HP", "JFK");
        //em.persist(livreACreer);


        //Modifier les propriété d'un livre

        //Livre livreAModif = em.find(Livre.class, 5);
        //if(livreAModif != null){
          //  livreAModif.setTitre("Du plaisirs dans la cuisine");
        //}

        //TypedQuery<Livre> queryAuteur = em.createQuery("from Livre where auteur = 'Gaston Pouet'", Livre.class);

        //Livre livreASupprimer = em.find(Livre.class, 6);
        //if(livreASupprimer != null){
        //    em.remove(livreASupprimer);
        //}

        //TypedQuery<Livre> allLivre = em.createQuery("from Livre", Livre.class);

        //Client client = em.find(Client.class, 2);
        //if(client != null){
        //    for (Emprunt emprunt : client.getLesEmprunts()){
          //      System.out.println(emprunt);
            //}
        //}



        //System.out.println(queryAuteur.getResultList());
        //System.out.println(allLivre.getResultList());
        em.getTransaction().commit();
        em.close();
        emf.close();


    }
}