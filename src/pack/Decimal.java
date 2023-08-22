package pack;

public class Decimal {
    private int Numerator;
    private int Denominator;

    public Decimal(int numerator, int denominator)
    {
        this.Numerator=numerator;
        this.Denominator=denominator;
    }

    public double Dash()
    {
        return (double) Numerator /Denominator;
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
