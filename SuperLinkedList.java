//Katherine Andrade, 12/1/25, period 6 cp3
import java.util.LinkedList;
import java.util.Iterator;

public class SuperLinkedList extends LinkedList<String> {

    public boolean removeVowels() {
        
        Iterator <String> jumper = this.iterator();
        boolean tracker = false; 
        while ("aeiou".indexOf(jumper.next()) != -1){
            jumper.remove();
            tracker=true;
        }//end while
    return tracker;
    }//end func

    public boolean removeConsonants() {
        return false;
    }

    public LinkedList<String> removeDuplicates() {
        return null;
    }

    public LinkedList<String> concatenateStrings() {

        return null;
    }

    public LinkedList<String> mix(LinkedList<String> list2) {

        return null;
    }

    public String toString() {
        String finished = "";
        LinkedList <String> list = new LinkedList<String>();
        Iterator <String> jumper = list.iterator();
        while(jumper.hasNext()){
            String val = jumper.next();
            finished += finished + val + ", ";
        }//end while
        return finished;
    }//end toString
} // end SuperLinkedList