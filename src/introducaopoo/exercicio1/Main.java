package introducaopoo.exercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Products products = new Products();
        products.productName = "XUXI";
        products.productQtd = 10;
        products.productPrice = 20.0;

        System.out.println(products.ToString());
        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        products.AddProducts(quantity);
        System.out.println();
        System.out.println("Updated data: " + products.ToString());
        System.out.println();
        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        products.RemoveProducts(quantity);
        System.out.println();
        System.out.println("Updated data: " + products.ToString());
    }
}
