// Classe para entrada de dados das especificações das motos.
public class Moto extends Clientes{
    private String Modelo;
    private String Ano;
    private String Placa;

    public void setModelo(String modelo) {
        this.Modelo = modelo;
    }
    public void setAno(String ano) {
        this.Ano = ano;
    }
    public void setPlaca(String placa) {
        this.Placa = placa;
    }
    public String getModelo() {
        return Modelo;
    }
    public String getAno() {
        return Ano;
    }
    public String getPlaca() {
        return Placa;
    }
}
