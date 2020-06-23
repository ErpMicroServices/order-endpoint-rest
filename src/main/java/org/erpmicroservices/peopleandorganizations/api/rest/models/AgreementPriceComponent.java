package org.erpmicroservices.peopleandorganizations.api.rest.models;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import java.util.UUID;

@Entity(name = "agreement_price_component")
public class AgreementPriceComponent extends AbstractPersistable<UUID> {

 private UUID priceComponentId;
}
