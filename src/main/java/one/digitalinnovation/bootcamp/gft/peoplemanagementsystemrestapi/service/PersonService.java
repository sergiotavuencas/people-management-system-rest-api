package one.digitalinnovation.bootcamp.gft.peoplemanagementsystemrestapi.service;

import one.digitalinnovation.bootcamp.gft.peoplemanagementsystemrestapi.dto.MessageResponseDTO;
import one.digitalinnovation.bootcamp.gft.peoplemanagementsystemrestapi.entity.Person;
import one.digitalinnovation.bootcamp.gft.peoplemanagementsystemrestapi.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class PersonService {

    private PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @PostMapping
    public MessageResponseDTO createPerson(Person person) {
        Person savedPerson = personRepository.save(person);

        /* With builder, we can avoid creating in constructor and encapsulate the data */
        return MessageResponseDTO
                .builder()
                .message("Created person with ID " + savedPerson.getId())
                .build();
    }
}
