package com.mycompany.tutoproyecto;
/**
 *
 * @author marti
 */
public class Operaciones extends Operaciones_Aritmeticas {
    public int suma(){
        return this.GetD1() + this.GetD2();
    }
    public int resta(){
        return this.GetD1() - this.GetD2();
    }
    public int multi(){
        return this.GetD1() * this.GetD2();
    }
    public int div(){
        if (this.GetD2() == 0){
            this.SetD2(1);
        }
        return this.GetD1() / this.GetD2();
    }
}
