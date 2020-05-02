package com.example.demo.dao;

import java.util.List;



import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Trainee;
import com.example.demo.entities.User;;

@Repository
public class UserDao {

	@PersistenceContext
	EntityManager em;

	// public User findByUsernameAndPassword(String username, String password);

	public String reteriveuser(String username, String password) {
		String Qstr = "SELECT user.password FROM User user where user.username=:ptitle";
		TypedQuery<String> query = em.createQuery(Qstr, String.class);
		query.setParameter("ptitle", username);
		
		String password1=query.getSingleResult();

		boolean res= password1 != null;

		if (res) {
			return password1;
		} else
			return null;
	}

}

