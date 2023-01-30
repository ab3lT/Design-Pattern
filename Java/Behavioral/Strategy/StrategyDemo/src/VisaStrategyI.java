public class VisaStrategyI implements ValidationStratageyI{

    @Override
    public boolean IsValid(CreditCard creditCard) {
        boolean isValid = true;

        isValid = creditCard.getNumber().startsWith("4") || creditCard.getNumber().startsWith("34");

        if(isValid){
            isValid = creditCard.getNumber().length() == 16;

        }
        if(isValid) {
            isValid = passLoon(creditCard.getNumber());
        }
        return isValid;
    }

    @Override
    public boolean passLoon(String ccNumber) {
        int sum = 0;
        boolean alternate = false;
        for (int i = ccNumber.length() - 1; i >= 0; i--) {
            int n = Integer.parseInt(ccNumber.substring(i, i + 1));
            if (alternate) {
                n *= 2;
                if (n > 9) {
                    n = (n % 10) + 1;
                }
            }
            sum += n;
            alternate = !alternate;
        }
        return (sum % 10 == 0);
    }
}
