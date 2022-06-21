package com.relationship.spring.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.relationship.spring.Entity.Address;
@Service
public interface AddressService {
    public List<Address> getAll(); 
    public Address getById(long id); 
    public List<Address> post(Address address);
    public List<Address> update(Address address);
    public String deleteById(long id);
}
