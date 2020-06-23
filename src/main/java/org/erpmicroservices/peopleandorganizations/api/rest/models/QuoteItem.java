package org.erpmicroservices.peopleandorganizations.api.rest.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Entity(name = "quote_item")
public class QuoteItem extends AbstractPersistable<UUID> {

 private Long sequence;

 private Long quantity;

 private BigDecimal quoteUnitPrice;

 @Column(name = "estimated_delivery_date", columnDefinition = "DATE")
 @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
 @JsonFormat(pattern = "yyyy-MM-dd")
 private LocalDate estimatedDeliveryDate;

 @NotBlank
 @NotNull
 private String comment;

 @OneToMany(orphanRemoval = true, cascade = CascadeType.ALL)
 @JoinColumn(name = "quote_item_id")
 private List<QuoteTerm> terms;

 private UUID productId;

 private UUID workEffortId;

 public Long getSequence() {
	return sequence;
 }

 public void setSequence(Long sequence) {
	this.sequence = sequence;
 }

 public Long getQuantity() {
	return quantity;
 }

 public void setQuantity(Long quantity) {
	this.quantity = quantity;
 }

 public BigDecimal getQuoteUnitPrice() {
	return quoteUnitPrice;
 }

 public void setQuoteUnitPrice(BigDecimal quoteUnitPrice) {
	this.quoteUnitPrice = quoteUnitPrice;
 }

 public LocalDate getEstimatedDeliveryDate() {
	return estimatedDeliveryDate;
 }

 public void setEstimatedDeliveryDate(LocalDate estimatedDeliveryDate) {
	this.estimatedDeliveryDate = estimatedDeliveryDate;
 }

 public String getComment() {
	return comment;
 }

 public void setComment(String comment) {
	this.comment = comment;
 }

 public List<QuoteTerm> getTerms() {
	return terms;
 }

 public void setTerms(List<QuoteTerm> terms) {
	this.terms = terms;
 }

 public UUID getProductId() {
	return productId;
 }

 public void setProductId(UUID productId) {
	this.productId = productId;
 }

 public UUID getWorkEffortId() {
	return workEffortId;
 }

 public void setWorkEffortId(UUID workEffortId) {
	this.workEffortId = workEffortId;
 }
}
