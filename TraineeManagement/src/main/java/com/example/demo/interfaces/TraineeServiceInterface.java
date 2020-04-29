package com.example.demo.interfaces;

import java.util.List;

import com.example.demo.entities.Trainee;
public interface TraineeServiceInterface {


	public Trainee addtrainee(Trainee t);

	public List<Trainee> retrieve();
	
	public void delete(int traineeid);
	
	
	
}
