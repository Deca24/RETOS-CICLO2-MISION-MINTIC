
package reto3;

public class CuentaCorriente extends Cliente {
    private long numero;
    private String fecha;
    private double saldo;
    private double porcentajeInteres;
    private double valorSobregiro;

    public CuentaCorriente(long numero, String fecha, double saldo, double porcentajeInteres, double valorSobregiro, long documento, String nombre, String correo, int celular, String direccion) {
        super(documento, nombre, correo, celular, direccion);
        this.numero = numero;
        this.fecha = fecha;
        this.saldo = saldo;
        this.porcentajeInteres = porcentajeInteres;
        this.valorSobregiro = valorSobregiro;
    }

    public CuentaCorriente(long numero, String fecha, double saldo, double porcentajeInteres, double valorSobregiro) {
        this.numero = numero;
        this.fecha = fecha;
        this.saldo = saldo;
        this.porcentajeInteres = porcentajeInteres;
        this.valorSobregiro = valorSobregiro;
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

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getPorcentajeInteres() {
        return porcentajeInteres;
    }

    public void setPorcentajeInteres(double porcentajeInteres) {
        this.porcentajeInteres = porcentajeInteres;
    }

    public double getValorSobregiro() {
        return valorSobregiro;
    }

    public void setValorSobregiro(double valorSobregiro) {
        this.valorSobregiro = valorSobregiro;
    }
    
    public double calcular_interes(){
        double valorInteres=0;
        valorInteres=this.saldo*(this.porcentajeInteres/100);
        return valorInteres;
    }
}
