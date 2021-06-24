package com.SG.ecommerce.dto;



import lombok.Data;

import java.util.Set;

import com.SG.ecommerce.entity.Address;
import com.SG.ecommerce.entity.Customer;
import com.SG.ecommerce.entity.Order;
import com.SG.ecommerce.entity.OrderItem;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}
