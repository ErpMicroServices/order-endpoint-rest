package org.erpmicroservices.peopleandorganizations.api.rest.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;
import java.util.UUID;

@Entity
public class RequirementStatus extends AbstractPersistable<UUID> {

 @Column(name = "status_date", columnDefinition = "DATE")
 @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
 @JsonFormat(pattern = "yyyy-MM-dd")
 private LocalDate statusDate;

 @ManyToOne
 @JoinColumn(name = "requirement_status_type_id")
 private RequirementStatusType type;

 public LocalDate getStatusDate() {
	return statusDate;
 }

 public void setStatusDate(LocalDate statusDate) {
	this.statusDate = statusDate;
 }

 public RequirementStatusType getType() {
	return type;
 }

 public void setType(RequirementStatusType type) {
	this.type = type;
 }
}
