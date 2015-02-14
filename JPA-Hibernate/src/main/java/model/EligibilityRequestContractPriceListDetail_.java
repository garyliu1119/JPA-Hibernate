package model;

import java.sql.Timestamp;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2014-07-26T15:30:23.636-0500")
@StaticMetamodel(EligibilityRequestContractPriceListDetail.class)
public class EligibilityRequestContractPriceListDetail_ {
	public static volatile SingularAttribute<EligibilityRequestContractPriceListDetail, Integer> price_List_Detail_ID;
	public static volatile SingularAttribute<EligibilityRequestContractPriceListDetail, String> contract_ID;
	public static volatile SingularAttribute<EligibilityRequestContractPriceListDetail, Integer> price_List_Key;
	public static volatile SingularAttribute<EligibilityRequestContractPriceListDetail, Timestamp> when_Created;
	public static volatile SingularAttribute<EligibilityRequestContractPriceListDetail, EligibilityRequestContractPriceListSet> eligibilityRequestContractPriceListSet;
}
