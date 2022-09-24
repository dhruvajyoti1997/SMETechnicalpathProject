package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Account reference. A account may be a party account or a financial account.
 */
@ApiModel(description = "Account reference. A account may be a party account or a financial account.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-08-24T07:46:52.134Z")


public class AccountRef   {
	
  private String id = null;
  private String name = null;
  private String type = null;
  private String number = null;

  public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}

public String getNumber() {
	return number;
}

public void setNumber(String number) {
	this.number = number;
}

public AccountRef id(String id) {
    this.id = id;
    return this;
  }

  public AccountRef name1(String name) {
	    this.name = name;
	    return this;
	  }
  public AccountRef type1(String type) {
	    this.type = type;
	    return this;
	  }
  public AccountRef number(String number) {
	    this.number = number;
	    return this;
	  }
  /**
   * Unique identifier of the account
   * @return id
  **/
  @ApiModelProperty(value = "Unique identifier of the account")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }



  public AccountRef name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the account
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the account")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountRef accountRef = (AccountRef) o;
    return Objects.equals(this.id, accountRef.id) &&
        Objects.equals(this.name, accountRef.name) &&
        Objects.equals(this.type, accountRef.type) &&
        Objects.equals(this.number, accountRef.number);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, type, number);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountRef {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    referredType: ").append(toIndentedString(number)).append("\n");
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

