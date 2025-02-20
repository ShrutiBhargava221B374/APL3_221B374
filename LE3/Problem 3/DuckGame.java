public class DuckGame {
    public static void main(String[] args) {
        Duck rubberDuck = new RubberDuck();
        Duck woodenDuck = new WoodenDuck();
        Duck redHeadDuck = new RedHeadDuck();
        Duck lakeDuck = new LakeDuck();

        rubberDuck.display();
        rubberDuck.performSwim();
        ((RubberDuck) rubberDuck).performQuack();  // Cast to access performQuack for RubberDuck

        System.out.println();

        woodenDuck.display();
        woodenDuck.performSwim();
        ((WoodenDuck) woodenDuck).performQuack();  // Cast to access performQuack for WoodenDuck

        System.out.println();

        redHeadDuck.display();
        redHeadDuck.performSwim();
        ((RedHeadDuck) redHeadDuck).performFly();  // Cast to access performFly for RedHeadDuck
        ((RedHeadDuck) redHeadDuck).performQuack();  // Cast to access performQuack for RedHeadDuck

        System.out.println();

        lakeDuck.display();
        lakeDuck.performSwim();
        ((LakeDuck) lakeDuck).performFly();  // Cast to access performFly for LakeDuck
        ((LakeDuck) lakeDuck).performQuack();  // Cast to access performQuack for LakeDuck
    }
}
