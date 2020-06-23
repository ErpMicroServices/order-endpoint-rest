package org.erpmicroservices.peopleandorganizations.api.rest.models;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import java.util.UUID;

@Entity(name = "agreement_organization_applicability")
public class AgreementOrganizationApplicability extends AbstractPersistable<UUID> {

 private UUID organizationId;

 public UUID getOrganizationId() {
	return organizationId;
 }

 public void setOrganizationId(UUID organizationId) {
	this.organizationId = organizationId;
 }
}
