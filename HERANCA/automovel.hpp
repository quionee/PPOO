#ifndef AUTOMOVEL_HPP
#define AUTOMOVEL_HPP

class Automovel {
    private:
        int qtdLugares;
    public:
        Automovel(int qtdLugares);
        ~Automovel();
        int getQtdLugares();
};

#endif
