package com.cs304.alanka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cs304.alanka.model.Buyer;
import com.cs304.alanka.repository.BuyerRepository;


@Service
public class BuyerService {

    @Autowired
    private BuyerRepository buyerRepository;

    public List<Buyer> getAllBuyers() {
        return buyerRepository.findAll();
    }

    public Buyer addBuyer(Buyer buyer){
        return buyerRepository.save(buyer);
    }

    public void deleteBuyer(Long id){ buyerRepository.deleteById(id);}
    
    public Buyer getBuyerById(Long id) {
    	return buyerRepository.findById(id).get();
    }
    
    public Buyer editBuyer(Buyer buyer, Long id) {
    	return buyerRepository.save(buyer);
    }
    

}
