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
