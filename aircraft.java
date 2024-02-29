/*
 * Name: Mustafa nafia
 * Date: 9/11/2019
 * Professor: Dr.Walsh
 */
public class aircraft extends Machine implements TaxInfo{
    
    String name; 
    String fuel; 
    int weight;
    
    
    public aircraft(){ super(); } 
    public aircraft(String name,String fuel, int weight) {
        super();
        this.name = name;
        this.fuel = fuel;
        this.weight = weight;
    }
    public void move() {
        System.out.println("This spacecraft is expensive!!!");
    }
    public String toString() { 
        String ans = super.toString() + "\nThe spacecraft name: " + name + "\nRequired Fuel: " + fuel + "\nWeight: " + weight + " lbs" + "\n" + "value: " + getValue() + "\n" + "Tax: " + calcTax()
        + "\n" + " We have " + things + " things \n\n***************\n";
        return ans;
    }
    public double calcTax() { 
        return getValue()*BASIC_TAX;
    }
}
