public class Carro{
    private String marca;
    private String modelo;
    private int ano;
    private String placa;

    public Carro(String marca, String modelo, String placa, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;

    }

    public String mostrarDadosCarro(){
        return "Marca: "+ getMarca() + "\n" +
        "Modelo: "+ getModelo() + "\n" +
        "Ano: "+ getAno() + "\n" +
        "Placa: " + getPlaca() + "\n";
    }

    //Getters

    public String getMarca(){
        return this.marca;
    }
    
    public String getModelo(){
        return this.modelo;
    }

    public int getAno(){
        return this.ano;
    }
    
    public String getPlaca(){
        return this.placa;
    }
}