package org.erpmicroservices.peopleandorganizations.api.rest.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Entity(name = "quote")
public class Quote extends AbstractPersistable<UUID> {

 @Column(name = "issue_date", columnDefinition = "DATE")
 @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
 @JsonFormat(pattern = "yyyy-MM-dd")
 private LocalDate issueDate;

 @Column(name = "valid_from_date", columnDefinition = "DATE")
 @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
 @JsonFormat(pattern = "yyyy-MM-dd")
 private LocalDate validFromDate;

 @Column(name = "valid_thru_date", columnDefinition = "DATE")
 @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
 @JsonFormat(pattern = "yyyy-MM-dd")
 private LocalDate validThruDate;

 private String description;

 @ManyToOne
 @JoinColumn(name = "quote_type_id")
 private QuoteType type;

 private UUID issuedByPartyId;

 private UUID givenToPartyId;

 @OneToMany
 @JoinColumn(name = "quote_id")
 private List<QuoteRole> roles;

 @OneToMany(orphanRemoval = true, cascade = CascadeType.ALL)
 @JoinColumn(name = "quote_id")
 private List<QuoteTerm> terms;

 @OneToMany(orphanRemoval = true, cascade = CascadeType.ALL)
 @JoinColumn(name = "quote_id")
 private List<QuoteItem> items;

 public LocalDate getIssueDate() {
	return issueDate;
 }

 public void setIssueDate(LocalDate issueDate) {
	this.issueDate = issueDate;
 }

 public LocalDate getValidFromDate() {
	return validFromDate;
 }

 public void setValidFromDate(LocalDate validFromDate) {
	this.validFromDate = validFromDate;
 }

 public LocalDate getValidThruDate() {
	return validThruDate;
 }

 public void setValidThruDate(LocalDate validThruDate) {
	this.validThruDate = validThruDate;
 }

 public String getDescription() {
	return description;
 }

 public void setDescription(String description) {
	this.description = description;
 }

 public QuoteType getType() {
	return type;
 }

 public void setType(QuoteType type) {
	this.type = type;
 }

 public UUID getIssuedByPartyId() {
	return issuedByPartyId;
 }

 public void setIssuedByPartyId(UUID issuedByPartyId) {
	this.issuedByPartyId = issuedByPartyId;
 }

 public UUID getGivenToPartyId() {
	return givenToPartyId;
 }

 public void setGivenToPartyId(UUID givenToPartyId) {
	this.givenToPartyId = givenToPartyId;
 }
}
