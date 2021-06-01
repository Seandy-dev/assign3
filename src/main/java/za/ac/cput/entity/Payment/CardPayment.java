/*CardPayment.java
Entity for the CardPayment
Author: Emihle Menzo 218337035
Date: 31 May 2021
 */
package za.ac.cput.entity.Payment;

public class CardPayment {

    private int cardNumber, cvvNumber;

    private CardPayment(Builder builder) {
        this.cardNumber = builder.cardNumber;
        this.cvvNumber = builder.cvvNumber;;

}

    @Override
    public String toString() {
        return "CardPayment{" +
                "cardNumber='" + cardNumber + '\'' +
                ", cvvNumber='" + cvvNumber + '\'' +
                '}';
    }

    public static class Builder {
        private int cardNumber, cvvNumber;

        public Builder setCardNumber(int cardNumber) {
            this.cardNumber = cardNumber;
            return this;
        }

        public Builder setCvvNumber(int cvvNumber) {
            this.cvvNumber = cvvNumber;
            return this;
        }


        public Builder copy(CardPayment CardPayment) {
            this.cardNumber = CardPayment.cardNumber;
            this.cvvNumber = CardPayment.cvvNumber;
            return this;
        }

        public CardPayment build() {

            return new CardPayment(this);
        }
    }
}