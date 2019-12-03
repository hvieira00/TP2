public class Adress {
    private String StreetName;
    private String DoorNo;
    private String PostalCode;

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

