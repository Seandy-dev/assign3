/*PaymentClass
*Entity of Payment
*Author : Hlombekazi Mbelu 209024666
*Date : 31 May 2021
* */
package za.ac.cput.entity.Payment;
import java.util.*;

public class Payment {

    private String paymentMethod, customer;
    private int paymentId , paymentAmount;
    Date date = new Date();

    private Payment(Builder builder)
    {
       this.paymentMethod =  builder.paymentMethod;
       this.customer = builder.customer;
       this.paymentId = builder.paymentId;
       this.paymentAmount = builder.paymentAmount;
       this.date =  builder.date;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentMethod='" + paymentMethod + '\'' +
                ", customer='" + customer + '\'' +
                ", paymentId=" + paymentId +
                ", paymentAmount=" + paymentAmount +
                ", date=" + date +
                '}';
    }

    public static class Builder{

        private String paymentMethod, customer;
        private int paymentId , paymentAmount;
        Date date = new Date();

        public Builder setPaymentMethod(String paymentMethod)
        {
            this.paymentMethod = paymentMethod;
            return this;
        }

        public Builder setCustomer(String customer)
        {
            this.customer = customer;
            return this;
        }

        public Builder setPaymentId(int paymentId)
        {
            this.paymentId = paymentId;
            return this;
        }

        public Builder setPaymentAmount(int paymentAmount)
        {
            this.paymentAmount = paymentAmount;
            return this;
        }

        public Builder setDate(Date date)
        {
            this.date = date;
            return this;
        }

        public Builder copy(Payment payment)
        {
            this.paymentMethod =  payment.paymentMethod;
            this.customer = payment.customer;
            this.paymentId = payment.paymentId;
            this.paymentAmount = payment.paymentAmount;
            this.date =  payment.date;
            return this;
        }

        public Payment build()
        {
            return new Payment(this);
        }
    }

}
