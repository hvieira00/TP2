public class User {
    private String name;
    private String email;
    private String username;
    private String password;
    private String address;

    public User(String nome, String mail, String username, String password, Adress address1) {

    }

    public String getName()
    {
        return name;
    }
    public String getEmail()
    {
        return email;
    }
    public String getUsername()
    {
        return username;
    }
    public String getPassword()
    {
        return password;
    }
    public String getStreet()
    {
        return address;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public void setPassword (String password)
    {
        this.password = password;
    }
}
