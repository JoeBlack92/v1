package demo.model;


import javax.persistence.*;
import java.util.Date;


/**
 * Created by poo2 on 15/06/2015.
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String surname;
    private Double salary;
    @Temporal(TemporalType.DATE)
    private Date dateIncorporation;

    public Employee(){

    }

    public Employee(Long id, Date dateIncorporation, Double salary, String surname, String name) {
        this.id = id;
        this.dateIncorporation = dateIncorporation;
        this.salary = salary;
        this.surname = surname;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Double getSalary() {
        return salary;
    }

    public Date getDateIncorporation() {
        return dateIncorporation;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void setDateIncorporation(Date dateIncorporation) {
        this.dateIncorporation = dateIncorporation;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", dateIncorporation=" + dateIncorporation +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (id != null ? !id.equals(employee.id) : employee.id != null) return false;
        if (name != null ? !name.equals(employee.name) : employee.name != null) return false;
        if (surname != null ? !surname.equals(employee.surname) : employee.surname != null) return false;
        if (salary != null ? !salary.equals(employee.salary) : employee.salary != null) return false;
        return !(dateIncorporation != null ? !dateIncorporation.equals(employee.dateIncorporation) : employee.dateIncorporation != null);

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (salary != null ? salary.hashCode() : 0);
        result = 31 * result + (dateIncorporation != null ? dateIncorporation.hashCode() : 0);
        return result;
    }
}
