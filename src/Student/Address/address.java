package Student.Address;

public class address {
    private String address;
    private int pincode;
    private String state;
    private String district;

    public address(String address, int pincode, String state, String district) {
        this.address = address;
        this.pincode = pincode;
        this.state = state;
        this.district = district;
    }

    public String getdetails(){
        return String.format("%s",this.address!=null?this.getdetails():"na");
    }

    public String getAddress() {
        return address;
    }

    public int getPincode() {
        return pincode;
    }

    public String getState() {
        return state;
    }

    public String getDistrict() {
        return district;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    
}
