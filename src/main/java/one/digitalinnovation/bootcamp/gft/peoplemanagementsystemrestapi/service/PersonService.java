package one.digitalinnovation.bootcamp.gft.peoplemanagementsystemrestapi.service;

import one.digitalinnovation.bootcamp.gft.peoplemanagementsystemrestapi.dto.request.PersonDTO;
import one.digitalinnovation.bootcamp.gft.peoplemanagementsystemrestapi.dto.response.MessageResponseDTO;
import one.digitalinnovation.bootcamp.gft.peoplemanagementsystemrestapi.entity.Person;
import one.digitalinnovation.bootcamp.gft.peoplemanagementsystemrestapi.mapper.PersonMapper;
import one.digitalinnovation.bootcamp.gft.peoplemanagementsystemrestapi.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    private PersonRepository personRepository;

    private final PersonMapper personMapper = PersonMapper.INSTANCE;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }


    public MessageResponseDTO createPerson(PersonDTO personDTO) {
        Person personToSave = personMapper.toModel(personDTO);

        Person savedPerson = personRepository.save(personToSave);

        /* With builder, we can avoid creating in constructor and encapsulate the data */
        return MessageResponseDTO
                .builder()
                .message("Created person with ID " + savedPerson.getId())
                .build();
    }
}
