package model;

import java.sql.Timestamp;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2014-07-26T15:30:23.973-0500")
@StaticMetamodel(EligibilityRequestContractPriceListSet.class)
public class EligibilityRequestContractPriceListSet_ {
	public static volatile SingularAttribute<EligibilityRequestContractPriceListSet, Integer> price_List_Set_ID;
	public static volatile SingularAttribute<EligibilityRequestContractPriceListSet, Timestamp> when_Created;
	public static volatile ListAttribute<EligibilityRequestContractPriceListSet, EligibilityRequestContractPriceListDetail> eligibilityRequestContractPriceListDetails;
	public static volatile SingularAttribute<EligibilityRequestContractPriceListSet, EligibilityParty> esmPartyTemp;
	public static volatile SingularAttribute<EligibilityRequestContractPriceListSet, EligibilityRequest> eligibilityRequest;
	public static volatile ListAttribute<EligibilityRequestContractPriceListSet, EligibilityRequestFacilityFulfillment> eligibilityRequestFacilityFulfillments1;
	public static volatile ListAttribute<EligibilityRequestContractPriceListSet, EligibilityRequestFacilityFulfillment> eligibilityRequestFacilityFulfillments2;
	public static volatile ListAttribute<EligibilityRequestContractPriceListSet, EligibilityRequestForm> eligibilityRequestForms;
}
