
package com.example.moto.repository.crudRepository;
import com.example.moto.entities.Message;
import org.springframework.data.repository.CrudRepository;


public interface MessageCrudRepository extends CrudRepository<Message, Integer>{
    
}
