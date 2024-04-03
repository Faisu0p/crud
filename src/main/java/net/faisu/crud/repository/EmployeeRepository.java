package net.faisu.crud.repository;

import net.faisu.crud.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // all crud database methods
}
