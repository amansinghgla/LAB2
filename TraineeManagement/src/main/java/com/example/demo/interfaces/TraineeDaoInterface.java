package com.example.demo.interfaces;



import java.util.List;
import com.example.demo.entities.Trainee;



public interface TraineeDaoInterafce {
	
	public boolean addtrainee (Trainee t);
	public void deletetrainee (int traineeid);
	public List<Trainee> retrieve();

}


