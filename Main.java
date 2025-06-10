
public class Main{
    public static void main(String[] args){
        Carro palio = new Carro("Fiat", "Palio", "MKGD-2345", 2004);
        MotoristaUber zoilba = new MotoristaUber();

        zoilba.setCarroMotorista(palio);
        zoilba.setIdMotorista(24);
        zoilba.setNomeMotorista("Olivia");

        System.out.println(zoilba.mostrarDados());
        

    }
}