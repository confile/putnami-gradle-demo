package test.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.i18n.client.ConstantsWithLookup;
import com.google.gwt.validation.client.AbstractValidationMessageResolver;
import com.google.gwt.validation.client.UserValidationMessagesResolver;

public class MyValidationMessagesResolver extends AbstractValidationMessageResolver 
				implements UserValidationMessagesResolver {

	protected MyValidationMessagesResolver() {
		super((ConstantsWithLookup) GWT.create(ValidationConstants.class));
	}

}
