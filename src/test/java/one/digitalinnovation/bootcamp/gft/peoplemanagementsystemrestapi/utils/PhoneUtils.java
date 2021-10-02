package one.digitalinnovation.bootcamp.gft.peoplemanagementsystemrestapi.utils;

import one.digitalinnovation.bootcamp.gft.peoplemanagementsystemrestapi.dto.request.PhoneDTO;
import one.digitalinnovation.bootcamp.gft.peoplemanagementsystemrestapi.entity.Phone;
import one.digitalinnovation.bootcamp.gft.peoplemanagementsystemrestapi.enums.PhoneType;

public class PhoneUtils {

    private static final String PHONE_NUMBER = "11 11111-1111";
    private static final PhoneType PHONE_TYPE = PhoneType.MOBILE;
    private static final long PHONE_ID = 1L;

    public static PhoneDTO createFakeDTO() {
        return PhoneDTO.builder()
                .number(PHONE_NUMBER)
                .type(PHONE_TYPE)
                .build();
    }

    public static Phone createFakeEntity() {
        return Phone.builder()
                .id(PHONE_ID)
                .number(PHONE_NUMBER)
                .type(PHONE_TYPE)
                .build();
    }
}
