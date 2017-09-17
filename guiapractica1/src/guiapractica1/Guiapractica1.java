/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package guiapractica1;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class Guiapractica1 {
   private static Scanner texto;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        texto = new Scanner (System.in);
        /*suma();
        
        Ejer5();
        Ejer6();
        Ejer7();
        
        Ejer8();
        Ejer9();
        Ejer11();
        Ejer12();
        Ejer13();
        
        Ejer14();
         Ejer15();
         Ejer16();
        */
        Ejer10();
        
        
        // TODO code application logic here
                   
    }
    
    public static void  suma(){
        System.out.print("INGRESE EL PRIMER NUMERO: ");
        double num1 = texto.nextDouble();
        System.out.print("INGRESE EL SEGUNDO NUMERO: ");
        double num2 = texto.nextDouble();
         System.out.print("La suma de los siguientes números "+num1+" + "+num2+" es: "+(num1+num2));
          System.out.print("");
    }
    /*
    Declara un String que contenga tu nombre, después muestra un mensaje de
bienvenida por consola. Por ejemplo: si introduzco “Fernando”, me aparezca
“Bienvenido Fernando”.
    */
     public static void  Ejer5(){
         
        String palabra = "Alejandro";
         System.out.print("BIENVENIDO "+palabra);
    } 
     /*
     Modifica la aplicación anterior, para que nos pida el nombre que queremos introducir
por teclado.
     */
      public static void  Ejer6(){
        System.out.print("INGRESE EL NOMBRE QUE DESEA: ");
        String palab = texto.next();
         System.out.print("BIENVENIDO "+palab);
    } 
      /*
      Haz una aplicación que calcule el área de un círculo (pi*R2). El radio se pedirá por
teclado.
      */
      
      public static void Ejer7(){
       System.out.print("Ingrese el radio ");
       double radio= texto.nextDouble();
       double area = Math.PI * Math.pow(radio,2);
       System.out.print("El resultado del area de un circulo es: "+area);
      }
      
      /*
      Lee un número por teclado e indica si es divisible entre 2. Si no lo es, también
debemos indicarlo.
      */
      public static void Ejer8(){
          System.out.print("INGRESE NUMERO ");
          Integer num1 = texto.nextInt();
          if (num1 % 2 == 0){
         System.out.print("El numero "+num1+" es divisible entre 2 ");
          }else
          {
          System.out.print("El numero "+num1+" NO ES DIVISIBLE");
          }
      
      }
      
      /*
      Lee un número por teclado y muestra por consola, el carácter al que pertenece en la 
tabla ASCII. Por ejemplo: si introduzco un 97, me muestre una a.
      */
       public static void Ejer9(){
          System.out.print("INGRESE NUMERO (0 al 127) ");
          byte num2 = texto.nextByte();
          char cadena = (char) num2;
          
          System.out.print("El resultado es "+cadena);
                
      }
       /*
       Modifica el ejercicio anterior, para que en lugar de pedir un número, pida un carácter 
(char) y muestre su código en la tabla ASCII.
       */
        public static void Ejer10(){
          System.out.print("INGRESE CARACTER (0 al 127) ");
          char cadena=texto.next().charAt(0);
          int num=(int)cadena;
          System.out.print(num);
                
      }
        /*
        Lee un número por teclado que pida el precio de un producto y calcule el precio final 
con IVA. El IVA sera una constante que sera del 21%.
        */
         public static void Ejer11(){
          System.out.print("INGRESE EL PRECIO DEL PRODUCTO ");
         double precio= texto.nextDouble();
         double iva=0.21;
         double suma = precio+(precio*iva);
          
          System.out.print("El resultado FINAL del producto con el IVA es "+suma);       
      }
         /*
          Muestra los números del 1 al 100 (ambos incluidos). Usa un bucle while.
         */
          public static void Ejer12(){
          System.out.print("LOS NUMEROS SON  (sentencia while) ");
         Integer i=0;
         while (i<=100) {
             System.out.println(i);   
             i++;
         }
         }
          /*
            Haz el mismo ejercicio anterior con un bucle for
          */
           public static void Ejer13(){
          System.out.print("LOS NUMEROS SON (sentencia for) ");
         
         for (Integer i=0;i<=100;i++) {
             System.out.println(i);   
            
         }
         }
           
           /*
           Muestra los números del 1 al 100 (ambos incluidos) divisibles entre 2 y 3. Utiliza el 
bucle que desees. 
           */
            public static void Ejer14(){
          System.out.print("LOS NUMEROS SON (sentencia for) ");
         
         for (Integer i=0;i<=100;i++) {
            if (i % 2 == 0 || i % 3 ==0){
             System.out.println(i);   
         }
         }
         }
        
        /*
    Realiza una aplicación que nos pida un número de ventas a introducir, después nos 
pedirá tantas ventas por teclado como número de ventas se hayan indicado. Al final 
mostrara la suma de todas las ventas. 
            */    
     
        public static void Ejer15(){
          System.out.print("LOS NUMERO DE VENTAS A REALIZAR ");
          Integer num = texto.nextInt();
          double sumavent =0;
          
         for (Integer i=1;i<=num;i++) {
             System.out.print("Ingresar el precio de la venta "+i+" $");
               double venta= texto.nextDouble();
               sumavent=sumavent+venta;
             
         
         }
          System.out.println("EL TOTAL DE LAS VENTAS SON: "+sumavent);  
         } 
        
        /*
        Realiza una aplicación que nos calcule una ecuación de segundo grado. Debes pedir las 
variables a, b y c por teclado
        */
        
          public static void Ejer16(){
          System.out.print("Ingrese la variable A ");
          Integer a = texto.nextInt();
          System.out.print("Ingrese la variable B ");
          Integer b = texto.nextInt();
          System.out.print("Ingrese la variable C ");
          Integer c = texto.nextInt();
          double discri=Math.pow(b, 2)-(4*a*c);
          if(discri>0){
            double x1=((b*(-1))+Math.sqrt(discri))/(2*a);
            double x2=((b*(-1))-Math.sqrt(discri))/(2*a);
            System.out.print("El valor de x1 es "+x1+" y el valor de x2 es "+x2);
        }else{
            System.out.print("El discriminante es negativo");
        }
          }
          
          /*
          Lee un número por teclado y comprueba que este número es mayor o igual que cero, 
si no lo es lo volverá a pedir (do while), después muestra ese número por consola.
          */
         public static void Ejer17(){
             Integer numero;
           do{
             System.out.print("Ingrese un numero que sea mayor a 0");
                numero = texto.nextInt();
           } while(numero<=0);
           System.out.print(numero);
           
         }
         /*
         Login con 3 intentos.
         */
         public static void Ejer18(){
             
             int n=0;
             int cont=3;
             int pass=0;
            
             while(n<3 ){
             
             System.out.println("Ingrese contraseña");
            pass=texto.nextInt();
            
            if(pass==12345 ){
               
             System.out.println("CONTRASEÑA CORRECTA, BIENVENIDO");
             System.exit(0);
            }
            else{
            --cont;   
            n=n+1;
            System.out.println("contraseña incorecta, le queda "+cont+" intentos");
            }
            if(cont==0){
                System.out.println("SE A TERMINADOS LOS INTENTOS, CONTACTARSE CON EL ADMINISTRADOR");
            }
            
             }
            
         }
         
         /*
         Crea una aplicación que nos pida un día de la semana y que nos diga si es un dia 
laboral o no.
         */
         
          public static void Ejer19(){
            
             System.out.println("Ingrese un dia de la semana ");
            String dia= texto.next();
            switch(dia){
               
                case "lunes":
                case "martes":
                case "miercoles":
                case "jueves":
                case "viernes":
                System.out.println("ES DIAS LABORABLES");
                break;
                case "sabado":
                case "domingo":
                System.out.println("NO ES DIA LABORABLE");
                default:
                    System.out.println("Ingrese un dia de la semana");
                    
                    
            }
           
         }
          
          /*
           Pide por teclado dos números y genera 10 números aleatorios entre esos números
          */
           public static void Ejer20(){
            
             System.out.println("Ingrese dos numeros para generar 10 numeros aleatorios ");
            Integer num1= texto.nextInt();
            Integer num2= texto.nextInt();
               for (int i = 0; i < 10; i++) {
                   System.out.println((int) (Math.random()*(num2-num1+1)+8));
                   
               }
           
           
         }
        
           /*
           Pide por teclado un número entero positivo (debemos controlarlo) y muestra el
número de cifras que tiene.
           */
         public static void Ejer21(){
             System.out.println("Ingrese numero ");
             Integer num = texto.nextInt();
             
             int cont=0;
        for (int i=num;i>0;i/=10){
        
            cont++;
        }
        
             System.out.println("El siguiente numero "+num+" tiene "+cont+" cifras");
           
         }  
      /*
         Pide un número por teclado e indica si es un número primo o no. 
         */     
         public static void Ejer22(){
             int num;
             int divisor=2;
             boolean bandera=false;
             
             System.out.println("Ingrese un numero");
             num = texto.nextInt();
             
             while(!bandera && divisor<num){
                 if(num%divisor==0){
                     bandera=true;
                 }else{
                     divisor++;
                 }
             }
             
             if(bandera){
                 System.out.println("el numero no es primo");
             }else{
                 System.out.println("el numeri si es primo");
             }
             
        
    }
         
         
   /*
          Muestra los números primos entre 1 y 100
    */      
      
         public static void Ejer23(){
             System.out.println("LOS NUMERO PRIMOS DEL RANGO 1 AL 100 SON: ");
            for (int i=1;i<=100;i++){
           
            int raiz=(int)Math.sqrt(i);
            int contador=0;
  
            
            for (int j=raiz;j>1;j--){
                if (i%j==0){
                    contador++;
                }
            }
  
  
            if (contador<1){
                System.out.println(i);
            }
  
        }
        
    }
    
     /*
         Del siguiente String “La lluvia en Corrientes fue una pesadilla durante los meses de 
abril y mayo” cuenta cuantas vocales hay en total
         */
         
         public static void Ejer24(){
             String frase="La lluvia en Corrientes fue una pesadilla durante los meses de abril y mayo";
             
             int cont=0;
             for (int i = 0; i < frase.length(); i++) {
                 if(frase.charAt(i)== 'a' ||
                    frase.charAt(i)== 'e' ||
                    frase.charAt(i)== 'i' ||
                    frase.charAt(i)== 'o' ||
                    frase.charAt(i)== 'u' ){
                     cont++;
                 }     
                         
                   
                 
             }
             System.out.println("Hay en total "+cont+" vocales");
         }
       
       /*
        Reemplaza todas las a del String anterior por una e.
       */
        public static void Ejer25(){
             String frase="La lluvia en Corrientes fue una pesadilla durante los meses de abril y mayo";
             
             System.out.print(frase.replace('a', 'e'));
         }
        
        /*
        Recorre el mismo String y transforma cada carácter a su código ASCII. Muéstralos en 
línea recta, separados por un espacio entre cada carácter.
        */
        public static void Ejer26(){
            String frase="La lluvia en Corrientes fue una pesadilla durante los meses de abril y mayo";
            for (int i = 0; i < frase.length(); i++) {
                System.out.print((int) frase.charAt(i)+"");
                
            }
    
}
          
        
           
              
      
         
        
      
     
      
        
  
    
    
    
}

