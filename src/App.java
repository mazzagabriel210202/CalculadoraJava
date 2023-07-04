import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
  
        Scanner sc = new Scanner(System.in);
    System.out.println("calculadora em java");

    double numero1 = sc.nextDouble();
    double numero2 = sc.nextDouble();

    System.out.println("digite aqui a operaçao desejada");


    System.out.println("1 para soma");
    System.out.println("2 para subtraçao");
    System.out.println("3 para multiplicaçao");
    System.out.println("4 para divisao");

    int operaçao = sc.nextInt();

    double resultado = 0;

    switch (operaçao) {
 case 1:
 resultado = numero1 + numero2;
break;

case 2:
resultado = numero1 - numero2;
break;

case 3:
resultado = numero1 * numero2;
break;

case 4:
resultado = numero1 / numero2;
break;

default:
System.out.println("erro na operaçao");
return;
    }

System.out.println("o resultado da operaçao eh: "+ resultado);

sc.close();   
    }
}
