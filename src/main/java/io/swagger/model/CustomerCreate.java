package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.AccountRef;
import io.swagger.model.AgreementRef;
import io.swagger.model.Characteristic;
import io.swagger.model.ContactMedium;
import io.swagger.model.CreditProfile;
import io.swagger.model.PaymentMethodRef;
import io.swagger.model.RelatedParty;
import io.swagger.model.TimePeriod;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;

import javax.persistence.Entity;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 *  Skipped properties: id,href
 */
@ApiModel(description = " Skipped properties: id,href")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-08-24T07:46:52.134Z")

public class CustomerCreate   {
	
 private String id = null;
  private String name = null;
  private String status = null;
  @Valid
  private List<AccountRef> account = null;
  

  @JsonProperty("contactMedium") 
  @Valid
  private List<ContactMedium> contactMedium = null;

 

  public CustomerCreate(String id) {
	super();
	this.id = id;
}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public CustomerCreate name(String name) {
    this.name = name;
    return this;
  }

  /**
   * A word, term, or phrase by which the Customer is known and distinguished from other Customers.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "A word, term, or phrase by which the Customer is known and distinguished from other Customers.")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CustomerCreate status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Used to track the lifecycle status of the customer.
   * @return status
  **/
  @ApiModelProperty(value = "Used to track the lifecycle status of the customer.")


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

 

  public CustomerCreate account(List<AccountRef> account) {
    this.account = account;
    return this;
  }
  public List<AccountRef> getAccount() {
    return account;
  }

  public void setAccount(List<AccountRef> account) {
    this.account = account;
  }

  public CustomerCreate addContactMediumItem(ContactMedium contactMediumItem) {
    if (this.contactMedium == null) {
      this.contactMedium = new ArrayList<ContactMedium>();
    }
    this.contactMedium.add(contactMediumItem);
    return this;
  }

  /**
   * Get contactMedium
   * @return contactMedium
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<ContactMedium> getContactMedium() {
    return contactMedium;
  }

  public void setContactMedium(List<ContactMedium> contactMedium) {
    this.contactMedium = contactMedium;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerCreate customerCreate = (CustomerCreate) o;
    return Objects.equals(this.id, customerCreate.id) &&
    	Objects.equals(this.name, customerCreate.name) &&
        Objects.equals(this.status, customerCreate.status) &&
        Objects.equals(this.account, customerCreate.account) &&
        Objects.equals(this.contactMedium, customerCreate.contactMedium);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, status, account, contactMedium);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerCreate {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    contactMedium: ").append(toIndentedString(contactMedium)).append("\n");
    sb.append("}");
    return sb.toString();
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

