package com.relationship.spring.ServiceImple;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.relationship.spring.Entity.Address;
import com.relationship.spring.Entity.Student;
import com.relationship.spring.Repository.AddressRepo;
import com.relationship.spring.Repository.StudentRepo;
import com.relationship.spring.Service.AddressService;

@Component
public class AddressImple implements AddressService{

    @Autowired
    AddressRepo addressRepo;

    @Autowired
    StudentRepo studentRepo;

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
        List<Student> studentList = studentRepo.findAll();
        List<Address> newAddressList = new ArrayList<Address>();
        
        for(Student a: studentList){
            List<Address> addList = a.getAddress();
            for(Address i: addList){
                if(i.getId() == id){

                }
                else{
                    newAddressList.add(i);
                }
            }

           a.setAddress(newAddressList);
           studentRepo.save(a);
        }
       
        
        addressRepo.deleteById(id);

        return "Deleted item with id: "+id;
    }
    
}
