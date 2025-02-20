class RubberDuck implements Duck, Quackable {
    private SwimBehavior swimBehavior = new SwimNoWay();
    private QuackBehavior quackBehavior = new Squeak();

    public void display() {
        System.out.println("I'm a Rubber Duck!");
    }

    public void performSwim() {
        swimBehavior.swim();
    }

    public void performQuack() {
        quackBehavior.quack();
    }
}