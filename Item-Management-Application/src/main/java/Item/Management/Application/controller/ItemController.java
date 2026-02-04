package Item.Management.Application.controller;

import Item.Management.Application.entity.Item;
import Item.Management.Application.service.ItemService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/items")
public class ItemController {
    @Autowired
    private ItemService itemservice;

    @PostMapping
    public ResponseEntity<Item>addItem(@Valid @RequestBody Item item){
       Item savedItem =  itemservice.addItem(item);
       return new ResponseEntity<>(savedItem, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Item>addItemById(@PathVariable Integer id){
       return itemservice.getItemById(id).map(item -> ResponseEntity.ok(item)).orElse(ResponseEntity.notFound().build());
    }
}
