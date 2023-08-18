package github.com.Tito74.Person.repo;

import github.com.Tito74.Person.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PersonRepo extends JpaRepository <Person, Long> {
}
