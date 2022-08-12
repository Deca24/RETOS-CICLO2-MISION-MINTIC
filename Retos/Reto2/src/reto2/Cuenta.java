
package reto2;

public class Cuenta {
    
    private long numeroCuenta;
    private String fecha;
    private int tipo;
    private double saldo;

    public Cuenta(long numeroCuenta, String fecha, int tipo, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.fecha = fecha;
        this.tipo = tipo;
        this.saldo = saldo;
    }

    public long getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(long numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public double calcular_interes(){
        double valor_int=0, total_int=0, total_saldo=0;
        switch(this.tipo){
            case 1: valor_int=this.saldo*0.015;break;
            case 2: valor_int=this.saldo*0.017;break;
            case 3: valor_int=this.saldo*0.016;break;
        }

        return valor_int;
    }
    
}
