package entities;

public class CurrencyConverter {

    public double dolarPrice;
    public double dolarBought;

    public double dolarTax(){
        return dolarBought + dolarBought*0.06;
    }
    public double dolarConversion(){
        return dolarPrice * dolarTax();
    }

}
