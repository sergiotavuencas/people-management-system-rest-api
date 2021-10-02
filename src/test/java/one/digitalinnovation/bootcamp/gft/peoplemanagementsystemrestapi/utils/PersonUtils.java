package one.digitalinnovation.bootcamp.gft.peoplemanagementsystemrestapi.utils;

import one.digitalinnovation.bootcamp.gft.peoplemanagementsystemrestapi.dto.request.PersonDTO;
import one.digitalinnovation.bootcamp.gft.peoplemanagementsystemrestapi.entity.Person;

import java.time.LocalDate;
import java.util.Collections;

public class PersonUtils {

    private static final String FIRST_NAME = "John";
    private static final String LAST_NAME = "Doe";
    private static final String CPF_NUMBER = "111.111.111-11";
    private static final Long PERSON_ID = 1L;
    private static final LocalDate BIRTH_DATE = LocalDate.of(1111, 11, 11);

    public static PersonDTO createFakeDTO() {
        return PersonDTO.builder()
                .firstName(FIRST_NAME)
                .lastName(LAST_NAME)
                .cpf(CPF_NUMBER)
                .birthDate("11-11-1111")
                .phones(Collections.singletonList(PhoneUtils.createFakeDTO()))
                .build();
    }

    public static Person createFakeEntity() {
        return Person.builder()
                .id(PERSON_ID)
                .firstName(FIRST_NAME)
                .lastName(LAST_NAME)
                .cpf(CPF_NUMBER)
                .birthDate(BIRTH_DATE)
                .phones(Collections.singletonList(PhoneUtils.createFakeEntity()))
                .build();
    }
}
