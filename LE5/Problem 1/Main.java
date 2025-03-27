/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Main{
    public static void main(String args[]){
        System.out.println("Preparing WHISKY ");
        Beverage b = new Whisky();
        b.templateMethod(30);
        System.out.println("\nPreparing BEER");
        b = new Beer();
        b.templateMethod(200);
    }
}