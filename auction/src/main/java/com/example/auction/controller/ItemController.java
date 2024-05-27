package com.example.auction.controller;

import com.example.auction.entity.Item;
import com.example.auction.model.AddItemInput;
import com.example.auction.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/items")
@Validated
public class ItemController {

    @Autowired
    private ItemService itemService;

    @GetMapping
    public List<Item> getAllItems() {
        return itemService.getAllItems();
    }

    @PostMapping
    public ResponseEntity<?> addItem(@Valid @RequestBody AddItemInput input) {
        Item item = new Item();
        item.setName(input.getName());
        item.setDescription(input.getDescription());
        item.setStartingPrice(input.getStartingPrice());
        Item savedItem = itemService.addItem(item);
        return new ResponseEntity<>(savedItem, HttpStatus.CREATED);
    }
}