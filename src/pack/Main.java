package pack;

import java.util.Date;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        // Task 1
        Date dateOfBirth = new Date(2001, 10, 5);

        Human human = new Human(
                "Алегров Артём Олегович",
                dateOfBirth,
                "Мелитополь",
                "Океания",
                "10 Мая, 11, 31"
        );
        human.setAdress("123");

        System.out.println(human.getAdress());

        Decimal firstDecimal = new Decimal(10, 3);
        Decimal secondDecimal = new Decimal(12, 2);
        Decimal sum = Decimal.Sum(firstDecimal, secondDecimal);
        System.out.println(sum.getNumerator());
        System.out.println('-');
        System.out.println(sum.getDenominator());


    }

}