package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the Eligibility_Request_Contract_Price_List_Set database table.
 * 
 */
@Entity
@Table(name="Eligibility_Request_Contract_Price_List_Set")
@NamedQuery(name="EligibilityRequestContractPriceListSet.findAll", query="SELECT e FROM EligibilityRequestContractPriceListSet e")
public class EligibilityRequestContractPriceListSet implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="Price_List_Set_ID")
	private int price_List_Set_ID;

	@Column(name="When_Created")
	private Timestamp when_Created;

	//bi-directional many-to-one association to EligibilityRequestContractPriceListDetail
	@OneToMany(mappedBy="eligibilityRequestContractPriceListSet")
	private List<EligibilityRequestContractPriceListDetail> eligibilityRequestContractPriceListDetails;

	//bi-directional many-to-one association to EligibilityParty
	@ManyToOne
	@JoinColumn(name="Creator_ID")
	private EligibilityParty esmPartyTemp;

	//bi-directional many-to-one association to EligibilityRequest
	@ManyToOne
	@JoinColumn(name="Request_ID")
	private EligibilityRequest eligibilityRequest;

	//bi-directional many-to-one association to EligibilityRequestFacilityFulfillment
	@OneToMany(mappedBy="eligibilityRequestContractPriceListSet1")
	private List<EligibilityRequestFacilityFulfillment> eligibilityRequestFacilityFulfillments1;

	//bi-directional many-to-one association to EligibilityRequestFacilityFulfillment
	@OneToMany(mappedBy="eligibilityRequestContractPriceListSet2")
	private List<EligibilityRequestFacilityFulfillment> eligibilityRequestFacilityFulfillments2;

	//bi-directional many-to-one association to EligibilityRequestForm
	@OneToMany(mappedBy="eligibilityRequestContractPriceListSet")
	private List<EligibilityRequestForm> eligibilityRequestForms;

	public EligibilityRequestContractPriceListSet() {
	}

	public int getPrice_List_Set_ID() {
		return this.price_List_Set_ID;
	}

	public void setPrice_List_Set_ID(int price_List_Set_ID) {
		this.price_List_Set_ID = price_List_Set_ID;
	}

	public Timestamp getWhen_Created() {
		return this.when_Created;
	}

	public void setWhen_Created(Timestamp when_Created) {
		this.when_Created = when_Created;
	}

	public List<EligibilityRequestContractPriceListDetail> getEligibilityRequestContractPriceListDetails() {
		return this.eligibilityRequestContractPriceListDetails;
	}

	public void setEligibilityRequestContractPriceListDetails(List<EligibilityRequestContractPriceListDetail> eligibilityRequestContractPriceListDetails) {
		this.eligibilityRequestContractPriceListDetails = eligibilityRequestContractPriceListDetails;
	}

	public EligibilityRequestContractPriceListDetail addEligibilityRequestContractPriceListDetail(EligibilityRequestContractPriceListDetail eligibilityRequestContractPriceListDetail) {
		getEligibilityRequestContractPriceListDetails().add(eligibilityRequestContractPriceListDetail);
		eligibilityRequestContractPriceListDetail.setEligibilityRequestContractPriceListSet(this);

		return eligibilityRequestContractPriceListDetail;
	}

	public EligibilityRequestContractPriceListDetail removeEligibilityRequestContractPriceListDetail(EligibilityRequestContractPriceListDetail eligibilityRequestContractPriceListDetail) {
		getEligibilityRequestContractPriceListDetails().remove(eligibilityRequestContractPriceListDetail);
		eligibilityRequestContractPriceListDetail.setEligibilityRequestContractPriceListSet(null);

		return eligibilityRequestContractPriceListDetail;
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

	public List<EligibilityRequestFacilityFulfillment> getEligibilityRequestFacilityFulfillments1() {
		return this.eligibilityRequestFacilityFulfillments1;
	}

	public void setEligibilityRequestFacilityFulfillments1(List<EligibilityRequestFacilityFulfillment> eligibilityRequestFacilityFulfillments1) {
		this.eligibilityRequestFacilityFulfillments1 = eligibilityRequestFacilityFulfillments1;
	}

	public EligibilityRequestFacilityFulfillment addEligibilityRequestFacilityFulfillments1(EligibilityRequestFacilityFulfillment eligibilityRequestFacilityFulfillments1) {
		getEligibilityRequestFacilityFulfillments1().add(eligibilityRequestFacilityFulfillments1);
		eligibilityRequestFacilityFulfillments1.setEligibilityRequestContractPriceListSet1(this);

		return eligibilityRequestFacilityFulfillments1;
	}

	public EligibilityRequestFacilityFulfillment removeEligibilityRequestFacilityFulfillments1(EligibilityRequestFacilityFulfillment eligibilityRequestFacilityFulfillments1) {
		getEligibilityRequestFacilityFulfillments1().remove(eligibilityRequestFacilityFulfillments1);
		eligibilityRequestFacilityFulfillments1.setEligibilityRequestContractPriceListSet1(null);

		return eligibilityRequestFacilityFulfillments1;
	}

	public List<EligibilityRequestFacilityFulfillment> getEligibilityRequestFacilityFulfillments2() {
		return this.eligibilityRequestFacilityFulfillments2;
	}

	public void setEligibilityRequestFacilityFulfillments2(List<EligibilityRequestFacilityFulfillment> eligibilityRequestFacilityFulfillments2) {
		this.eligibilityRequestFacilityFulfillments2 = eligibilityRequestFacilityFulfillments2;
	}

	public EligibilityRequestFacilityFulfillment addEligibilityRequestFacilityFulfillments2(EligibilityRequestFacilityFulfillment eligibilityRequestFacilityFulfillments2) {
		getEligibilityRequestFacilityFulfillments2().add(eligibilityRequestFacilityFulfillments2);
		eligibilityRequestFacilityFulfillments2.setEligibilityRequestContractPriceListSet2(this);

		return eligibilityRequestFacilityFulfillments2;
	}

	public EligibilityRequestFacilityFulfillment removeEligibilityRequestFacilityFulfillments2(EligibilityRequestFacilityFulfillment eligibilityRequestFacilityFulfillments2) {
		getEligibilityRequestFacilityFulfillments2().remove(eligibilityRequestFacilityFulfillments2);
		eligibilityRequestFacilityFulfillments2.setEligibilityRequestContractPriceListSet2(null);

		return eligibilityRequestFacilityFulfillments2;
	}

	public List<EligibilityRequestForm> getEligibilityRequestForms() {
		return this.eligibilityRequestForms;
	}

	public void setEligibilityRequestForms(List<EligibilityRequestForm> eligibilityRequestForms) {
		this.eligibilityRequestForms = eligibilityRequestForms;
	}

	public EligibilityRequestForm addEligibilityRequestForm(EligibilityRequestForm eligibilityRequestForm) {
		getEligibilityRequestForms().add(eligibilityRequestForm);
		eligibilityRequestForm.setEligibilityRequestContractPriceListSet(this);

		return eligibilityRequestForm;
	}

	public EligibilityRequestForm removeEligibilityRequestForm(EligibilityRequestForm eligibilityRequestForm) {
		getEligibilityRequestForms().remove(eligibilityRequestForm);
		eligibilityRequestForm.setEligibilityRequestContractPriceListSet(null);

		return eligibilityRequestForm;
	}

}