# PruebaAPAP
Aqui se sube la actualizacion del codigo para test

# Tabla de Índices

1. [Métodos de Acción](#métodos-de-acción)
2. [POM](#POM)
3. [Test](#TEST)
4. [Como Ejecutar los Test](#Como-Ejecutar-los-Test)

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

![image](https://github.com/ZeravatLegna/PruebaAPAP/assets/146205659/8747edef-1467-46e8-97f7-756b3ad9434f)

![image](https://github.com/ZeravatLegna/PruebaAPAP/assets/146205659/96de36b8-98ff-45e3-b704-ef6b9a0bdd5b)


## Como Ejecutar los Test

Para ejecutar los test, nos vamos al package de test como se ve en la seccion de test, ahi los test estan tageados y convocados. 

si tenemos la libreria de testng instalada podemos dar click derecho y correr los test. 

![image](https://github.com/ZeravatLegna/PruebaAPAP/assets/146205659/d20d0af8-a03d-4923-9f2b-5ffe78f47adc)

esto ejecutara todos los test que esten tageados.

Tambien podemos ejecutar los Test A traves de CMD.

Nos ubicamos en la carpeta del proyecto 

![image](https://github.com/ZeravatLegna/PruebaAPAP/assets/146205659/909cea14-c6a0-4436-a0e5-fe1cb233fd93)

Pulsamos clic derecho y selecionamos la opcion, abrir terminal.


![image](https://github.com/ZeravatLegna/PruebaAPAP/assets/146205659/f8ab95a1-2794-49f0-985c-95e63cd430fb)

una vez con la terminal abierta.

![image](https://github.com/ZeravatLegna/PruebaAPAP/assets/146205659/85d31403-2c74-423a-be7d-d75536a92685)

Escribimos el siguiente comando MVN test

![image](https://github.com/ZeravatLegna/PruebaAPAP/assets/146205659/cf9bb864-36f8-4b7d-910d-079a64fa2094)


y se ejecutara nuestra pruebas. 

![image](https://github.com/ZeravatLegna/PruebaAPAP/assets/146205659/69869ab7-0a36-4303-87f2-5cbe40e62eec)
















