package Simple.studentRegister;

import java.util.Comparator;

public class ageComparator implements Comparator <studentInfo> {

	public int compare(studentInfo sage, studentInfo sage1) {
		if(sage.studentAge == sage1.studentAge)
			return 0;
		if(sage.studentAge > sage1.studentAge)
			return 1;
		else 
			return -1;
	}

}
