package org.erpmicroservices.peopleandorganizations.api.rest.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Entity
public class Agreement extends AbstractPersistable<UUID> {

 @Column(name = "agreement_date", columnDefinition = "DATE")
 @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
 @JsonFormat(pattern = "yyyy-MM-dd")
 private LocalDate agreementDate;

 @Column(name = "from_date", columnDefinition = "DATE")
 @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
 @JsonFormat(pattern = "yyyy-MM-dd")
 private LocalDate fromDate;

 @Column(name = "thru_date", columnDefinition = "DATE")
 @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
 @JsonFormat(pattern = "yyyy-MM-dd")
 private LocalDate thruDate;

 private String description;

 private String text;

 @ManyToOne
 @JoinColumn(name = "agreement_type_id")
 private AgreementType type;

 @OneToMany(orphanRemoval = true, cascade = CascadeType.ALL)
 @JoinColumn(name = "agreement_id")
 private List<AgreementItem> items;

 @OneToMany(orphanRemoval = true, cascade = CascadeType.ALL)
 @JoinColumn(name = "agreement_item_id")
 private List<AgreementTerm> terms;

 public LocalDate getAgreementDate() {
	return agreementDate;
 }

 public void setAgreementDate(LocalDate agreementDate) {
	this.agreementDate = agreementDate;
 }

 public LocalDate getFromDate() {
	return fromDate;
 }

 public void setFromDate(LocalDate fromDate) {
	this.fromDate = fromDate;
 }

 public LocalDate getThruDate() {
	return thruDate;
 }

 public void setThruDate(LocalDate thruDate) {
	this.thruDate = thruDate;
 }

 public String getDescription() {
	return description;
 }

 public void setDescription(String description) {
	this.description = description;
 }

 public String getText() {
	return text;
 }

 public void setText(String text) {
	this.text = text;
 }

 public AgreementType getType() {
	return type;
 }

 public void setType(AgreementType type) {
	this.type = type;
 }

 public List<AgreementItem> getItems() {
	return items;
 }

 public void setItems(List<AgreementItem> items) {
	this.items = items;
 }

 public List<AgreementTerm> getTerms() {
	return terms;
 }

 public void setTerms(List<AgreementTerm> terms) {
	this.terms = terms;
 }
}
