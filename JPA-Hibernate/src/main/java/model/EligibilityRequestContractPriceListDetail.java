package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the Eligibility_Request_Contract_Price_List_Detail database table.
 * 
 */
@Entity
@Table(name="Eligibility_Request_Contract_Price_List_Detail")
@NamedQuery(name="EligibilityRequestContractPriceListDetail.findAll", query="SELECT e FROM EligibilityRequestContractPriceListDetail e")
public class EligibilityRequestContractPriceListDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="Price_List_Detail_ID")
	private int price_List_Detail_ID;

	@Column(name="Contract_ID")
	private String contract_ID;

	@Column(name="Price_List_Key")
	private int price_List_Key;

	@Column(name="When_Created")
	private Timestamp when_Created;

	//bi-directional many-to-one association to EligibilityRequestContractPriceListSet
	@ManyToOne
	@JoinColumn(name="Price_List_Set_ID")
	private EligibilityRequestContractPriceListSet eligibilityRequestContractPriceListSet;

	public EligibilityRequestContractPriceListDetail() {
	}

	public int getPrice_List_Detail_ID() {
		return this.price_List_Detail_ID;
	}

	public void setPrice_List_Detail_ID(int price_List_Detail_ID) {
		this.price_List_Detail_ID = price_List_Detail_ID;
	}

	public String getContract_ID() {
		return this.contract_ID;
	}

	public void setContract_ID(String contract_ID) {
		this.contract_ID = contract_ID;
	}

	public int getPrice_List_Key() {
		return this.price_List_Key;
	}

	public void setPrice_List_Key(int price_List_Key) {
		this.price_List_Key = price_List_Key;
	}

	public Timestamp getWhen_Created() {
		return this.when_Created;
	}

	public void setWhen_Created(Timestamp when_Created) {
		this.when_Created = when_Created;
	}

	public EligibilityRequestContractPriceListSet getEligibilityRequestContractPriceListSet() {
		return this.eligibilityRequestContractPriceListSet;
	}

	public void setEligibilityRequestContractPriceListSet(EligibilityRequestContractPriceListSet eligibilityRequestContractPriceListSet) {
		this.eligibilityRequestContractPriceListSet = eligibilityRequestContractPriceListSet;
	}

}