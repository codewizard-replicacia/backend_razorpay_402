package com.apps.razorpay.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

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

@Entity(name = "PersonAddressInfo")
@Table(schema = "\"razorpay\"", name = "\"PersonAddressInfo\"")
@Data
public class PersonAddressInfo{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"UserName\"")
	private String userName;

	@Column(name = "\"Address\"", nullable = true)
	private String address;
	
    @Embedded
    @Column(name = "\"City\"", nullable = true)
    @AttributeOverrides({
            	@AttributeOverride(name = "name", column = @Column(name = "\"City_Name\"")) ,
            	@AttributeOverride(name = "countryRegion", column = @Column(name = "\"City_CountryRegion\"")) ,
            	@AttributeOverride(name = "region", column = @Column(name = "\"City_Region\""))  }) 
	private City city;
	
	@Column(name = "\"Code\"", nullable = true)
	private Short code;
	
}