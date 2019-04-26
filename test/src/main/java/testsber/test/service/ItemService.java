package testsber.test.service;

import testsber.test.model.Items;

import java.util.List;

public interface ItemService {
    List<Items> allItems();
    void add(Items item);
    void delete(Items item);
    void edit(Items item);
    Items getById(int id);
}
