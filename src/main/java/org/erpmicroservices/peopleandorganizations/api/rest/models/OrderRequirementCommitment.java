package org.erpmicroservices.peopleandorganizations.api.rest.models;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.UUID;

@Entity(name = "order_requirement_commitment")
public class OrderRequirementCommitment extends AbstractPersistable<UUID> {

 private Long quantity;

 @ManyToOne
 @JoinColumn(name = "requirement_id")
 private Requirement requirement;

 @ManyToOne
 @JoinColumn(name = "order_item_id")
 private OrderItem orderItem;

 public Long getQuantity() {
	return quantity;
 }

 public void setQuantity(Long quantity) {
	this.quantity = quantity;
 }

 public Requirement getRequirement() {
	return requirement;
 }

 public void setRequirement(Requirement requirement) {
	this.requirement = requirement;
 }

 public OrderItem getOrderItem() {
	return orderItem;
 }

 public void setOrderItem(OrderItem orderItem) {
	this.orderItem = orderItem;
 }
}
