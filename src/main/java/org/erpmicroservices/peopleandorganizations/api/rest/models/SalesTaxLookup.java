package org.erpmicroservices.peopleandorganizations.api.rest.models;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import java.math.BigDecimal;
import java.util.UUID;

@Entity
public class SalesTaxLookup extends AbstractPersistable<UUID> {

 private BigDecimal salesTaxPercentage;

 private UUID geographicBoundaryId;

 private UUID productCategoryId;

 public BigDecimal getSalesTaxPercentage() {
	return salesTaxPercentage;
 }

 public void setSalesTaxPercentage(BigDecimal salesTaxPercentage) {
	this.salesTaxPercentage = salesTaxPercentage;
 }

 public UUID getGeographicBoundaryId() {
	return geographicBoundaryId;
 }

 public void setGeographicBoundaryId(UUID geographicBoundaryId) {
	this.geographicBoundaryId = geographicBoundaryId;
 }

 public UUID getProductCategoryId() {
	return productCategoryId;
 }

 public void setProductCategoryId(UUID productCategoryId) {
	this.productCategoryId = productCategoryId;
 }
}
