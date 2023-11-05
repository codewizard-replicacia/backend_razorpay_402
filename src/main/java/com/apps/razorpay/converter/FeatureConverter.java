package com.apps.razorpay.converter;

import com.apps.razorpay.enums.Feature;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = false)
public class FeatureConverter implements AttributeConverter<Feature, Integer> {

    @Override
    public Integer convertToDatabaseColumn(Feature feature) {
        return feature != null ? feature.ordinal() : null;
    }

    @Override
    public Feature convertToEntityAttribute(Integer dbData) {
		return Feature.getFeature(dbData);
    }
}
