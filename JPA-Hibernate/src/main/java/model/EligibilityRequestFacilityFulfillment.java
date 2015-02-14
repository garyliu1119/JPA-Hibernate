package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the Eligibility_Request_Facility_Fulfillment database table.
 * 
 */
@Entity
@Table(name="Eligibility_Request_Facility_Fulfillment")
@NamedQuery(name="EligibilityRequestFacilityFulfillment.findAll", query="SELECT e FROM EligibilityRequestFacilityFulfillment e")
public class EligibilityRequestFacilityFulfillment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="Facility_Fulfillment_ID")
	private int facility_Fulfillment_ID;

	@Column(name="Company_ID")
	private String company_ID;

	@Column(name="Member_ID")
	private int member_ID;

	@Column(name="When_Created")
	private Timestamp when_Created;

	@Column(name="When_Reviewed")
	private Timestamp when_Reviewed;

	//bi-directional many-to-one association to EligibilityParty
	@ManyToOne
	@JoinColumn(name="Reviewer_ID")
	private EligibilityParty esmPartyTemp;

	//bi-directional many-to-one association to EligibilityRequest
	@ManyToOne
	@JoinColumn(name="Request_ID")
	private EligibilityRequest eligibilityRequest;

	//bi-directional many-to-one association to EligibilityRequestContractPriceListSet
	@ManyToOne
	@JoinColumn(name="Requested_Price_List_Set_ID")
	private EligibilityRequestContractPriceListSet eligibilityRequestContractPriceListSet1;

	//bi-directional many-to-one association to EligibilityRequestContractPriceListSet
	@ManyToOne
	@JoinColumn(name="Approved_Price_List_Set_ID")
	private EligibilityRequestContractPriceListSet eligibilityRequestContractPriceListSet2;

	//bi-directional many-to-one association to EligibilityFulfillmentStatus
	@ManyToOne
	@JoinColumn(name="Fulfillment_Status_ID")
	private EligibilityFulfillmentStatus fulfillmentStatus;

	public EligibilityRequestFacilityFulfillment() {
	}

	public int getFacility_Fulfillment_ID() {
		return this.facility_Fulfillment_ID;
	}

	public void setFacility_Fulfillment_ID(int facility_Fulfillment_ID) {
		this.facility_Fulfillment_ID = facility_Fulfillment_ID;
	}

	public String getCompany_ID() {
		return this.company_ID;
	}

	public void setCompany_ID(String company_ID) {
		this.company_ID = company_ID;
	}

	public int getMember_ID() {
		return this.member_ID;
	}

	public void setMember_ID(int member_ID) {
		this.member_ID = member_ID;
	}

	public Timestamp getWhen_Created() {
		return this.when_Created;
	}

	public void setWhen_Created(Timestamp when_Created) {
		this.when_Created = when_Created;
	}

	public Timestamp getWhen_Reviewed() {
		return this.when_Reviewed;
	}

	public void setWhen_Reviewed(Timestamp when_Reviewed) {
		this.when_Reviewed = when_Reviewed;
	}

	public EligibilityParty getEsmPartyTemp() {
		return this.esmPartyTemp;
	}

	public void setEsmPartyTemp(EligibilityParty esmPartyTemp) {
		this.esmPartyTemp = esmPartyTemp;
	}

	public EligibilityRequest getEligibilityRequest() {
		return this.eligibilityRequest;
	}

	public void setEligibilityRequest(EligibilityRequest eligibilityRequest) {
		this.eligibilityRequest = eligibilityRequest;
	}

	public EligibilityRequestContractPriceListSet getEligibilityRequestContractPriceListSet1() {
		return this.eligibilityRequestContractPriceListSet1;
	}

	public void setEligibilityRequestContractPriceListSet1(EligibilityRequestContractPriceListSet eligibilityRequestContractPriceListSet1) {
		this.eligibilityRequestContractPriceListSet1 = eligibilityRequestContractPriceListSet1;
	}

	public EligibilityRequestContractPriceListSet getEligibilityRequestContractPriceListSet2() {
		return this.eligibilityRequestContractPriceListSet2;
	}

	public void setEligibilityRequestContractPriceListSet2(EligibilityRequestContractPriceListSet eligibilityRequestContractPriceListSet2) {
		this.eligibilityRequestContractPriceListSet2 = eligibilityRequestContractPriceListSet2;
	}

	public EligibilityFulfillmentStatus getFulfillmentStatus() {
		return this.fulfillmentStatus;
	}

	public void setFulfillmentStatus(EligibilityFulfillmentStatus fulfillmentStatus) {
		this.fulfillmentStatus = fulfillmentStatus;
	}

}