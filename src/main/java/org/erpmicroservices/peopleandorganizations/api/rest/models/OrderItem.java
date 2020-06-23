package org.erpmicroservices.peopleandorganizations.api.rest.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity(name = "order_item")
public class OrderItem extends AbstractPersistable<UUID> {

 @ManyToOne
 @JoinColumn(name = "order_type_id")
 private OrderItemType type;

 private long sequenceId;

 private long quantity;

 private BigDecimal unitPrice;

 @Column(name = "estimated_delivery_date", columnDefinition = "DATE")
 @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
 @JsonFormat(pattern = "yyyy-MM-dd")
 private LocalDate estimatedDeliveryDate;

 private String itemDescription;

 private String comment;

 private UUID correspondingPoId;

 @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
 @JoinColumn(name = "ordered_with_id")
 private List<OrderItem> orderedWith = new ArrayList<>();

 private UUID productId;

 private UUID productFeatureId;

 @ManyToOne
 private QuoteItem quoteItem;

 private UUID contactMechanismId;

 private UUID partyRoleId;

 @OneToMany
 @JoinColumn(name = "affecting_order_item_id")
 private List<OrderAdjustment> adjustments = new ArrayList<>();

 @OneToMany
 @JoinColumn(name = "condition_for_order_item_id")
 private List<OrderTerm> terms = new ArrayList<>();

 @OneToMany
 @JoinColumn(name = "status_for_order_item_id")
 private List<OrderStatus> statuses = new ArrayList<>();

 @OneToMany
 @JoinColumn(name = "order_item_id")
 private List<OrderRequirementCommitment> requirementCommitments = new ArrayList<>();

 public List<OrderRequirementCommitment> getRequirementCommitments() {
	return requirementCommitments;
 }

 public void setRequirementCommitments(List<OrderRequirementCommitment> requirementCommitments) {
	this.requirementCommitments = requirementCommitments;
 }

 public List<OrderAdjustment> getAdjustments() {
	return adjustments;
 }

 public void setAdjustments(List<OrderAdjustment> adjustments) {
	this.adjustments = adjustments;
 }

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

 public QuoteItem getQuoteItem() {
	return quoteItem;
 }

 public void setQuoteItem(QuoteItem quoteItem) {
	this.quoteItem = quoteItem;
 }

 public UUID getContactMechanismId() {
	return contactMechanismId;
 }

 public void setContactMechanismId(UUID contactMechanismId) {
	this.contactMechanismId = contactMechanismId;
 }

 public UUID getPartyRoleId() {
	return partyRoleId;
 }

 public void setPartyRoleId(UUID partyRoleId) {
	this.partyRoleId = partyRoleId;
 }

 public OrderItemType getType() {
	return type;
 }

 public void setType(OrderItemType type) {
	this.type = type;
 }

 public long getSequenceId() {
	return sequenceId;
 }

 public void setSequenceId(long sequenceId) {
	this.sequenceId = sequenceId;
 }

 public long getQuantity() {
	return quantity;
 }

 public void setQuantity(long quantity) {
	this.quantity = quantity;
 }

 public BigDecimal getUnitPrice() {
	return unitPrice;
 }

 public void setUnitPrice(BigDecimal unitPrice) {
	this.unitPrice = unitPrice;
 }

 public LocalDate getEstimatedDeliveryDate() {
	return estimatedDeliveryDate;
 }

 public void setEstimatedDeliveryDate(LocalDate estimatedDeliveryDate) {
	this.estimatedDeliveryDate = estimatedDeliveryDate;
 }

 public String getItemDescription() {
	return itemDescription;
 }

 public void setItemDescription(String itemDescription) {
	this.itemDescription = itemDescription;
 }

 public String getComment() {
	return comment;
 }

 public void setComment(String comment) {
	this.comment = comment;
 }

 public UUID getCorrespondingPoId() {
	return correspondingPoId;
 }

 public void setCorrespondingPoId(UUID correspondingPoId) {
	this.correspondingPoId = correspondingPoId;
 }

 public List<OrderItem> getOrderedWith() {
	return orderedWith;
 }

 public void setOrderedWith(List<OrderItem> orderedWith) {
	this.orderedWith = orderedWith;
 }

 public UUID getProductId() {
	return productId;
 }

 public void setProductId(UUID productId) {
	this.productId = productId;
 }

 public UUID getProductFeatureId() {
	return productFeatureId;
 }

 public void setProductFeatureId(UUID productFeatureId) {
	this.productFeatureId = productFeatureId;
 }

 public QuoteItem getQuote() {
	return quoteItem;
 }

 public void setQuote(QuoteItem quoteItem) {
	this.quoteItem = quoteItem;
 }
}
