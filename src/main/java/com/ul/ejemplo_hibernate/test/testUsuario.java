package com.ul.ejemplo_hibernate.test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ul.ejemplo_hibernate.Usuario;


public class testUsuario{

    //@PersistenceContext(name = "")
    private static EntityManager manager;
    private static EntityManagerFactory emf;

    public static void main(String[] args) {
        emf = Persistence.createEntityManagerFactory("Persistencia");
        manager = emf.createEntityManager();
        
        List<Usuario> Usuarios = manager.createQuery("FROM Usuario").getResultList();
        
    }
}