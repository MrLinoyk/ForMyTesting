package lesson.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@FieldDefaults (level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
@Table (name = "department")
public class Department {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    long id;

    String name;

}
