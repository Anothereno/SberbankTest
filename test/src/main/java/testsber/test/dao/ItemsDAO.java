package testsber.test.dao;

import testsber.test.model.Items;

import java.util.List;

public interface ItemsDAO {
    List<Items> allItems();

    void add(Items items);
    void delete(Items items);
    void edit(Items items);

    Items getById(int id);
}
