package one.digitalinnovation.bootcamp.gft.peoplemanagementsystemrestapi.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import one.digitalinnovation.bootcamp.gft.peoplemanagementsystemrestapi.enums.PhoneType;

import javax.persistence.*;

@Entity
@Data /* Provides getters and setters for the attributes */
@Builder /* Give us a design patterns to construct the objects */
@AllArgsConstructor /* Give us constructors */
@NoArgsConstructor /* Give us constructors */
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private PhoneType type;

    @Column(nullable = false)
    private String number;
}
