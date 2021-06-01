package za.ac.cput.entity.Users;

/* BusBoy.java
   Entity for BusBoy
   Author : Devon Sherwyn May (219168296)
   Date : 07 June
 */

public class BusBoy
{

    private int Salary, employee_number;
    private String name, surname;

    private BusBoy(Builder builder)
    {
        this.Salary= builder.Salary;
        this.employee_number= builder.employee_number;
        this.name= builder.name;
        this.surname= builder.surname;
    }
    @Override
    public String toString()
    {
        return "Builder{" +
                "Salary=" + Salary +
                ", Employee_Number=" + employee_number +
                ", name=" +name+
                ", surname=" +surname+
                '}';
    }

    public static class  Builder
    {
        private int Salary, employee_number;
        private String name, surname;

        public Builder setSalary(int Salary)
        {
            this.Salary = Salary;
            return this;
        }

        public Builder setEmployee_number(int employee_number)
        {
            this.employee_number = employee_number;
            return this;
        }

        public Builder setName(String name)
        {
            this.name = name;
            return this;
        }

        public Builder setSurname(String surname)
        {
            this.surname = surname;
            return this;
        }

        public BusBoy build()
        {
            return new BusBoy(this);
        }

        private Builder copy(BusBoy busboy)
        {
            this.Salary= busboy.Salary;
            this.employee_number= busboy.employee_number;
            this.name= busboy.name;
            this.surname= busboy.surname;
            return this;
        }
    }
}
