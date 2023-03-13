
package com.mycompany.ejercicio3poo;


public class Main {

    public static void main(String[] args) {
        
        ModeloCalculadora modeloCalculadora  = new ModeloCalculadora();
        Calculadora calculadora = new Calculadora();
        int resultadosumas = calculadora.sumar(2, 2, 2);
        System.out.println("la sumas es : "+resultadosumas); //suma
        String resultadoresta = calculadora.restar(2, 1);
        System.out.println(resultadoresta);//resta
        double resultadomultiplicacion = calculadora.multiplicar(2, 2, 2, 2, 2);
        System.out.println("el resultado multiplicacion es : "+resultadomultiplicacion);//multiplicacion
        modeloCalculadora.setNumeroUno(10);
        modeloCalculadora.setNumeroDos(5);
        float resultadodivison = calculadora.division(modeloCalculadora);
        System.out.println("el resultaod de la division es :"+ resultadodivison);
        String resultadopotencia = calculadora.potencia();
        System.out.println(resultadopotencia);
        Calculadora resultadosconstructores = new Calculadora(7,8,9,4,5);
    }
}
