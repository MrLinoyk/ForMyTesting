package lesson.services;

import lesson.model.Person;
import lesson.model.dto.PersonDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;



public interface PersonService {
    PersonDto getById (Long id);

    Page<PersonDto> getPersonWithPaginationAndFiltering (Specification <PersonDto> spec, Pageable page);
}
