public class blub extends Monster {
    public blub(){
        super("blub", 150,25);
    }

    @Override
    public void attack() {
        IO.println("The blub attacks the player!");
        IO.println("damage:" + getattackpoints());

    }
}
