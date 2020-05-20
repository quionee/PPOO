#include <iostream>
#include <cstdlib>

#include "carro.hpp"

Carro::Carro(int qtdLugares, std::string marca) : Automovel(qtdLugares) {
    this->marca = marca;
}

Carro::~Carro() {
}

std::string Carro::getMarca() {
    return marca;
}
