package com.finalexception.backendapp.resource;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(SpringJUnit4ClassRunner.class)
public class AppInfoTest {

	private MockMvc mockMvc;
	
	@InjectMocks
	private AppInfo appInfo;
	
	@Before
	public void setUp() throws Exception {
		
		mockMvc = MockMvcBuilders.standaloneSetup(appInfo).build();
	}
	
	@Test
	public void shouldReceiveAppInfo() throws Exception {
		 
		mockMvc.perform(MockMvcRequestBuilders.get("/info"))
					.andExpect(MockMvcResultMatchers.status().isOk())
					.andExpect(MockMvcResultMatchers.content().string("Infox"));														
	}
}
