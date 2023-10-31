import javax.swing.plaf.IconUIResource;

public class Mage extends Unit{
    private int mana;

    public Mage (String nm, int h, int mn) {
        super(nm, h);
        this.mana = mn;
    }

    public Mage (Mage m) {
        super(m.name, m.hp);
        this.mana = m.mana;
    }
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("mana" + mana);
    }
}
