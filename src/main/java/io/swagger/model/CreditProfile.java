package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TimePeriod;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Credit profile for the party (containing credit scoring, ...). By default only the current credit profile  is retrieved. It can be used as a list to give the party credit profiles history, the first one in the list will be the current one.
 */
@ApiModel(description = "Credit profile for the party (containing credit scoring, ...). By default only the current credit profile  is retrieved. It can be used as a list to give the party credit profiles history, the first one in the list will be the current one.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-08-24T07:46:52.134Z")


public class CreditProfile   {
  @JsonProperty("creditProfileDate")
  private OffsetDateTime creditProfileDate = null;

  @JsonProperty("creditRiskRating")
  private Integer creditRiskRating = null;

  @JsonProperty("creditScore")
  private Integer creditScore = null;

  @JsonProperty("validFor")
  private TimePeriod validFor = null;

  @JsonProperty("@baseType")
  private String baseType = null;

  @JsonProperty("@schemaLocation")
  private String schemaLocation = null;

  @JsonProperty("@type")
  private String type = null;

  public CreditProfile creditProfileDate(OffsetDateTime creditProfileDate) {
    this.creditProfileDate = creditProfileDate;
    return this;
  }

  /**
   * The date the profile was established
   * @return creditProfileDate
  **/
  @ApiModelProperty(required = true, value = "The date the profile was established")
  @NotNull

  @Valid

  public OffsetDateTime getCreditProfileDate() {
    return creditProfileDate;
  }

  public void setCreditProfileDate(OffsetDateTime creditProfileDate) {
    this.creditProfileDate = creditProfileDate;
  }

  public CreditProfile creditRiskRating(Integer creditRiskRating) {
    this.creditRiskRating = creditRiskRating;
    return this;
  }

  /**
   * This is an integer whose value is used to rate the risk
   * @return creditRiskRating
  **/
  @ApiModelProperty(value = "This is an integer whose value is used to rate the risk")


  public Integer getCreditRiskRating() {
    return creditRiskRating;
  }

  public void setCreditRiskRating(Integer creditRiskRating) {
    this.creditRiskRating = creditRiskRating;
  }

  public CreditProfile creditScore(Integer creditScore) {
    this.creditScore = creditScore;
    return this;
  }

  /**
   * A measure of a person or organizations creditworthiness calculated on the basis of a combination of factors such as their income and credit history
   * @return creditScore
  **/
  @ApiModelProperty(value = "A measure of a person or organizations creditworthiness calculated on the basis of a combination of factors such as their income and credit history")


  public Integer getCreditScore() {
    return creditScore;
  }

  public void setCreditScore(Integer creditScore) {
    this.creditScore = creditScore;
  }

  public CreditProfile validFor(TimePeriod validFor) {
    this.validFor = validFor;
    return this;
  }

  /**
   * The period for which the profile is valid
   * @return validFor
  **/
  @ApiModelProperty(required = true, value = "The period for which the profile is valid")
  @NotNull

  @Valid

  public TimePeriod getValidFor() {
    return validFor;
  }

  public void setValidFor(TimePeriod validFor) {
    this.validFor = validFor;
  }

  public CreditProfile baseType(String baseType) {
    this.baseType = baseType;
    return this;
  }

  /**
   * When sub-classing, this defines the super-class
   * @return baseType
  **/
  @ApiModelProperty(value = "When sub-classing, this defines the super-class")


  public String getBaseType() {
    return baseType;
  }

  public void setBaseType(String baseType) {
    this.baseType = baseType;
  }

  public CreditProfile schemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
    return this;
  }

  /**
   * A URI to a JSON-Schema file that defines additional attributes and relationships
   * @return schemaLocation
  **/
  @ApiModelProperty(value = "A URI to a JSON-Schema file that defines additional attributes and relationships")


  public String getSchemaLocation() {
    return schemaLocation;
  }

  public void setSchemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
  }

  public CreditProfile type(String type) {
    this.type = type;
    return this;
  }

  /**
   * When sub-classing, this defines the sub-class entity name
   * @return type
  **/
  @ApiModelProperty(value = "When sub-classing, this defines the sub-class entity name")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditProfile creditProfile = (CreditProfile) o;
    return Objects.equals(this.creditProfileDate, creditProfile.creditProfileDate) &&
        Objects.equals(this.creditRiskRating, creditProfile.creditRiskRating) &&
        Objects.equals(this.creditScore, creditProfile.creditScore) &&
        Objects.equals(this.validFor, creditProfile.validFor) &&
        Objects.equals(this.baseType, creditProfile.baseType) &&
        Objects.equals(this.schemaLocation, creditProfile.schemaLocation) &&
        Objects.equals(this.type, creditProfile.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creditProfileDate, creditRiskRating, creditScore, validFor, baseType, schemaLocation, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditProfile {\n");
    
    sb.append("    creditProfileDate: ").append(toIndentedString(creditProfileDate)).append("\n");
    sb.append("    creditRiskRating: ").append(toIndentedString(creditRiskRating)).append("\n");
    sb.append("    creditScore: ").append(toIndentedString(creditScore)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
    sb.append("    baseType: ").append(toIndentedString(baseType)).append("\n");
    sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

