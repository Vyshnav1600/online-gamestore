package com.gamestore.service;

import com.gamestore.domain.Payment;
import com.gamestore.domain.UserPayment;

public interface PaymentService {
	Payment setByUserPayment(UserPayment userPayment, Payment payment);
}
