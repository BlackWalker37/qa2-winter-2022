package hw1;

public class CreditCard {
    //------------------------------ATTRIBUTES------------------------------
    private String bankName;
    private boolean isDebitCard;
    private int expirationDate;
    private int securityCode;
    private int cardNumber;

    //------------------------------GETTERS/SETTERS--------------------------

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public boolean isDebitCard() {
        return isDebitCard;
    }

    public void setDebitCard(boolean debitCard) {
        isDebitCard = debitCard;
    }

    public int getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(int expirationDate) {
        this.expirationDate = expirationDate;
    }

    public int getSecurityCode() {
        return securityCode;
    }

    public void setSecurityCode(int securityCode) {
        this.securityCode = securityCode;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }
}
