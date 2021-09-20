package org.system;

public class Desktop extends Computer
{
 public void desktopSize()
 {
	 System.out.println("This is called from desktop class");
 }
 public static void main(String[] args)
 {
	 Desktop comInherit = new Desktop();
	 comInherit.compterModel();
	 comInherit.desktopSize();
	 
 }
 
}
