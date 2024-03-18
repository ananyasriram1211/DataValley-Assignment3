class Organization implements Cloneable {
    private int organizationCode;
    private String organizationName;
    private String organizationAddress;

    
    public Organization(int code, String name, String address) {
        this.organizationCode = code;
        this.organizationName = name;
        this.organizationAddress = address;
    }

    
    public void printDetails() {
        System.out.println("Organization Code: " + organizationCode);
        System.out.println("Organization Name: " + organizationName);
        System.out.println("Organization Address: " + organizationAddress);
    }

   
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // Clones the object using the default clone method
    }
}

public class Main {
    public static void main(String[] args) {
        
        Organization org1 = new Organization(1, "ABC Corp", "123 Main St");
        Organization org2 = null;
        try {
            org2 = (Organization) org1.clone(); // Perform the cloning
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println("Original Organization:");
        org1.printDetails(); // Display details of the original object
        System.out.println("\nCloned Organization:");
        org2.printDetails(); // Display details of the cloned object
    }
}
