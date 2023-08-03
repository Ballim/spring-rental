package co.za.crystalleafdecor.CLD.api.controller;

import co.za.crystalleafdecor.CLD.domain.entity.Item;
import co.za.crystalleafdecor.CLD.persistance.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("item")
public class ItemController {
    @Autowired
    ItemService itemService;

    @GetMapping
    public ResponseEntity<?> getAllItems(){
        return ResponseEntity.ok(itemService.getAllItems());
    }

    @GetMapping("/category/{categoryId}")
    public ResponseEntity<?> getItemsByCategory(@PathVariable Long categoryId){
        return ResponseEntity.ok(itemService.getItemsByCategory(categoryId));
    }
    @PostMapping("/new")
    public ResponseEntity<?> newItem(@RequestBody Item item){
        System.out.println(item.getItemDescription());
        Item newItem = itemService.newItem(item);
        if(newItem == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(newItem);
    }

    @PutMapping("/update/{itemId}")
    public ResponseEntity<?> updateItem(@RequestBody Item item, @PathVariable Long itemId){
        Item updated = itemService.updateItem(item, itemId);
        if (updated==null){
            return ResponseEntity.notFound().build();
        }else {
            return ResponseEntity.ok(updated);
        }
    }

    @PutMapping("/update-stock/{itemId}/{qty}")
    public  ResponseEntity<?> updateItemStock(@PathVariable Long itemId, @PathVariable int qty){
        Item updated = itemService.updateItemStock(itemId,qty);
        if (updated==null){
            return ResponseEntity.notFound().build();
        }else {
            return ResponseEntity.ok(updated);
        }
    }
}
