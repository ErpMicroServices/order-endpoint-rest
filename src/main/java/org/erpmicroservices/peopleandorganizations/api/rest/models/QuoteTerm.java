package org.erpmicroservices.peopleandorganizations.api.rest.models;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.util.UUID;

@Entity(name = "quote_term")
public class QuoteTerm extends AbstractPersistable<UUID> {

	@Column(name = "\"value\"")
	private BigDecimal value;

 @ManyToOne
 @JoinColumn(name = "quote_term_type_id")
 private QuoteTermType type;
}
