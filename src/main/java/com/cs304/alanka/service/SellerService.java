package com.cs304.alanka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cs304.alanka.model.Seller;
import com.cs304.alanka.repository.SellerRepository;


@Service
public class SellerService {

    @Autowired
    private SellerRepository sellerRepository;

    public List<Seller> getAllSellers() {
        return sellerRepository.findAll();
    }

    public Seller addSeller(Seller seller){
        return sellerRepository.save(seller);
    }

    public void deleteSeller(Long id){ sellerRepository.deleteById(id);}
    
    public Seller getSellerById(Long id) {
    	return sellerRepository.findById(id).get();
    }
    
    public Seller editSeller(Seller seller, Long id) {
    	return sellerRepository.save(seller);
    }
    

}
