package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2014-07-26T15:30:23.634-0500")
@StaticMetamodel(EligibilityFulfillmentStatus.class)
public class EligibilityFulfillmentStatus_ {
	public static volatile SingularAttribute<EligibilityFulfillmentStatus, Short> fulfillment_Status_ID;
	public static volatile SingularAttribute<EligibilityFulfillmentStatus, String> fulfillment_Status_Description;
	public static volatile ListAttribute<EligibilityFulfillmentStatus, EligibilityRequestFacilityFulfillment> eligibilityRequestFacilityFulfillments;
}
