package com.example.repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.example.model.User;

@Repository
public class UserRepositoryCustomImpl  {

    @PersistenceContext
    private EntityManager entityManager;
    // Implement all abstract methods, including exists(Example<S> example)
    public User findByUserName(String username){
        String queryStr = "SELECT u FROM User u WHERE u.username = :username";
        TypedQuery<User> query = entityManager.createQuery(queryStr, User.class);
        query.setParameter("username", username);
        return query.getSingleResult();
    }
}