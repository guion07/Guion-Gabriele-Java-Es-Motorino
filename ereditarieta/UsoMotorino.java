package ereditarieta;

public class UsoMotorino{
    public static void main(String[]args){
        Motorino mioMotorino = new Motorino("nero metallizzato", 40.5, "Piaggio Liberty");
        double velocitaIniziale = mioMotorino.getVelocita();
        System.out.println("Velocità iniziale Motorino: " + velocitaIniziale + "km/h");

        MotorinoImmatricolato mioMotorinoImmatricolato = new MotorinoImmatricolato("rosso", 30.5, "Aprilia Scarabeo", 70.0, "CV1234");

        System.out.println("Velocità massima MotorinoImmatricolato: " + mioMotorinoImmatricolato.getMax() + "km/h");

        mioMotorino.accelera(30.8);
        mioMotorinoImmatricolato.accelera(30.8);

        System.out.println("Nuova velocità Motorino: " + mioMotorino.getVelocita() + "km/h");
        System.out.println("Nuova velocità MotorinoImmatricolato: " + mioMotorinoImmatricolato.getVelocita() + "km/h");
    }
}
