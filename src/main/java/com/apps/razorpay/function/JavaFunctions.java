package com.apps.razorpay.function;

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
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import com.apps.razorpay.repository.TripRepository;
import com.apps.razorpay.repository.AirlineRepository;
import com.apps.razorpay.repository.AbstractPlanItemRepository;
import com.apps.razorpay.repository.AirportRepository;
import com.apps.razorpay.repository.DocumentRepository;
import com.apps.razorpay.repository.AbstractPersonRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
		    @EdmFunction(name = "GetFriendsTrips", returnType = @EdmFunction.ReturnType(isCollection = true, type = Trip.class), hasFunctionImport = true, isBound = true )
		    public List<Trip> GetFriendsTrips(
			      @EdmParameter(name = "person") final Person person ,       
			      @EdmParameter(name = "userName") final String userName ){
			      return null;
			      }      
    
		    @EdmFunction(name = "GetPersonWithMostFriends", returnType = @EdmFunction.ReturnType, hasFunctionImport = true, isBound = false )
		    public Person GetPersonWithMostFriends(){
		           return null;
			      }
			      
            
    
		    @EdmFunction(name = "GetInvolvedPeople", returnType = @EdmFunction.ReturnType(isCollection = true, type = Person.class), hasFunctionImport = true, isBound = true )
		    public List<Person> GetInvolvedPeople(
			      @EdmParameter(name = "trip") final Trip trip ){
			      return null;
			      }      
    
		    @EdmFunction(name = "GetNearestAirport", returnType = @EdmFunction.ReturnType, hasFunctionImport = true, isBound = false )
		    public Airport GetNearestAirport(
			      @EdmParameter(name = "lat") final Double lat , 
			      
			      @EdmParameter(name = "lon") final Double lon ){
			      return null;
			      }
			      
    
		    @EdmFunction(name = "GetFavoriteAirline", returnType = @EdmFunction.ReturnType, hasFunctionImport = true, isBound = true )
		    public Airline GetFavoriteAirline(
			      @EdmParameter(name = "person") final Person person ){
			      return null;
			      }      
    
}
   
