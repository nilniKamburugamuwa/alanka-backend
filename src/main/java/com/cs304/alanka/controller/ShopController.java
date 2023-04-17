package com.cs304.alanka.controller;

import com.cs304.alanka.model.Shop;
import com.cs304.alanka.service.ShopService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins="*")
@RestController
@RequestMapping(path = "api/shop")
public class ShopController {

    @Autowired
    private ShopService shopService;

    @GetMapping("/getAll")
    public List<Shop> getAllShops(){return shopService.getAllShops();}

    @GetMapping("/get/{id}")
    public Shop getShop(@PathVariable(name="id") Long id) {
    	return shopService.getShopById(id);
    }
    
    @PostMapping("/save")
    public Shop addShop(@RequestBody Shop shop){return shopService.addShop(shop);}
    
    @DeleteMapping("/delete/{id}")
    public void deleteShop(@PathVariable(name="id") Long id) {
    	shopService.deleteShop(id);
    }
    
    @PostMapping("/edit/{id}")
    public Shop editShop(@RequestBody Shop shop, @PathVariable Long id) {
    	shop.setShopId(id);
    	return shopService.addShop(shop);
    }

}
