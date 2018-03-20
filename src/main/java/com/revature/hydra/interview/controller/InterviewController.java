package com.revature.hydra.interview.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.revature.beans.Interview;
import com.revature.hydra.interview.service.InterviewService;

@RestController
@CrossOrigin
@EnableAutoConfiguration
public class InterviewController {
	
	private InterviewService interviewService;
	
	@Autowired
	public void setClientService(InterviewService interviewService) {
		this.interviewService = interviewService;
	}
	
	@RequestMapping(value = "/all/interview", method = RequestMethod.GET)
    //@ResponseBody
    public ResponseEntity<Map<Integer, Interview>> findAllInterview() {
		return new ResponseEntity<>(interviewService.findAll(), HttpStatus.OK);
    }

	@RequestMapping(value = "/all/interview/associate/{id}", method = RequestMethod.GET)
    //@ResponseBody
    public ResponseEntity<Map<Integer, Interview>> retrieveAllInterviewByAssociate(@PathVariable Integer id) {
		return new ResponseEntity<>(interviewService.findAllByAssociate(id), HttpStatus.OK);
    }
}
