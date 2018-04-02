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

import com.revature.beans.InterviewType;
import com.revature.hydra.interview.application.InterviewRepositoryServiceApplication;
import com.revature.hydra.interview.data.InterviewTypeRepository;

/**
 * Test Class for testing the functionality of the InterviewTypeRespository
 * @author Omowumi
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = InterviewRepositoryServiceApplication.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class InterviewTypeRepositoryTest {
	private final static Logger log = Logger.getLogger(InterviewTypeRepositoryTest.class);

	@Autowired
	InterviewTypeRepository interviewTypeRepository;
	
	InterviewType testInterviewType;
	
	Integer testId;

	/**
	 * Create a test interview type in table to test on
	 * @throws Exception
	 */
	@Before
	public void init() {
		log.info("init");
		testInterviewType = new InterviewType();
		testInterviewType.setInterviewTypeName("testType");
		testInterviewType = interviewTypeRepository.save(testInterviewType);
		testId = testInterviewType.getInterviewTypeId();
	}
	
	/**
	 * Remove test interview type so that it doesn't cause problems with repeated runs 
	 * of the test and isn't left in database for production
	 */
	@After
	public void teardown() {
		log.info("teardown");
		if (interviewTypeRepository.findOne(testId) != null) {
			interviewTypeRepository.delete(testId);
		}
	}

	/**
	 * Test finding all interview types into a list
	 */
	@Test
	public void test1FindAll() {
		log.info("test1FindAll");
		List<InterviewType> interviewTypes = interviewTypeRepository.findAll();
		assertNotNull(interviewTypes);
	}
	
	/**
	 * Test finding one interview type by id
	 */
	@Test
	public void test2FindOne() {
		log.info("test2FindOne");
		InterviewType it = interviewTypeRepository.findOne(testId);
		assertEquals(it.getInterviewTypeName(), testInterviewType.getInterviewTypeName());
	}
	
	/**
	 * Test updating an interview type name
	 */
	@Test
	public void test3Update() {
		log.info("test3Update");
		testInterviewType.setInterviewTypeName("Test New Name");
		InterviewType updatedIt = interviewTypeRepository.save(testInterviewType);
		assertEquals(updatedIt.getInterviewTypeName(), testInterviewType.getInterviewTypeName());
	}
	
	/**
	 * Test deleting an interview type
	 */
	@Test
	public void test4Delete() {
		log.info("test4Delete");
		interviewTypeRepository.delete(testId);
		
		assertNull(interviewTypeRepository.findOne(testId));
	}

}
