abstract class Beverage{
    private void pour(int qty){
        System.out.println("Pour " + qty + " ml of beverage in a glass.");
    }
    protected abstract void addContiment();
    protected void stir() {}
    private void serve(){
        System.out.println("Serve through waiter.");
    }
    
    public void templateMethod(int qty){
        pour(qty);
        addContiment();
        stir();
        serve();
    }
}