package com.cs304.alanka.controller;

import com.cs304.alanka.model.Buyer;
import com.cs304.alanka.service.BuyerService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins="*")
@RestController
@RequestMapping(path = "api/buyer")
public class BuyerController {

    @Autowired
    private BuyerService buyerService;

    @GetMapping("/getAll")
    public List<Buyer> getAllBuyers(){return buyerService.getAllBuyers();}

    @GetMapping("/get/{id}")
    public Buyer getBuyer(@PathVariable(name="id") Long id) {
    	return buyerService.getBuyerById(id);
    }
    
    @PostMapping("/save")
    public Buyer addBuyer(@RequestBody Buyer buyer){return buyerService.addBuyer(buyer);}
    
    @DeleteMapping("/delete/{id}")
    public void deleteBuyer(@PathVariable(name="id") Long id) {
    	buyerService.deleteBuyer(id);
    }
    
    @PostMapping("/edit/{id}")
    public Buyer editBuyer(@RequestBody Buyer buyer, @PathVariable Long id) {
    	buyer.setBuyerId(id);
    	return buyerService.addBuyer(buyer);
    }

}