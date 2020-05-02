package com.example.demo.dao;


import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.entities.Trainee;

@Transactional
@Repository
public class TraineeDao implements TraineeDaoInterface {

	@PersistenceContext
	private EntityManager em;

	@Override
	public boolean addtrainee(Trainee trainee) {
		em.persist(trainee);
		return true;
	}

	@Override
	public List<Trainee> reterivetrainee() {
		String Qstr = "SELECT trainee FROM Trainee trainee";
		TypedQuery<Trainee> query = em.createQuery(Qstr, Trainee.class);

		return query.getResultList();
	}

	@Override
	public Trainee findbyid(int traineeid) {

		return em.find(Trainee.class, traineeid);
	}

	@Override
	public void deletetrainee(int traineeid) {

		Trainee trainee = em.find(Trainee.class, traineeid);
		em.remove(trainee);

	}

	@Override
	public Trainee modifytrainee(int traineeid) {
		Trainee trainee = em.find(Trainee.class,  traineeid);
		return em.merge(trainee);
	}


}
