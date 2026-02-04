package Item.Management.Application.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.*;
import jakarta.validation.constraints.NotNull;

//This class represents the Item table in the database
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Item {

    //Primary key
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull(message = "id is requried")
    private Integer id;

    @NotBlank(message = "name is required")
    private String name;

    @NotBlank(message = "Description is required")
    private String description;

    private double price;

}
