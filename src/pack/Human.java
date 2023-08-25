package pack;

import java.util.Date;

public class Human {
    private String FIO;
    private Date DateOfBirth;

    private String City;
    private String Country;
    private String Adress;


    public Human(String fio, Date dateOfBirth, String city, String country, String adress) {
        FIO = fio;
        DateOfBirth = dateOfBirth;
        City = city;
        Country = country;
        Adress = adress;
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getAdress() {
        return Adress;
    }

    public void setAdress(String adress) {
        Adress = adress;
    }

    public Date getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }
}
