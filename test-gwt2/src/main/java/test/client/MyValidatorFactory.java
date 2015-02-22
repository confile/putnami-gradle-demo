package test.client;

import javax.validation.Validator;
import javax.validation.groups.Default;

import com.google.gwt.core.client.GWT;
import com.google.gwt.validation.client.AbstractGwtValidatorFactory;
import com.google.gwt.validation.client.GwtValidation;
import com.google.gwt.validation.client.impl.AbstractGwtValidator;



public class MyValidatorFactory extends AbstractGwtValidatorFactory {

	@GwtValidation(value = {UserDetailsDto.class}, groups = {Default.class})
	public interface GwtValidator extends Validator {
	}
	
	
	@Override
	public AbstractGwtValidator createValidator() {
		return GWT.create(GwtValidator.class);
	}
	
}
