package org.erpmicroservices.peopleandorganizations.api.rest.models;

import lombok.*;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.UUID;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderType extends AbstractPersistable<UUID> {

	@NotBlank
	@NotNull
	private String description;

	@ManyToOne
	private OrderType parent;

	@OneToMany(mappedBy = "type")
	private List<Order> ordersOf;
}
