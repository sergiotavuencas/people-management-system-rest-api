package one.digitalinnovation.bootcamp.gft.peoplemanagementsystemrestapi.service;

import one.digitalinnovation.bootcamp.gft.peoplemanagementsystemrestapi.dto.request.PersonDTO;
import one.digitalinnovation.bootcamp.gft.peoplemanagementsystemrestapi.dto.response.MessageResponseDTO;
import one.digitalinnovation.bootcamp.gft.peoplemanagementsystemrestapi.entity.Person;
import one.digitalinnovation.bootcamp.gft.peoplemanagementsystemrestapi.repository.PersonRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static one.digitalinnovation.bootcamp.gft.peoplemanagementsystemrestapi.utils.PersonUtils.createFakeDTO;
import static one.digitalinnovation.bootcamp.gft.peoplemanagementsystemrestapi.utils.PersonUtils.createFakeEntity;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class PersonServiceTest {

    @Mock
    private PersonRepository personRepository;

    @InjectMocks
    private PersonService personService;

    @Test
    void testGivenPersonDTOThenReturnSavedMessage() {
        PersonDTO personDTO = createFakeDTO();
        Person expectedSavedPerson = createFakeEntity();

        when(personRepository.save(any(Person.class))).thenReturn(expectedSavedPerson);

        MessageResponseDTO expectedSuccessMessage = createExpectedSuccessMessage(expectedSavedPerson.getId());
        MessageResponseDTO successMessage = personService.createPerson(personDTO);

        assertEquals(expectedSuccessMessage, successMessage);
    }

    private MessageResponseDTO createExpectedSuccessMessage(Long savedPersonId) {
        return MessageResponseDTO.builder()
                .message("Created person with ID, " + savedPersonId)
                .build();
    }
}
