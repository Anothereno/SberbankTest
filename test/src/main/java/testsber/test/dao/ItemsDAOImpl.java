package testsber.test.dao;

import testsber.test.model.Items;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class ItemsDAOImpl implements ItemsDAO {
    private static final AtomicInteger AUTO_ID = new AtomicInteger(0);
    private static Map<Integer, Items> items = new HashMap<>();

    static {
        Items item1 = new Items();
        item1.setId(AUTO_ID.getAndIncrement());
        item1.setArticle("А001");
        item1.setName("Гайка");
        item1.setShelf(1);
        item1.setBox("A");
        items.put(item1.getId(), item1);
    }

    static {
        Items item2 = new Items();
        item2.setId(AUTO_ID.getAndIncrement());
        item2.setArticle("В001");
        item2.setName("Болт");
        item2.setShelf(2);
        item2.setBox("В");
        items.put(item2.getId(), item2);
    }

    static {
        Items item3 = new Items();
        item3.setId(AUTO_ID.getAndIncrement());
        item3.setArticle("C001");
        item3.setName("Шайба");
        item3.setShelf(1);
        item3.setBox("С");
        items.put(item3.getId(), item3);
    }

    @Override
    public List<Items> allItems(){
        return new ArrayList<>(items.values());
    }

    @Override
    public void add(Items item){
        item.setId(AUTO_ID.getAndIncrement());
        items.put(item.getId(), item);
    }

    @Override
    public void delete(Items item){
        items.remove(item.getId());
    }

    @Override
    public void edit(Items item){
        items.put(item.getId(), item);
    }

    @Override
    public Items getById(int id){
        return items.get(id);
    }
}
