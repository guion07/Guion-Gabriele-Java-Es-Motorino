class Motorino{
    public String colore;
    public double velocita;
    public String tipo;
    public boolean antifurto;

    public Motorino(String colore, double velocita, String tipo, boolean antifurto){
        
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
            this.velocita += incremento;
        }
    }

    public void InserisciAntifurto(){
        this.antifurto = true;
    }

    public static void main(String[]args){
        Motorino mioMotorino = new Motorino("Verde", "Piaggio Scarabeo", 49.5);

        System.out.println(mioMotorino);
        mioMotorino.accelera(11);
        System.out.println("Dopo l'accelerazione: " + mioMotorino);

        mioMotorino.InserisciAntifurto();
        mioMotorino.accelera(11);

        System.out.println("Dopo l'unserimento dell'antifurto e il tentativo di accelerazione: " + mioMotorino);
    }
}