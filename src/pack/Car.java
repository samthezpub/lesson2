package pack;

public class Car {
    private String Name;
    private String CreatorName;
    private int ReleaseYear;
    private double EngineCapacity;

    public Car(String name, String creatorName, int releaseYear, double engineCapacity) {
        Name = name;
        CreatorName = creatorName;
        ReleaseYear = releaseYear;
        EngineCapacity = engineCapacity;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCreatorName() {
        return CreatorName;
    }

    public void setCreatorName(String creatorName) {
        CreatorName = creatorName;
    }

    public int getReleaseYear() {
        return ReleaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        ReleaseYear = releaseYear;
    }

    public double getEngineCapacity() {
        return EngineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        EngineCapacity = engineCapacity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "Name='" + Name + '\'' +
                ", CreatorName='" + CreatorName + '\'' +
                ", ReleaseYear=" + ReleaseYear +
                ", EngineCapacity=" + EngineCapacity +
                '}';
    }

}
