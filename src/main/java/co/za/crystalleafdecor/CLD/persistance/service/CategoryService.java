package co.za.crystalleafdecor.CLD.persistance.service;

import co.za.crystalleafdecor.CLD.domain.entity.Category;
import co.za.crystalleafdecor.CLD.persistance.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    CategoryRepository categoryRepository;

    public List<Category> getAllCategories(){
        return categoryRepository.findAll();
    }

    public Optional<Category> getCategoryById(Long id){
        return categoryRepository.findById(id);
    }
    public Category newCategory(Category category){
        return categoryRepository.save(category);
    }
}
