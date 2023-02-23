
package com.mycompany.ejercicio3poo;


public class Main {

    public static void main(String[] args) {
        
        ModeloCalculadora calcular  = new ModeloCalculadora();
        Calculadora resultados = new Calculadora();
        int resultadosumas = resultados.sumar(2, 2, 2);
        System.out.println("la sumas es : "+resultadosumas); //suma
        String resultadoresta = resultados.restar(2, 1);
        System.out.println(resultadoresta);//resta
        double resultadomultiplicacion = resultados.multiplicar(2, 2, 2, 2, 2);
        System.out.println("el resultado multiplicacion es : "+resultadomultiplicacion);//multiplicacion
        calcular.setNumeroUno(10);
        calcular.setNumeroDos(5);
        float resultadodivison = resultados.division(calcular);
        System.out.println("el resultaod de la division es :"+ resultadodivison);
        String resultadopotencia = resultados.potencia();
        System.out.println(resultadopotencia);
        Calculadora resultadosconstructores = new Calculadora(7,8,9,4,5);
    }
}
