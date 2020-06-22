package org.erpmicroservices.peopleandorganizations.api.rest.models;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.util.UUID;

@Entity(name = "order_adjustment")
public class OrderAdjustment extends AbstractPersistable<UUID> {

 @ManyToOne
 @JoinColumn(name = "order_adjustment_type_id")
 private OrderAdjustmentType type;

 private BigDecimal amount;

 private BigDecimal percentage;

 @ManyToOne
 @JoinColumn(name = "affecting_order_item_id")
 private OrderItem affectingItem;

 @ManyToOne
 @JoinColumn(name = "affecting_order_id")
 private Order affectingOrder;

 public OrderAdjustmentType getType() {
	return type;
 }

 public void setType(OrderAdjustmentType type) {
	this.type = type;
 }

 public BigDecimal getAmount() {
	return amount;
 }

 public void setAmount(BigDecimal amount) {
	this.amount = amount;
 }

 public BigDecimal getPercentage() {
	return percentage;
 }

 public void setPercentage(BigDecimal percentage) {
	this.percentage = percentage;
 }

 public OrderItem getAffectingItem() {
	return affectingItem;
 }

 public void setAffectingItem(OrderItem affectingItem) {
	this.affectingItem = affectingItem;
 }

 public Order getAffectingOrder() {
	return affectingOrder;
 }

 public void setAffectingOrder(Order affectingOrder) {
	this.affectingOrder = affectingOrder;
 }
}
