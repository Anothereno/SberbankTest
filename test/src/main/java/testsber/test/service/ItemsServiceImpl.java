package testsber.test.service;

import testsber.test.dao.ItemsDAO;
import testsber.test.dao.ItemsDAOImpl;
import testsber.test.model.Items;

import java.util.List;

public class ItemsServiceImpl implements ItemService {
    private ItemsDAO itemsDAO = new ItemsDAOImpl();

    @Override
    public List<Items> allItems(){
        return itemsDAO.allItems();
    }

    @Override
    public void add(Items item){
        itemsDAO.add(item);
    }

    @Override
    public void delete(Items items){
        itemsDAO.delete(items);
    }

    @Override
    public void edit(Items items){
        itemsDAO.edit(items);
    }

    @Override
    public Items getById(int id){
        return itemsDAO.getById(id);
    }
}
