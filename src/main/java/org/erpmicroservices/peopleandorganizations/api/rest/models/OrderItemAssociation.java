package org.erpmicroservices.peopleandorganizations.api.rest.models;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.UUID;

@Entity(name = "order_item_association")
public class OrderItemAssociation extends AbstractPersistable<UUID> {

 @ManyToOne
 @JoinColumn(name = "sales_order_item_id")
 private OrderItem salesOrderItem;

 @ManyToOne
 @JoinColumn(name = "purchase_order_item_id")
 private OrderItem purchaseOrderItem;

 public OrderItem getSalesOrderItem() {
  return salesOrderItem;
 }

 public void setSalesOrderItem(OrderItem salesOrderItem) {
  this.salesOrderItem = salesOrderItem;
 }

 public OrderItem getPurchaseOrderItem() {
  return purchaseOrderItem;
 }

 public void setPurchaseOrderItem(OrderItem purchaseOrderItem) {
  this.purchaseOrderItem = purchaseOrderItem;
 }
}
