public abstract class Machine implements TaxInfo {
private String color; 
private String location;
private long value;
private boolean loan;
static int things=0;

public Machine() {
    things++;
    color = "none";
    location = "Not placed yet";
    value = 0;
    loan = false;
}
public Machine (String color, String location, long value){
    things++;
    loan = false;
    this.color = color;
    this.location = location;
    this.value = value;
}
public String getColor() {
    return color;
}
public void setColor(String color) {
    this.color = color;
}
public String getLocation() {
    return location;
}
public void setLocation(String location){
    this.location = location;
}
public long getValue() {
  return value;
}

public void setValue(long value) {
    this.value = value;
    
}
public boolean isLoan() {
    return loan;
}
public void setLoan(boolean loan) { 
    this.loan = loan;
}


public static int getThings() {
    return things;
}
public void setThings(int things) {
    this.things = things;
}


public abstract void move();
public String toString() {
    return "Machine\nColor: " + color + "\nLocation: " + location + "\nValue: " + value + "\n";
}
}


    