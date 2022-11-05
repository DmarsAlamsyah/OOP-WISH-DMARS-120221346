public class User {

    // TODO Create Attribute of User; Name and Phone Number then Create Setter

    // TODO Create Method to Register User and Display User's Name and Phone Number and success message
    String Name;
    int PhoneNumber;

    public void setName(String Name){
        this.Name = Name;
    }
    public void setPhoneNumber(int PhoneNumber){
        this.PhoneNumber = PhoneNumber; 
    }
    public void Register(){
        System.out.print("Name :" + Name);
        System.out.print("Phone Number :" + PhoneNumber);
        System.out.print("You are succesfully registered!");
    }

}
