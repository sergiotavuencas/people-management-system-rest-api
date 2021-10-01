package one.digitalinnovation.bootcamp.gft.peoplemanagementsystemrestapi.repository;

import one.digitalinnovation.bootcamp.gft.peoplemanagementsystemrestapi.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
