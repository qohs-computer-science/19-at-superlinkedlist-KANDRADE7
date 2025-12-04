//Katherine Andrade, 12/1/25, period 6 cp3
public class SuperTestFile {
  public static void main(String[] args) {

    SuperLinkedList tester = new SuperLinkedList(); 
    tester.add("a");
    System.out.println("\n"+tester.toString()); 
    tester.removeVowels();
    System.out.println("\n"+tester.toString()); 
    tester.add("a");
    tester.addFirst("A");
    tester.add("x");  
    tester.add("e");
    tester.add("e");
    tester.add("a");
    tester.addFirst("E");
    System.out.println("\n"+tester.toString()); 
    System.out.println("n"+tester.removeDuplicates());
    System.out.println("\n"+tester.toString()); 
    tester.removeVowels();
    System.out.println("\n"+tester.toString()); 
   
  } // end main
} // end class