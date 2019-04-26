package testsber.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import testsber.test.model.Items;
import testsber.test.service.ItemService;
import testsber.test.service.ItemsServiceImpl;

import javax.jws.WebParam;
import java.util.List;

@Controller
public class ItemController {
    private ItemService itemsService = new ItemsServiceImpl();

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView allItems() {
        List<Items> items = itemsService.allItems();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("items");
        modelAndView.addObject("itemList", items);
        return modelAndView;
    }

/*
    @RequestMapping(value = "/edit", method = RequestMethod.GET)
    public ModelAndView edit(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("edit");
        return modelAndView;
    }
*/
    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public ModelAndView edit(@PathVariable("id") int id){
        Items item = itemsService.getById(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("edit");
        modelAndView.addObject("item", item);
        modelAndView.addObject("item", itemsService.getById(id));
        return modelAndView;
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public ModelAndView addPage(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("edit");
        return modelAndView;
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ModelAndView addItem(@ModelAttribute("item") Items item){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/");
        itemsService.add(item);
        return modelAndView;
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
        public ModelAndView deleteItem(@PathVariable("id")int id) {
            ModelAndView modelAndView = new ModelAndView();
            modelAndView.setViewName("redirect:/");
            Items item = itemsService.getById(id);
            itemsService.delete(item);
            return modelAndView;
        }

    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public ModelAndView editItem(@ModelAttribute("item") Items items){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/");
        itemsService.edit(items);
        return modelAndView;
    }
}
