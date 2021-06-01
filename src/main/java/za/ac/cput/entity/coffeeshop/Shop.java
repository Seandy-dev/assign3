package za.ac.cput.entity.coffeeshop;
/* Shop.java
   Entity for Shop
   Author : Nikitha Mbokotwana (218337906)
   Date : 01 June
 */

public class Shop {
    private String name;

    private Shop(Builder builder) {
        this.name = builder.name;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                '}';
    }

    public static class Builder {
        private String name;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder copy(Shop shop) {
            this.name = shop.name;


            return this;
        }

        public Shop build() {
            return new Shop(this);

        }

    }
}
