package ereditarieta;

public class MotorinoImmatricolato extends Motorino{
    private double maxVelocita;
    private String targa;

    public MotorinoImmatricolato(String colore, double velocita, String tipo, double maxVelocita, String targa){
        super(colore,velocita,tipo);
        this.maxVelocita = maxVelocita;
        this.targa = targa;
    }

    public double getMax(){
        return maxVelocita;
    }

    @Override
    public void accelera(double incremento){
        double nuovaVelocita = getVelocita() + incremento;
        if(nuovaVelocita < maxVelocita){
            super.accelera(incremento);
        }
        else{
            super.accelera(maxVelocita - getVelocita());
        }
    }
}
