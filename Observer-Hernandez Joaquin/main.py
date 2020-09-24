# Cuando existe una relación de dependencia de uno a muchos que puede requerir 
# que un objeto notifique a múltiples objetos que dependen de él cuando cambia su estado.

from biblioteca import Biblioteca
from libro import Libro

if __name__ == "__main__":
    Biblioteca.devolver_libro(Libro("Fisica Universitaria - Sears Zemansky - 13a Edicion","bueno"))
    Biblioteca.devolver_libro(Libro("Python 3 - 2da Edicion","dañado"))