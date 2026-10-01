public class Cabeçalho {
    public String Facul;
    public String Aluno;
    public String Professor;
    public String Tema;

    public void Criar(String fac, String al, String prof, String tema) {
        Facul = fac;
        Aluno = al;
        Professor = prof;
        Tema = tema;
    }

    public String Infos() {
      System.out.println("Faculdade: "+Facul+"\nProfessor: "+Professor+"\nAluno: "+Aluno+"\nTema: "+Tema);
      return "";
    };

}
