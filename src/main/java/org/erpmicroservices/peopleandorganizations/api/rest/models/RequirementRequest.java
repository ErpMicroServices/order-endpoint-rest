package org.erpmicroservices.peopleandorganizations.api.rest.models;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.UUID;

@Entity(name = "requirement_request")
public class RequirementRequest extends AbstractPersistable<UUID> {

 @ManyToOne
 @JoinColumn(name = "requirement_id")
 private Requirement requirement;

 @ManyToOne
 @JoinColumn(name = "request_item_id")
 private RequestItem requestItem;
}
