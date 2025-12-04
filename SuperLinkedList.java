//Katherine Andrade, 12/1/25, period 6 cp3
import java.util.LinkedList;
import java.util.Iterator;

public class SuperLinkedList extends LinkedList<String> {

    public boolean removeVowels() {
        Iterator <String> jumper = this.iterator();
        boolean tracker = false; 
        while (jumper.hasNext()){
            String val = jumper.next().toLowerCase();
            if("aeiou".indexOf(val) != -1){
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
            String easterEgg = bunny.next().toLowerCase();
            if(consonants.indexOf(easterEgg) != -1){
                bunny.remove();
                carrot=true;
            }//end if
        }//end while loop
        return carrot;
    }//end func

    public LinkedList<String> removeDuplicates() {
        LinkedList <String> removeVals = new LinkedList<String>();
        Iterator <String> cookie = this.iterator();
        int index=0;

        while(cookie.hasNext()){
            String sugar = cookie.next();
            boolean removed =false;
            for(int x=0; x< index; x++){
                if(this.get(x).equals(sugar)){
                removeVals.add(sugar);
                cookie.remove();
                removed = true;
                }//end if
            }//end for loop
            if(!removed)
                index++;
        }//end while loop

        return removeVals;
    } //end func

    public LinkedList<String> concatenateStrings() {
        LinkedList<String> snowballList = new LinkedList<String>();
        Iterator <String> hopper = this.iterator();
        String snowBall = "";
        while(hopper.hasNext()){
            snowBall = snowBall + hopper.next();
            snowballList.add(snowBall);
        }//end while loop
        return snowballList;
    }//end func

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