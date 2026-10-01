public class Pergunta {
    public String texto;
    public char resposta;

    void regPergunta(String txt, char res) {
        texto = txt;
        resposta = res;
    }

    boolean validar(char alt) {
        return alt == resposta;
    };
}
