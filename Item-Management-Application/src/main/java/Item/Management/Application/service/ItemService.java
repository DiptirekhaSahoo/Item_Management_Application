package Item.Management.Application.service;

import Item.Management.Application.entity.Item;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

// Service class contains business logic
@Service
public class ItemService {
    private final List<Item> items = new ArrayList<>();

    public Item addItem(Item item){
        items.add(item);
        return item;
    }

    public Optional<Item> getItemById(Integer id){
        return items.stream().filter(item -> item.getId().equals(id)).findFirst();
    }
}
