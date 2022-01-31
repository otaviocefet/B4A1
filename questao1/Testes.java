public class Testes {
    public static void main(String[] args) {
      Agenda agenda = new Agenda();
      Pessoa pessoa = new Pessoa("",0,0);

      agenda.armazenaPessoa("João", 2003, 1.80);
      agenda.armazenaPessoa("Ricardo", 1980, 1.67);
      agenda.armazenaPessoa("Marina", 2004, 1.10);


      agenda.imprimeAgenda();


      agenda.imprimePessoa(1);

      System.out.println(agenda.buscaPessoa("Ricardo")); 

      agenda.removePessoa("Ricardo");

      agenda.imprimeAgenda();
      
    }
}