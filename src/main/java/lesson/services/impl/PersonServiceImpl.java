package lesson.services.impl;

import lesson.model.Person;
import lesson.model.dto.PersonDto;
import lesson.repo.PersonRepo;
import lesson.services.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService {

    private final PersonRepo personRepo;


    @Override
    public PersonDto getById(Long id) {
        return personRepo.findById(id).get();
    }

    @Override
    @Transactional(readOnly = true)
    public Page<PersonDto> getPersonWithPaginationAndFiltering(Specification <PersonDto> spec, Pageable page) {
        return personRepo.findAll(spec, page);
    }

}
