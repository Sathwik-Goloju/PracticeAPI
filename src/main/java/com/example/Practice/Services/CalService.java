package com.example.Practice.Services;

import com.example.Practice.Modelss.Customer;
import com.example.Practice.Repo.REposi;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalService {
    @Autowired
    private REposi rEposi;
    public Customer addUser(Customer customer){
        Customer cus = rEposi.save(customer);
//        return "customer saved successfylly with cus name "+cus.getCustomerId();
        return cus;
    }

    public Customer update(Integer id,String name){
        Customer cust = rEposi.findById(id).get();
        cust.setCusName(name);

        rEposi.save(cust);
        return cust;
    }
}
