//Katherine Andrade, 12/1/25, period 6 cp3
import java.util.LinkedList;
import java.util.Iterator;

public class SuperLinkedList extends LinkedList<String> {

    public boolean removeVowels() {
        Iterator <String> jumper = this.iterator();
        boolean tracker = false; 
        while (jumper.hasNext()){
            if("aeiou".indexOf(jumper.next()) != -1){
                jumper.remove();
                tracker=true;
            }//end if
        }//end while
    return tracker;
    }//end func

    public boolean removeConsonants() {
        Iterator <String> bunny = this.iterator();
        boolean carrot = false;
        String consonants = "bcdfghjklmnpqrstvwxyz";
        while(bunny.hasNext()){
            if(consonants.indexOf(bunny.next()) != -1)
                bunny.remove();
                carrot=true;
        }//end while loop
        return carrot;
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
        Iterator <String> jumper = this.iterator();
        while(jumper.hasNext()){
            String val = jumper.next();
            finished += val; 
            if(jumper.hasNext())
                finished+=", ";
        }//end while
        return finished;
    }//end toString
} // end SuperLinkedList