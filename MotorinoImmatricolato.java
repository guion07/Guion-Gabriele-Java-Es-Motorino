class MotorinoImmatricolato extends Motorino {
    public double maxVelocita;
    public String targa;

    public MotorinoImmatricolato(double maxVelocita, String targa){
        this.maxVelocita = maxVelocita;
        this.targa = targa;
    }

    public void getMax(){
        System.out.println("velocità massima: " + maxVelocita + "Km/h");
    }

    public void accellera(double incremento){
        double s = this.velocita + incremento;
        if(s < maxVelocita){
            this.velocita = s;
        }
        else{
            this.velocita = maxVelocita;
        }
    }
}
