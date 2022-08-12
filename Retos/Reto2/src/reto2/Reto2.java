
package reto2;

import java.util.Scanner;
public class Reto2 {

    public static void main(String[] args) {
        Scanner console=new Scanner(System.in);
        console.useDelimiter("\n");
        
        int tipo, N;
        long numeroCuenta;
        double saldo, total_int=0, total_saldo_int=0, valor_int=0, total_saldo=0;
        String fecha;
        
        System.out.println("Número de cuentas: ");
        N=console.nextInt();
        
        for(int i=0; i<N; i++){
            System.out.println("Ingrese el número de cuenta: ");
            numeroCuenta=console.nextLong();
            
            System.out.println("Ingrese la fecha aaaa/mm/dd");
            fecha=console.next();
            console.nextLine();
            
            System.out.println("Indique el tipo de cuenta:\n 1.Ahorro Diario\n 2.Cuenta Joven\n 3.Tradicional\n ");
            tipo=console.nextInt();
            
            System.out.println("Ingrese el saldo: ");
            saldo=console.nextDouble();
            
            Cuenta obj_cuenta=new Cuenta(numeroCuenta,fecha,tipo,saldo);
            valor_int=obj_cuenta.calcular_interes();
            total_int+=valor_int;
            total_saldo_int=saldo+valor_int;
            total_saldo+=total_saldo_int;            
            System.out.println("Número de cuenta: "+obj_cuenta.getNumeroCuenta());
            System.out.println("Valor interes: "+valor_int);
            System.out.println("Saldo con interes: "+total_saldo_int);
        }
        System.out.println("Total interes: "+total_int);
        System.out.println("Total saldos: "+total_saldo);
    }
    
}
