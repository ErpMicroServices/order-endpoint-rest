package org.erpmicroservices.peopleandorganizations.api.rest.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity(name = "request")
public class Request extends AbstractPersistable<UUID> {

 @Column(name = "request_date", columnDefinition = "DATE")
 @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
 @JsonFormat(pattern = "yyyy-MM-dd")
 private LocalDate requestDate;

 @Column(name = "response_required_date", columnDefinition = "DATE")
 @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
 @JsonFormat(pattern = "yyyy-MM-dd")
 private LocalDate responseRequiredDate;

 private String description;

 @ManyToOne
 @JoinColumn(name = "request_type_id")
 private RequestType type;

 @OneToMany
 @JoinColumn(name = "request_id")
 private List<RequestItem> items;

 @OneToMany
 @JoinColumn(name = "request_id")
 private List<RespondingParty> respondingParties = new ArrayList<>();

 public LocalDate getRequestDate() {
  return requestDate;
 }

 public void setRequestDate(LocalDate requestDate) {
  this.requestDate = requestDate;
 }

 public LocalDate getResponseRequiredDate() {
  return responseRequiredDate;
 }

 public void setResponseRequiredDate(LocalDate responseRequiredDate) {
  this.responseRequiredDate = responseRequiredDate;
 }

 public String getDescription() {
  return description;
 }

 public void setDescription(String description) {
  this.description = description;
 }
}
