
void main() {
   ArrayList<Pergunta> ClassPerguntas = new ArrayList<>();
   Scanner leitor = new Scanner(System.in);

   String[] Perguntas = {
           "1. Qual a função de um vetor? \na) Guardar um número na memória\nb) Relacionar chave-valor\nc) Agrupar e localizar dados por índices\nd)Transmitir doenças",
           "2. Qual a relação entre os elementos que compõem um objeto? \na) Pai-filho\nb) Parâmetro-Método\nc) String-Número\nd) Chave-valor",
           "3. Qual das características mencionadas abaixo é encontrada numa Classe, mas não numa função? \na) Parâmetros \nb) Retorno \nc) Lógica interna\nd) Métodos",
           "4. Como um número que aceita casas decimais é declarado em Java? \na) Integer numero;\nb) char numero; \nc) decimal numero;\nd) float numero;",
           "5. Qual tipo é usado para guardar um valor verdadeiro ou falso em Java? \na) boolean\nb) char\nc) int\nd) String",
           "6. Qual é o índice do primeiro elemento de um vetor em Java? \na) 1\nb) 0\nc) -1\nd) Depende do tamanho do vetor",
           "7. Qual a função de uma estrutura if? \na) Declarar uma Classe condicionalmente\nb) Criar um vetor condicionalmente\nc) Executar uma bloco de código condicionalmente\nd) Apenas retornar True ou False após uma validação",
           "8. Para que serve uma estrutura for? \na) Repetir um bloco de código\nb) Relacionar chave-valor\nc) Declarar um valor constante\nd) Executar uma validação",
           "9. Qual palavra-chave é usada para criar uma instância de uma Classe em Java? \na) return\nb) new\nc) import\nd) public",
           "10. Qual a função da palavra-chave return em um método? \na) Repetir a execução do método\nb) Encerrar o bloco e sempre retornar um valor\nc) Encerrar o bloco de código e, quando definido, retornar um valor\nd) Apenas encerrar o bloco de código",
           "11. Qual tipo é usado para guardar uma sequência de caracteres em Java? \na) char\nb) boolean\nc) int\nd) string",
           "12. Como podemos consultar a quantidade de elementos de um vetor chamado numeros em Java, sem bibliotecas externas? \na) numeros.size()\nb) numeros.length\nc) numeros.length()\nd) numeros.count()",
           "13. Qual operador é usado para verificar se dois valores do tipo int são iguais em Java? \na) =\nb) !=\nc) ==\nd) >=",
           "14. Qual operador representa o OU lógico, exigindo que uma das condições sejam verdadeiras? \na) ||\nb) !\nc) ==\nd) &&",
           "15. Qual operador representa o E lógico, exigindo que duas condições sejam verdadeiras? \na) ||\nb) !\nc) ==\nd) &&",
           "16. Qual operador representa o NOT lógico, verificando se um valor é falso/não existe? \na) ||\nb) !\nc) ==\nd) &&",
           "17. Qual o paradigma predominante no Java? \na) Orientação a objetos\nb) Programação lógica\nc) Programação funcional\nd) Programação procedural",
           "18. Qual a diferença entre stack (pilha) e queue (fila)? \na) Ambas retiram primeiro o elemento que entrou primeiro\nb) A pilha retira primeiro o último elemento inserido, e a fila retira primeiro o primeiro elemento inserido\nc) A pilha retira primeiro o primeiro elemento inserido, e a fila retira primeiro o último elemento inserido\nd) Ambas organizam os elementos em ordem crescente",
           "19. Qual conceito permite uma classe filha instancear atributos e métodos de uma classe Pai? \na) Herança\nb) Polimorfismo\nc) Encapsulamento\nd) Recursão",
           "20. Qual conceito permite agrupar atributos e métodos em uma Classe e controlar o acesso aos seus dados?\na) Herança\nb) Polimorfismo\nc) Encapsulamento\nd) Recursão"
   };

   String[] Respostas = {
           "c", "d", "d", "d", "a", "b", "c", "a", "b", "c",
           "d", "b", "c", "a", "d", "b", "a", "b", "a", "c"
   };

   ArrayList<Boolean> corretas = new ArrayList<>();

   for(int i = 0; i<Perguntas.length; i++) {
       Pergunta perguntaFormatada = new Pergunta();
       perguntaFormatada.regPergunta(Perguntas[i], Respostas[i].charAt(0));
       ClassPerguntas.add(perguntaFormatada);
   }
    System.out.println("Hora do quiz de Java!");
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
   long certas = corretas.stream().filter(Boolean.TRUE::equals).count();

   System.out.println(certas+" respostas corretas e "+(ClassPerguntas.size()-certas)+" erradas");
}
