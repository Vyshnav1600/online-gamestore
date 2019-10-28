package com.gamestore.service;

import com.gamestore.domain.BillingAddress;
import com.gamestore.domain.UserBilling;

public interface BillingAddressService {
	BillingAddress setByUserBilling(UserBilling userBilling, BillingAddress billingAddress);
}
