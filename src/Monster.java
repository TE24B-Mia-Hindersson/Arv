public class Monster {
    private String name;
    protected int health;
    protected int attackpoints;

    public Monster(String name, int health, int attackpoints) {
        this.name = name;
        this.health = health;
        this.attackpoints = attackpoints;
    }

    public String getname() {
        return name;
    }

    public int gethealth() {
        return health;
    }


    public int getattackpoints() {
        return attackpoints;
    }

    public void attack() {
        IO.println(name + "attackerar!");
        IO.println("skada:" + attackpoints);
    }

    public void takedmg(int dmg) {
        health -= dmg;
        if (health < 0) {
            health = 0;
        }
    }
}
