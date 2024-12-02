package TomadaObjeto;

public class Teste {
    public static void main(String[] args) {
        Tomada3Pinos tomada3Pinos = new Tomada3Pinos();
        Tomada2Pinos tomada2Pinos = new TomadaAdapter(tomada3Pinos);
        tomada2Pinos.ligarNaTomada2Pinos();
    }
}
