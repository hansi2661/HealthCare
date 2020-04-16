package com.HelthCare.HealthCare;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/users")
public class userResource {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<user> getAlluser() {
		
		List<user> users = new ArrayList<user>();
		
		user u1 = new user();
		u1.setU_id(0001);
		u1.setU_fname("Supun");
		u1.setU_lname("Madhawa");
		u1.setU_age(24);
		u1.setU_address("Kuliyapitiya");
		u1.setU_sex("Male");
		u1.setU_sex("madhawa@gmail.com");
		u1.setU_username("Madhawa");
		u1.setU_password("madhawa123");
		u1.setU_type("admin");
		u1.setU_contact(07600000000);
		
		user u2 = new user();
		u2.setU_id(0002);
		u2.setU_fname("Sahan");
		u2.setU_lname("Malssri");
		u2.setU_age(23);
		u2.setU_address("Kolonnawa");
		u2.setU_sex("Male");
		u2.setU_sex("sahan@gmail.com");
		u2.setU_username("Sahan");
		u2.setU_password("sahan123");
		u2.setU_type("patient");
		u2.setU_contact(07700000000);
		
		user u3 = new user();
		u3.setU_id(0003);
		u3.setU_fname("Kasun");
		u3.setU_lname("Thilina");
		u3.setU_age(24);
		u3.setU_address("Horana");
		u3.setU_sex("Male");
		u3.setU_sex("kasun@gmail.com");
		u3.setU_username("Kasun");
		u3.setU_password("kasun123");
		u3.setU_type("patient");
		u3.setU_contact(07700000000);
		
		users.add(u1);
		users.add(u2);
		users.add(u3);
		
		return users;
		
		
	}
	
	@POST
	@Path("/user")
	@Consumes(MediaType.APPLICATION_JSON)
	public user createUser(user u4) {
		System.out.println(u4);
		return u4;
	} 
	

}
