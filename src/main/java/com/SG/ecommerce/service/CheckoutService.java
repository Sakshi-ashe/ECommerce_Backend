package com.SG.ecommerce.service;

import com.SG.ecommerce.dto.Purchase;
import com.SG.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}