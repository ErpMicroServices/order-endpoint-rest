package org.erpmicroservices.peopleandorganizations.api.rest.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "\"order\"")
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Order extends AbstractPersistable<UUID> {

 @ManyToOne
 @JoinColumn(name = "order_type_id")
 private OrderType type;

 private String orderIdentifier;

 @Column(name = "order_date", columnDefinition = "DATE")
 @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
 @JsonFormat(pattern = "yyyy-MM-dd")
 private LocalDate orderDate;

 @Column(name = "entry_date", columnDefinition = "DATE")
 @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
 @JsonFormat(pattern = "yyyy-MM-dd")
 private LocalDate entryDate;

 @OneToMany(orphanRemoval = true, cascade = CascadeType.ALL)
 @JoinColumn(name = "order_id")
 private List<OrderItem> items = new ArrayList<>();

 private UUID placedUsingContactMechanismId;

 private UUID takenViaContactMechanismId;

 private UUID billingLocationContactMechanismId;

 @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
 @JoinColumn(name = "order_id")
 private List<OrderRole> roles = new ArrayList<>();

 private UUID placedByPartyRoleId;

 private UUID takenByPartyRoleId;

 private UUID withRequestedBillToPartyRoleId;

 @OneToMany
 @JoinColumn(name = "affecting_order_id")
 private List<OrderAdjustment> adjustments = new ArrayList<>();

 @OneToMany
 @JoinColumn(name = "condition_for_order_id")
 private List<OrderTerm> terms;

 @OneToMany
 @JoinColumn(name = "status_for_order_id")
 private List<OrderStatus> statuses = new ArrayList<>();

}
