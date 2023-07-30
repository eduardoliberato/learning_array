package vetor;

import entities.product;
import java.util.Scanner;
import java.util.Locale;

public class vetor_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("How many products?\n");
        
        int n = sc.nextInt();
        product[] vect = new product[n];

        // .length brings the quantity of elements in the vector  

        for (int i = 0; i < vect.length; i++) {
            sc.nextLine(); // line break
            System.out.println("What is the name of the product? \n");
            String name = sc.nextLine();
            System.out.println("What is the price of the product? \n");
            double price = sc.nextDouble();
            vect[i] = new product(name, price); // receive in the position i each new object

        }

        double sum = 0.0;
        for (int i = 0; i < vect.length; i++) {
            sum = sum + vect[i].getPrice();
        }
        double avg = sum / vect.length;

        System.out.printf("The average price of the products is %.2f\n", avg);

        sc.close();

    }

}
