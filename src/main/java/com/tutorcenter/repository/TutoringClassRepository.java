package com.tutorcenter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tutorcenter.model.TutoringClass;

@Repository
public interface TutoringClassRepository extends JpaRepository<TutoringClass, Integer> {

}
