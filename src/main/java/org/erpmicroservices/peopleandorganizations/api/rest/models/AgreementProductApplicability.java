package org.erpmicroservices.peopleandorganizations.api.rest.models;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import java.util.UUID;

@Entity(name = "agreement_product_applicability")
public class AgreementProductApplicability extends AbstractPersistable<UUID> {

 private UUID productId;

 public UUID getProductId() {
	return productId;
 }

 public void setProductId(UUID productId) {
	this.productId = productId;
 }
}
