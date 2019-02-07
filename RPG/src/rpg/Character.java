package rpg;

public class Character {

    static Dice dice = new Dice();
    String name;
    int strength;
    int dexterity;
    int intelligence;
    int MaxLife;
    int CurrentLife;
    int damage;

    public Character(String n, int s, int d, int i) {
        this.name = n;
        this.strength = s;
        this.dexterity = d;
        this.intelligence = i;
        MaxLife = (dice.roll() + 10) * 10;
        CurrentLife = MaxLife;
    }

    public int attack() {
        int attack = (dice.roll() * this.strength) + this.intelligence + this.dexterity;
        this.damage = attack;
        return attack;
    }

    public void wound(int damage) {
        damage = dice.roll();
        CurrentLife -= damage;
    }

    public void heal(int heal) {
        heal = dice.roll();
        while (CurrentLife < MaxLife) {
            CurrentLife += heal;
        }
    }

    public String getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getCurrentLife() {
        return CurrentLife;
    }

    public int getMaxLife() {
        return MaxLife;
    }
}
