package za.ac.cput.entity.coffeeshop;
/*
 * Menu.java
 * Entity for Menu.
 * Thina Mbiza - 217217095
 * Date: 01 June 2021
 */

public class Menu {

    private String breakfast, lunch, tea, coffee;

    private Menu(Builder builder){
        this.breakfast = builder.breakfast;
        this.lunch = builder.lunch;
        this.tea = builder.tea;
        this.coffee = builder.coffee;

    }

    @Override
    public String toString() {
        return "Builder{" +
                "breakfast='" + breakfast + '\'' +
                ", lunch='" + lunch + '\'' +
                ", tea='" + tea + '\'' +
                ", coffee='" + coffee + '\'' +
                '}';
    }

    public static class Builder{
        private String breakfast, lunch, tea, coffee;

        public Builder setBreakfast(String breakfast) {
            this.breakfast = breakfast;
            return this;
        }

        public Builder setLunch(String lunch) {
            this.lunch = lunch;
            return this;
        }

        public Builder setTea(String tea) {
            this.tea = tea;
            return this;
        }

        public Builder setCoffee(String coffee) {
            this.coffee = coffee;
            return this;
        }

        public Builder copy(Menu menu){
            this.breakfast = menu.breakfast;
            this.lunch = menu.lunch;
            this.coffee = menu.coffee;
            this.tea = menu.tea;
            return this;
        }
        public Menu build(){
            return new Menu(this);
        }
    }
}
