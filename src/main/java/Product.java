public class Product {
    private String name;
    private String description;
    private String picture;
    private Category category;
    private double price;
    private char unytytype;

    public String getName()
    {
        return name;
    }
    public String getDescription(){
        return description;

    }
    public String getPicture()
    {
        return picture;
    }
    public Category getCategory()
    {
        return category;
    }
    public String getCategoryName()
    {
        return category.getName();
    }
    public String getCategoryColor()
    {
        return category.getColor();
    }
    public double getPrice()
    {
        return price;
    }
    public char getUnytytype()
    {
        return unytytype;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setDescription(String description)
    {
        this.description = description;
    }
    public void setPicture(String picture)
    {
        this.picture = picture;
    }
    public void setCategory(Category category)
    {
        this.category = category;
    }
    public void setPrice (double price)
    {
        this.price = price;
    }
    public void setUnytytype (char unytytype)
    {
        this.unytytype = unytytype;
    }
}
