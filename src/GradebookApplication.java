
import java.util.Scanner;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



public class GradebookApplication {

	private static Scanner reader;
	static String studentname;
	static String studentgrade;
	static String studentgender;
	static String studentmajor;
	static String studentstate;
	static int studentscore;

	static JTable accounttable;


	public static void main(String[] args)

	{
		AccountTableMethod.createtable();// Create Account Table

		accounttable=AccountTableMethod.AccountTable;

		System.out.println("Welcome to Gradebook Application");

		System.out.println("At any point, if you enter -1, you can see the report.");

		System.out.println("Please create new student account(s), ");
		System.out.println("If you enter -1 before finishing input, the current account cannot saved.");
		System.out.println("If you want to quit, please enter -2.");

		reader = new Scanner(System.in);

		int number=1;

		while(number>0){

			System.out.println("Enter an student name: ");
			studentname=reader.next();  

			if(studentname.equals("-1"))
			{
				AccountTableMethod.report();
			}else if(studentname.equals("-2"))
			{
				AccountTableMethod.report();
				break;
			}

			System.out.println("Enter the student grade: ");   
			studentgrade=reader.next();

			if(studentgrade.equals("-1"))
			{
				AccountTableMethod.report();
			}else if(studentgrade.equals("-2"))
			{
				AccountTableMethod.report();
				break;
			}

			System.out.println("Enter the student gender:" );
			studentgender=reader.next();

			if(studentgender.equals("-1"))
			{
				AccountTableMethod.report();

			}else if(studentgender.equals("-2"))
			{
				AccountTableMethod.report();
				break;
			}

			System.out.println("Enter the student major: ");
			studentmajor=reader.next();

			if(studentmajor.equals("-1"))
			{
				AccountTableMethod.report();
			}else if(studentmajor.equals("-2"))
			{
				AccountTableMethod.report();
				break;
			}

			System.out.println("Enter the student state of origin: ");
			studentstate=reader.next();

			if(studentstate.equals("-1"))
			{
				AccountTableMethod.report();
			}else if(studentstate.equals("-2"))
			{
				AccountTableMethod.report();
				break;
			}

			System.out.println("Enter the student score: ");
			studentscore=reader.nextInt();

			if(studentscore==-1)
			{
				AccountTableMethod.report();
			}else if(studentscore==-2)
			{
				AccountTableMethod.report();
				break;
			}

			AccountTableMethod.createaccount(studentname,studentgrade,studentgender,studentmajor,studentstate,Integer.toString(studentscore));

			AccountTableMethod.report();

		}




	}


}
