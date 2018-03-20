package com.revature.hydra.interview.data;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.beans.Interview;

/**
 * InterviewRepository Data Access Object with various methods to communicate with database
 * @author Omowumi
 *
 */
@Repository
public interface InterviewRepository extends JpaRepository<Interview, Integer> {
	
	/**
	 * Find all Interviews
	 * 
	 * @return list of Interviews
	 */
	List<Interview> findAll();
	
	/**
	 * Find all interviews by associateId
	 * 
	 * @param associateId
	 * @return list of Interviews
	 */
	List<Interview> findAllByAssociateId(Integer associateId);
}
