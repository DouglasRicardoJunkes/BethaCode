public class FuncionarioBuilder {
    public static Funcionario novoFuncionario(String tipo, int id, String nome, String cpf, Double salarioBruto){

        if (tipo.equals("ESTAGIARIO")){
            return new Estagiario(id,nome,cpf,salarioBruto);
        }

        if (tipo.equals("ANALISTA")){
            return new Analista(id,nome,cpf,salarioBruto);
        }

        if (tipo.equals("ARQUITETO")){
            return new ArquitetoSoft(id,nome,cpf,salarioBruto);
        }

        if (tipo.equals("COORDENADOR")){
            return new Coordenador(id,nome,cpf,salarioBruto);
        }

        return new Funcionario(id, nome);
    }
}
