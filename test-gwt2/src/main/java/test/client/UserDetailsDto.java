package test.client;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class UserDetailsDto extends UserDto {

	@NotNull(message = "{user_username_blank}")
	@Size(min = 3, message = "{user_username_minSize_error}")
	@Pattern(regexp = "[a-zA-Z0-9]+", message = "{user_username_validator_error}")
	private String username;
	
//	@NotNull(message = "{user_firstName_blank}")
//	@Pattern(regexp = "[a-zA-ZßüöäÜÖÄéè]+([ -][a-zA-ZßüöäÜÖÄéè]+)*", message = "{user_firstName_validator_error}")
//	private String firstName;
	
//	@NotNull(message = "{user_lastName_blank}")
//	@Pattern(regexp = "[a-zA-ZßüöäÜÖÄéè]+([ -][a-zA-ZßüöäÜÖÄéè]+)*", message = "{user_lastName_validator_error}")
//	private String lastName;
	
	@NotNull(message = "{user_email_blank}")
	@Pattern(regexp = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$", message="{user_email_email_error}")
	private String email;
	
	@NotNull(message = "{user_password_blank}")
	@Size(min = 3, message = "{user_password_minSize_error}")
	private String password;
	
//	@NotNull(message = "{user_gender_blank}")
	private String gender;
	
	@JsonIgnore
	private Date birthday;
	private long birthdayString;		// This is the date string as long.

	private String facebookProfileLinkUrl;
	private String addressLine;
	private boolean validFacbookToken;
	
	
	private int errorCount;
	private List<String> errorMessages;
	

	@Override
  public String getUsername() {
		return username;
	}

	@Override
  public void setUsername(String username) {
		this.username = username;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
		if (birthday != null) {
			this.birthdayString = birthday.getTime();
		}
		else {
			this.birthdayString = -1;
		}
	}

	public long getBirthdayString() {
		return birthdayString;
	}

	public void setBirthdayString(long birthdayString) {
		this.birthdayString = birthdayString;
		if (birthdayString > 0) {
			this.birthday = new Date(birthdayString);
		}
	}

	public String getFacebookProfileLinkUrl() {
		return facebookProfileLinkUrl;
	}

	public void setFacebookProfileLinkUrl(String facebookProfileLinkUrl) {
		this.facebookProfileLinkUrl = facebookProfileLinkUrl;
	}

	public String getAddressLine() {
		return addressLine;
	}

	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getErrorCount() {
		return errorCount;
	}

	public void setErrorCount(int errorCount) {
		this.errorCount = errorCount;
	}

	public List<String> getErrorMessages() {
		return errorMessages;
	}

	public void setErrorMessages(List<String> errorMessages) {
		this.errorMessages = errorMessages;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

  public boolean isValidFacbookToken() {
    return validFacbookToken;
  }

  public void setValidFacbookToken(boolean validFacbookToken) {
    this.validFacbookToken = validFacbookToken;
  }

  

	
}
