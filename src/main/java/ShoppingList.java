import java.util.List;

public class ShoppingList {

    public ShoppingList(String s, User user1, User user2) {

    }

    public void setProductlist1(List<Product> Productlist1) {
        Productlist1 = Productlist1;
    }

    public void setProductlist2(List<Product> Productlist2) {
        Productlist2 = Productlist2;
    }
    private String name;
    private User user;
    private List<User>userlist;
    private List<Product>productlist1;
    private List<Product>productlist2;
    private Product p;
    int i;
    int total;


    public String getListName(){
        return name;
    }
    public  String getUserName(){
        return user.getName();
    }
    public double getPercentageCompleted(){
        return (productlist2.size() / (productlist2.size()+ productlist1.size())) *100;
    }
    public int getTotalOfProducts(){
        return productlist1.size();
    }
    public int getTotalOfProductsOnShoppingCart(){
        return productlist2.size();
    }
    public double getTotalPrice() {
        for (i = 0; i <= productlist2.size() + productlist1.size(); i++) {
            total += p.getPrice();
        }
        return total;
    }
    public double getTotalPriceOnCart(){
        for (i= 0 ; i<= productlist2.size() ; i++){
            total += p.getPrice();
        }
        return total;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setUser(User user){
        this.user = user;
    }
    public boolean AddProduct(Product p ){
        return this.productlist1.add(p);

    }
    public boolean removeProduct(Product p){
        if(this.productlist1.contains(p)){
            return this.productlist1.remove(p);
        }
        return false;
    }
    public boolean addProductShoppingCart(Product p){
        if(this.productlist1.contains(p)){
            this.removeProduct(p);
            this.productlist2.add(p);
            return true;
        }
        return false;
    }
    public boolean removeProductShoopingCart(Product p){
        if(this.productlist2.contains(p)){
            this.productlist2.remove(p);
            this.AddProduct(p);
            return true;
        }
        return false;
    }
}