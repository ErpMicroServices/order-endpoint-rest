package org.erpmicroservices.peopleandorganizations.api.rest.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Entity(name = "request_item")
public class RequestItem extends AbstractPersistable<UUID> {

 @Column(name = "required_by_date", columnDefinition = "DATE")
 @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
 @JsonFormat(pattern = "yyyy-MM-dd")
 private LocalDate requiredByDate;

 private Long quantity;

 private BigDecimal maximumAmount;

 private String description;

 @ManyToOne
 @JoinColumn(name = "quote_item_id")
 private Quote quote;

 @OneToMany
 @JoinColumn(name = "request_item_id")
 private List<RequirementRequest> requirementRequests;
}
