package D01P02;
//Interface to represent MedicineInfo
interface MedicineInfo {
 void displayLabel();
}

//Concrete class for Tablet
class Tablet implements MedicineInfo {
 @Override
 public void displayLabel() {
     System.out.println("Store Tablets in a cool dry place.");
 }
}

//Concrete class for Syrup
class Syrup implements MedicineInfo {
 @Override
 public void displayLabel() {
     System.out.println("Syrup is consumable only on prescription.");
 }
}

//Concrete class for Ointment
class Ointment implements MedicineInfo {
 @Override
 public void displayLabel() {
     System.out.println("Ointment is for external use only.");
 }
}

//TestClass to test polymorphic behavior
public class D01P02 {
 public static void main(String[] args) {
     // Declare Medicine instances
     MedicineInfo tablet = new Tablet();
     MedicineInfo syrup = new Syrup();
     MedicineInfo ointment = new Ointment();
     
     // Check polymorphic behavior of displayLabel() method
     tablet.displayLabel();
     syrup.displayLabel();
     ointment.displayLabel();
 }
}

