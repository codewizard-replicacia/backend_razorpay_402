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
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmAction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataAction;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.transaction.Transactional;

@Component
public class JavaActions implements ODataAction {
    private final EntityManager entityManager;

    public JavaActions(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

	
	
	    
	    @EdmAction(name = "ResetDataSource", isBound = false)
	    public void resetDataSource() {
	        EntityTransaction entityTransaction = entityManager.getTransaction();
	        entityTransaction.begin();
            		entityManager.createNativeQuery("DELETE FROM \"Trippin\".\"Trip\"").executeUpdate();
    		entityManager.createNativeQuery("DELETE FROM \"Trippin\".\"Airline\"").executeUpdate();
    		entityManager.createNativeQuery("DELETE FROM \"Trippin\".\"Flight\"").executeUpdate();
    		entityManager.createNativeQuery("DELETE FROM \"Trippin\".\"PlanItem\"").executeUpdate();
    		entityManager.createNativeQuery("DELETE FROM \"Trippin\".\"Document\"").executeUpdate();
    		entityManager.createNativeQuery("DELETE FROM \"Trippin\".\"Manager\"").executeUpdate();
    		entityManager.createNativeQuery("DELETE FROM \"Trippin\".\"AbstractPerson\"").executeUpdate();
    		entityManager.createNativeQuery("DELETE FROM \"Trippin\".\"Employee\"").executeUpdate();
    		entityManager.createNativeQuery("DELETE FROM \"Trippin\".\"AbstractPlanItem\"").executeUpdate();
    		entityManager.createNativeQuery("DELETE FROM \"Trippin\".\"Airport\"").executeUpdate();
    		entityManager.createNativeQuery("DELETE FROM \"Trippin\".\"Event\"").executeUpdate();
    		entityManager.createNativeQuery("DELETE FROM \"Trippin\".\"PublicTransportation\"").executeUpdate();
    		entityManager.createNativeQuery("DELETE FROM \"Trippin\".\"Person\"").executeUpdate();
        entityTransaction.commit();
    
	    
	    

      }     
	    
      }     
	    
          @EdmAction(name = "ShareTrip", isBound = true)
		  public void ShareTrip(    
			 @EdmParameter(name = "personInstance", isNullable = true) final Person personInstance , 
		 
			 @EdmParameter(name = "userName", isNullable = false) final String userName , 
		 
			 @EdmParameter(name = "tripId", isNullable = false) final Integer tripId ){ 
			 //customlogic
 
		 
      }     
	    
          @EdmAction(name = "UpdateLastName", isBound = true)
		  public boolean UpdateLastName(    
			 @EdmParameter(name = "person", isNullable = true) final Person person ,  
			 
			 @EdmParameter(name = "lastName", isNullable = false) final String lastName ){ 
			 //customlogic
			 return false;
  
			 
	  
		     
           
      }     
}
  