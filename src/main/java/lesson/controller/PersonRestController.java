package lesson.controller;

import lesson.model.Person;
import lesson.model.dto.PersonDto;
import lesson.services.PersonService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("api/v1/person")
public class PersonRestController {

    private PersonService personService;

    public PersonRestController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping ("/{department_name}")
    public ResponseEntity <PersonDto> getByDepartment (@PathVariable("department_name") long id) {
        return ResponseEntity.ok(personService.getById(id));
    }
}
