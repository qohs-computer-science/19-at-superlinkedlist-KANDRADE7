//Katherine Andrade, 12/1/25, period 6 cp3

import java.util.Iterator;
import java.util.LinkedList;

public class SuperTestFile {
  public static void main(String[] args) {
    //create 3 linkedlists
    SuperLinkedList cow = new SuperLinkedList(); 
    cow.add("M");
    cow.add("O");
    cow.add("O");
    cow.add("O");
    cow.add("O");
    System.out.println("This is cow list: " + cow.toString());

    SuperLinkedList sheep = new SuperLinkedList();
    sheep.add("b");
    sheep.add("a");
    sheep.add("a");
    sheep.add("a");
    sheep.add("h");
    System.out.println("This is sheep list: " + sheep.toString());

    SuperLinkedList horse = new SuperLinkedList();
    horse.add("n");
    horse.add("e");
    horse.add("i");
    horse.add("g");
    horse.add("h");
    System.out.println("This is horse list: " + horse.toString());

    System.out.println("\nThis is cow list after calling mix with sheep list: " );
    LinkedList sheepMix = cow.mix(sheep);
    printList(sheepMix);

    //print concatenate
    System.out.println("\nThis is sheep list after calling concatenate function: ");
    printList(sheep.concatenateStrings());
    System.out.println("\nThis is horse list after calling concatenate function: ");
    printList(horse.concatenateStrings()); 

    //print removeVowels
    System.out.println("\nRemoved vowels: " + cow.removeVowels());
    System.out.println("This is cow list after removing vowels: " + cow.toString());

    //print removeConsonants
    System.out.println("\nRemoved consonants: " + horse.removeConsonants());
    System.out.println("This is horse list after removing consonants: " + horse.toString());

    //print removeDuplicates
    System.out.println("These are the values returned after removeDuplicates: ");
    printList(sheep.removeDuplicates());
    System.out.println("\nThis is sheep list after removing duplicates: " + sheep.toString());
  } // end main

  public static void printList(LinkedList <String> data){
      Iterator<String> jumper = data.iterator();
      while(jumper.hasNext()){
        System.out.println(jumper.next());
      }//while loop
  }// end func 
} // end class