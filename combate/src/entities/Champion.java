package entities;

public class Champion {
    
    private String name;
    private int life;
    private int attack;
    private int armor;

    public Champion(String name, int life, int attack, int armor) {
        this.name = name;
        this.life = life;
        this.attack = attack;
        this.armor = armor;
    }

    public void takeDamage(Champion other) {
        int damage = other.getAttack() - this.armor;
        if(damage < 1){ damage = 1; }

        this.life = Math.max(this.life - damage, 0);
    
    }

    public String status() {
        if(this.life == 0){
            return String.format("""
                %s: %d de vida (morreu)
                """, this.name, this.life);
        } else {
            return String.format("""
                    %s: %d de vida
                    """, this.name, this.life);
        }
    }

    public int getLife() {
        return life;
    }

    public int getAttack() {
        return attack;
    }


}
