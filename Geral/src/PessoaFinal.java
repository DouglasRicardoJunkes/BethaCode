public final class PessoaFinal {
    private int id;
    private String nome;
    private String cpf;
    private Double salarioBruto;

    public PessoaFinal(int id, String nome, String cpf, Double salarioBruto) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.salarioBruto = salarioBruto;
    }

    public PessoaFinal(int id, String nome, String cpf) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
    }

    public PessoaFinal(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(Double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }
}
