package za.ac.cput.entity.Payment;
/* CashPayment.java
   Entity for CashPayment
   Author : Devon Sherwyn May (219168296)
   Date : 07 June
 */
public class CashPayment
{
    private int coins, notes;

    private CashPayment(Builder builder)
    {
     this.coins= builder.coins;
     this.notes= builder.notes;
    }
    @Override
    public String toString()
    {
        return "Builder{" +
                "coins=" + coins +
                ", notes=" + notes +
                '}';
    }

    public static class  Builder
    {
        private int coins, notes;

        public Builder setCoins(int coins)
        {
            this.coins = coins;
            return this;
        }

        public Builder setNotes(int notes)
        {
            this.notes = notes;
            return this;
        }
        public CashPayment build()
        {
            return new CashPayment(this);
        }

      private Builder copy(CashPayment cashpayment)
      {
          this.coins= cashpayment.coins;
          this.notes= cashpayment.notes;
          return this;
      }
    }
}
