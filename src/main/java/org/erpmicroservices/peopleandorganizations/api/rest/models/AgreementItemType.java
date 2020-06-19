package org.erpmicroservices.peopleandorganizations.api.rest.models;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Entity
public class AgreementItemType extends AbstractPersistable<UUID> {
 @NotBlank
 @NotNull
 private String description;

 @ManyToOne
 private AgreementItemType parent;

 public String getDescription() {
	return description;
 }

 public void setDescription(String description) {
	this.description = description;
 }

 public AgreementItemType getParent() {
	return parent;
 }

 public void setParent(AgreementItemType parent) {
	this.parent = parent;
 }
}
