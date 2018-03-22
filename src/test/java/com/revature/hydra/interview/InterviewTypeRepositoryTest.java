package com.revature.hydra.interview;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
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
public class InterviewTypeRepositoryTest {

	@Autowired
	InterviewTypeRepository test;

	@Test
	public void testFindAll() {
		List<InterviewType> interviewTypes = test.findAll();
		assertNotNull(interviewTypes);
	}

}
