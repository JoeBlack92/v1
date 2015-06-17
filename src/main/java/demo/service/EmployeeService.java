package demo.service;

import demo.model.Category;
import demo.model.Developer;
import demo.model.Employee;
import demo.repositories.DeveloperRepository;
import demo.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by poo2 on 17/06/2015.
 */
@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private DeveloperRepository developerRepository;

    public void testEmployees(){

        Calendar calendar = Calendar.getInstance();
        calendar.set(2015,Calendar.JANUARY,1);
        Date startDate = calendar.getTime();
        calendar.set(2015, Calendar.MARCH, 1);
        Date endDate = calendar.getTime();
        calendar.set(2015, Calendar.FEBRUARY, 1);
        Date dateIncorporation = calendar.getTime();


        Employee employee = new Employee();
        employee.setName("Carlos");
        employee.setSurname("Mendez");
        employee.setSalary(1000.0);
        employee.setDateIncorporation(dateIncorporation);

        employeeRepository.save(employee);

        Employee employee2 = new Employee();
        employee2.setName("Roy");
        employee2.setSurname("Fich");
        employee2.setSalary(1100.0);
        employee2.setDateIncorporation(dateIncorporation);

        employeeRepository.save(employee2);

        Employee employee3 = new Employee();
        employee3.setName("Paula");
        employee3.setSurname("Marz");
        employee3.setSalary(1000.0);
        employee3.setDateIncorporation(new Date());

        employeeRepository.save(employee3);

        Employee employee4 = new Employee();
        employee4.setName("Vanesa");
        employee4.setSurname("villa");
        employee4.setSalary(1300.0);
        employee4.setDateIncorporation(new Date());

        employeeRepository.save(employee4);

        Employee mendez= employeeRepository.findBySurname("Mendez").get(0);
        System.out.println(mendez);

        Employee fich= employeeRepository.findBySurname("Fich").get(0);
        System.out.println(fich);

        Employee roy = employeeRepository.findByDateIncorporationBetween(startDate, endDate).get(0);
        System.out.println(roy );
    }

    public void testDeveloper(){

        Calendar calendar = Calendar.getInstance();
        calendar.set(2015,Calendar.JANUARY,1);
        Date startDate = calendar.getTime();
        calendar.set(2015, Calendar.MARCH, 1);
        Date endDate = calendar.getTime();
        calendar.set(2015, Calendar.FEBRUARY, 1);
        Date dateIncorporation = calendar.getTime();

        Developer developer = new Developer();
        developer.setName("Joel");
        developer.setSurname("Martinez");
        developer.setSalary(5000.0);
        developer.setDateIncorporation(dateIncorporation);
        developer.setCategory(Category.JUNIOR);

        Developer developer2 = new Developer();
        developer2.setName("Julian");
        developer2.setSurname("Lopez");
        developer2.setSalary(2000.0);
        developer2.setDateIncorporation(new Date());
        developer2.setCategory(Category.ARCHITECT);

        Developer developer3 = new Developer();
        developer3.setName("Roger");
        developer3.setSurname("Rabbit");
        developer3.setSalary(6000.0);
        developer3.setDateIncorporation(new Date());
        developer3.setCategory(Category.SENIOR);


        Employee lopez = developerRepository.findBySurname("Lopez").get(0);
        System.out.println(lopez);

        Employee  rabbit = developerRepository.findBySurname("Rabit").get(0);
        System.out.println(rabbit);

        Employee fecha = developerRepository.findByDateIncorporationBetween(startDate, endDate).get(0);
        System.out.println(fecha);

    }
}
