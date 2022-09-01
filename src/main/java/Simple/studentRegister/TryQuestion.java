package Simple.studentRegister;

public class TryQuestion {
		public static void main(String args[]) {
			TryQuestion scjp = new TryQuestion();
		scjp.method1();
		}
		public void method1() {
		ThreadAsc tasc = new ThreadAsc("OneThread");
		tasc.start();
		}
		}
class ThreadAsc extends Thread
{ 
private String str1= " ";//suarj
ThreadAsc(String s) {
str1 = s;//suraj
}
public void run() {
methodWait();
System.out.println("Thread Completed");
}
public void methodWait() {
while (true) {
try {
System.out.println("Waiting Thread");
//wait();
} catch (Exception e) {
}
System.out.println(str1);
}}
}

