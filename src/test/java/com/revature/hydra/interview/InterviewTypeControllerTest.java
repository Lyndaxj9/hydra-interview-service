package com.revature.hydra.interview;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.io.IOException;
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
import org.springframework.mock.http.MockHttpOutputMessage;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.revature.beans.InterviewType;
import com.revature.hydra.interview.application.InterviewRepositoryServiceApplication;
import com.revature.hydra.interview.data.InterviewTypeRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = InterviewRepositoryServiceApplication.class)
@WebAppConfiguration
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class InterviewTypeControllerTest {
	@Autowired
	InterviewTypeRepository interviewTypeRepository;
	
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
	
	private InterviewType testInterviewType;
	
	@Before
	public void setUp() throws Exception {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
		this.testInterviewType = new InterviewType();
		this.testInterviewType.setInterviewTypeName("testType");
		this.testInterviewType = interviewTypeRepository.save(this.testInterviewType);
	}

	@After
	public void tearDown() {
		int testId = this.testInterviewType.getInterviewTypeId();
		if (this.interviewTypeRepository.findOne(testId) != null) {
			this.interviewTypeRepository.delete(testId);
		}
	}

	@Test
	public void test1AllInterviewTypes() throws Exception {
		this.mockMvc.perform(get("/all/interviewtype"))
					.andExpect(status().isOk())
					.andExpect(content().contentType(mediaTypeJson))
					.andExpect(jsonPath("$[*].interviewTypeName", Matchers.hasItem("Phone")));
	}
	
	@Test
	public void test2AddInterviewType() throws Exception {
		InterviewType addIt = new InterviewType();
		addIt.setInterviewTypeName("addTestType");
		this.mockMvc.perform(post("/add/interviewtype")
					.content(this.json(addIt))
					.contentType(this.mediaTypeJson))
					.andExpect(status().isCreated());
	}

	@Test
	public void test3UpdateInterviewType() throws Exception {
		this.testInterviewType.setInterviewTypeName("testUpdateName");
		this.mockMvc.perform(put("/update/interviewtype/" + this.testInterviewType.getInterviewTypeId())
					.content(this.json(this.testInterviewType))
					.contentType(this.mediaTypeJson))
					.andExpect(status().isOk());
	}
	
	@Test
	public void test4DeleteInterviewType() throws Exception {
		this.mockMvc.perform(delete("/delete/interviewtype/" + this.testInterviewType.getInterviewTypeId()))
					.andExpect(status().isOk());
	}
	
	protected String json(Object obj) throws IOException {
		MockHttpOutputMessage mockHttpOutputMessage = new MockHttpOutputMessage();
		this.mappingJackson2HttpMessageConverter.write(obj, MediaType.APPLICATION_JSON, mockHttpOutputMessage);
		return mockHttpOutputMessage.getBodyAsString();
	}

}
