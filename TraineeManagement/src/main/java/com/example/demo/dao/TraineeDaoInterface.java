package com.example.demo.dao;


import java.util.List;


import com.example.demo.entities.Trainee;

public interface TraineeDaoInterface {

	boolean addtrainee(Trainee trainee);

	List<Trainee> reterivetrainee();

	Trainee findbyid(int traineeid);

	void deletetrainee(int traineeid);

	Trainee modifytrainee(int traineeId);

}

