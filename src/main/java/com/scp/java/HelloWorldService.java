package com.scp.java;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/Customers")
public class HelloWorldService {
	
	@GET
	@Produces("text/html")
	public Response getLocalCust()
	{
		
		 String output = "I am from 'getLocalCust' method";
         return Response.status(200).entity(output).build();
	}
	@GET
	@Path("{name}/{country}")
	@Produces("text/html")
	public Response getResultByPassingValue(@PathParam("name") String name,@PathParam("country") String Country)
	{
		String output = "Customer name - "+name+", Country - "+Country+"";
        return Response.status(200).entity(output).build();
	}

}
