
void main() {
   ArrayList<Pergunta> ClassPerguntas = new ArrayList<>();
   Scanner leitor = new Scanner(System.in);

   String[] Perguntas = {
           "1. Qual das características mencionadas abaixo é encontrada numa Classe, mas não numa função? \na) Parâmetros \nb) Retorno \nc) Lógica interna\nd) Métodos\ne) Operadores aritméticos",
           "2. Como um número que aceita casas decimais é declarado em Java? \na) Integer numero;\nb) char numero; \nc) decimal numero;\nd) float numero;\ne) long numero;",
           "3. Qual tipo é usado para guardar um valor verdadeiro ou falso em Java? \na) boolean\nb) char\nc) int\nd) String\ne) byte",
           "4. Qual é o índice do primeiro elemento de um vetor em Java? \na) 1\nb) 0\nc) -1\nd) Depende do tamanho do vetor\ne) O tamanho do vetor",
           "5. Qual palavra-chave é usada para criar uma instância de uma Classe em Java? \na) return\nb) new\nc) import\nd) public\ne) static",
           "6. Qual a função da palavra-chave return em um método? \na) Repetir a execução do método\nb) Encerrar o bloco e sempre retornar um valor\nc) Encerrar o bloco de código e, quando definido, retornar um valor\nd) Apenas encerrar o bloco de código\ne) Definir o tipo de retorno na declaração do método",
           "7. Qual tipo é usado para guardar uma sequência de caracteres em Java? \na) char\nb) boolean\nc) int\nd) string\ne) double",
           "8. Como podemos consultar a quantidade de elementos de um vetor chamado numeros em Java, sem bibliotecas externas? \na) numeros.size()\nb) numeros.length\nc) numeros.length()\nd) numeros.count()\ne) numeros.capacity()",
           "9. Qual operador é usado para verificar se dois valores do tipo int são iguais em Java? \na) =\nb) !=\nc) ==\nd) >=\ne) <=",
           "10. Qual operador representa o OU lógico, exigindo que uma das condições sejam verdadeiras? \na) ||\nb) !\nc) ==\nd) &&\ne) %",
           "11. Qual operador representa o E lógico, exigindo que duas condições sejam verdadeiras? \na) ||\nb) !\nc) ==\nd) &&\ne) !=",
           "12. Qual o paradigma predominante no Java? \na) Orientação a objetos\nb) Programação lógica\nc) Programação funcional\nd) Programação procedural\ne) Programação orientada a protótipos",
           "13. Qual conceito permite uma classe filha instancear atributos e métodos de uma classe Pai? \na) Herança\nb) Polimorfismo\nc) Encapsulamento\nd) Recursão\ne) Composição",
           "14. Qual conceito permite agrupar atributos e métodos em uma Classe e controlar o acesso aos seus dados?\na) Herança\nb) Polimorfismo\nc) Encapsulamento\nd) Recursão\ne) Sobrecarga",
           "15. Qual a função de um vetor? \na) Guardar um número na memória\nb) Relacionar chave-valor\nc) Agrupar e localizar dados por índices\nd)Transmitir doenças\ne) Ordenar automaticamente todos os dados armazenados"
   };

   String[] Respostas = {
           "d", "d", "a", "b", "b", "c", "d", "b", "c", "a",
           "d", "a", "a", "c", "c"
   };

   Cabeçalho cabecalho = new Cabeçalho();

   cabecalho.Criar("UNIFAN - Centro Universitário Alfredo Nasser", "Samuel Gonçalves Campos", "Brenno Pimenta da Costa", "Quiz sobre Java e desenvolvimento no Geral");

   cabecalho.Infos();

   System.out.println();

   ArrayList<Boolean> corretas = new ArrayList<>();

   for(int i = 0; i<Perguntas.length; i++) {
       Pergunta perguntaFormatada = new Pergunta();
       perguntaFormatada.regPergunta(Perguntas[i], Respostas[i].charAt(0));
       ClassPerguntas.add(perguntaFormatada);
   }
   System.out.println("Hora do quiz!");
   System.out.println();
   for(int j = 0; j<ClassPerguntas.size();j++) {
       System.out.println(ClassPerguntas.get(j).texto);
       if(leitor.hasNext()) {
           char res = leitor.nextLine().charAt(0);
           if (ClassPerguntas.get(j).validar(res)) {
               corretas.add(true);
           } else {
               corretas.add(false);
           }
       } else {
           corretas.add(false);
       }
       System.out.println();
   }
   float certas = corretas.stream().filter(Boolean.TRUE::equals).count();
   float media = certas / ClassPerguntas.size();

   System.out.println("Desempenho: ");
   System.out.println(" Corretas: "+certas);
   System.out.println(" Erradas: "+(ClassPerguntas.size()-certas));
   System.out.printf(" Média de acertos: %.2f%n", media);
   System.out.println();
   System.out.println("Obrigado pela atenção! :)");
}
