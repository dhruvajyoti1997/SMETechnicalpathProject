package io.swagger.model;

import org.springframework.validation.annotation.Validated;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Indicates the contact medium that could be used to contact the party.
 */
@ApiModel(description = "Indicates the contact medium that could be used to contact the party.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-08-24T07:46:52.134Z")


public class ContactMedium   {
  private String mediumType = null;
  private Boolean preferred = null;
  private String city = null;
  private String contactType = null;
  private String country = null;
  private String emailAddress = null;
  private String faxNumber = null;
  private String phoneNumber = null;
  private String postCode = null;

  
  public String getMediumType() {
		return mediumType;
	}


	public void setMediumType(String mediumType) {
		this.mediumType = mediumType;
	}



  /**
   * If true, indicates that is the preferred contact medium
   * @return preferred
  **/
  @ApiModelProperty(value = "If true, indicates that is the preferred contact medium")


  public Boolean isPreferred() {
    return preferred;
  }

  public void setPreferred(Boolean preferred) {
    this.preferred = preferred;
  }


  public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getContactType() {
		return contactType;
	}

	public void setContactType(String contactType) {
		this.contactType = contactType;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getFaxNumber() {
		return faxNumber;
	}

	public void setFaxNumber(String faxNumber) {
		this.faxNumber = faxNumber;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public Boolean getPreferred() {
		return preferred;
	}
 

  @Override
public String toString() {
	return "ContactMedium [mediumType=" + mediumType + ", preferred=" + preferred + ", city=" + city + ", contactType="
			+ contactType + ", country=" + country + ", emailAddress=" + emailAddress + ", faxNumber=" + faxNumber
			+ ", phoneNumber=" + phoneNumber + ", postCode=" + postCode + "]";
}

/**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

