public class Pessoa {
    private String nome;
    private double altura;
    private int nascimento;
    
    public Pessoa(String nomeDaPessoa, double alturaDaPessoa, int NascimentoDaPessoa){
        this.nome = nomeDaPessoa;
        this.altura=alturaDaPessoa;
        this.nascimento=NascimentoDaPessoa;
    }


    void imprimirDados(){
        System.out.println("Nome: " + getNome() + "\nAltura: " + getAltura()+ "\nNascimento: " + getNascimento() );
    };

    public int CalcularIdade (int anoNascimento){
        int idade;
        idade = 2022-anoNascimento;
        return (idade);
    };

    public void setNome(String nomePessoa){
        this.nome = nomePessoa;
    };
    public String getNome(){
        return this.nome;
    };

    public void setAltura(float AlturaPessoa){
        this.altura=AlturaPessoa;
    };
    public double getAltura(){
        return this.altura;
    };



    public void setNascimento(int nascimentoPessoa){
        this.nascimento = nascimentoPessoa;
    };
    public int getNascimento(){
        return this.nascimento;
    }
};
