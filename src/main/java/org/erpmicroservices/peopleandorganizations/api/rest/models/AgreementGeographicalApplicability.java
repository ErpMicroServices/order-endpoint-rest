package org.erpmicroservices.peopleandorganizations.api.rest.models;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import java.util.UUID;

@Entity(name = "agreement_geographical_applicability")
public class AgreementGeographicalApplicability extends AbstractPersistable<UUID> {

 private UUID geographicBoundaryId;

 public UUID getGeographicBoundaryId() {
	return geographicBoundaryId;
 }

 public void setGeographicBoundaryId(UUID geographicBoundaryId) {
	this.geographicBoundaryId = geographicBoundaryId;
 }
}
