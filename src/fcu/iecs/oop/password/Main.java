package fcu.iecs.oop.password;

import java.util.Scanner;

public class Main 
{

	public static void main(String[] args)
	{
		PasswordEncoder encode=new PasswordEncoder();
		Scanner keyboard=new Scanner(System.in);
		String password,con="exit";
		while(true)
		{
			System.out.print("Please enter a password you want to encode:");
			password=keyboard.next();
			if(password.compareToIgnoreCase(con)==0)
			{
				System.out.print("Exiting program");
				break;
			}
			password=encode.encode(password);
			System.out.println("result:"+password);
		}
		keyboard.close();
	}

}
