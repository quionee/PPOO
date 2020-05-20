#ifndef CARRO_HPP
#define CARRO_HPP

#include <cstdlib>
#include "automovel.hpp"

class Carro : public Automovel {
    private:
        std::string marca;
    public:
        Carro(int qtdLugares, std::string marca);
        ~Carro();
        std::string getMarca();
};

#endif
