package edu.badpals.Domain.Repo;
import edu.badpals.Domain.Fruit;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
@ApplicationScoped
public class FruitRepo implements PanacheRepository<Fruit>{
    
}
