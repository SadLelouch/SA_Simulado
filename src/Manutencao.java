// Classe para controle das manutenções.
public class Manutencao extends Clientes {
    private String Id;
    private String Data;
    private Double Preco;

    public void setId(String id) {
        this.Id = id;
    }

        public void setData(String data){
            this.Data = data;
        }

            public void setPreco(Double preco){
                this.Preco = preco;
            }

    public String getId() {
        return Id;
    }

    public String getData() {
        return Data;
    }

    public Double getPreco() {
        return Preco;
    }
}
