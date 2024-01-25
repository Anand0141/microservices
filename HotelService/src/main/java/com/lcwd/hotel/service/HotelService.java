package com.lcwd.hotel.service;

import com.lcwd.hotel.entity.Hotel;

import java.util.List;

public interface HotelService {

    public Hotel create(Hotel hotel);

    public List<Hotel> getAll();

    public Hotel getById(String id);
}
