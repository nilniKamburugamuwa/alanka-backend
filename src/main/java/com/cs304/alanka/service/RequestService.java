package com.cs304.alanka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cs304.alanka.model.Request;
import com.cs304.alanka.repository.RequestRepository;


@Service
public class RequestService {

    @Autowired
    private RequestRepository requestRepository;

    public List<Request> getAllRequests() {
        return requestRepository.findAll();
    }

    public Request addRequest(Request request){
        return requestRepository.save(request);
    }

    public void deleteRequest(Long id){ requestRepository.deleteById(id);}
    
    public Request getRequestById(Long id) {
    	return requestRepository.findById(id).get();
    }
    
    public Request editRequest(Request request, Long id) {
    	return requestRepository.save(request);
    }
    

}
