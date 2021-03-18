import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class weightList {
	weightList(){
		weightcal wt1 = new weightcal(60);
		weightcal wt2 = new weightcal(70);
		weightcal wt3 = new weightcal(100);
		
		ArrayList<weightcal> weightlist = new ArrayList<weightcal>();
		
		weightlist.add(wt1);
		weightlist.add(wt2);
		weightlist.add(wt3);
		
		Iterator<weightcal> weightIt = weightlist.iterator();
		while (weightIt.hasNext()) {
			weightIt.next().weight();
		}
	}
}
