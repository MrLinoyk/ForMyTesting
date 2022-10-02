package lesson.repo;


import lesson.model.dto.PersonDto;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonRepo extends PagingAndSortingRepository<PersonDto, Long>, JpaSpecificationExecutor <PersonDto> {

}
