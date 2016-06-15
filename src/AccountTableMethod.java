import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class AccountTableMethod {

	static JTable AccountTable;
	
	 static double sum=0;
	 static double sumforgenderM=0, countforgenderM=0;
	 static double sumforgenderF=0, countforgenderF=0;
	 static double sumformajorEcon=0, countformajorEcon=0;
	 static double sumformajorCompsci=0, countformajorCompsci=0;
	 static double sumformajorEE=0, countformajorEE=0;
	 static double sumforstateMD=0, countforstateMD=0;
	 static double sumforstateDC=0, countforstateDC=0;
	 static double sumforstateVA=0, countforstateVA=0;
	 
	 static double average=0;
	 static double aveforgenderM=0;
	 static double aveforgenderF=0;
	 static double aveformajorEcon=0;
	 static double aveformajorCompsci=0;
	 static double aveformajorEE=0;
	 static double aveforstateMD=0;
	 static double aveforstateDC=0;
	 static double aveforstateVA=0;

	public static void createtable()
	{//Create columns names

		String columnNames[]={"Name", "Grade", "Gender", "Major", "State of Origin","Score"};

		//Create some data

		String dataValues[][]=
			{
					{"Bob Jones", "A", "M","Econ", "MD", "88"}

			};

		// Create a new table instance

		AccountTable=new JTable(new DefaultTableModel(dataValues, columnNames));
	}
	
	
	public static void createaccount( String studentname, String studentgrade, String studentgender, 
			String studentmajor, String studentstate, String studentscore)
	{

		DefaultTableModel model = new DefaultTableModel();
		model=(DefaultTableModel) AccountTable.getModel();

		model.addRow(new Object[]{ studentname, studentgrade, studentgender, 
				studentmajor, studentstate, studentscore});


	}

	public static void report()
	{
		for(int i=0;i<=AccountTable.getRowCount()-1;i++)
		{
			sum+= Integer.parseInt((String) AccountTable.getValueAt(i, 5));

			if(AccountTable.getValueAt(i, 2).equals("M"))
			{
				sumforgenderM+= Integer.parseInt((String) AccountTable.getValueAt(i, 5));
				countforgenderM+=1;
			}
			if(AccountTable.getValueAt(i, 2).equals("F"))
			{
				sumforgenderF+= Integer.parseInt((String) AccountTable.getValueAt(i, 5));
				countforgenderF+=1;
			}

			if(AccountTable.getValueAt(i, 3).equals("Econ"))
			{
				sumformajorEcon+= Integer.parseInt((String) AccountTable.getValueAt(i, 5));
				countformajorEcon+=1;
			}
			if(AccountTable.getValueAt(i, 3).equals("Compsci"))
			{
				sumformajorCompsci+= Integer.parseInt((String) AccountTable.getValueAt(i, 5));
				countformajorCompsci+=1;
			}
			if(AccountTable.getValueAt(i, 3).equals("EE"))
			{
				sumformajorEE+= Integer.parseInt((String) AccountTable.getValueAt(i, 5));
				countformajorEE+=1;
			}

			if(AccountTable.getValueAt(i, 4).equals("MD"))
			{
				sumforstateMD+= Integer.parseInt((String) AccountTable.getValueAt(i, 5));
				countforstateMD+=1;
			}
			if(AccountTable.getValueAt(i, 4).equals("DC"))
			{
				sumforstateDC+= Integer.parseInt((String) AccountTable.getValueAt(i, 5));
				countforstateDC+=1;
			}
			if(AccountTable.getValueAt(i, 4).equals("VA"))
			{
				 sumforstateVA+= Integer.parseInt((String) AccountTable.getValueAt(i, 5));
				countforstateVA+=1;
			}
		}
        
		System.out.println("The number of Students:" +AccountTable.getRowCount());
		if(AccountTable.getRowCount()>0)
		{
			average=sum/(AccountTable.getRowCount());
		}
		else
		{
			average=0;
		}
		if(countforgenderM>0)
		{
			aveforgenderM=sumforgenderM/countforgenderM;
		}
		else
		{
			aveforgenderM=0;
		}
		if(countforgenderF>0)
		{
			aveforgenderF=sumforgenderF/countforgenderF;
		}
		else
		{
			aveforgenderF=0;
		}
		if(countformajorEcon>0)
		{
			aveformajorEcon=sumformajorEcon/countformajorEcon;
		}
		else
		{
			aveformajorEcon=0;
		}
		if(countformajorCompsci>0)
		{
			aveformajorCompsci=sumformajorCompsci/countformajorCompsci;
		}
		else
		{
			aveformajorCompsci=0;
		}
		if(countformajorEE>0)
		{
			aveformajorEE=sumformajorEE/countformajorEE;
		}
		else
		{
			aveformajorEE=0;
		}
		if(countforstateMD>0)
		{
			aveforstateMD=sumforstateMD/countforstateMD;
		}
		else
		{
			aveforstateMD=0;
		}
		if(countforstateDC>0)
		{
			aveforstateDC=sumforstateDC/countforstateDC;
		}
		else
		{
			aveforstateDC=0;
		}
		if(countforstateVA>0)
		{
			aveforstateVA=sumforstateVA/countforstateVA;
		}
		else
		{
			aveforstateVA=0;
		}
		
		NumberFormat formatter = new DecimalFormat("#0.00");     
		System.out.println("Overall Average is "+formatter.format(average));
		System.out.println("Overall Average for Gender:");
		System.out.println("        Average for Male is "+formatter.format(aveforgenderM));
		System.out.println("        Average for Female is "+formatter.format(aveforgenderF));
		System.out.println("Overall Average for Major:");
		System.out.println("        Average for Econ is "+formatter.format(aveformajorEcon));
		System.out.println("        Average for Compsci is "+formatter.format(aveformajorCompsci));
		System.out.println("        Average for EE is "+formatter.format(aveformajorEE));
		System.out.println("Overall Average for State:");
		System.out.println("        Average for MD is "+formatter.format(aveforstateMD));
		System.out.println("        Average for DC is "+formatter.format(aveforstateDC));
		System.out.println("        Average for VA is "+formatter.format(aveforstateVA));


	}

}
