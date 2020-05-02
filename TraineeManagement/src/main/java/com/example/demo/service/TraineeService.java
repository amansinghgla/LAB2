package com.example.demo.service;



import java.util.ArrayList;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.TraineeDao;
import com.example.demo.entities.Trainee;

@Service
@Transactional
public class TraineeService implements TraineeServiceInterface {

	@Autowired
	private TraineeDao traineeDao;

	@Override
	public Trainee savetrainee(Trainee trainee) {
		boolean result = traineeDao.addtrainee(trainee);
		return result ? trainee : null;
	}

	@Override
	public List<Trainee> reterivetrainee() {

		return traineeDao.reterivetrainee();
	}

	@Override
	public Trainee findbyid(int traineeid) {
		return traineeDao.findbyid(traineeid);
	}

	@Override
	public void deletetrainee(int traineeid) {

		traineeDao.deletetrainee(traineeid);

	}

	@Override
	public Trainee modifytrainee(int traineeid) {
		return traineeDao.modifytrainee(traineeid);
	}

}



