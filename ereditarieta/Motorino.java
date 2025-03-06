package ereditarieta;

public class Motorino {
    private String colore;
    private double velocita;
    private String tipo;
    private boolean antifurto;

    public Motorino(String colore, double velocita, String tipo){
        this.colore = colore;
        this.velocita = velocita;
        this.tipo = tipo;
        this.antifurto = false;
    }

    public double getVelocita(){
        return velocita;
    }

    public void accelera(double incremento){
        if(!antifurto){
            velocita += incremento;
        }
    }

    public void inserisciantifurto(){
        antifurto = true;
    }
}
