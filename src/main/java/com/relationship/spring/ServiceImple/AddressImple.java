package com.relationship.spring.ServiceImple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.relationship.spring.Entity.Address;
import com.relationship.spring.Repository.AddressRepo;
import com.relationship.spring.Service.AddressService;

@Component
public class AddressImple implements AddressService{

    @Autowired
    AddressRepo addressRepo;

    @Override
    public List<Address> getAll() {
        return addressRepo.findAll();
    }

    @Override
    public Address getById(long id) {
        return addressRepo.findById(id).get();
    }

    @Override
    public List<Address> post(Address address) {
        addressRepo.save(address);
        return addressRepo.findAll();
    }

    @Override
    public List<Address> update(Address address) {
       List<Address> new_list = addressRepo.findAll();
       for(Address a: new_list){
        if(a.getId() == address.getId()){
            addressRepo.save(address);
        }
        else{
            System.out.println("Id doesn't exist!");
        }
       }
        return addressRepo.findAll();
    }

    @Override
    public String deleteById(long id) {
        addressRepo.deleteById(id);
        return "Deleted item with id: "+id;
    }
    
}
