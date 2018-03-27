package com.revature.hydra.interview;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Arrays;

import org.hamcrest.Matchers;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.revature.beans.Interview;
import com.revature.hydra.interview.application.InterviewRepositoryServiceApplication;
import com.revature.hydra.interview.data.InterviewRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = InterviewRepositoryServiceApplication.class)
@WebAppConfiguration
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class InterviewControllerTest {
	@Autowired
	InterviewRepository interviewRepository;
	
	@Autowired
    private WebApplicationContext webApplicationContext;
	
	@Autowired
	void setConverters(HttpMessageConverter<?>[] converters) {
		this.mappingJackson2HttpMessageConverter = Arrays.asList(converters).stream()
					.filter(hmc -> hmc instanceof MappingJackson2HttpMessageConverter)
					.findAny()
					.orElse(null);
		
		Assert.assertNotNull("the JSON message converter must not be null", this.mappingJackson2HttpMessageConverter);
	}
	
	private final String mediaTypeJson = MediaType.APPLICATION_JSON_UTF8_VALUE;
	
	private HttpMessageConverter mappingJackson2HttpMessageConverter;
	
	private MockMvc mockMvc;
	
	private Interview testInterview;
	
	@Before
	public void setUp() throws Exception {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
		this.testInterview = new Interview();
		this.testInterview.setAssociateId(717);
		this.testInterview.setClientId(3);
		this.testInterview.setEndClientId(3);
		this.testInterview.setInterviewDate(null);
		this.testInterview.setInterviewFeedback("test feedback");
		this.testInterview.setInterviewTypeId(2);
		this.testInterview = interviewRepository.save(testInterview);
	}

	@After
	public void tearDown() {
		int testId = this.testInterview.getInterviewId();
		if (this.interviewRepository.findOne(testId) != null) {
			this.interviewRepository.delete(testId);
		}
	}

	@Test
	public void test1AllInterviews() throws Exception {
		this.mockMvc.perform(get("/all/interview"))
					.andExpect(status().isOk())
					.andExpect(content().contentType(mediaTypeJson));
	}
	
	@Test
	public void test2AllInterviewsForAssociate() throws Exception {
		this.mockMvc.perform(get("/all/interview/associate/" + this.testInterview.getAssociateId()))
					.andExpect(status().isOk())
					.andExpect(content().contentType(mediaTypeJson))
					.andExpect(jsonPath("$[*].associateId", Matchers.hasItem(717)))
					.andExpect(jsonPath("$[*].interviewFeedback", Matchers.hasItem(this.testInterview.getInterviewFeedback())));
	}

}
