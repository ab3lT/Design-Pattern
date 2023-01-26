public class StrategyDemo {
    public static void main(String[] args) {
        CreditCard amexChard = new CreditCard(new AmexStrategy());

        amexChard.setNumber("379185883464283");
        amexChard.setDate("04/2020");
        amexChard.setCvv("123");

        System.out.println("Is Amex Valid: " + amexChard.isVaid());

        amexChard = new CreditCard(new AmexStrategy());

        amexChard.setNumber("37918588346283");
        amexChard.setDate("04/2020");
        amexChard.setCvv("123");

        System.out.println("Is Amex Valid: " + amexChard.isVaid());


        // using visa strategy

        CreditCard visaCard = new CreditCard(new VisaStrategy());
        visaCard.setNumber("479185883464283");
        visaCard.setDate("04/2020");
        visaCard.setCvv("123");

        System.out.println("is Visa Card Is Valid: " + visaCard.isVaid());

    }
}
