class WoodenDuck implements Duck, Quackable {
    private SwimBehavior swimBehavior = new SwimWithFins();
    private QuackBehavior quackBehavior = new Mute();

    public void display() {
        System.out.println("I'm a Wooden Duck!");
    }

    public void performSwim() {
        swimBehavior.swim();
    }

    public void performQuack() {
        quackBehavior.quack();
    }
}