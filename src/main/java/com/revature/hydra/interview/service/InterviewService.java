package com.revature.hydra.interview.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.beans.Interview;
import com.revature.hydra.interview.data.InterviewRepository;

/**
 * Interview Service
 * 
 * Interview services implementation with communication with InterviewRepository
 * 
 * @author Omowumi
 *
 */
@Service
public class InterviewService {
	
	@Autowired
	private InterviewRepository interviewRepository;

	/**
	 * Find all Interviews
	 * 
	 * @return Map<Integer, Interview>
	 */
	public Map<Integer, Interview> findAll() {
		List<Interview> li = interviewRepository.findAll();
		Map<Integer, Interview> map = createMapping(li);

		return map;
	}
	
	/**
	 * Find all Interviews for a single Associate
	 * 
	 * @param associateId
	 * @return Map<Integer, Interview>
	 */
	public Map<Integer, Interview> findAllByAssociate(Integer associateId) {
		List<Interview> li = interviewRepository.findAllByAssociateId(associateId);
		return createMapping(li);
	}
	
	/**
	 * Add interview for a particular associate
	 * @param associateId
	 * @param interview
	 */
	public void addInterviewForAssociate(Integer associateId, Interview interview) {
		interview.setAssociateId(associateId);
		interviewRepository.save(interview);
	}
	
	/**
	 * Update interview for a particular associate
	 * @param interviewId
	 * @param interview
	 */
	public void updateInterview(Integer interviewId, Interview interview) {
		interview.setInterviewId(interviewId);
		interviewRepository.save(interview);
	}
	
	/**
	 * Delete interview by interviewId
	 * @param interviewId
	 */
	public void delete(Integer interviewId) {
		interviewRepository.delete(interviewId);
	}
	
	/**
	 * Delete interview by interview
	 * @param interview
	 */
	public void delete(Interview interview) {
		interviewRepository.delete(interview);
	}

	/**
	 * Helper function to create InterviewId, Interview mapping
	 * 
	 * @param li
	 * @return Map<Integer, Interview>
	 */
	private Map<Integer, Interview> createMapping(List<Interview> li) {
		Map<Integer, Interview> map = new HashMap<>();

		if (li != null) {
			for (Interview i : li) {
				map.put(i.getInterviewId(), i);
			}
		}

		return map;
	}
}
