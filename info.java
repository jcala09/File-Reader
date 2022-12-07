import java.util.Random;

public class info{

	// variables
	private String firstName;
	private String lastName;
	private String dept;
	private String companyEmail;
	private String alternateEmail;
	private String initialPassword;

/** NAME: info
 PARAMETERS: none
 PURPOSE: default constructor
 PRECONDITION: variables declared
 POSTCONDITION: all variables have defaults
*/
	public info()
	{
		this.firstName= "FIRSTNAME";
		this.lastName= "LASTNAME";
		this.dept= "DEPARTMENT";
		this.companyEmail= "firstname.lastname@department.company.com";
		this.alternateEmail="NA";
		this.initialPassword="Password";
	}

	/** NAME: createTempPassword()
 PARAMETERS: none
 PURPOSE: create reandom password
 PRECONDITION: none
 POSTCONDITION: return a random password
*/
public String createTempPassword()
  {
    Random rand = new Random();
    String temp_pass = "";
    for (int i = 0; i < 10; i++)
    {
        temp_pass += "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789~!@#$%^&*-+=:;.<>?/".charAt(rand.nextInt(80));
    }
    return temp_pass;
  }
	/** NAME: info
 PARAMETERS: String fname, String lname, String department, String email
 PURPOSE: assign values to variables
 PRECONDITION: none
 POSTCONDITION: no return, just variables assigned
*/
	public info(String fname, String lname, String department, String email)
	{
		this.firstName=fname;
		this.lastName= lname;
		this.dept= department;
		this.alternateEmail= email;
	}
		/** NAME: Empinfo
 PARAMETERS: info emp
 PURPOSE: get employee information
 PRECONDITION: none
 POSTCONDITION: no return, just variables assigned
*/
  void EmpInfo(info emp){
    emp.firstName = firstName;
    emp.lastName = lastName;
    emp.dept = dept;
    emp.companyEmail = companyEmail;
}
		/** NAME: toString
 PARAMETERS: none
 PURPOSE: return string
 PRECONDITION: none
 POSTCONDITION: returning string for object
*/
	public String toString()
	{
		this.initialPassword= createTempPassword();
		return ("Name:\t\t\t\t" + firstName + " " + lastName + "\nDepartment:\t\t\t" + dept + "\nCompany Email:\t\t"+ companyEmail+ "\nAlternate Email:\t" + alternateEmail + "\nPassword:\t\t\t" + initialPassword );
	}

	//setters
	public void setfirstName(String fname)
	{
	this.firstName= fname;
	}

	public void setlastName(String lname)
	{
	this.lastName= lname;
	}
	public void setdept(String department)
	{
		this.dept= department;
	}

	public void setcompanyEmail(String cemail)
	{
		this.companyEmail= cemail;
	}

	public void setalternateEmail(String amail)
	{
		this.alternateEmail= amail;
	}

	public void setinitialPassword(String pw)
	{
		this.initialPassword= pw;
	}

	//getters
	public String getfirstName()
	{
		return this.firstName;
	}

	public String getlastName()
	{
		return this.lastName;
	}

	public String getdept()
	{
		return this.dept;
	}

	public String getcompanyEmail()
	{
		return this.companyEmail;
	}

	public String getalternateEmail()
	{
		return this.alternateEmail;
	}

	public String getinitialPassword()
	{
		return this.initialPassword;
	}

	}