import java.util.ArrayList;
import java.util.List;

public class Agenda {
    ArrayList<Pessoa> pessoas = new ArrayList<>(10);

    public void armazenaPessoa(String nome, int datadeNascimento, double altura){
        Pessoa pessoa = new Pessoa(nome, altura, datadeNascimento ); 
        pessoas.add(pessoa);        
    };
    public void removePessoa(String nome){
        for (int i = 0; i<10; i++){
            if (pessoas.get(i).getNome() == nome){
                pessoas.remove(i);
            }
        };
    };

    public int buscaPessoa(String nome){
        for (int i = 0; i<10; i++){
            if (pessoas.get(i).getNome() == nome){
                return i;
            }
        };
        return (11);
    };

    void imprimeAgenda(){
        for (int i = 0; i<pessoas.size(); i++){
            System.out.println("Pessoa "+ i+1 + ": \n" + "\nNome: " + pessoas.get(i).getNome()
            + "\nData d Nascimento: " + pessoas.get(i).getNascimento() + "\nAltura: " + pessoas.get(i).getAltura() + "\n\n\n");
        };
    };

    void imprimePessoa(int index){
        System.out.println("Pessoa "+ index+1 + ": \n" + "\nNome: " + pessoas.get(index).getNome()
            + "\nData d Nascimento: " + pessoas.get(index).getNascimento() + "\nAltura: " + pessoas.get(index).getAltura() + "\n\n\n");
    };
}
