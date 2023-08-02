package co.za.crystalleafdecor.CLD.persistance.service;

import co.za.crystalleafdecor.CLD.domain.entity.Category;
import co.za.crystalleafdecor.CLD.domain.entity.Item;
import co.za.crystalleafdecor.CLD.persistance.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemService {
    @Autowired
    ItemRepository itemRepository;
    @Autowired
    CategoryService categoryService;

    public List<Item> getAllItems(){
        return itemRepository.findAll();
    }

    public Item newItem(Item item){
        if(!categoryService.getCategoryById(item.getCategory().getCategoryId()).isPresent()){
            return null;
        }
        return itemRepository.save(item);
    }

    public Item updateItem(Item item, Long itemId){
        Optional<Item> foundItem = itemRepository.findById(itemId);
        if(foundItem.isPresent()){
            foundItem.get().setItemName(item.getItemName());
            foundItem.get().setItemDescription(item.getItemDescription());
            foundItem.get().setUnitPrice(item.getUnitPrice());
            foundItem.get().setCategory(item.getCategory());
            foundItem.get().setCurrentStock(item.getCurrentStock());
            return itemRepository.save(foundItem.get());
        }
        return null;
    }

    public Item updateItemStock(Long itemId, int stock){
        Optional<Item> item = itemRepository.findById(itemId);
        if (item.isPresent()){
            item.get().setCurrentStock(stock);
            return itemRepository.save(item.get());
        }
        return null;
    }

    public List<Item> getItemsByCategory(Long categoryId) {
        return itemRepository.findAllByCategoryCategoryId(categoryId);
    }
}
