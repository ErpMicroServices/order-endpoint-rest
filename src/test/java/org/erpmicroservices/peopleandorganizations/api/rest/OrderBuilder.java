package org.erpmicroservices.peopleandorganizations.api.rest;


import org.erpmicroservices.peopleandorganizations.api.rest.models.Order;
import org.erpmicroservices.peopleandorganizations.api.rest.models.OrderType;
import org.erpmicroservices.peopleandorganizations.api.rest.repositories.OrderRepo;
import org.erpmicroservices.peopleandorganizations.api.rest.repositories.OrderTypeRepo;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static io.cucumber.spring.CucumberTestContext.SCOPE_CUCUMBER_GLUE;

@Component
@Scope(SCOPE_CUCUMBER_GLUE)
public class OrderBuilder {
	private final OrderRepo orderRepo;

	private final OrderTypeRepo orderTypeRepo;
	private final OrderType orderType;

	public OrderBuilder(final OrderRepo orderRepo, final OrderTypeRepo orderTypeRepo) {
		this.orderRepo = orderRepo;
		this.orderTypeRepo = orderTypeRepo;
		orderType = orderTypeRepo.save(OrderType.builder()
				                               .description("This is an order type")
				                               .build());
	}

	public Order build() {

		return orderRepo.save(Order.builder()
				                      .entryDate(LocalDate.now())
				                      .orderDate(LocalDate.now())
				                      .orderIdentifier(UUID.randomUUID().toString())
//				                      .type(orderType)
				                      .build());
	}

	public List<Order> build(int numberOfOrders) {
		List<Order> orders = new ArrayList<>();
		for (int i = 0; i < numberOfOrders; i++) {
			orders.add(build());
		}
		return orders;
	}
}
