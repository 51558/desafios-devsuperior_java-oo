package entities;

public class Bill {

    public char gender;
    public int beer, barbecue, softDrink;

    public double cover() {
        double consume = feeding() + ticket();
        return (consume > 30) ? 0.0 : 4.0;
        
    }

    public double feeding() {
        return beer * 5 + barbecue * 7.0 + softDrink * 3.0;
    }

    public double ticket() {
        return (gender == 'F') ? 8.0 : 10.0;
    }

    public double total() {
        return cover() + feeding() + ticket();
    }
    
}
