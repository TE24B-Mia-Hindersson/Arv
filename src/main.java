import java.util.Random;

public class main {
    public static void main(String[] args) {
        Random random = new Random();
        int playerhealth = 100;
        Monster monster;
        if (random.nextBoolean()) {
            monster = new Vampire();
        } else {
            monster = new blub();
        }
        IO.println("You meet a:" + monster.getname() + "!");
        IO.println("The monsters health:" + monster.gethealth());
        IO.println("Players health:" + playerhealth);
        IO.println("--Monster attacks!!--");
        monster.attack();
        playerhealth -= monster.getattackpoints();
        if (playerhealth < 0) {
            playerhealth = 0;
        }
        IO.println("Player health after attack:" + playerhealth);
        IO.println("--Player attacks!!--");
        int playerattack = 30;
        IO.println("Player does: " + playerattack + "damage");
        IO.println("The monsters health before attack:" + monster.gethealth());
        monster.takedmg(playerattack);
        IO.println("The monsters health after attack:" + monster.gethealth());

    }
}

