package encapsulation;

class AccountDetail{

    // field and data hiding using encapsulatio
    private String PhoneNumber;

    // method for set private data
    public void setData( String PH){
        PhoneNumber = PH;
    }

    // method for return data into private data for string
    public String getData(){
        return PhoneNumber;
    } 

}

public class accountSecurity {
    public static void main(String[] args) {
        AccountDetail p1 = new AccountDetail();
        p1.setData("9811034442");
        System.out.println(p1.getData());
    }
}
