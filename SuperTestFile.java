//Katherine Andrade, 12/1/25, period 6 cp3
import java.util.LinkedList;
import java.util.Iterator;
public class SuperTestFile {
  public static void main(String[] args) {

    SuperLinkedList <String> tester = new SuperLinkedList(); 
    tester.add("a");
    tester.add("x");  
    tester.add("e");
    System.out.println(tester.toString()); 
    tester.removeVowels();
    System.out.println(tester.toString()); 

  } // end main
} // end class