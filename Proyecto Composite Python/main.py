from ExpresionComposite import ExpresionComposite
from Leaf import Leaf

class main():

    def main(self):
        self.suma = ExpresionComposite("+")
        self.resta = ExpresionComposite("-")
        self.multi = ExpresionComposite("*")
        self.div = ExpresionComposite("/")

        self.uno = Leaf(1)
        self.dos = Leaf(2)
        self.tres = Leaf(3)
        self.cuatro = Leaf(4)

        self.suma.agregar(self.uno.numero)
        self.suma.agregar(self.dos.numero)
        self.suma.agregar(self.tres.numero)
        self.suma.agregar(self.cuatro.numero)
        self.cuenta = self.suma.operacion()

        print("La suma de las hojas es: ", self.cuenta)

if __name__ == "__main__":
    app = main()
    app.main()