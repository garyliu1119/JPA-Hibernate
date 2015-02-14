package model;

import java.sql.Timestamp;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2014-07-26T15:30:23.979-0500")
@StaticMetamodel(EligibilityRequestFacilityFulfillment.class)
public class EligibilityRequestFacilityFulfillment_ {
	public static volatile SingularAttribute<EligibilityRequestFacilityFulfillment, Integer> facility_Fulfillment_ID;
	public static volatile SingularAttribute<EligibilityRequestFacilityFulfillment, String> company_ID;
	public static volatile SingularAttribute<EligibilityRequestFacilityFulfillment, Integer> member_ID;
	public static volatile SingularAttribute<EligibilityRequestFacilityFulfillment, Timestamp> when_Created;
	public static volatile SingularAttribute<EligibilityRequestFacilityFulfillment, Timestamp> when_Reviewed;
	public static volatile SingularAttribute<EligibilityRequestFacilityFulfillment, EligibilityParty> esmPartyTemp;
	public static volatile SingularAttribute<EligibilityRequestFacilityFulfillment, EligibilityRequest> eligibilityRequest;
	public static volatile SingularAttribute<EligibilityRequestFacilityFulfillment, EligibilityRequestContractPriceListSet> eligibilityRequestContractPriceListSet1;
	public static volatile SingularAttribute<EligibilityRequestFacilityFulfillment, EligibilityRequestContractPriceListSet> eligibilityRequestContractPriceListSet2;
	public static volatile SingularAttribute<EligibilityRequestFacilityFulfillment, EligibilityFulfillmentStatus> fulfillmentStatus;
}
