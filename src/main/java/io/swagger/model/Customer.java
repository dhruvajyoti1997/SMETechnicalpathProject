package io.swagger.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.validation.annotation.Validated;

/**
 * Customer
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-08-24T07:46:52.134Z")

@Entity(name = "customer")

@Table(name = "customer")
public class Customer {

	@Id
	@NotNull
	private Long id;
	
	@NotBlank
	private String name;
	@NotBlank
	private String status;
	@NotBlank
	@Size(message = "it should have 12 digit number")
	private String accountNumber;
	@NotBlank
	@Size(message = "it should have 10 digit number")
	private String phoneNumber;
	@Email
	@NotBlank
	private String emailId;
	@NotBlank
	private String address;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(Long id, String name, String status, String accountNumber, String phoneNumber, String emailId,
			String address) {
		super();
		this.id = id;
		this.name = name;
		this.status = status;
		this.accountNumber = accountNumber;
		this.phoneNumber = phoneNumber;
		this.emailId = emailId;
		this.address = address;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", status=" + status + ", accountNumber=" + accountNumber
				+ ", phoneNumber=" + phoneNumber + ", emailId=" + emailId + ", address=" + address + "]";
	}

//  @Valid
//  @OneToMany(targetEntity=AccountRef.class, mappedBy="customer", fetch=FetchType.EAGER)
//  private List<AccountRef> account = null;
//
//  @Valid
//  private List<ContactMedium> contactMedium = null;

//  public Customer id(String id) {
//    this.id = id;
//    return this;
//  }
//
//  /**
//   * Unique identifier for Customers
//   * @return id
//  **/
//  @ApiModelProperty(value = "Unique identifier for Customers")
//
//
//  public String getId() {
//    return id;
//  }
//
//  public void setId(String id) {
//    this.id = id;
//  }
//
//
//  /**
//   * A word, term, or phrase by which the Customer is known and distinguished from other Customers.
//   * @return name
//  **/
//  @ApiModelProperty(value = "A word, term, or phrase by which the Customer is known and distinguished from other Customers.")
//
//
//  public String getName() {
//    return name;
//  }
//
//  public void setName(String name) {
//    this.name = name;
//  }
//
//  public Customer status(String status) {
//    this.status = status;
//    return this;
//  }
//
//  /**
//   * Used to track the lifecycle status of the customer.
//   * @return status
//  **/
//  @ApiModelProperty(value = "Used to track the lifecycle status of the customer.")
//
//
//  public String getStatus() {
//    return status;
//  }
//
//  public void setStatus(String status) {
//    this.status = status;
//  }

//  public Customer account(List<AccountRef> account) {
//    this.account = account;
//    return this;
//  }
//
//  public Customer addAccountItem(AccountRef accountItem) {
//    if (this.account == null) {
//      this.account = new ArrayList<AccountRef>();
//    }
//    this.account.add(accountItem);
//    return this;
//  }
//
//  /**
//   * Get account
//   * @return account
//  **/
//  @ApiModelProperty(value = "")
//
//  @Valid
//
//  public List<AccountRef> getAccount() {
//    return account;
//  }
//
//  public void setAccount(List<AccountRef> account) {
//    this.account = account;
//  }

//  @Valid
//
//  public List<ContactMedium> getContactMedium() {
//    return contactMedium;
//  }
//
//  public void setContactMedium(List<ContactMedium> contactMedium) {
//    this.contactMedium = contactMedium;
//  }

//  @Override
//  public boolean equals(java.lang.Object o) {
//    if (this == o) {
//      return true;
//    }
//    if (o == null || getClass() != o.getClass()) {
//      return false;
//    }
//    Customer customer = (Customer) o;
//    return Objects.equals(this.id, customer.id) &&
//        Objects.equals(this.name, customer.name) &&
//        Objects.equals(this.status, customer.status) &&
//        Objects.equals(this.account, customer.account) &&
//        Objects.equals(this.contactMedium, customer.contactMedium);
//  }
//
//  @Override
//  public int hashCode() {
//    return Objects.hash(id,name, status,account, contactMedium);
//  }

//  @Override
//  public String toString() {
//    StringBuilder sb = new StringBuilder();
//    sb.append("class Customer {\n");
//    
//    sb.append("    id: ").append(toIndentedString(id)).append("\n"); 
//    sb.append("    name: ").append(toIndentedString(name)).append("\n");
//    sb.append("    status: ").append(toIndentedString(status)).append("\n");
//    sb.append("    account: ").append(toIndentedString(account)).append("\n");
//    sb.append("    contactMedium: ").append(toIndentedString(contactMedium)).append("\n");
//    sb.append("}");
//    return sb.toString();
//  }

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
//  private String toIndentedString(java.lang.Object o) {
//    if (o == null) {
//      return "null";
//    }
//    return o.toString().replace("\n", "\n    ");
//  }
}
