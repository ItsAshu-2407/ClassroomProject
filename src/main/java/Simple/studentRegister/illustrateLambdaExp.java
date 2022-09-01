package Simple.studentRegister;

import static java.lang.System.*; //Importing Required packages.
import java.util.ArrayList;
import java.util.stream.Collectors;

import static java.lang.System.*;
import java.util.*;

public class illustrateLambdaExp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // creating object of Scanner class.
		ArrayList<Integer> al = new ArrayList<Integer>(); // Created ArrayList
		out.println("Enter the number upto which you want even number to be printed.");
		int num = sc.nextInt();
		for (int i = 0; i <= num; i++)
			al.add(i); // Adding the elements in ArrayList

		al.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());//Filtering all the even numbers.
		int res = al.stream().filter(i -> i % 2 == 0).reduce(0, (j, i) -> j + i);//Adding all the even numbers and storing it in a variable.
		out.println("Your output after adding even number upto " + num + " is " + res);
		sc.close();//Scanner object closed.
	}
}
