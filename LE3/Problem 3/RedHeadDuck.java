class RedHeadDuck implements Duck, Flyable, Quackable {
    private SwimBehavior swimBehavior = new SwimWithFins();
    private FlyBehavior flyBehavior = new FlyWithWings();
    private QuackBehavior quackBehavior = new Quack();

    public void display() {
        System.out.println("I'm a RedHead Duck!");
    }

    public void performSwim() {
        swimBehavior.swim();
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }
}