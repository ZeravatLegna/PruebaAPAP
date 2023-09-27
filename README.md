# PruebaAPAP
Aqui se sube la actualizacion del codigo para test

# Tabla de Índices

1. [Métodos de Acción](#métodos-de-acción)
2. [POM](#POM)
3. [Test](#TEST)
4. [Sección 4](#sección-4)



Esctructura de la automatizacion.



## Metodos De Accion.

Las acciones que se pueden realizar dentro de las pruebas automatizadas estan creadas en un Package llamado helpers

![image](https://github.com/ZeravatLegna/PruebaAPAP/assets/146205659/273a8d5c-dd0f-4df2-a30a-b90ee87431c6)

para agregar o modificar alguna accion comun, se configura en este objeto 

![image](https://github.com/ZeravatLegna/PruebaAPAP/assets/146205659/547dfc6a-cf48-4005-814a-61f366c80784)

Esta recibe el WebDriver y el objeto y realiza las acciones que estan dentro del metodo llamado. 
las variables son 
Objeto y Elemento


## POM 

Los elementos de las paginas estan esquematizado en el package de pages. 

![image](https://github.com/ZeravatLegna/PruebaAPAP/assets/146205659/2dd128d4-ff38-4ad0-a83e-5f83f57eba89)

la estructura de la misma inicia con un controlador, seguido con los elementos que vamos a utilizar en dicha pagina.

una vez configurado y detectado todos los elementos que vamos a utilizar de la pagina 

se procede a crear el paso a paso dentro de la pagina utilizando los metodos creado en el package helpers.

![image](https://github.com/ZeravatLegna/PruebaAPAP/assets/146205659/d026ae38-460b-4407-be06-71d248b0faf2)


## Test 

Una vez que ya tengamos nuestros POM creados y configurados. creamos un package para test, en el cual tendremos el test suit.

en el cual colocaremos las variables que vamos a solicitar y enviar a los test para que estas se ejecuten. 

![image](https://github.com/ZeravatLegna/PruebaAPAP/assets/146205659/96de36b8-98ff-45e3-b704-ef6b9a0bdd5b)












