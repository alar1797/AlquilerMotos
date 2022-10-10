
package com.example.moto.repository.crudRepository;
import com.example.moto.entities.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface ReservationCrudRepository extends CrudRepository<Reservation, Integer>{
    
}
