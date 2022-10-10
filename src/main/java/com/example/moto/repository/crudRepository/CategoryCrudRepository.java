
package com.example.moto.repository.crudRepository;
import com.example.moto.entities.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryCrudRepository extends CrudRepository<Category, Integer> {
    
}
