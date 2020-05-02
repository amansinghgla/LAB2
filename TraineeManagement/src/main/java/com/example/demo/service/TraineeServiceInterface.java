package com.example.demo.service;

import java.util.List;


import com.example.demo.entities.Trainee;

public interface TraineeServiceInterface {

	Trainee savetrainee(Trainee trainee);

	List<Trainee> reterivetrainee();

	Trainee findbyid(int traineeid);

	void deletetrainee(int traineeid);

	Trainee modifytrainee(int traineeid);

}

