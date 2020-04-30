package com.example.demo.dao;




import javax.transaction.Transactional;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;






import com.example.demo.entities.Trainee;

@Transactional
@Repository
public interface TraineeDao extends JpaRepository<Trainee, Integer> {


}