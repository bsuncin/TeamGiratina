
//import SendSMS;
import java.util.Scanner;

public class TestSendSMS {
	
	public static void main(String[] args) {
	    String[] stuff = new String[2];
	    Scanner kbd = new Scanner(System.in);
	    kbd.useDelimiter("\n");
	    System.out.println("Please enter a phone number to send the text to: \n"
	    		+ "Note: must include country code + 10 digits. Example: +19194577950");
	    stuff[0] = kbd.next();
	    System.out.println("Please enter a messege to send to that number: \n");
	    stuff[1] = kbd.next();
	    SendSMS.sendTxt(stuff);
	    kbd.close();
	}
}
