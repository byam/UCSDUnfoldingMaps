package practicing;


public class Airport {

    private int airportID;
    private String name;
    private String city;
    private String country;
    private String code3;

    public Airport(int airportID, String name, String city, String country, String code3) {
        this.airportID = airportID;
        this.name = name;
        this.city = city;
        this.country = country;
        this.code3 = code3;
    }

    public String getCity() {
        return this.city;
    }

    public String getCountry() {
        return this.country;
    }

    public String getCode() {
        return this.code3;
    }

    public int getAirportID() {
        return airportID;
    }

    public String getName() {
        return name;
    }
}
