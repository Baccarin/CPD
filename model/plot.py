import matplotlib.pyplot as plt
import numpy as np


vector = [10,100,500,1000,5000]

#em milesegundos
pilha = [1, 3, 5, 5, 7]

fila = [70, 75, 82, 89, 92]

lista = [1, 1, 6 , 6 , 8]




plt.plot(vector, fila, color='blue' )
plt.plot(vector, pilha, color='green' )
plt.plot(vector, lista, color='red')

plt.grid(True)

plt.ylabel("Tempo em ms")
plt.xlabel("Tamanho da entrada")

plt.show()
