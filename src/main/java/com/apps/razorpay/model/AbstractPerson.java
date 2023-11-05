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



@Entity(name = "AbstractPerson")
@Table(name = "\"AbstractPerson\"", schema =  "\"razorpay\"")
@Data
@Inheritance
@DiscriminatorColumn(name = "\"DType\"")
public abstract class AbstractPerson {

	@Id
    @Column(name = "\"UserName\"")
    protected String userName;

	@Column(name = "\"DType\"", length = 1, insertable = false, updatable = false, nullable = false)
	protected String dType;

}