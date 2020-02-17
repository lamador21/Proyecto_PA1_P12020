/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

/**
 *
 * @author ROOT
 */
public class Operaciones {
    
    private int num1;
    private int num2;
    private String signo;
    private int resultado;

    public Operaciones(int num1, int num2, String signo, int resultado) {
        this.num1 = num1;
        this.num2 = num2;
        this.signo = signo;
        this.resultado = resultado;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public String getSigno() {
        return signo;
    }

    public void setSigno(String signo) {
        this.signo = signo;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    @Override
    public String toString() {
        return "Operaciones{" + "num1=" + num1 + ", num2=" + num2 + ", signo=" + signo + ", resultado=" + resultado + '}';
    }

    Object getOperacion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
