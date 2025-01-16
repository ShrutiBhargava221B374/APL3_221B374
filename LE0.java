/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

//Printing tables from command line arguments
// public class Main
// {
// 	public static void main(String[] args) {
// 	    int x = Integer.parseInt(args[0]);
// 	    for(int i=1; i<=10; i++)
// 	    {
// 		    System.out.println(x + " x " +i + " = "+ x*i);
// 	    }
// 	}
// }


public class Main
{
	public static void main(String[] args) {
	    Juet obj = new Juet();
	    obj.setName("Shruti Bhargava"); obj.setAge(20);
		System.out.println("Name is " + obj.getName() + " and age is " + obj.getAge());
	}
}
class Juet
{
    private int age;
    private String name;
    
    public void setAge(int x){   this.age=x;    }
    public void setName(String n){  this.name = n;    }
    public int getAge(){    return this.age; }
    public String getName(){    return this.name;    }
}