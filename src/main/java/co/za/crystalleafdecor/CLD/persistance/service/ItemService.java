package co.za.crystalleafdecor.CLD.persistance.service;

import co.za.crystalleafdecor.CLD.domain.entity.Item;
import co.za.crystalleafdecor.CLD.persistance.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {
    @Autowired
    ItemRepository itemRepository;

    public List<Item> getAllItems(){
        return itemRepository.findAll();
    }
}
