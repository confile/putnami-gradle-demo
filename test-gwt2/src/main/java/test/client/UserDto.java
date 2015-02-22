package test.client;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.common.base.Strings;


 

public class UserDto {

	private String username;
	
	private String firstName;
	
	private String lastName;
	
	private String userImageSmallUrl;
	@JsonIgnore
	private String userImageSmallCachedUrl;
	
	private String userImageUrl;
	@JsonIgnore
	private String userImageCachedUrl;

	private String description;
	private long lastUpdatedTime;
	
	
	public UserDto() {
	  setUsername("");
	  setFirstName("");
	  setLastName("");
	  setUserImageSmallUrl("");
	  setUserImageSmallCachedUrl("");
	  setUserImageUrl("");
	  setUserImageCachedUrl("");
	  setDescription("");
	  setLastUpdatedTime(0);
	}
	
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
		
	public String getUserImageSmallUrl() {
		return userImageSmallUrl;
	}

	public void setUserImageSmallUrl(String userImageSmallUrl) {
		this.userImageSmallUrl = userImageSmallUrl;
	}

	public String getUserImageSmallCachedUrl() {
		if (!Strings.isNullOrEmpty(userImageSmallCachedUrl)) {
			return userImageSmallCachedUrl;
		}
		return getUserImageSmallUrl();
	}

	public void setUserImageSmallCachedUrl(String userImageSmallCachedUrl) {
		this.userImageSmallCachedUrl = userImageSmallCachedUrl;
	}

	public String getUserImageUrl() {
		return userImageUrl;
	}

	public void setUserImageUrl(String userImageUrl) {
		this.userImageUrl = userImageUrl;
	}

	public String getUserImageCachedUrl() {
		if (!Strings.isNullOrEmpty(userImageCachedUrl)) {
			return userImageCachedUrl;
		}
		return getUserImageUrl();
	}

	public void setUserImageCachedUrl(String userImageCachedUrl) {
		this.userImageCachedUrl = userImageCachedUrl;
	}
	
	public String getFullName() {
	  String fullName = getFirstName()+" "+getLastName(); 
		return fullName.trim();
	}

	public void setFullName(String fullName) {
	  if (!Strings.isNullOrEmpty(fullName)) {
  		String[] names = fullName.split(" ");
  		if (names.length >= 2) {
  			this.setLastName(names[names.length-1]);	
  			this.setFirstName(fullName.replaceFirst(this.getLastName(), "").trim());			
  		}
	  }
	  else {
	    this.setFirstName("");
	    this.setLastName("");
	  }
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

  public long getLastUpdatedTime() {
    return lastUpdatedTime;
  }

  public void setLastUpdatedTime(long lastUpdatedTime) {
    this.lastUpdatedTime = lastUpdatedTime;
  }
	
	
	
}
