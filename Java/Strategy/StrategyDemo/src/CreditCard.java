public class CreditCard {
    private String number;
    private String date;
    private String cvv;

    private ValidationStratageyI strategy;
    public CreditCard(ValidationStratageyI strategy){
        this.strategy = strategy;
    }

    public boolean isVaid(){
        return strategy.IsValid(this);
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public ValidationStratageyI getStrategy() {
        return strategy;
    }

    public void setStrategy(ValidationStratageyI strategy) {
        this.strategy = strategy;
    }
}
