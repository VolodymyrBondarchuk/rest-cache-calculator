package com.calculator.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Controller;


@Controller
@Path("/divide")
public class DivideController {
	
	private static final Logger log = LoggerFactory.getLogger(DivideController.class);

	@GET
	public Response divide() {

		return Response.status(400).entity("Please add parametrs to the request").build();

	}
	
	@GET
	@Path("{a}")
	@Produces(MediaType.APPLICATION_JSON)
	@Cacheable(value="divideCache")
	public Double divide(@PathParam("a") Double a) {

		log.debug("Parametrs: "+a);
		return a;

	}
	
	@GET
	@Path("{a}/{b}")
	@Produces(MediaType.APPLICATION_JSON)
	@Cacheable(value="divideCache")
	public Double divide(@PathParam("a") Double a, @PathParam("b") Double b) {
		log.debug("Parametrs: "+a+", "+b);
		Double result = 0.0;
		if(b!=0){
			result = a / b;
			
		}
		
		return result;

	}
	
	@GET
	@Path("{a}/{b}/{c}")
	@Produces(MediaType.APPLICATION_JSON)
	@Cacheable(value="divideCache")
	public Double divide(@PathParam("a") Double a, @PathParam("b") Double b, @PathParam("c") Double c) {
		log.debug("Parametrs: "+a+", "+b+", "+c);
		Double result = 0.0;
		if(b!=0 && c!=0){
			result = a / b /c;
			
		}
		
		return result;

	}

}