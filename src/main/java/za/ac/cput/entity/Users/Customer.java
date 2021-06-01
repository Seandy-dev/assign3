package za.ac.cput.entity.Users;

/* Customer.java
 Entity for the Customer
 Author: Sindiswa Nomusa Mbhele (219279616)
 Date: 01 June 2021
*/
public class Customer {


    private String name, surname, address;
    private int bank_details, phone_number;

    private Customer(Builder builder) {
        this.name = builder.name;
        this.surname = builder.surname;;
        this.address = builder.address;
        this.bank_details = builder.bank_details;
        this.phone_number = builder.phone_number;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", address='" + address + '\'' +
                ", bank_details=" + bank_details +
                ", phone_number=" + phone_number +
                '}';
    }

    public static class Builder {
        public String name, surname, address;
        private int bank_details, phone_number;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder surname(String surname) {
            this.surname = surname;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder bank_details(int bank_details){
            this.bank_details = bank_details;
            return this;
        }

        public Builder phone_number(int phone_number){
            this.phone_number = phone_number;
            return this;
        }

        public Builder copy(Customer customer) {
            this.name= customer.name;
            this.surname = customer.surname;
            this.address = customer.address;
            this.bank_details = customer.bank_details;
            this.phone_number = customer.phone_number;
            return this;
        }

        public Customer build() {

            return new Customer(this);
        }
    }
}
