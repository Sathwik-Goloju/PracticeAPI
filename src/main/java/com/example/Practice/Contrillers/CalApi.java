package com.example.Practice.Contrillers;

import com.example.Practice.Modelss.Customer;
import com.example.Practice.Services.CalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CalApi {

    @Autowired
    private CalService calService;
    @PostMapping("addCus")
    public Customer addCus(@RequestBody Customer customer){
        Customer res = calService.addUser(customer);
        return res;
    }

    @PutMapping("UpdateCus")
    public Customer updateCus(@RequestParam Integer id,@RequestParam String name){
        return calService.update(id,name);
    }

    @DeleteMapping("deleteCus")
    public Customer deleteCus(@RequestParam Integer id){
        return calService.delete(id);
    }

}
