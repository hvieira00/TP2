public class Adress {
    private String StreetName;
    private String DoorNo;
    private String PostalCode;

    public Adress(String Rua, String s, String s1) {

    }

    public String GetStreetName()
    {
        return StreetName;
    }
    public String DoorNo (){
        return DoorNo;
    }

    public String PostalCode()
    {
        return PostalCode;
    }

    public void setStreetName(String StreetName)
    {
        this.StreetName = StreetName;
    }

    public  void setDoorNo (String DoorNo)
    {
        this.DoorNo = DoorNo;
    }

    public void setPostalCode (String PostalCode)
    {
        this.PostalCode = PostalCode;
    }
}

