package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the Eligibility_Request database table.
 * 
 */
@Entity
@Table(name="Eligibility_Request")
@NamedQuery(name="EligibilityRequest.findAll", query="SELECT e FROM EligibilityRequest e")
public class EligibilityRequest implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="Request_ID")
	private int request_ID;

	@Column(name="Initial_Company_ID")
	private String initial_Company_ID;

	@Column(name="Initial_Member_ID")
	private int initial_Member_ID;

	@Column(name="Request_Notes")
	private String request_Notes;

	@Column(name="When_Created")
	private Timestamp when_Created;

	//bi-directional many-to-one association to EligibilityParty
	@ManyToOne
	@JoinColumn(name="Initiator_ID")
	private EligibilityParty esmPartyTemp;

	//bi-directional many-to-one association to EligibilityRequestContractPriceListSet
	@OneToMany(mappedBy="eligibilityRequest")
	private List<EligibilityRequestContractPriceListSet> eligibilityRequestContractPriceListSets;

	//bi-directional many-to-one association to EligibilityRequestFacilityFulfillment
	@OneToMany(mappedBy="eligibilityRequest")
	private List<EligibilityRequestFacilityFulfillment> eligibilityRequestFacilityFulfillments;

	public EligibilityRequest() {
	}

	public int getRequest_ID() {
		return this.request_ID;
	}

	public void setRequest_ID(int request_ID) {
		this.request_ID = request_ID;
	}

	public String getInitial_Company_ID() {
		return this.initial_Company_ID;
	}

	public void setInitial_Company_ID(String initial_Company_ID) {
		this.initial_Company_ID = initial_Company_ID;
	}

	public int getInitial_Member_ID() {
		return this.initial_Member_ID;
	}

	public void setInitial_Member_ID(int initial_Member_ID) {
		this.initial_Member_ID = initial_Member_ID;
	}

	public String getRequest_Notes() {
		return this.request_Notes;
	}

	public void setRequest_Notes(String request_Notes) {
		this.request_Notes = request_Notes;
	}

	public Timestamp getWhen_Created() {
		return this.when_Created;
	}

	public void setWhen_Created(Timestamp when_Created) {
		this.when_Created = when_Created;
	}

	public EligibilityParty getEsmPartyTemp() {
		return this.esmPartyTemp;
	}

	public void setEsmPartyTemp(EligibilityParty esmPartyTemp) {
		this.esmPartyTemp = esmPartyTemp;
	}

	public List<EligibilityRequestContractPriceListSet> getEligibilityRequestContractPriceListSets() {
		return this.eligibilityRequestContractPriceListSets;
	}

	public void setEligibilityRequestContractPriceListSets(List<EligibilityRequestContractPriceListSet> eligibilityRequestContractPriceListSets) {
		this.eligibilityRequestContractPriceListSets = eligibilityRequestContractPriceListSets;
	}

	public EligibilityRequestContractPriceListSet addEligibilityRequestContractPriceListSet(EligibilityRequestContractPriceListSet eligibilityRequestContractPriceListSet) {
		getEligibilityRequestContractPriceListSets().add(eligibilityRequestContractPriceListSet);
		eligibilityRequestContractPriceListSet.setEligibilityRequest(this);

		return eligibilityRequestContractPriceListSet;
	}

	public EligibilityRequestContractPriceListSet removeEligibilityRequestContractPriceListSet(EligibilityRequestContractPriceListSet eligibilityRequestContractPriceListSet) {
		getEligibilityRequestContractPriceListSets().remove(eligibilityRequestContractPriceListSet);
		eligibilityRequestContractPriceListSet.setEligibilityRequest(null);

		return eligibilityRequestContractPriceListSet;
	}

	public List<EligibilityRequestFacilityFulfillment> getEligibilityRequestFacilityFulfillments() {
		return this.eligibilityRequestFacilityFulfillments;
	}

	public void setEligibilityRequestFacilityFulfillments(List<EligibilityRequestFacilityFulfillment> eligibilityRequestFacilityFulfillments) {
		this.eligibilityRequestFacilityFulfillments = eligibilityRequestFacilityFulfillments;
	}

	public EligibilityRequestFacilityFulfillment addEligibilityRequestFacilityFulfillment(EligibilityRequestFacilityFulfillment eligibilityRequestFacilityFulfillment) {
		getEligibilityRequestFacilityFulfillments().add(eligibilityRequestFacilityFulfillment);
		eligibilityRequestFacilityFulfillment.setEligibilityRequest(this);

		return eligibilityRequestFacilityFulfillment;
	}

	public EligibilityRequestFacilityFulfillment removeEligibilityRequestFacilityFulfillment(EligibilityRequestFacilityFulfillment eligibilityRequestFacilityFulfillment) {
		getEligibilityRequestFacilityFulfillments().remove(eligibilityRequestFacilityFulfillment);
		eligibilityRequestFacilityFulfillment.setEligibilityRequest(null);

		return eligibilityRequestFacilityFulfillment;
	}

}