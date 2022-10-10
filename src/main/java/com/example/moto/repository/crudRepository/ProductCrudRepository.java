
package com.example.moto.repository.crudRepository;
import com.example.moto.entities.Product;
import org.springframework.data.repository.CrudRepository;


public interface ProductCrudRepository extends CrudRepository<Product, Integer> {
    
}
