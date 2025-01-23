/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
        Mother m1 = new Child(); 
        m1.show();
        
        //if both are non static - output is hello juet from child class.
        //if only child is static- eror; child cannot override show() in Mother
        //if only mother is static-  error: show() in Child cannot override show() in Mother
        //if both are static - hello world
	}
}
