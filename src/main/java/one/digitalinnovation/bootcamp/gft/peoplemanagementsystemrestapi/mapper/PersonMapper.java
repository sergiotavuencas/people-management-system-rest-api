package one.digitalinnovation.bootcamp.gft.peoplemanagementsystemrestapi.mapper;

import one.digitalinnovation.bootcamp.gft.peoplemanagementsystemrestapi.dto.request.PersonDTO;
import one.digitalinnovation.bootcamp.gft.peoplemanagementsystemrestapi.entity.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PersonMapper {

    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    @Mapping(target = "birthDate", source = "birthDate", dateFormat = "dd-MM-yyyy")
    Person toModel(PersonDTO personDTO);

    PersonDTO toDTO(Person person);
}
