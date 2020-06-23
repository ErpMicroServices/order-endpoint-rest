package org.erpmicroservices.peopleandorganizations.api.rest.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
public class Requirement extends AbstractPersistable<UUID> {

 private String description;

 @Column(name = "requirement_creation_date", columnDefinition = "DATE")
 @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
 @JsonFormat(pattern = "yyyy-MM-dd")
 private LocalDate requirementCreationDate;

 @Column(name = "required_by", columnDefinition = "DATE")
 @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
 @JsonFormat(pattern = "yyyy-MM-dd")
 private LocalDate requiredBy;

 private BigDecimal estimatedBudget;

 private Long quantity;

 private String reason;

 @OneToMany(orphanRemoval = true, cascade = CascadeType.ALL)
 @JoinColumn(name = "parent_requirement_id")
 private List<Requirement> subRequirements = new ArrayList<>();

 private UUID facilityId;

 private UUID productId;

 @ManyToOne
 @JoinColumn(name = "requirement_type_id")
 private RequirementType type;

 @OneToMany
 @JoinColumn(name = "requirement_id")
 private List<OrderRequirementCommitment> commitments = new ArrayList<>();

 @OneToMany(orphanRemoval = true, cascade = CascadeType.ALL)
 @JoinColumn(name = "requirement_id")
 private List<RequirementRole> roles;

 @OneToMany(orphanRemoval = true, cascade = CascadeType.ALL)
 @JoinColumn(name = "requirement_id")
 private List<RequirementStatus> statuses = new ArrayList<>();


 public String getDescription() {
	return description;
 }

 public void setDescription(String description) {
	this.description = description;
 }

 public LocalDate getRequirementCreationDate() {
	return requirementCreationDate;
 }

 public void setRequirementCreationDate(LocalDate requirementCreationDate) {
	this.requirementCreationDate = requirementCreationDate;
 }

 public LocalDate getRequiredBy() {
	return requiredBy;
 }

 public void setRequiredBy(LocalDate requiredBy) {
	this.requiredBy = requiredBy;
 }

 public BigDecimal getEstimatedBudget() {
	return estimatedBudget;
 }

 public void setEstimatedBudget(BigDecimal estimatedBudget) {
	this.estimatedBudget = estimatedBudget;
 }

 public Long getQuantity() {
	return quantity;
 }

 public void setQuantity(Long quantity) {
	this.quantity = quantity;
 }

 public String getReason() {
	return reason;
 }

 public void setReason(String reason) {
	this.reason = reason;
 }

 public List<Requirement> getSubRequirements() {
	return subRequirements;
 }

 public void setSubRequirements(List<Requirement> subRequirements) {
	this.subRequirements = subRequirements;
 }

 public UUID getFacilityId() {
	return facilityId;
 }

 public void setFacilityId(UUID facilityId) {
	this.facilityId = facilityId;
 }

 public UUID getProductId() {
	return productId;
 }

 public void setProductId(UUID productId) {
	this.productId = productId;
 }

 public RequirementType getType() {
	return type;
 }

 public void setType(RequirementType type) {
	this.type = type;
 }

 public List<OrderRequirementCommitment> getCommitments() {
	return commitments;
 }

 public void setCommitments(List<OrderRequirementCommitment> commitments) {
	this.commitments = commitments;
 }

 public List<RequirementRole> getRoles() {
	return roles;
 }

 public void setRoles(List<RequirementRole> roles) {
	this.roles = roles;
 }

 public List<RequirementStatus> getStatuses() {
	return statuses;
 }

 public void setStatuses(List<RequirementStatus> statuses) {
	this.statuses = statuses;
 }
}
