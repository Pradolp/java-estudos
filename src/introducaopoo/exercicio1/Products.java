package introducaopoo.exercicio1;

public class Products {
    public String productName;
    public int productQtd;
    public double productPrice;

    public double TotalValueInStock(){
        return productPrice * productQtd;
    }

    public void AddProducts(int quantity){
        productQtd += quantity;
    }

    public void RemoveProducts(int quantity){
        productQtd -= quantity;
    }

    public String ToString(){
        return productName + ", $ " + productPrice + ", " + productQtd + " units, Total: $ " + TotalValueInStock();
    }
}
