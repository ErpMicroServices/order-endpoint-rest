package org.erpmicroservices.peopleandorganizations.api.rest.models;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.util.UUID;

@Entity(name = "order_role")
public class OrderRole extends AbstractPersistable<UUID> {

 private BigDecimal percentContribution;

 private UUID assignedToPartyId;

 @ManyToOne
 @JoinColumn(name = "order_role_type_id")
 private OrderRoleType type;

 public BigDecimal getPercentContribution() {
  return percentContribution;
 }

 public void setPercentContribution(BigDecimal percentContribution) {
  this.percentContribution = percentContribution;
 }

 public UUID getAssignedToPartyId() {
  return assignedToPartyId;
 }

 public void setAssignedToPartyId(UUID assignedToPartyId) {
  this.assignedToPartyId = assignedToPartyId;
 }

 public OrderRoleType getType() {
  return type;
 }

 public void setType(OrderRoleType type) {
  this.type = type;
 }
}
