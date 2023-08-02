package co.za.crystalleafdecor.CLD;

import co.za.crystalleafdecor.CLD.domain.entity.Category;
import co.za.crystalleafdecor.CLD.domain.entity.Item;
import co.za.crystalleafdecor.CLD.domain.entity.User;
import co.za.crystalleafdecor.CLD.persistance.repository.CategoryRepository;
import co.za.crystalleafdecor.CLD.persistance.service.CategoryService;
import co.za.crystalleafdecor.CLD.persistance.service.ItemService;
import co.za.crystalleafdecor.CLD.persistance.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class DBInit implements CommandLineRunner {

    @Autowired
    UserService userService;
    @Autowired
    ItemService itemService;
    @Autowired
    CategoryService categoryService;

    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setEmail("ballim@ziyaad.co.za");
        user.setFullName("Ziyaad Ballim");
        user.setMobileNumber("0720866809");
        user.setPassword("Password123");
        userService.newUser(user);

        Category category= new Category();
        category.setCategoryName("Glasses");
        categoryService.newCategory(category);
        Category category1 = new Category();
        category1.setCategoryName("Plates");
        categoryService.newCategory(category1);

        for (int i=0; i<20; ++i){
            Item item= new Item();
            item.setItemName("Item "+i);
            item.setItemDescription("Description "+i);
            item.setCategory(category);
            item.setUnitPrice(BigDecimal.valueOf(10.0*i));
            item.setCurrentStock(20*i);
            itemService.newItem(item);
        }

        for (int i=0; i<20; ++i){
            Item item= new Item();
            item.setItemName("Item "+i);
            item.setItemDescription("Description "+i);
            item.setCategory(category1);
            item.setUnitPrice(BigDecimal.valueOf(10.0*i));
            item.setCurrentStock(20*i);
            itemService.newItem(item);
        }
    }
}
