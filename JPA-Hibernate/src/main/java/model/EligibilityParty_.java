package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2014-07-26T15:30:23.635-0500")
@StaticMetamodel(EligibilityParty.class)
public class EligibilityParty_ {
	public static volatile SingularAttribute<EligibilityParty, Integer> party_ID;
	public static volatile SingularAttribute<EligibilityParty, String> party_Name;
	public static volatile ListAttribute<EligibilityParty, EligibilityRequest> eligibilityRequests;
	public static volatile ListAttribute<EligibilityParty, EligibilityRequestContractPriceListSet> eligibilityRequestContractPriceListSets;
	public static volatile ListAttribute<EligibilityParty, EligibilityRequestFacilityFulfillment> eligibilityRequestFacilityFulfillments;
}
