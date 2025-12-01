//Katherine Andrade, 12/1/25, period 6 cp3
public class SuperTestFile {
  public static void main(String[] args) {

    SuperLinkedList tester = new SuperLinkedList(); 
    tester.add("a");
    tester.addFirst("A");
    tester.add("x");  
    tester.add("e");
    System.out.println("\n"+tester.toString()); 
    tester.removeVowels();
    System.out.println(tester.toString()); 
    tester.removeConsonants();
    System.out.println(tester.toString()); 


  } // end main
} // end class