public class AppleColorHeavyLight implements ApplePrettyPrint{
    @Override
    public String print(Apple apple) {
        return "A " + (apple.getWeight() > 150 ? "HEAVY" : "LIGHT") + " " + apple.getColor() + " apple";
    }
}
