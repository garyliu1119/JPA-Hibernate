package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ESM_Party_TEMP database table.
 * 
 */
@Entity
@Table(name="ESM_Party_TEMP")
@NamedQuery(name="EligibilityParty.findAll", query="SELECT e FROM EligibilityParty e")
public class EligibilityParty implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="Party_ID")
	private int party_ID;

	@Column(name="Party_Name")
	private String party_Name;

	//bi-directional many-to-one association to EligibilityRequest
	@OneToMany(mappedBy="esmPartyTemp")
	private List<EligibilityRequest> eligibilityRequests;

	//bi-directional many-to-one association to EligibilityRequestContractPriceListSet
	@OneToMany(mappedBy="esmPartyTemp")
	private List<EligibilityRequestContractPriceListSet> eligibilityRequestContractPriceListSets;

	//bi-directional many-to-one association to EligibilityRequestFacilityFulfillment
	@OneToMany(mappedBy="esmPartyTemp")
	private List<EligibilityRequestFacilityFulfillment> eligibilityRequestFacilityFulfillments;

	public EligibilityParty() {
	}

	public int getParty_ID() {
		return this.party_ID;
	}

	public void setParty_ID(int party_ID) {
		this.party_ID = party_ID;
	}

	public String getParty_Name() {
		return this.party_Name;
	}

	public void setParty_Name(String party_Name) {
		this.party_Name = party_Name;
	}

	public List<EligibilityRequest> getEligibilityRequests() {
		return this.eligibilityRequests;
	}

	public void setEligibilityRequests(List<EligibilityRequest> eligibilityRequests) {
		this.eligibilityRequests = eligibilityRequests;
	}

	public EligibilityRequest addEligibilityRequest(EligibilityRequest eligibilityRequest) {
		getEligibilityRequests().add(eligibilityRequest);
		eligibilityRequest.setEsmPartyTemp(this);

		return eligibilityRequest;
	}

	public EligibilityRequest removeEligibilityRequest(EligibilityRequest eligibilityRequest) {
		getEligibilityRequests().remove(eligibilityRequest);
		eligibilityRequest.setEsmPartyTemp(null);

		return eligibilityRequest;
	}

	public List<EligibilityRequestContractPriceListSet> getEligibilityRequestContractPriceListSets() {
		return this.eligibilityRequestContractPriceListSets;
	}

	public void setEligibilityRequestContractPriceListSets(List<EligibilityRequestContractPriceListSet> eligibilityRequestContractPriceListSets) {
		this.eligibilityRequestContractPriceListSets = eligibilityRequestContractPriceListSets;
	}

	public EligibilityRequestContractPriceListSet addEligibilityRequestContractPriceListSet(EligibilityRequestContractPriceListSet eligibilityRequestContractPriceListSet) {
		getEligibilityRequestContractPriceListSets().add(eligibilityRequestContractPriceListSet);
		eligibilityRequestContractPriceListSet.setEsmPartyTemp(this);

		return eligibilityRequestContractPriceListSet;
	}

	public EligibilityRequestContractPriceListSet removeEligibilityRequestContractPriceListSet(EligibilityRequestContractPriceListSet eligibilityRequestContractPriceListSet) {
		getEligibilityRequestContractPriceListSets().remove(eligibilityRequestContractPriceListSet);
		eligibilityRequestContractPriceListSet.setEsmPartyTemp(null);

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
		eligibilityRequestFacilityFulfillment.setEsmPartyTemp(this);

		return eligibilityRequestFacilityFulfillment;
	}

	public EligibilityRequestFacilityFulfillment removeEligibilityRequestFacilityFulfillment(EligibilityRequestFacilityFulfillment eligibilityRequestFacilityFulfillment) {
		getEligibilityRequestFacilityFulfillments().remove(eligibilityRequestFacilityFulfillment);
		eligibilityRequestFacilityFulfillment.setEsmPartyTemp(null);

		return eligibilityRequestFacilityFulfillment;
	}

}