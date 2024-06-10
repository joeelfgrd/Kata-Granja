package edu.badpals.Domain;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;

@Entity
@Data
@NoArgsConstructor
@Table(name = "t_fruit")
public class Fruit {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name="";

    @Column(name = "description")
    private String description="";
    @ManyToOne
    @JoinColumn(name = "farmer_id")
    public Farmer farmer;





}
