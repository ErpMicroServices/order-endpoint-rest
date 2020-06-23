package org.erpmicroservices.peopleandorganizations.api.rest.models;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity(name = "agreement_item")
public class AgreementItem extends AbstractPersistable<UUID> {

 private Long sequence;

 private String agreementText;

 private String agreementImage;

 @ManyToOne
 @JoinColumn(name = "agreement_item_type_id")
 private AgreementItemType type;

 @OneToMany(orphanRemoval = true, cascade = CascadeType.ALL)
 @JoinColumn(name = "agreement_item_id")
 private List<AgreementOrganizationApplicability> appliesToOrganizations;

 @OneToMany(orphanRemoval = true, cascade = CascadeType.ALL)
 @JoinColumn(name = "agreement_item_id")
 private List<AgreementProductApplicability> appliesToProducts;

 @OneToMany(orphanRemoval = true, cascade = CascadeType.ALL)
 @JoinColumn(name = "agreement_item_id")
 private List<AgreementGeographicalApplicability> appliesToGeographicBoundaries;

 @OneToMany(orphanRemoval = true, cascade = CascadeType.ALL)
 @JoinColumn(name = "parent_id")
 private List<AgreementItem> subItems;

 @OneToMany(orphanRemoval = true, cascade = CascadeType.ALL)
 @JoinColumn(name = "agreement_item_id")
 private List<AgreementTerm> terms;

 public Long getSequence() {
	return sequence;
 }

 public void setSequence(Long sequence) {
	this.sequence = sequence;
 }

 public String getAgreementText() {
	return agreementText;
 }

 public void setAgreementText(String agreementText) {
	this.agreementText = agreementText;
 }

 public String getAgreementImage() {
	return agreementImage;
 }

 public void setAgreementImage(String agreementImage) {
	this.agreementImage = agreementImage;
 }

 public AgreementItemType getType() {
	return type;
 }

 public void setType(AgreementItemType type) {
	this.type = type;
 }

 public List<AgreementOrganizationApplicability> getAppliesToOrganizations() {
	return appliesToOrganizations;
 }

 public void setAppliesToOrganizations(List<AgreementOrganizationApplicability> appliesToOrganizations) {
	this.appliesToOrganizations = appliesToOrganizations;
 }

 public List<AgreementProductApplicability> getAppliesToProducts() {
	return appliesToProducts;
 }

 public void setAppliesToProducts(List<AgreementProductApplicability> appliesToProducts) {
	this.appliesToProducts = appliesToProducts;
 }

 public List<AgreementGeographicalApplicability> getAppliesToGeographicBoundaries() {
	return appliesToGeographicBoundaries;
 }

 public void setAppliesToGeographicBoundaries(List<AgreementGeographicalApplicability> appliesToGeographicBoundaries) {
	this.appliesToGeographicBoundaries = appliesToGeographicBoundaries;
 }

 public List<AgreementItem> getSubItems() {
	return subItems;
 }

 public void setSubItems(List<AgreementItem> subItems) {
	this.subItems = subItems;
 }
}
