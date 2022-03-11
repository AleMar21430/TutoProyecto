package com.mycompany.tutoproyecto;

/**
 *
 * @author marti
 */
public class Operaciones_Aritmeticas {
    private int Num1, Num2;
    
    Operaciones_Aritmeticas(int Param1, int Param2){
    this.Num1 = Param1;
    this.Num2 = Param2;
    }
    Operaciones_Aritmeticas(){
        System.out.println("Bienvenido a la calculadora");
        this.Num1 = 0;
        this.Num2 = 0;
    }
    public void SetD1(int Param){
        this.Num1 = Param;
    }
    public void SetD2(int Param){
        this.Num2 = Param;
    }
    public int GetD1(){
        return this.Num1;
    }
    public int GetD2(){
        return this.Num2;
    }
}
