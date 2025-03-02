package model;

public class User {
    private int id;
    private String name;
    private String drivingLicense;

    public User(int id, String name, String drivingLicense) {
        this.id = id;
        this.name = name;
        this.drivingLicense = drivingLicense;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDrivingLicense() {
        return drivingLicense;
    }
}
