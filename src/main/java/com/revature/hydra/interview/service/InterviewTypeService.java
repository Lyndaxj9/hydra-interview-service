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
	
	public void addInterviewType(String interviewTypeName) {
		InterviewType it = new InterviewType();
		it.setInterviewTypeName(interviewTypeName);
		interviewTypeRepository.save(it);
	}
	
	public void updateInterview(Integer interviewTypeId, InterviewType interviewType) {
		interviewType.setInterviewTypeId(interviewTypeId);
		interviewTypeRepository.save(interviewType);
	}
	
	public void delete(Integer interviewTypeId) {
		interviewTypeRepository.delete(interviewTypeId);
	}
	
	public void delete(InterviewType interviewType) {
		interviewTypeRepository.delete(interviewType);
	}
}
