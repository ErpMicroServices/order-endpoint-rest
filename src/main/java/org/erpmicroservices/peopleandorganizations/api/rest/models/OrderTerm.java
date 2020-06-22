package org.erpmicroservices.peopleandorganizations.api.rest.models;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.util.UUID;

@Entity(name = "order_term")
public class OrderTerm extends AbstractPersistable<UUID> {

 private BigDecimal termValue;

 @ManyToOne
 @JoinColumn(name = "condition_for_order_item_id")
 private OrderItem conditionForItem;

 @ManyToOne
 @JoinColumn(name = "condition_for_order_id")
 private Order conditionForOrder;

 @ManyToOne
 private OrderTermType type;
}
