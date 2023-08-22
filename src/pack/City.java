package pack;

public class City {
    private String Name;
    private String Country;
    private String Phone;
    private long NumberOfInhabitants;
    private int PostIndex;
    private int PhoneCode;


    public City(String name, String country, String phone, long numberOfInhabitants, int postIndex, int phoneCode){
        this.Name=name;
        this.Country=country;
        this.Phone=phone;
        this.NumberOfInhabitants=numberOfInhabitants;
        this.PostIndex=postIndex;
        this.PhoneCode=phoneCode;
    }

    public String getCountry() {
        return Country;
    }

    public int getPhoneCode() {
        return PhoneCode;
    }

    public int getPostIndex() {
        return PostIndex;
    }

    public long getNumberOfInhabitants() {
        return NumberOfInhabitants;
    }

    public String getName() {
        return Name;
    }

    public String getPhone() {
        return Phone;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setNumberOfInhabitants(long numberOfInhabitants) {
        NumberOfInhabitants = numberOfInhabitants;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public void setPhoneCode(int phoneCode) {
        PhoneCode = phoneCode;
    }

    public void setPostIndex(int postIndex) {
        PostIndex = postIndex;
    }
}
