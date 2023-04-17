package com.cs304.alanka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cs304.alanka.model.Shop;
import com.cs304.alanka.repository.ShopRepository;


@Service
public class ShopService {

    @Autowired
    private ShopRepository shopRepository;

    public List<Shop> getAllShops() {
        return shopRepository.findAll();
    }

    public Shop addShop(Shop shop){
        return shopRepository.save(shop);
    }

    public void deleteShop(Long id){ shopRepository.deleteById(id);}
    
    public Shop getShopById(Long id) {
    	return shopRepository.findById(id).get();
    }
    
    public Shop editShop(Shop shop, Long id) {
    	return shopRepository.save(shop);
    }
    

}

