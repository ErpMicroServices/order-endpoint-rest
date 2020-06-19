package org.erpmicroservices.peopleandorganizations.api.rest.models;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Entity
public class AgreementType extends AbstractPersistable<UUID> {
 @NotBlank
 @NotNull
 private String description;

 @ManyToOne
 private AgreementType parent;

 public String getDescription() {
	return description;
 }

 public void setDescription(String description) {
	this.description = description;
 }

 public AgreementType getParent() {
	return parent;
 }

 public void setParent(AgreementType parent) {
	this.parent = parent;
 }
}
