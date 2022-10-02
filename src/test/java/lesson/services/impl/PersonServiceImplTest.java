package lesson.services.impl;

import lesson.model.dto.PersonDto;
import lesson.repo.PersonRepo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@SpringBootTest
public class PersonServiceImplTest {
    private static PersonDto personDto1;
    private static PersonDto personDto2;
    private static List<PersonDto> personDtos;

    @Mock
    private PersonRepo personRepo;

    @InjectMocks
    private PersonServiceImpl personService;

    @BeforeEach
    void initMethod () {
        personDto1 = PersonDto.builder()
                .id(1L)
                .name("Dmitry")
                .build();

        personDto2 = PersonDto.builder()
                .id(2L)
                .name("Pavel")
                .build();

        personDtos = List.of (personDto1, personDto2);
    }

    @DisplayName("test getById Method")
    @Test
    void getById () {
        when(personRepo.findById(1L)).thenReturn(Optional.of(personDto1));

        assertEquals (personService.getById(1L), personDto1);
        Mockito.verify(personRepo, Mockito.times(1)).findById(1L);
    }
}
