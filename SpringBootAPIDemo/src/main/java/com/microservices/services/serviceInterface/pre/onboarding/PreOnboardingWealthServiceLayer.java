/**
 * 
 */
package com.microservices.services.serviceInterface.pre.onboarding;

import com.microservices.entities.Model.pre.onbaording.SignupLoginCustomerDetails;

/**
 * @author 33000005
 *
 */
public interface PreOnboardingWealthServiceLayer {
	public boolean registerCustomer(SignupLoginCustomerDetails customerDetails);
}
