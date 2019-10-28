package com.gamestore.service;

import com.gamestore.domain.ShippingAddress;
import com.gamestore.domain.UserShipping;

public interface ShippingAddressService {
	ShippingAddress setByUserShipping(UserShipping userShipping, ShippingAddress shippingAddress);
}
