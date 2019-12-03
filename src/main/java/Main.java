import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String args[]) {
        Category category1 = new Category("Vegetais", "Verdes", "Verde");
        Category category2 = new Category("Frutas", "Maduras", "Vermelho");
        Category category3 = new Category("Cereais","Doces","Amarelos");

        Product product1 = new Product("Maçã", "Verdes", "Imagem", category2, 10, "kg");
        Product product2 = new Product("Tomates","Maduros","Imagem",category1,14,"kg");
        Product product3 = new Product("Dióspiro","maduros","Imagem",category2,22,"kg");
        Product product4 = new Product("Crunch","Sabor a chocolate","imagem",category3,36,"un");
        Product product5 = new Product("Chocapic","Sabor a Chocolate","Imagem",category3,47,"un");
        Product product6 = new Product("alface","Fresca","Imagem",category1,7,"kg");
        Product product7 = new Product("Melancia","Tropical","Imagem",category2,15,"kg");

        Adress address1 = new Adress("Avenida Robert Smith","68","4715-340");
        Adress address2 = new Adress("Rua das Irmãs Missionárias","5E","4576-863");

        User user1 = new User("Hugo Vieira","hugovieira2000@gmail.com","hugo00","hg2000",address1);
        User user2 = new User("Zé Camarinha","zezecamarinha@gmail.com","zeze1998","marta543",address2);

        ShoppingList lista1= new ShoppingList("Lista 1",user1,user2);
        ShoppingList lista2= new ShoppingList("Lista 2",user1,user2);

        List<Product> newProductList = new ArrayList<>();
        newProductList.add(product1);
        newProductList.add(product2);
        newProductList.add(product3);
        newProductList.add(product4);
        newProductList.add(product5);
        newProductList.add(product6);
        newProductList.add(product7);
        lista1.setProductlist1(newProductList);

        List<Product> newProductList2 = new ArrayList<>();
        newProductList.add(product1);
        newProductList.add(product2);
        lista1.setProductlist2(newProductList2);

        System.out.println(lista1.getUserName()+"\n"+ lista2.getTotalOfProductsOnShoppingCart()+"\n"+ lista1.getTotalOfProducts());
    }
}