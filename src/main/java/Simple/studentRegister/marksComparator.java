package Simple.studentRegister;

import java.util.Comparator;

public class marksComparator implements Comparator <studentInfo> {
	
	public int compare(studentInfo smarks, studentInfo smarks1) {
		if(smarks.studentMarks == smarks1.studentMarks)
			return 0;
		if(smarks.studentMarks > smarks1.studentMarks)
			return 1;
		else
			return-1;
	}

}
