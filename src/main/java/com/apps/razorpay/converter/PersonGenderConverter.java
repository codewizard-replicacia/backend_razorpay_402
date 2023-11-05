package com.apps.razorpay.converter;

import com.apps.razorpay.enums.PersonGender;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = false)
public class PersonGenderConverter implements AttributeConverter<PersonGender, Integer> {

    @Override
    public Integer convertToDatabaseColumn(PersonGender personGender) {
        return personGender != null ? personGender.ordinal() : null;
    }

    @Override
    public PersonGender convertToEntityAttribute(Integer dbData) {
		return PersonGender.getPersonGender(dbData);
    }
}
