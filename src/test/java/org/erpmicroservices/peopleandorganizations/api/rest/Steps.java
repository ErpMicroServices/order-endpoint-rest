package org.erpmicroservices.peopleandorganizations.api.rest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.erpmicroservices.peopleandorganizations.api.rest.models.Order;
import org.erpmicroservices.peopleandorganizations.api.rest.models.OrderType;
import org.erpmicroservices.peopleandorganizations.api.rest.repositories.OrderRepo;
import org.erpmicroservices.peopleandorganizations.api.rest.repositories.OrderTypeRepo;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class Steps {

	@Autowired
	private OrderBuilder orderBuilder;
	private List<Order> expectedOrderList;

	private List<Order> actualOrderList;

	@Autowired
	private OrderTypeRepo orderTypeRepo;

	@Autowired
	private OrderRepo orderRepo;

	@Autowired
	private TestRestTemplate client;

	@Given("{int} orders exist")
	public void orders_exist(Integer numberOfOrders) {
		expectedOrderList = orderBuilder.build(numberOfOrders);
	}

	@When("I get a list")
	public void i_get_a_list() {
		final List<OrderType> all = orderTypeRepo.findAll();
		final List<Order> orders = orderRepo.findAll();
		final ResponseEntity<String> responseEntity = client
				                                              .getForEntity("/orders", String.class);
		responseEntity.getBody();
//		actualOrderList =
//				            Arrays.asList(client
//				                  .getForEntity("/orders", Order[].class).getBody());

	}

	@Then("all {int} orders are in it")
	public void all_orders_are_in_it(Integer int1) {
		Assertions.assertEquals(expectedOrderList.size(), actualOrderList.size());
	}

}
