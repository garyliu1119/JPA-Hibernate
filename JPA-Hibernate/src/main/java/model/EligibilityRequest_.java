package model;

import java.sql.Timestamp;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2014-07-26T15:30:23.635-0500")
@StaticMetamodel(EligibilityRequest.class)
public class EligibilityRequest_ {
	public static volatile SingularAttribute<EligibilityRequest, Integer> request_ID;
	public static volatile SingularAttribute<EligibilityRequest, String> initial_Company_ID;
	public static volatile SingularAttribute<EligibilityRequest, Integer> initial_Member_ID;
	public static volatile SingularAttribute<EligibilityRequest, String> request_Notes;
	public static volatile SingularAttribute<EligibilityRequest, Timestamp> when_Created;
	public static volatile SingularAttribute<EligibilityRequest, EligibilityParty> esmPartyTemp;
	public static volatile ListAttribute<EligibilityRequest, EligibilityRequestContractPriceListSet> eligibilityRequestContractPriceListSets;
	public static volatile ListAttribute<EligibilityRequest, EligibilityRequestFacilityFulfillment> eligibilityRequestFacilityFulfillments;
}
