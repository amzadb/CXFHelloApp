package com.cxf.practice;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import org.springframework.stereotype.Service;

@Service
@Path("/helloService")
public class HelloService {

	@GET
	@Path("/hello")
	@Produces("text/plain")
	public String sayHello() {
		return "Hello World! Welcome to CXF Rest Service.";
	}

	@GET
	@Path("/hello1/{name}")
	@Produces("text/plain")
	public String sayHelloPathParam(@PathParam("name") String name) {
		return "Hello, " + name + "!";
	}

	@GET
	@Path("/hello2")
	@Produces("text/plain")
	public String sayHelloQueryParam(@QueryParam("name") String name) {
		if (name != null) {
			return "Hello, " + name + "!";
		} else {
			return "Hello, Welcome to CXF Rest Service.";
		}
	}

}
