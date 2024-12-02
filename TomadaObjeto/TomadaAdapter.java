package TomadaObjeto;

public class TomadaAdapter extends Tomada2Pinos {
    private Tomada3Pinos tomada3Pinos;

    public TomadaAdapter(Tomada3Pinos tomada3Pinos) {
        this.tomada3Pinos = tomada3Pinos;
    }

    public void ligarNaTomada2Pinos() {
        tomada3Pinos.ligarNaTomada3Pinos();
    }
}

