package pack;

public class Decimal {
    private int Numerator;
    private int Denominator;

    public Decimal(int numerator, int denominator)
    {
        this.Numerator=numerator;
        this.Denominator=denominator;
    }

    public static Decimal Sum(Decimal first, Decimal second)
    {
        if (first.getDenominator() == second.getDenominator()){
           int sumDenominator = first.getDenominator() + second.getDenominator();
           int sumNumerator = first.getNumerator() + second.getNumerator();
           return new Decimal(sumNumerator,sumDenominator);
        }
        else{
            int commonDenominator = first.getDenominator() * second.getDenominator();
            first.setNumerator(first.getNumerator() * second.getDenominator());
            second.setNumerator(second.getNumerator() * first.getDenominator());

            int sumNumerator = first.getNumerator() + second.getNumerator();
            return new Decimal(sumNumerator,commonDenominator);
        }

    }

    public static Decimal Minus(Decimal first, Decimal second){
        if (first.getDenominator() == second.getDenominator()){
            int minDenominator = first.getDenominator() - second.getDenominator();
            int minNumerator = first.getNumerator() - second.getNumerator();
            return new Decimal(minNumerator,minDenominator);
        }
        else{
            int commonDenominator = first.getDenominator() * second.getDenominator();
            first.setNumerator(first.getNumerator() * second.getDenominator());
            second.setNumerator(second.getNumerator() * first.getDenominator());

            int minNumerator = first.getNumerator() - second.getNumerator();
            return new Decimal(minNumerator, commonDenominator);
        }
    }

    public static Decimal Multiplication(Decimal first, Decimal second){
        if (first.getDenominator() == second.getDenominator()){
            int multDenominator = first.getDenominator() * second.getDenominator();
            int multNumerator = first.getNumerator() * second.getNumerator();
            return new Decimal(multNumerator,multDenominator);
        }
        return first;
    }

    public static Decimal Division(Decimal first, Decimal second){
        if (first.getDenominator() == second.getDenominator()){
            int divDenominator = first.getDenominator() * second.getNumerator();
            int divNumerator = first.getNumerator() * second.getDenominator();
            return new Decimal(divNumerator,divDenominator);
        }
        return first;
    }

    public int getDenominator() {
        return Denominator;
    }
    public int getNumerator() {
        return Numerator;
    }
    public void setDenominator(int denominator) {
        Denominator = denominator;
    }
    public void setNumerator(int numerator) {
        Numerator = numerator;
    }
}
