package org.erpmicroservices.peopleandorganizations.api.rest.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.time.LocalDate;
import java.util.UUID;

@Entity(name = "responding_party")
public class RespondingParty extends AbstractPersistable<UUID> {

 @Column(name = "date_sent", columnDefinition = "DATE")
 @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
 @JsonFormat(pattern = "yyyy-MM-dd")
 private LocalDate dateSent;

 @Column(name = "contact_mechanism_id")
 private UUID contactMechanismId;

 @Column(name = "party_id")
 private UUID partyId;

 public LocalDate getDateSent() {
	return dateSent;
 }

 public void setDateSent(LocalDate dateSent) {
	this.dateSent = dateSent;
 }

 public UUID getContactMechanismId() {
	return contactMechanismId;
 }

 public void setContactMechanismId(UUID contactMechanismId) {
	this.contactMechanismId = contactMechanismId;
 }

 public UUID getPartyId() {
	return partyId;
 }

 public void setPartyId(UUID partyId) {
	this.partyId = partyId;
 }
}
