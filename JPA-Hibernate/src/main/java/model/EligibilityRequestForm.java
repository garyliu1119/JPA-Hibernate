package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Eligibility_Request_Form database table.
 * 
 */
@Entity
@Table(name="Eligibility_Request_Form")
@NamedQuery(name="EligibilityRequestForm.findAll", query="SELECT e FROM EligibilityRequestForm e")
public class EligibilityRequestForm implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="Request_Form_ID")
	private int request_Form_ID;

	@Column(name="Form_ID")
	private int form_ID;

	//bi-directional many-to-one association to EligibilityRequestContractPriceListSet
	@ManyToOne
	@JoinColumn(name="Price_List_Set_ID")
	private EligibilityRequestContractPriceListSet eligibilityRequestContractPriceListSet;

	public EligibilityRequestForm() {
	}

	public int getRequest_Form_ID() {
		return this.request_Form_ID;
	}

	public void setRequest_Form_ID(int request_Form_ID) {
		this.request_Form_ID = request_Form_ID;
	}

	public int getForm_ID() {
		return this.form_ID;
	}

	public void setForm_ID(int form_ID) {
		this.form_ID = form_ID;
	}

	public EligibilityRequestContractPriceListSet getEligibilityRequestContractPriceListSet() {
		return this.eligibilityRequestContractPriceListSet;
	}

	public void setEligibilityRequestContractPriceListSet(EligibilityRequestContractPriceListSet eligibilityRequestContractPriceListSet) {
		this.eligibilityRequestContractPriceListSet = eligibilityRequestContractPriceListSet;
	}

}