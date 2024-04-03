package net.faisu.crud;

import net.faisu.crud.model.Employee;
import net.faisu.crud.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;
	@Override
	public void run(String... args) throws Exception {

		Employee employee = new Employee();
		employee.setFirstName("Faisal");
		employee.setLastName("Khan");
		employee.setEmailId("faisal.khan786hi@gmail.com");
		employeeRepository.save(employee);

		Employee employee1 = new Employee();
		employee1.setFirstName("Shreya");
		employee1.setLastName("Singh");
		employee1.setEmailId("shreya@gmail.com");
		employeeRepository.save(employee1);

	}
}