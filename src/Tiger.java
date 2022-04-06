public class Tiger extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "Tiger: roarrrr";
    }

    @Override
    public String howToEat() {
        return "Could be fried";
    }
}
