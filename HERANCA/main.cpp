#include <iostream>

#include "automovel.hpp"
#include "carro.hpp"

using namespace std;

int main() {    
    Carro automovel(3, "gol");
    cout << automovel.getQtdLugares() << endl;
}
