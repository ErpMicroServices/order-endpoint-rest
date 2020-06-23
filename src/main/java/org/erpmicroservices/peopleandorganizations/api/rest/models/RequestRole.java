package org.erpmicroservices.peopleandorganizations.api.rest.models;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.UUID;

@Entity(name = "request_role")
public class RequestRole extends AbstractPersistable<UUID> {


 @ManyToOne
 @JoinColumn(name = "request_role_type_id")
 private RequestRoleType type;

 private UUID partyId;

 public RequestRoleType getType() {
	return type;
 }

 public void setType(RequestRoleType type) {
	this.type = type;
 }

 public UUID getPartyId() {
	return partyId;
 }

 public void setPartyId(UUID partyId) {
	this.partyId = partyId;
 }
}
