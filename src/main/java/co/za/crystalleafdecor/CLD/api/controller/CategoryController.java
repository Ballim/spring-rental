package co.za.crystalleafdecor.CLD.api.controller;

import co.za.crystalleafdecor.CLD.domain.entity.Category;
import co.za.crystalleafdecor.CLD.persistance.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("category")
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @GetMapping
    public ResponseEntity<?> getAllCategories(){
        return ResponseEntity.ok(categoryService.getAllCategories());
    }

    @PostMapping("/new")
    public ResponseEntity<?> newCategory(@RequestBody Category category){
        System.out.println(category);
        return ResponseEntity.ok(categoryService.newCategory(category));
    }
}
