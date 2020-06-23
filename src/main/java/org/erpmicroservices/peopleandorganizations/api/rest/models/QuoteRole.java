package org.erpmicroservices.peopleandorganizations.api.rest.models;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.UUID;

@Entity(name = "quote_role")
public class QuoteRole extends AbstractPersistable<UUID> {

 @ManyToOne
 @JoinColumn(name = "quote_role_type_id")
 private QuoteRoleType type;

 private UUID partyId;

 public QuoteRoleType getType() {
	return type;
 }

 public void setType(QuoteRoleType type) {
	this.type = type;
 }

 public UUID getPartyId() {
	return partyId;
 }

 public void setPartyId(UUID partyId) {
	this.partyId = partyId;
 }
}
