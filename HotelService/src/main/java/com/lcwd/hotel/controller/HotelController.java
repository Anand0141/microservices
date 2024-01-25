package com.lcwd.hotel.controller;

import com.lcwd.hotel.entity.Hotel;
import com.lcwd.hotel.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotel")
public class HotelController {

    @Autowired
    private HotelService service;

    @PostMapping("/create")
    public ResponseEntity<Hotel> create(@RequestBody Hotel hotel){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.create(hotel));
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Hotel>> getAll(){
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<Hotel> getById(@PathVariable String id){
        return ResponseEntity.status(HttpStatus.OK).body(service.getById(id));
    }

}
