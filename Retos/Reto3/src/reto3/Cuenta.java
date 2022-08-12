
package reto3;

public class Cuenta extends Cliente {
    private long numero;
    private String fecha;
    private int tipoCuenta;
    private double saldo;

    public Cuenta(long numero, String fecha, int tipoCuenta, double saldo, long documento, String nombre, String correo, int celular, String direccion) {
        super(documento, nombre, correo, celular, direccion);
        this.numero = numero;
        this.fecha = fecha;
        this.tipoCuenta = tipoCuenta;
        this.saldo = saldo;
    }

    public Cuenta(long numero, String fecha, int tipoCuenta, double saldo) {
        this.numero = numero;
        this.fecha = fecha;
        this.tipoCuenta = tipoCuenta;
        this.saldo = saldo;
    }

    public Cuenta() {
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(int tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public double calcular_interes(){
        double valorInteres=0;
        switch(this.tipoCuenta){
            case 1: valorInteres=this.saldo*0.015;break;
            case 2: valorInteres=this.saldo*0.017;break;
            case 3: valorInteres=this.saldo*0.016;break;
        }
        return valorInteres;
    }
    
}
