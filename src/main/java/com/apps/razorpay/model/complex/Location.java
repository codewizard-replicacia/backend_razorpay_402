package com.apps.razorpay.model.complex;


import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;

@Embeddable
@Data
public class Location {
  
	
  @Column(name = "\"Address\"", nullable = true)
  private String address;
  @Column(name = "\"City\"")
  @Embedded
  private City city;
	
  @Column(name = "\"Code\"", nullable = true)
  private Short code;
}
