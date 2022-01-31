import java.util.ArrayList;

public class Departamento extends Empresa{
    private String nome;
    public Departamento(String Nome,  String CNPJ, String nomeDepartamento){
        super(Nome, CNPJ);
        this.nome = nomeDepartamento;
    }

    public void AdicionarFuncionarios(String NomeEmpresa, String CNPJEmpresa, double salarioFuncionario, String nomeFuncionario, int admissaoFuncionario){
        ArrayList<Funcionario> funcionarios = new ArrayList<>(100);
        Funcionario funcUnidade = new Funcionario(NomeEmpresa, CNPJEmpresa, this.nome, salarioFuncionario, nomeFuncionario, admissaoFuncionario);
        funcionarios.add(funcUnidade);
    };

    public double aumentarSalario (int porcentagem, double salario){
        return (salario/100 *porcentagem);
    };
}
