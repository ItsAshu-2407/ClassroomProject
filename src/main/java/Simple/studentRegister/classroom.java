/**
 * In this project we are storing and sorting the students on the basis of their given information.
 *@author Ashutosh Kumar
 */
package Simple.studentRegister;

import java.util.ArrayList;				//Importing necessary packages.
import java.util.Collections;
import static java.lang.System.*;

public class classroom 
{
    public static void main( String[] args )
    {
    	studentInfo sd = new studentInfo(1, "Akshat", 21, 86);				//Passing Students Information.
    	studentInfo sd1 = new studentInfo(14, "Punit", 22, 78);
    	studentInfo sd2 = new studentInfo(6, "Saurav", 20, 91);
    	studentInfo sd3 = new studentInfo(3, "Karan", 23, 55);
    	studentInfo sd4 = new studentInfo(20, "Vedant", 24, 95);
    	
    	ArrayList<studentInfo> alobj = new ArrayList<studentInfo>();		//ArrayList Object Created.
    	alobj.add(sd4);
    	alobj.add(sd2);
    	alobj.add(sd3);
    	alobj.add(sd1);
    	alobj.add(sd);
    	
    	out.println("\t\t\t----Student Comparison on the basis of id----");
    	Collections.sort(alobj, new idComparator());     		//Sorting ArrayList elements on the basis of their id.
    	for (studentInfo si : alobj) {
    		out.println(" ID:- "+si.studentId+" Name:- "+si.studentName+" Marks:- "+si.studentMarks+" Age:- "+si.studentAge);
    	}
    	out.println("Maximum Marks 100/n");
    	out.println("\t\t\t----Student Comparison on the basis of Marks----");
    	Collections.sort(alobj, new marksComparator());			//Sorting ArrayList elements on the basis of their marks.
    	for (studentInfo smarks : alobj) {
    		out.println(" Marks:- "+smarks.studentMarks+" Name:- "+smarks.studentName+" ID:- "+smarks.studentId+" Age:- "+smarks.studentAge);
    	}
    	out.println("\t\t\t----Student Comparison on the basis of Age----");
    	Collections.sort(alobj, new ageComparator());			//Sorting ArrayList elements on the basis of their Age.
    	for (studentInfo sage : alobj) {
    		out.println(" Age:- "+sage.studentAge+" Name:- "+sage.studentName+" Marks:- "+sage.studentMarks+" ID:- "+sage.studentId);
    	}
    }
    
}
