public class MotoristaUber{
    private Carro carroMotorista;
    private String nomeMotorista;
    private int idMotorista;


    

    public String mostrarDados(){
        return"Nome da motorista: " + getNomeMotorista()+ "\n" +
        "ID da motorista: " + getIdMotorista() + "\n" +
        this.carroMotorista.mostrarDadosCarro();
    }
    //getters
    public Carro getCarroMotorista(){
        return this.carroMotorista;
    }

    
    public int getIdMotorista(){
        return this.idMotorista;
    }
    
    public String getNomeMotorista(){
        return this.nomeMotorista;
    }

    //setters
        public void setCarroMotorista(Carro novoCarroMotorista){
         this.carroMotorista = novoCarroMotorista;
    }

    public void setIdMotorista(int novoIdMotorista){
         this.idMotorista = novoIdMotorista ;
    }
    
    public void setNomeMotorista(String novoNomeMotorista){
         this.nomeMotorista = novoNomeMotorista;
    }
}