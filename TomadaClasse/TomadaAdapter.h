#ifndef TOMADAADAPTER_H
#define TOMADAADAPTER_H

#include "Tomada2Pinos.h"
#include "Tomada3Pinos.h"

class TomadaAdapter : public Tomada2Pinos, public Tomada3Pinos {
public:
    void ligarNaTomada2Pinos() override;
};

#endif // TOMADAADAPTER_H