/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.packt.webstore.service;

import com.packt.webstore.domain.Customer;
import java.util.List;

/**
 *
 * @author derickfelix
 */
public interface CustomerService {

    List<Customer> getAllCustomers();
    
    public void addCustomer(Customer customer);
}
