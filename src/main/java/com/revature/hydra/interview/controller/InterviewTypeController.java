package com.revature.hydra.interview.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.revature.beans.InterviewType;
import com.revature.hydra.interview.service.InterviewTypeService;

/**
 * Service requests for Interview information
 * @author Omowumi
 *
 */
@RestController
@CrossOrigin
@EnableAutoConfiguration
public class InterviewTypeController {
	
	private InterviewTypeService interviewTypeService;
	
	@Autowired
	public void setInterviewService(InterviewTypeService interviewTypeService) {
		this.interviewTypeService = interviewTypeService;
	}
	
	/**
	 * Retrieves all interview types
	 * @return ResponseEntity<List<InterviewType>>
	 */
	@RequestMapping(value = "/all/interviewtype", method = RequestMethod.GET)
    public ResponseEntity<List<InterviewType>> findAllInterview() {
		return new ResponseEntity<>(interviewTypeService.findAll(), HttpStatus.OK);
    }
}
