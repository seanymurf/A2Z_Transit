
import java.io.Serializable;


/**
 *
 * @author Sean
 */
public class Package implements java.io.Serializable {

    // member data
    private int packageID;
    private String arrivalTime;
    private String name;
    private String address;
    private String city;
    private String county;
    private String contactNumber;
    private String description;
    private double price;
    private boolean prePaid;

    // constructor
    public Package(int packageID, String arrivalTime) {
        setPackage("", "", "", "", "", "", "", 0.0, false);
        this.packageID = packageID;
        this.arrivalTime = arrivalTime;
    }

    // set the package properties
    public void setPackage(String name, String address,
            String city, String county, String contactNumber,
            String arrivalTime, String description, double price, boolean prePaid) {
        this.setName(name);
        this.setAddress(address);
        this.setCity(city);
        this.setCounty(county);
        this.setContactNumber(contactNumber);
        this.setArrivalTime(arrivalTime);
        this.setPrice(price);
        this.setDescription(description);
        this.setPrePaid(prePaid);

    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the county
     */
    public String getCounty() {
        return county;
    }

    /**
     * @param county the county to set
     */
    public void setCounty(String county) {
        this.county = county;
    }

    /**
     * @return the arrivalTime
     */
    public String getArrivalTime() {
        return arrivalTime;
    }

    /**
     * @param arrivalTime the arrivalTime to set
     */
    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    /**
     * @return the contactNumber
     */
    public String getContactNumber() {
        return contactNumber;
    }

    /**
     * @param contactNumber the contactNumber to set
     */
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the prePaid
     */
    public boolean isPrePaid() {
        return prePaid;
    }

    /**
     * @param prePaid the prePaid to set
     */
    public void setPrePaid(boolean prePaid) {
        this.prePaid = prePaid;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the packageID
     */
    public int getPackageID() {
        return packageID;
    }

    /**
     * @param packageID the packageID to set
     */
    public void setPackageID(int packageID) {
        this.packageID = packageID;
    }

    @Override
    public String toString() {

        return "Package ID " + this.getPackageID()
                + "\nPackage Arrived at " + this.getArrivalTime()
                + "\nCustomer Name " + this.getName()
                + "\nAddress " + this.getAddress()
                + "\nCity " + this.getCity()
                + "\nCounty " + this.getCounty()
                + "\nContact Number " + this.getContactNumber()
                + "\nProduct Description " + this.getDescription()
                + "\nPrice €" + this.getPrice()
                + "\nPrepaid " + this.isPrePaid() + "\n\n";
            
    }
   
}
