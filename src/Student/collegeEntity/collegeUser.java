package Student.collegeEntity;

public class collegeUser {

// composition relation among classes
// HAS-A address
/// which will help to related two class without inheritance
// and most important is to check wheather the class 
// contain the value null in an attributes inside the address class which is a type of 
// address class 
    private Address addresses;

    public Address getAddresses() {
        return addresses;
    }

    public void setAddresses(Address addresses) {
        this.addresses = addresses;
    }
    
}
