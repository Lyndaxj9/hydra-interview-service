package com.revature.hydra.interview.controller;

import java.util.Map;

import org.apache.log4j.Logger;
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

import com.revature.beans.Interview;
import com.revature.hydra.interview.service.InterviewService;

/**
 * Service requests for Interview information
 * @author Omowumi
 *
 */
@RestController
@CrossOrigin
@EnableAutoConfiguration
public class InterviewController {
	private static final Logger log = Logger.getLogger(InterviewController.class);
	
	private InterviewService interviewService;
	
	@Autowired
	public void setInterviewService(InterviewService interviewService) {
		this.interviewService = interviewService;
	}
	
	/**
	 * Retrieves all interviews
	 * @return ResponseEntity<Map<Integer, Interview>>
	 */
	@RequestMapping(value = "/all/interview", method = RequestMethod.GET)
    public ResponseEntity<Map<Integer, Interview>> findAllInterview() {
		return new ResponseEntity<>(interviewService.findAll(), HttpStatus.OK);
    }

	/**
	 * Retrieves all interviews for specified Associate
	 * @param id
	 * @return ResponseEntity<Map<Intege, Interview>>
	 */
	@RequestMapping(value = "/all/interview/associate/{id}", method = RequestMethod.GET)
    public ResponseEntity<Map<Integer, Interview>> retrieveAllInterviewByAssociate(@PathVariable Integer id) {
		return new ResponseEntity<>(interviewService.findAllByAssociate(id), HttpStatus.OK);
    }
	
	/**
	 * Adds interview for specified Associate
	 * @param id
	 * @param interview
	 * @return
	 */
	@RequestMapping(value = "/add/interview/associate/{id}", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    //@ResponseBody
    public ResponseEntity<Void> addInterviewByAssociate(@PathVariable Integer id, @RequestBody Interview interview) {
		log.info("adding interview");
		interviewService.addInterviewForAssociate(id, interview);
		return new ResponseEntity<>(HttpStatus.CREATED);
    }
	
	/**
	 * Updates interview information
	 * @param id
	 * @param interview
	 * @return
	 */
	@RequestMapping(value = "/update/interview/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    //@ResponseBody
    public ResponseEntity<Void> updateInterview(@PathVariable Integer id, @RequestBody Interview interview) {
		log.info("updating interview");
		interviewService.updateInterview(id, interview);
		return new ResponseEntity<>(HttpStatus.OK);
    }
	
	/**
	 * Deletes interview based on interviewId
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/delete/interview/{id}", method = RequestMethod.DELETE)
    //@ResponseBody
    public ResponseEntity<Void> deleteInterviewById(@PathVariable Integer id) {
		log.info("deleting interview");
		interviewService.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);
    }
}
