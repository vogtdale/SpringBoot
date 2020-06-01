package com.meetup;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.meetup.Model.PersonneModel;
import com.meetup.Model.Role;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.security.test.web.servlet.setup.SecurityMockMvcConfigurers.springSecurity;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
class MeetupsApplicationTests {

	@Autowired
	private WebApplicationContext context;

	@Autowired
	ObjectMapper mapper;

	private MockMvc mvc;

	@BeforeEach
	public void beforeAll() {
		mvc = MockMvcBuilders
				.webAppContextSetup(context)
				.apply(springSecurity())
				.build();

	}

	/*@Test
	@WithMockUser(username = "admin", roles={"ADMIN"})
	void contextLoads() throws Exception {
		mvc.perform(get("/user/{id}", 1).contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk());
	}*/

	/*@Test
	@WithMockUser(username = "admin", roles={"ADMIN"})
	void contextLoads() throws Exception {
		mvc.perform(get("/user/", 1).accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk());
	}*/

	/*@Test
	@WithMockUser(username = "admin", roles={"ADMIN"})
	void contextLoads() throws Exception {
		PersonneModel personneModel = new PersonneModel();
		personneModel.setUsername("root");
		personneModel.setPassword("root");
		personneModel.setEmail("root@root.fr");
		personneModel.setGender("M");
		personneModel.setId(24);
		personneModel.setRoles(personneModel.getRoles());
		personneModel.setSurname("doe");

		String json = mapper.writeValueAsString(personneModel);

		mvc.perform(
				put("/users/add", 1)
						.contentType(MediaType.APPLICATION_JSON)
						.accept(MediaType.APPLICATION_JSON)
						.content(json)

				)

				.andExpect(status().isOk());
	}*/

	/*@Test
	@WithMockUser(username = "admin", roles={"ADMIN"})
	void contextLoads() throws Exception {
		mvc.perform(get("/user/", 1).accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk());
	}*/

	/*@Test
	@WithMockUser(username = "admin", roles={"ADMIN"})
	void contextLoads() throws Exception {
		mvc.perform(
				get("/user/", 1))

				.andExpect(MockMvcResultMatchers
						.jsonPath("$[1].username")
						.value("john")

				);


	}*/

	@Test
	void contextLoads() throws Exception {

		PersonneModel personneModel = new PersonneModel();
		personneModel.setUsername("test2");
		personneModel.setPassword("test2");
		personneModel.setEmail("root@root.fr");
		personneModel.setGender("M");
		personneModel.setId(50);
		personneModel.setRoles(personneModel.getRoles());
		personneModel.setSurname("doe");
		String json = mapper.writeValueAsString(personneModel);

		mvc.perform(
				put("/api/auth/signup")
						.contentType(MediaType.APPLICATION_JSON)
						.accept(MediaType.APPLICATION_JSON)
						.content(json))
				.andExpect(status().isOk());

		String token = mvc.perform(
				post("/api/auth/signin")
						.contentType(MediaType.APPLICATION_JSON)
						.accept(MediaType.APPLICATION_JSON)
						.content(json))
				.andExpect(status().isOk())
				.andReturn()
				.getResponse()
				.getContentAsString();

		mvc.perform(
				get("/user")
						.header("authorization", "Bearer " + token)
		)
				.andExpect(status().isOk());
	}

}
