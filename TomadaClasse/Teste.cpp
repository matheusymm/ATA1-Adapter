#include "Tomada2Pinos.h"
#include "TomadaAdapter.h"

int main() {
    Tomada2Pinos* tomada2Pinos = new TomadaAdapter();
    tomada2Pinos->ligarNaTomada2Pinos();
    delete tomada2Pinos;
    return 0;
}