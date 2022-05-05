import java.util.Scanner;
public class dowhile {

public static void main(String args[]){

int a;
int b=1;
int c=0;

do{
Scanner captura=new Scanner (System.in);

    System.out.println("Digita tus numeros (10)");
a=captura.nextInt();
 
c= c+a;



b++;
}
while (b<10);
    
    System.out.println("hola aca termina la funcion "+c);
            





}    
}
