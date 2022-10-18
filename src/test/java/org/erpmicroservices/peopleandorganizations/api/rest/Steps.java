package org.erpmicroservices.peopleandorganizations.api.rest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.erpmicroservices.peopleandorganizations.api.rest.models.Order;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class Steps {

	@Autowired
	private OrderBuilder orderBuilder;
	private List<Order> orderList;

	@Given("{int} orders exist")
	public void orders_exist(Integer numberOfOrders) {
		orderList = orderBuilder.build(numberOfOrders);
	}

	@When("I get a list")
	public void i_get_a_list() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("all {int} orders are in it")
	public void all_orders_are_in_it(Integer int1) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

}
