package com.revature.hydra.interview.data;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.beans.Interview;
import com.revature.beans.InterviewType;

/**
 * InterviewRepository Data Access Object with various methods to communicate with Interview Table
 * @author Omowumi
 *
 */
@Repository
public interface InterviewTypeRepository extends JpaRepository<InterviewType, Integer> {
	
	/**
	 * Find all Interviews
	 * 
	 * @return list of Interviews
	 */
	List<InterviewType> findAll();
}
