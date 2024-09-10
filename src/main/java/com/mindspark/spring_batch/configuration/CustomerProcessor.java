package com.mindspark.spring_batch.configuration;

import com.mindspark.spring_batch.entity.Customer;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;
@Slf4j
public class CustomerProcessor implements ItemProcessor<Customer, Customer> {

    Logger logger = LoggerFactory.getLogger(CustomerProcessor.class);

    @Override
    public Customer process(Customer customer) throws Exception {

        //processor logic
        logger.info("Processing customer: " + customer.toString()); // Log customer data
        return customer;

//        if(item.getCountry().equals("India"){
//            return item;
//        }
//        return null;
    }
}
