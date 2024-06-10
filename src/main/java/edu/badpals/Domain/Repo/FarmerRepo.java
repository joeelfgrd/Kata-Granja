package edu.badpals.Domain.Repo;
import edu.badpals.Domain.Farmer;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
@ApplicationScoped
public class FarmerRepo implements PanacheRepository<Farmer>{
    
}
