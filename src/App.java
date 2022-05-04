public class App {
    public static void main(String[] args) {
        Troll t = new Troll("Garfunk the Great", 80, 50, Troll.typeOfAttack.CHARGE);
        System.out.println(t.getName());
        System.out.println(t.getUserLevel());
        System.out.println(t.getTrollLevel());
        System.out.println(t.isDangerous());
        System.out.println(t.getType());
    }
}
