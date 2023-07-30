package entities;

public class product {
    
    private String name;
    private double price;

    public product(String name, double price){

        this.name = name;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public String setName(String name){
        return this.name = name;
    }

    public double getPrice(){
        return price;
    }

    public double setPrice(double price){
        return this.price = price;
    }

}
