package reto1;

import java.util.Scanner;
public class Reto1 {

    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        console.useDelimiter("\n");
        
        int type_acc, N;
        long number_acc; 
        double balance_acc, price_int=0, total_int=0, total_balance=0;
        String day;
        
        System.out.println ("Número de cuentas: ");
        N=console.nextInt();
        
        for (int i=0; i<N; i++){
            
            System.out.println("Ingrese número de cuenta: ");
            number_acc=console.nextLong();
            System.out.println("Introduzca la fecha con formato aaaa/mm/dddd");
            day=console.next();
            console.nextLine();
            System.out.println("Indique el tipo de cuenta:\n 1.Ahorro Diario\n 2.Cuenta Joven\n 3.Tradicional\n ");
            type_acc=console.nextInt();
            System.out.println("Ingrese el saldo: ");
            balance_acc=console.nextDouble();          
            
            switch (type_acc){
                case 1: price_int=balance_acc*0.015;break;
                case 2: price_int=balance_acc*0.017;break;
                case 3: price_int=balance_acc*0.016;break;
            }
            balance_acc=balance_acc+price_int;
            total_int=total_int+price_int;
            total_balance=total_balance+balance_acc;
            System.out.println("Número de cuenta: "+number_acc);
            System.out.println("Valor de interes: "+price_int);
            System.out.println("Saldo con interes: "+balance_acc);
        }
        System.out.println("Total intereses: "+total_int);
        System.out.println("Saldo total con intereses: "+total_balance);
    }  
}
