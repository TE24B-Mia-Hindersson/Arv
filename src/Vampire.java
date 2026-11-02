public class Vampire extends Monster {
    public Vampire() {
        super("Vampire", 100, 20);
    }

    @Override
    public void attack() {
        IO.println("The vampire bites the player!");
        IO.println("damage:" + getattackpoints());

    }
}
