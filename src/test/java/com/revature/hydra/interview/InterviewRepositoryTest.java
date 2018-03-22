package com.revature.hydra.interview;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
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
public class InterviewRepositoryTest {

	@Autowired
	InterviewRepository test;

	@Test
	public void testFindAll() {
		List<Interview> interviews = test.findAll();
		assertNotNull(interviews);
	}
	
	@Test
	public void testFindAllByAssociateId() {
		List<Interview> interviews = test.findAllByAssociateId(5501);
		assertNotNull(interviews);
	}

}
