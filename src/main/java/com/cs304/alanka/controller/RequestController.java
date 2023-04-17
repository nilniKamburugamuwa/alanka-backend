package com.cs304.alanka.controller;

import com.cs304.alanka.model.Request;
import com.cs304.alanka.service.RequestService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins="*")
@RestController
@RequestMapping(path = "api/request")
public class RequestController {

    @Autowired
    private RequestService requestService;

    @GetMapping("/getAll")
    public List<Request> getAllRequests(){return requestService.getAllRequests();}

    @GetMapping("/get/{id}")
    public Request getRequest(@PathVariable(name="id") Long id) {
    	return requestService.getRequestById(id);
    }
    
    @PostMapping("/save")
    public Request addRequest(@RequestBody Request request){return requestService.addRequest(request);}
    
    @DeleteMapping("/delete/{id}")
    public void deleteRequest(@PathVariable(name="id") Long id) {
    	requestService.deleteRequest(id);
    }
    
    @PostMapping("/edit/{id}")
    public Request editRequest(@RequestBody Request request, @PathVariable Long id) {
    	request.setId(id);
    	return requestService.addRequest(request);
    }

}
