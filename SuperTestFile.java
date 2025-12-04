//Katherine Andrade, 12/1/25, period 6 cp3
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

    System.out.println("\nThis is cow list after calling mix with sheep list: " + cow.mix(sheep));
    System.out.println("\nThis is sheep list after calling concatenate function: " + sheep.concatenateStrings());
    System.out.println("This is horse list after calling concatenate function: " + horse.concatenateStrings());

  } // end main
} // end class