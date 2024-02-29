/*
 * Mustafa Nafia
 * Course: C202 - Dr.Walsh
 */

public class C202MachineAbstract { 
    public static void main(String[] args) {
        
        Machine c1 = new Car("Ford","Windstar", 100000);
        c1.setValue(500);
        c1.setColor("Red");
        c1.setLoan(true);        
        c1.move();        
        System.out.println(c1);        
        System.out.println("\n");
        
        
        Machine c2 = new bus("ford", "Model T", 125000);
        c2.setValue(1000);
        c2.setColor("Yellow");
        c2.setLoan(true);                
        c2.move();
        System.out.println(c2);
        System.out.println("\n");
        
        
        Machine c3 = new bicycle("BMX", "110-120CM", "Brand new");
        c3.setValue(50);
        c3.setColor("Blue");
        c3.setLoan(true);                
        c3.move();
        System.out.println(c3);
        System.out.println("\n");
        
        
        Machine c4 = new aircraft("Shenzhou", "11,000 pounds per second",17280);
        c4.setValue(110000000);
        c4.setLocation("ON THE MOON");
        c4.setColor("White");
        c4.setLoan(true);                
        c4.move();
        System.out.println(c4);
        System.out.println("\n");
        
        
        Machine b1 = new Boat(350,2000);
        b1.setValue(20000);
        b1.setLocation("Lake");
        b1.setColor("White");                    
        b1.move();
        System.out.println(b1);
        System.out.println("\n");
        
        
        
        
        
        
        
    }
}

        
        