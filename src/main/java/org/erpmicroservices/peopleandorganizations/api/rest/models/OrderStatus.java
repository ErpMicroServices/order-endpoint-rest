package org.erpmicroservices.peopleandorganizations.api.rest.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity(name = "order_status")
public class OrderStatus extends AbstractPersistable<UUID> {

 @Column(name = "status_changed", columnDefinition = "DATE")
 @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
 @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
 private LocalDateTime statusChanged;

 @ManyToOne
 @JoinColumn(name = "status_for_order_item_id")
 private OrderItem statusForItem;

 @ManyToOne
 @JoinColumn(name = "status_for_order_id")
 private Order statusForOrder;

 @ManyToOne
 @JoinColumn(name = "order_status_type_id")
 private OrderStatusType type;

 public OrderStatusType getType() {
	return type;
 }

 public void setType(OrderStatusType type) {
	this.type = type;
 }

 public LocalDateTime getStatusChanged() {
	return statusChanged;
 }

 public void setStatusChanged(LocalDateTime statusChanged) {
	this.statusChanged = statusChanged;
 }

 public OrderItem getStatusForItem() {
	return statusForItem;
 }

 public void setStatusForItem(OrderItem statusForItem) {
	this.statusForItem = statusForItem;
 }

 public Order getStatusForOrder() {
	return statusForOrder;
 }

 public void setStatusForOrder(Order statusForOrder) {
	this.statusForOrder = statusForOrder;
 }

}
