import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class mailbox
{
	
	//variables
	private static int arrSize=10; 
	private info[] employee;

	private String filename;
	private int errorcondition=-1;
	private int sizearray=0;
	
		/** NAME: mailbox
 PARAMETERS:none
 PURPOSE: default variables
 PRECONDITION: none
 POSTCONDITION: no return, just variables assigned
*/
	public mailbox()
	{
		filename= "newhires.txt";
		employee= new info[arrSize];
	}

		/** NAME:mailbox
 PARAMETERS: String fname, String lname, String department, String email
 PURPOSE: assign values to variables
 PRECONDITION: none
 POSTCONDITION: no return, just variables assigned
*/
	public mailbox(int i, String fileName)
	{
		employee= new info[i];
		filename= fileName;
	}

	//getters and setters/
	public String Getfilename()
	{
		return filename;
	}
	public void setArrayElement(int i, info object)
	{
		this.employee[i]= object;
	}

	public info getArrayElement(int i)
	{
		return employee[i];
	}

	/** NAME:arrayLength
 PARAMETERS: none
 PURPOSE: return the size of the array
 PRECONDITION: none
 POSTCONDITION: no return, just variables assigned
*/
	public int arrayLength()
	{
	 return sizearray;
	}
	
	
		/** NAME:readfile
	PARAMETERS: filename
	PURPOSE: read the stuff in the file
	PRECONDITION: initializing filename
	POSTCONDITION: setup filename
	*/
			public void readfile(String filename)
		{
			try
			{
					Scanner scanner = new Scanner(new File(filename));
					
					int i=0;
					while (scanner.hasNextLine())
						{
							
						// if i goes past 10 then exit file.
						//make an object for each employee
						try{
						employee[i]= new info(scanner.next(),scanner.next(),scanner.next(),scanner.next());
						employee[i].setcompanyEmail(employee[i].getfirstName() + "." +employee[i].getlastName() + "@" + employee[i].getdept() + ".company.com");

						// change to invalid if not right dept
						String e=	employee[i].getdept();
						e.replace("\n", "");
						
						employee[i].setdept(e);
						
						i++;
						sizearray++;	
						}

						catch(ArrayIndexOutOfBoundsException exception){
						this.errorcondition=2;
						return;
						}				
						}
			if(i==0)
		{System.out.println("**NO EMPLOYEES FOUND**");}
		else
		{;}
		
		
	if( arrayLength()== arrSize)
				{this.errorcondition=0;}
				else if(arrayLength()< arrSize && arrayLength()!=0)
				{this.errorcondition=1;}

			}
			
			catch (FileNotFoundException e)
			{
				System.out.println("File not found!");
			}
		}

	
/** NAME:printError
 PARAMETERS: none
 PURPOSE: printerrors
 PRECONDITION: readfile has to be initialized first
 POSTCONDITION: return printed errorcondition
*/
public void printError()
{
	if(errorcondition==0)
System.out.println("**NO ERRORS ENCOUNTERED**");
else if(errorcondition==1)
System.out.println("**FEWER EMPLOYEES THAN EXPECTED**");
else if(errorcondition==2)
System.out.println("**MORE EMPLOYEES THAN EXPECTED**");
}

}