
package com.example.moto.Repositories;

import com.example.moto.entities.Motorbike;
import com.example.moto.repository.crudRepository.MotorbikeCrudRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MotorbikeRepository {
    
    @Autowired
    private MotorbikeCrudRepository motorbikeCrudRepository;
    
    public List<Motorbike> getAll(){
        return (List<Motorbike>) motorbikeCrudRepository.findAll();
        
    }
    
    public Optional<Motorbike> getMotorbike(int id){
       return motorbikeCrudRepository.findById(id);
    }
  
   
    public Motorbike save(Motorbike p){
        return motorbikeCrudRepository.save(p);
    }
    
    public void delete(Motorbike p) {
        motorbikeCrudRepository.delete(p);
    }
    
}
