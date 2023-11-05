package com.apps.razorpay.model;


import lombok.Data;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


 
import com.apps.razorpay.model.Person;
import com.apps.razorpay.model.Document;
import com.apps.razorpay.model.Airline;
import com.apps.razorpay.model.Airport;
import com.apps.razorpay.model.Trip;
import com.apps.razorpay.model.PlanItem;
import com.apps.razorpay.model.Event;
import com.apps.razorpay.model.PublicTransportation;
import com.apps.razorpay.model.Flight;
import com.apps.razorpay.model.Employee;
import com.apps.razorpay.model.Manager;
import com.apps.razorpay.model.complex.Location;
import com.apps.razorpay.model.complex.City;
import com.apps.razorpay.model.complex.AirportLocation;
import com.apps.razorpay.model.complex.EventLocation;
import com.apps.razorpay.enums.PersonGender;
import com.apps.razorpay.enums.Feature;
import com.apps.razorpay.converter.PersonGenderConverter;
import com.apps.razorpay.converter.FeatureConverter;
import com.apps.razorpay.converter.DurationConverter;
import com.apps.razorpay.converter.UUIDToByteConverter;
import com.apps.razorpay.converter.UUIDToStringConverter;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.Duration;
import java.util.Date;
import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.DiscriminatorValue;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Lob;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmMediaStream;

@Entity(name = "Flight")
@Data
@DiscriminatorValue(value = "4")
                        
public class Flight extends PublicTransportation {
  public Flight () {
    super();
  }
	  
  @Column(name = "\"FlightNumber\"", nullable = true )
  private String flightNumber;
  
  
  
  
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "\"FlightAirline\"", referencedColumnName = "\"AirlineCode\"", insertable = false, updatable = false)
	private Airline airline;
	
	@Column(name = "\"FlightAirline\"")
	private String flightAirline;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "\"FlightFrom\"", referencedColumnName = "\"IcaoCode\"", insertable = false, updatable = false)
	private Airport from;
	
	@Column(name = "\"FlightFrom\"")
	private String flightFrom;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "\"FlightTo\"", referencedColumnName = "\"IcaoCode\"", insertable = false, updatable = false)
	private Airport to;
	
	@Column(name = "\"FlightTo\"")
	private String flightTo;
   
  
  
  
  
  
  
  
  
  
  @Override
  public String toString() {
	return "Flight [" 
  + "FlightNumber= " + flightNumber 
 + "]";
	}
	
}