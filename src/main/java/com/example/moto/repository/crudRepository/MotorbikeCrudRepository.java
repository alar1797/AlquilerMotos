
package com.example.moto.repository.crudRepository;
import com.example.moto.entities.Motorbike;
import org.springframework.data.repository.CrudRepository;

public interface MotorbikeCrudRepository extends CrudRepository<Motorbike, Integer> {
    
}
