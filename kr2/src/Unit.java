import java.util.Scanner;

public class Unit {
    protected String name;
    protected int hp;

    public Unit (String nm, int h) {
        this.name = nm;
        this.hp = h;
    }

    public Unit (Unit u) {
        this.name = u.name;
        this.hp = u.hp;
    }

    public void printInfo() {
        System.out.println("name" + name);
        System.out.println("hp" + hp);
    }

}
