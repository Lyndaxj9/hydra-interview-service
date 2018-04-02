package com.revature.hydra.interview.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.beans.InterviewType;
import com.revature.hydra.interview.data.InterviewTypeRepository;

/**
 * Interview Service
 * 
 * Interview services implementation of communication with InterviewRepository
 * 
 * @author Omowumi
 *
 */
@Service
public class InterviewTypeService {
	
	@Autowired
	private InterviewTypeRepository interviewTypeRepository;

	/**
	 * Find all Interview Types
	 * 
	 * @return Map<Integer, Interview>
	 */
	public List<InterviewType> findAll() {
		List<InterviewType> lit = interviewTypeRepository.findAll();
		return lit;
	}
	
	/**
	 * Add an interview type to database
	 * @param interviewTypeName
	 */
	public void addInterviewType(String interviewTypeName) {
		InterviewType it = new InterviewType();
		it.setInterviewTypeName(interviewTypeName);
		interviewTypeRepository.save(it);
	}
	
	/**
	 * Update an interview type in database
	 * @param interviewTypeId
	 * @param interviewType
	 */
	public void updateInterview(Integer interviewTypeId, InterviewType interviewType) {
		interviewType.setInterviewTypeId(interviewTypeId);
		interviewTypeRepository.save(interviewType);
	}
	
	/**
	 * Delete an interview type from database by the id
	 * @param interviewTypeId
	 */
	public void delete(Integer interviewTypeId) {
		interviewTypeRepository.delete(interviewTypeId);
	}
	
	/**
	 * Delete an interview type from database by the object
	 * @param interviewType
	 */
	public void delete(InterviewType interviewType) {
		interviewTypeRepository.delete(interviewType);
	}
}
