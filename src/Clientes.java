// Classe para entrada de dados das especificações dos Clientes.
public class Clientes {
    protected String Nome;
    private String Telefone;
    private String Cpf;
    private String Endereco;
    private String Nascimento;

    public void setNome(String nome) {
        this.Nome = nome;
    }

    public void setTelefone(String telefone) {
        this.Telefone = telefone;
    }

    public void setCpf(String cpf) {
        this.Cpf = cpf;
    }

    public void setEndereco(String endereco) {
        this.Endereco = endereco;
    }

    public void setNascimento(String nascimento) {
            this.Nascimento = nascimento;
    }
    public String getNome() {
        return Nome;
    }
    public String getTelefone() {
        return Telefone;
    }
    public String getCpf() {
        return Cpf;
    }
    public String getEndereco() {
        return Endereco;
    }
    public String getNascimento() {
        return Nascimento;
    }

}
