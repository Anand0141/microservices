package com.lcwd.hotel.service;

import com.lcwd.hotel.entity.Hotel;
import com.lcwd.hotel.exception.ResourceNotFoundExcepiton;
import com.lcwd.hotel.repository.HotelRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HotelServiceImpl implements HotelService{


    @Autowired
    private HotelRepo repository;
    @Override
    public Hotel create(Hotel hotel) {
        String Uid= UUID.randomUUID().toString();
        hotel.setId(Uid);
        return repository.save(hotel);
    }

    @Override
    public List<Hotel> getAll() {
        return repository.findAll();
    }

    @Override
    public Hotel getById(String id) {
        return repository.findById(id).orElseThrow(()-> new ResourceNotFoundExcepiton("hotel with given id is not found"));
    }
}
