package test.client;

import com.google.gwt.i18n.client.ConstantsWithLookup;

public interface ValidationConstants extends ConstantsWithLookup {
	
	@DefaultStringValue("Username cannot be empty.")
	@Key("user.username.blank")
	String user_username_blank();
	
	@DefaultStringValue("Please enter at least {min} characters for your username.")
	@Key("user.username.minSize.error")
	String user_username_minSize_error();
	
	@DefaultStringValue("The username may only contain letters and numbers.")
	@Key("user.username.validator.error")
	String user_username_validator_error();
	
	@DefaultStringValue("Firstname cannot be empty.")
	@Key("user.firstName.blank")
	String user_firstName_blank();
	
	@DefaultStringValue("The firstname may only contain letters, numbers and spaces.")
	@Key("user.firstName.validator.error")
	String user_firstName_validator_error();
	
	@DefaultStringValue("LastName cannot be empty.")
	@Key("user.lastName.blank")
	String user_lastName_blank();
	
	@DefaultStringValue("The lastName may only contain letters, numbers and spaces.")
	@Key("user.lastName.validator.error")
	String user_lastName_validator_error();
	
	@DefaultStringValue("Email cannot be empty.")
	@Key("user.email.blank")
	String user_email_blank();
	
	@DefaultStringValue("Please enter a correct email address.")
	@Key("user.email.email.error")
	String user_email_email_error();
	
	@DefaultStringValue("Gender cannot be empty.")
	@Key("user.gender.blank")
	String user_gender_blank();
	
	@DefaultStringValue("Please enter a name for your pet.")
	@Key("pet.name.blank")
	String pet_name_blank();
	
	@DefaultStringValue("Please enter at least {min} characters.")
	@Key("pet.name.minSize.error")
	String pet_name_minSize_error();
	
	@DefaultStringValue("The pet name may only contain letters and numbers.")
	@Key("pet.name.validator.error")
	String pet_name_validator_error();

	@DefaultStringValue("Please choose one of your pets or create a new one.")
	@Key("pet.blank")
	String pet_blank();

	@DefaultStringValue("Please choose a characteristic")
	@Key("attribute.blank")
	String attribute_blank();

	@DefaultStringValue("Password cannot be empty.")
	@Key("user.password.blank")
	String user_password_blank();

	@DefaultStringValue("Please enter at least {min} characters for your password.")
	@Key("user.password.minSize.error")
	String user_password_minSize_error();





}
