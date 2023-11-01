package prueba;

import java.util.Scanner;

public class Prueba {

    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);

    int num1, num2, opc;
    boolean salir = false;

    while(!salir){

        System.out.println("MENU CALCULADORA: ");
        System.out.println("1. SUMA.");
        System.out.println("2. RESTA.");
        System.out.println("3. MULTIPLICACION.");
        System.out.println("4. DIVISION.");
        System.out.println("0. Salir.");
        
        System.out.println("Escriba una de las opciones:");
        opc = sc.nextInt();
        
        switch (opc) {
            case 1:
                System.out.println("Suma:");
                System.out.println("Escriba el primer sumando: ");
                num1 = sc.nextInt();
                System.out.println("Escriba el segundo sumando: ");
                num2 = sc.nextInt();
                
                int suma = num1+num2;
                System.out.println("El resultado de la suma es: "+suma);
            break;
            case 2:
                System.out.println("Resta:");
                System.out.println("Escriba el primer numero: ");
                num1 = sc.nextInt();
                System.out.println("Escriba el segundo numero: ");
                num2 = sc.nextInt();
                
                int resta = num1-num2;
                System.out.println("El resultado de la resta es: "+resta);
            break;
            case 3:
                System.out.println("Multiplicacion:");
                System.out.println("Escriba el primer numero: ");
                num1 = sc.nextInt();
                System.out.println("Escriba el segundo numero: ");
                num2 = sc.nextInt();
                
                int multi = num1*num2;
                System.out.println("El resultado de la multiplicacion es: "+multi);
            break;
            case 4:
                System.out.println("Division:");
                System.out.println("Escriba el primer numero: ");
                num1 = sc.nextInt();
                System.out.println("Escriba el segundo numero: ");
                num2 = sc.nextInt();
                
                int divi = num1/num2;
                if(num2 == 0){
                    System.out.println("la division por 0 no es correcta, escriba un numero diferente");
                }else{
                    System.out.println("El resultado de la multiplicacion es: "+divi);
                }

            break;
            case 0:
                salir = true;
            break;
            default: System.out.println("Opcion incorecta, ingrese un numero valido:");
            break;
        }
        
    }
    
}
}