package org.erpmicroservices.peopleandorganizations.api.rest.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity(name = "order")
public class Order extends AbstractPersistable<UUID> {

 @ManyToOne
 @JoinColumn(name = "order_type_id")
 private OrderType type;

 private String orderIdentifier;

 @Column(name = "order_date", columnDefinition = "DATE")
 @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
 @JsonFormat(pattern = "yyyy-MM-dd")
 private LocalDate orderDate;

 @Column(name = "entry_date", columnDefinition = "DATE")
 @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
 @JsonFormat(pattern = "yyyy-MM-dd")
 private LocalDate entryDate;

 @OneToMany(orphanRemoval = true, cascade = CascadeType.ALL)
 @JoinColumn(name = "order_id")
 private List<OrderItem> items = new ArrayList<>();

 private UUID placedUsingContactMechanismId;

 private UUID takenViaContactMechanismId;

 private UUID billingLocationContactMechanismId;

 @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
 @JoinColumn(name = "order_id")
 private List<OrderRole> roles = new ArrayList<>();

 private UUID placedByPartyRoleId;

 private UUID takenByPartyRoleId;

 private UUID withRequestedBillToPartyRoleId;

 @OneToMany
 @JoinColumn(name = "affecting_order_id")
 private List<OrderAdjustment> adjustments = new ArrayList<>();

 @OneToMany
 @JoinColumn(name = "condition_for_order_id")
 private List<OrderTerm> terms;

 @OneToMany
 @JoinColumn(name = "status_for_order_id")
 private List<OrderStatus> statuses = new ArrayList<>();

 public List<OrderTerm> getTerms() {
  return terms;
 }

 public void setTerms(List<OrderTerm> terms) {
  this.terms = terms;
 }

 public List<OrderStatus> getStatuses() {
  return statuses;
 }

 public void setStatuses(List<OrderStatus> statuses) {
  this.statuses = statuses;
 }

 public List<OrderRole> getRoles() {
  return roles;
 }

 public void setRoles(List<OrderRole> roles) {
  this.roles = roles;
 }

 public UUID getPlacedByPartyRoleId() {
  return placedByPartyRoleId;
 }

 public void setPlacedByPartyRoleId(UUID placedByPartyRoleId) {
  this.placedByPartyRoleId = placedByPartyRoleId;
 }

 public UUID getTakenByPartyRoleId() {
  return takenByPartyRoleId;
 }

 public void setTakenByPartyRoleId(UUID takenByPartyRoleId) {
  this.takenByPartyRoleId = takenByPartyRoleId;
 }

 public UUID getWithRequestedBillToPartyRoleId() {
  return withRequestedBillToPartyRoleId;
 }

 public void setWithRequestedBillToPartyRoleId(UUID withRequestedBillToPartyRoleId) {
  this.withRequestedBillToPartyRoleId = withRequestedBillToPartyRoleId;
 }

 public List<OrderAdjustment> getAdjustments() {
  return adjustments;
 }

 public void setAdjustments(List<OrderAdjustment> adjustments) {
  this.adjustments = adjustments;
 }

 public OrderType getType() {
  return type;
 }

 public void setType(OrderType type) {
  this.type = type;
 }

 public UUID getPlacedUsingContactMechanismId() {
  return placedUsingContactMechanismId;
 }

 public void setPlacedUsingContactMechanismId(UUID placedUsingContactMechanismId) {
  this.placedUsingContactMechanismId = placedUsingContactMechanismId;
 }

 public UUID getTakenViaContactMechanismId() {
  return takenViaContactMechanismId;
 }

 public void setTakenViaContactMechanismId(UUID takenViaContactMechanismId) {
  this.takenViaContactMechanismId = takenViaContactMechanismId;
 }

 public UUID getBillingLocationContactMechanismId() {
  return billingLocationContactMechanismId;
 }

 public void setBillingLocationContactMechanismId(UUID billingLocationContactMechanismId) {
  this.billingLocationContactMechanismId = billingLocationContactMechanismId;
 }

 public String getOrderIdentifier() {
  return orderIdentifier;
 }

 public void setOrderIdentifier(String orderId) {
  this.orderIdentifier = orderId;
 }

 public LocalDate getOrderDate() {
  return orderDate;
 }

 public void setOrderDate(LocalDate orderDate) {
  this.orderDate = orderDate;
 }

 public LocalDate getEntryDate() {
  return entryDate;
 }

 public void setEntryDate(LocalDate entryDate) {
  this.entryDate = entryDate;
 }

 public List<OrderItem> getItems() {
  return items;
 }

 public void setItems(List<OrderItem> items) {
  this.items = items;
 }
}
