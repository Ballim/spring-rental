package co.za.crystalleafdecor.CLD.api.controller;

import co.za.crystalleafdecor.CLD.persistance.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("item")
public class ItemController {
    @Autowired
    ItemService itemService;

    @GetMapping
    public ResponseEntity<?> getAllItems(){
        return ResponseEntity.ok(itemService.getAllItems());
    }
}
