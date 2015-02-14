package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the Fulfillment_Status database table.
 * 
 */
@Entity
@Table(name="Fulfillment_Status")
@NamedQuery(name="EligibilityFulfillmentStatus.findAll", query="SELECT e FROM EligibilityFulfillmentStatus e")
public class EligibilityFulfillmentStatus implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="Fulfillment_Status_ID")
	private short fulfillment_Status_ID;

	@Column(name="Fulfillment_Status_Description")
	private String fulfillment_Status_Description;

	//bi-directional many-to-one association to EligibilityRequestFacilityFulfillment
	@OneToMany(mappedBy="fulfillmentStatus")
	private List<EligibilityRequestFacilityFulfillment> eligibilityRequestFacilityFulfillments;

	public EligibilityFulfillmentStatus() {
	}

	public short getFulfillment_Status_ID() {
		return this.fulfillment_Status_ID;
	}

	public void setFulfillment_Status_ID(short fulfillment_Status_ID) {
		this.fulfillment_Status_ID = fulfillment_Status_ID;
	}

	public String getFulfillment_Status_Description() {
		return this.fulfillment_Status_Description;
	}

	public void setFulfillment_Status_Description(String fulfillment_Status_Description) {
		this.fulfillment_Status_Description = fulfillment_Status_Description;
	}

	public List<EligibilityRequestFacilityFulfillment> getEligibilityRequestFacilityFulfillments() {
		return this.eligibilityRequestFacilityFulfillments;
	}

	public void setEligibilityRequestFacilityFulfillments(List<EligibilityRequestFacilityFulfillment> eligibilityRequestFacilityFulfillments) {
		this.eligibilityRequestFacilityFulfillments = eligibilityRequestFacilityFulfillments;
	}

	public EligibilityRequestFacilityFulfillment addEligibilityRequestFacilityFulfillment(EligibilityRequestFacilityFulfillment eligibilityRequestFacilityFulfillment) {
		getEligibilityRequestFacilityFulfillments().add(eligibilityRequestFacilityFulfillment);
		eligibilityRequestFacilityFulfillment.setFulfillmentStatus(this);

		return eligibilityRequestFacilityFulfillment;
	}

	public EligibilityRequestFacilityFulfillment removeEligibilityRequestFacilityFulfillment(EligibilityRequestFacilityFulfillment eligibilityRequestFacilityFulfillment) {
		getEligibilityRequestFacilityFulfillments().remove(eligibilityRequestFacilityFulfillment);
		eligibilityRequestFacilityFulfillment.setFulfillmentStatus(null);

		return eligibilityRequestFacilityFulfillment;
	}

}