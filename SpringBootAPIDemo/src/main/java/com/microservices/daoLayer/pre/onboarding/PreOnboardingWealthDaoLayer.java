/**
 * 
 */
package com.microservices.daoLayer.pre.onboarding;

import com.microservices.entities.Model.pre.onbaording.SignupLoginCustomerDetails;

/**
 * @author 33000005
 *
 */
public interface PreOnboardingWealthDaoLayer {

	/**
	 * 
	 */
	public boolean registerCustomer(SignupLoginCustomerDetails customerDetails);

}
