package com.shri.rest.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.shri.fw.base.FilterCriteria;

@Path("/main")
public class TestService {

	@Path("/getTest")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getTest() {
		return "Hello Shrikar, Rest is also successful...";
	}

	@Path("/getCriteria")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public FilterCriteria getCriteria() {
		FilterCriteria criteria = new FilterCriteria();
		criteria.setName("fname");
		criteria.setValue("Shrikar");
		return criteria;
	}
}
