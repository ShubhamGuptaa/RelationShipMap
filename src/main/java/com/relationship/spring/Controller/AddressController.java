package com.relationship.spring.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.relationship.spring.Entity.Address;
import com.relationship.spring.Service.AddressService;

@RestController
@RequestMapping("/address")
public class AddressController {
    
    @Autowired
    AddressService addressService;

    @GetMapping("/getAll")
    public List<Address> getAllAddress(){
        return addressService.getAll();
    }
    @GetMapping("/getById/{id}")
    public Address getAddressById(@PathVariable("id") long id){
        return addressService.getById(id);
    }
    @PostMapping("/post")
    public List<Address> postAddress(@RequestBody Address address){
        return addressService.post(address);
    }
    @GetMapping("/update")
    public List<Address> updateAddress(@RequestBody Address address){
        return addressService.update(address);
    }
    @GetMapping("/deleteById/{id}")
    public String deleteAddress(@PathVariable("id") long id){
        return addressService.deleteById(id);
    }
    
}
