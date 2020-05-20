#include <iostream>

#include "automovel.hpp"

Automovel::Automovel(int qtdLugares) {
    this->qtdLugares = qtdLugares;
}

Automovel::~Automovel() {
}

int Automovel::getQtdLugares() {
    return qtdLugares;
}
