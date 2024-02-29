/*
 * Name: Mustafa nafia
 * Date: 9/11/2019
 * Professor: Dr.Walsh
 */
public class Car extends Machine implements TaxInfo{
    
    String make; 
    String model; 
    int miles;
    
    
    public Car(){ super(); } 
    public Car(String make,String model, int miles) {
        super();
        this.make = make;
        this.model = model;
        this.miles = miles;
    }
    public void move() {
        System.out.println("This is a car....");
    }
    public String toString() { 
        String ans = super.toString() + "\nmake: " + make + "\nmodel: " + model + "\nmiles: " + miles + "\n" + "value: " + getValue() + "\n" + "Tax: " + calcTax()
        + "\n" + " We have " + things + " things \n\n***************\n";
        return ans;
    }
    public double calcTax() { 
        return getValue()*BASIC_TAX;
    }
}
