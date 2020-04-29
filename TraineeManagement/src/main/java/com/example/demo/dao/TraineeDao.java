package com.example.demo.dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.entities.Trainee;
import com.example.demo.interfaces.TraineeDaoInterafce;;


@Transactional
@Repository

public class TraineeDao implements TraineeDaoInterface {
	
	
	
	@PersistenceContext
	EntityManager em;


	@Override
	public List<Trainee> retrieve() {
		
		String Qstr="SELECT trainee FROM Trainee trainee";
		TypedQuery<Trainee> query=em.createQuery(Qstr,Trainee.class);
		return query.getResultList()
	}
	
	@Override
	public boolean addtrainee(Trainee t) {
		// TODO Auto-generated method stub
		em.persist(t);
		return true;
	}

	@Override
	public void deletetrainee(int traineeid) {
		// TODO Auto-generated method stub
		Trainee t=em.find(Trainee.class, traineeid);
		System.out.println(t.getTraineeid() +" "+t.getTraineename() + " "+t.getTraineedomain()+ " "+t.getTraineelocation()+ "is removed");
		em.remove(t);
	}
	
}