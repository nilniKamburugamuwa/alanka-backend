package com.cs304.alanka.controller;

import com.cs304.alanka.model.Seller;
import com.cs304.alanka.service.SellerService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins="*")
@RestController
@RequestMapping(path = "api/seller")
public class SellerController {

    @Autowired
    private SellerService sellerService;

    @GetMapping("/getAll")
    public List<Seller> getAllSellers(){return sellerService.getAllSellers();}

    @GetMapping("/get/{id}")
    public Seller getSeller(@PathVariable(name="id") Long id) {
    	return sellerService.getSellerById(id);
    }
    
    @PostMapping("/save")
    public Seller addSeller(@RequestBody Seller seller){return sellerService.addSeller(seller);}
    
    @DeleteMapping("/delete/{id}")
    public void deleteSeller(@PathVariable(name="id") Long id) {
    	sellerService.deleteSeller(id);
    }
    
    @PostMapping("/edit/{id}")
    public Seller editSeller(@RequestBody Seller seller, @PathVariable Long id) {
    	seller.setSellerId(id);
    	return sellerService.addSeller(seller);
    }

}
