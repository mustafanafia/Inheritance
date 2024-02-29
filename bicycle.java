public class bicycle extends Machine implements TaxInfo{    
    String type; 
    String size; 
    String status;
    
    
    public bicycle(){ super(); } 
    public bicycle(String type,String size, String status) {
        super();
        this.type = type;
        this.size = size;
        this.status = status;
    }
    public void move() {
        System.out.println("This is a bicycle....");
    }
    public String toString() { 
        String ans = super.toString() + "\ntype: " + type + "\nsize: " + size + "\nstatus: " + status + "\n" + "value: " + getValue() + "\n" + "Tax: " + calcTax()
        + "\n" + " We have " + things + " things \n\n***************\n";
        return ans;
    }
    public double calcTax() { 
        return getValue()*BASIC_TAX;
    }
}
