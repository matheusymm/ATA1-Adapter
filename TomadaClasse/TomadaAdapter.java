package TomadaClasse;

public class TomadaAdapter extends Tomada3Pinos implements Tomada2Pinos {
    @Override
    public void ligarNaTomada2Pinos() {
        super.ligarNaTomada3Pinos();
    }
}

