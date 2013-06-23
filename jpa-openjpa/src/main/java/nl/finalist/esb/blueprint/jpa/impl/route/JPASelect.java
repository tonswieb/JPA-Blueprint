package nl.finalist.esb.blueprint.jpa.impl.route;

import nl.finalist.esb.blueprint.jpa.TestRepository;

import org.apache.camel.builder.RouteBuilder;

public class JPASelect extends RouteBuilder {

	private TestRepository testRepository;
	
	@Override
	public void configure() throws Exception {
		
		from("jetty:http://localhost:8080").setBody(header("key")).bean(testRepository, "add");
		from("jetty:http://localhost:8081").setBody(header("key")).bean(testRepository, "get");
	}

	public TestRepository getTestRepository() {
		return testRepository;
	}

	public void setTestRepository(TestRepository testRepository) {
		this.testRepository = testRepository;
	}
}
