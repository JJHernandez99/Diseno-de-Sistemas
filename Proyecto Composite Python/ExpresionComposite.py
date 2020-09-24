from Expresion import Expresion

class ExpresionComposite(Expresion):
    def __init__(self, operador):
        self.operador = str(operador)
        self.expresionList = []
    
    
    def agregar(self, expresion):
        self.expresionList.append(expresion)

    def eliminar(self, expresion):
        self.expresionList.remove(expresion)

    def operacion(self):
        self.resultado = 0
        print(self.expresionList)

        if self.operador == "+":
            for i in range(len(self.expresionList)-1):
                self.resultado = self.resultado + (self.expresionList[i] + self.expresionList[i+1])
        
        elif self.operador == "-":
            for i in range(len(self.expresionList)-1):
                self.resultado = self.resultado + (self.expresionList[i] - self.expresionList[i+1])

        elif self.operador == "*":
            for i in range(len(self.expresionList)-1):
                self.resultado = self.resultado + (self.expresionList[i] * self.expresionList[i+1])
        
        elif self.operador == "/":
            for i in range(len(self.expresionList)-1):
                self.resultado = self.resultado + (self.expresionList[i] / self.expresionList[i+1])
            
        return self.resultado
