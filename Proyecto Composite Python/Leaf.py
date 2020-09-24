from Expresion import Expresion

class Leaf(Expresion):
    def __init__(self, numero):
        self.numero = int(numero)
    
    def agregar(self, expresion):
        pass

    def eliminar(self, expresion):
        pass

    def operacion(self):
        return self.numero
        