package com.mycompany.ejercicio3poo;

import java.util.Random;

public class Calculadora {

    public ModeloCalculadora dividir;

    public int sumar(int numero1, int numero2, int numero3) {
        int resultadoSuma = numero1 + numero2 + numero3;
        return resultadoSuma;
    }

    public String restar(int numero1, int numero2){
        int resultadoResta = numero1 - numero2;
        String restar = "el resultado de la resta es : " + resultadoResta;
        return restar;
    }

    public double multiplicar(int numero1, int numero2, int numero3, int numero4, int numero5) {
        double resultadoMultiplicacion = (numero1 * numero2 * numero3 * numero4 * numero5);
        return resultadoMultiplicacion;
    }

    public float division(ModeloCalculadora dividir ){
        float resultado = dividir.getNumeroUno()/dividir.getNumeroDos();
        return resultado;
    }

    public String potencia() {
        Random numeroAleatorio = new Random();
        int random = numeroAleatorio.nextInt(100);
        int potencia = random ^ 2;
        String resultadoPotencias = "el resultado de potencia aleatoria es : " + potencia;
        return resultadoPotencias;
    }

    public String raiz(String numero) {
       
        int numEntero = Integer.parseInt(numero);
        int raiz = (int)Math.sqrt(numEntero);
        String resultadoRaiz = "la raiz es : " + raiz;
        return resultadoRaiz;
    }

    public Calculadora() {

        Random random = new Random();
        ModeloCalculadora divisioncalculadora = new ModeloCalculadora();
        divisioncalculadora.setNumeroDos(random.nextInt(100));
        divisioncalculadora.setNumeroUno(random.nextInt(100));
        System.out.println( "la sumas aleatoria es : "+sumar(random.nextInt(100),random.nextInt(100),random.nextInt(100)));
        System.out.println("la resta aleatoria " +restar(random.nextInt(100),random.nextInt(100)));
        System.out.println("la multipliacion aleatoria es "+multiplicar(random.nextInt(100),random.nextInt(100),random.nextInt(100),random.nextInt(100),random.nextInt(100)));
        System.out.println(potencia());
        System.out.println(raiz (String.valueOf(random.nextInt(100))));
        System.out.println("la division aleatoria es :"+division(divisioncalculadora));
    }

    
    public Calculadora(int num1, int num2, int num3, int num4, int num5){
       
        this.sumar(num1, num2, num3);
        this.multiplicar(num1, num2, num3, num4, num5);
        this.restar(num1, num2);
        this.potencia();
        ModeloCalculadora divisioncalculadora = new ModeloCalculadora();
        divisioncalculadora.setNumeroUno(10);
        divisioncalculadora.setNumeroDos(5);
        this.division(divisioncalculadora);
    }
}
