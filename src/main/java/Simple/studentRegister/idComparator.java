package Simple.studentRegister;

import java.util.Comparator;

public class idComparator implements Comparator<studentInfo> {

	@Override
	public int compare(studentInfo sid, studentInfo sid1) {
		if(sid.studentId == sid1.studentId)
			return 0;
		if(sid.studentId > sid1.studentId)
			return 1;
		else
			return -1;
	}

}
