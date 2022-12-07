/**
 AUTHOR: Jerome Gabriel Cala
 FILENAME: Main.java
 SPECIFICATION: Briefly describe the problem and expectation
 FOR: CS 2365 Object-Oriented Programming Section 001
*/
class Main {
  public static void main(String[] args) {
    mailbox Mailbox= new mailbox();
		Mailbox.readfile(Mailbox.Getfilename());
		
		for(int i=0; i< Mailbox.arrayLength(); i++)
		{System.out.println(Mailbox.getArrayElement(i).toString());
		System.out.println("\n");
		
		}
		Mailbox.printError();
  }
}