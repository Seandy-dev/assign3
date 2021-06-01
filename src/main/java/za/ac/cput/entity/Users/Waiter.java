package za.ac.cput.entity.Users;
/*
 * Waiter.java
 * Entity for Waiter.
 * Thina Mbiza - 217217095
 * Date: 01 June 2021
 */
public class Waiter {

    private String name, surname;
    private String employeeNumber;
    private String salary;

    private Waiter(Builder builder) {
        this.name = builder.name;
        this.surname = builder.surname;
        this.employeeNumber = builder.employeeNumber;
        this.salary = builder.salary;

    }

    @Override
    public String toString() {
        return "Waiter{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", employeeNumber=" + employeeNumber +
                ", salary=" + salary +
                '}';
    }

    public static class Builder {
        private String name, surname, employeeNumber, salary;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public Builder setEmployeeNumber(String employeeNumber) {
            this.employeeNumber = employeeNumber;
            return this;
        }

        public Builder setSalary(String salary) {
            this.salary = salary;
            return this;
        }

        public Waiter build() {
            return new Waiter(this);
        }
    }

    public Waiter copy(Waiter waiter) {
        this.name = waiter.name;
        this.surname = waiter.surname;
        this.employeeNumber = waiter.employeeNumber;
        this.salary = waiter.salary;
        return this;
    }
}
