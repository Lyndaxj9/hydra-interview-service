package com.revature.hydra.interview.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
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
    public ResponseEntity<List<InterviewType>> findAllInterviewTypes() {
		return new ResponseEntity<>(interviewTypeService.findAll(), HttpStatus.OK);
    }
	
	/**
	 * Add a new interview type
	 * @param interviewTypeName
	 * @return ResponseEntity<Void>
	 */
	@RequestMapping(value = "/add/interviewtype", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> addInterviewType(@RequestBody String interviewTypeName) {
		interviewTypeService.addInterviewType(interviewTypeName);
		return new ResponseEntity<>(HttpStatus.CREATED);
    }
	
	/**
	 * Update interview type
	 * @param id
	 * @param interviewType
	 * @return ResponseEntity<Void>
	 */
	@RequestMapping(value = "/update/interviewtype/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> updateInterviewType(@PathVariable Integer id, @RequestBody InterviewType interviewType) {
		interviewTypeService.updateInterview(id, interviewType);
		return new ResponseEntity<>(HttpStatus.OK);
    }
	
	/**
	 * Delete an interview type
	 * @param id
	 * @return ResponseEntity<Void>
	 */
	@RequestMapping(value = "/delete/interviewtype/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Void> deleteInterviewTypeById(@PathVariable Integer id) {
		interviewTypeService.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);
    }
}
