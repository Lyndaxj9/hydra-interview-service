package com.revature.hydra.interview;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.revature.beans.Interview;
import com.revature.hydra.interview.application.InterviewRepositoryServiceApplication;
import com.revature.hydra.interview.data.InterviewRepository;

/**
 * Test Class for testing the functionality of the InterviewRespository
 * @author Omowumi
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = InterviewRepositoryServiceApplication.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class InterviewRepositoryTest {
	private static final Logger log = Logger.getLogger(InterviewRepositoryTest.class);

	@Autowired
	InterviewRepository interviewRepository;
	
	Interview testInterview;
	
	Integer testId;

	/**
	 * Create a test interview in table to test on
	 * @throws Exception
	 */
	@Before
	public void init() {
		log.info("init()");
		testInterview = new Interview();
		testInterview.setInterviewId(0);
		testInterview.setAssociateId(213);
		testInterview.setClientId(3);
		testInterview.setEndClientId(null);
		testInterview.setInterviewDate(null);
		testInterview.setInterviewFeedback("test wow amazing");
		testInterview.setInterviewTypeId(2);
		testInterview = interviewRepository.save(testInterview);
		testId = testInterview.getInterviewId();
	}
	
	/**
	 * Remove test interview so that it doesn't cause problems with repeated runs 
	 * of the test and isn't left in database for production
	 */
	@After
	public void teardown() {
		log.info("teardown()");
		if (interviewRepository.findOne(testId) != null) {
			interviewRepository.delete(testId);
		}
	}
	
/*	@Test
	public void test1AddInterview() {
		log.info("test1AddInterview()");
		testInterview = interviewRepository.save(testInterview);
		testId = testInterview.getInterviewId();
		
		assertTrue(interviewRepository.findAll().contains(testInterview));
	}*/
	
	/**
	 * Test finding all interviews from table into a list
	 */
	@Test
	public void test2FindAll() {
		log.info("test2FindAll()");
		List<Interview> interviews = interviewRepository.findAll();
		assertNotNull(interviews);
	}
	
	/**
	 * Test updating a interview in table
	 */
	@Test
	public void test3UpdateInterview() {
		log.info("test3UpdateInterview");
		testInterview.setEndClientId(5);
		testInterview.setInterviewTypeId(3);
		Interview updatedInterview = interviewRepository.save(testInterview);
		assertEquals(updatedInterview.getEndClientId(), testInterview.getEndClientId());
	}

	/**
	 * Test finding all interviews for an associate id into a list
	 */
	@Test
	public void test4FindAllByAssociateIdExists() {
		log.info("test3FindAllByAssociateIdExists: ");
		List<Interview> interviews = interviewRepository.findAllByAssociateId(5501);
		assertNotNull(interviews);
	}
	
	/**
	 * Test deleting an interview from table
	 */
	@Test
	public void test5DeleteInterview() {
		log.info("test4DeleteInterview()");
		interviewRepository.delete(testId);
		
		assertNull(interviewRepository.findOne(testId));
	}

}
