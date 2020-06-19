package org.erpmicroservices.peopleandorganizations.api.rest.models;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Entity
public class RequirementStatusType extends AbstractPersistable<UUID> {
 @NotBlank
 @NotNull
 private String description;

 @ManyToOne
 private RequirementStatusType parent;

 public String getDescription() {
	return description;
 }

 public void setDescription(String description) {
	this.description = description;
 }

 public RequirementStatusType getParent() {
	return parent;
 }

 public void setParent(RequirementStatusType parent) {
	this.parent = parent;
 }
}
