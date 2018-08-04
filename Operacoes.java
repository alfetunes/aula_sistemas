import java.util.Scanner;
public class Operacao {

Scanner input = new Scanner(System.in);

public void soma(){
int num1,num2, resposta;
System.out.println("Digite o primeiro numero da soma:");
num1 = input.nextInt(); 
System.out.println("Digite o segundo numero da soma:");
num2 = input.nextInt(); 
resposta = num1 + num2;
System.out.println("O resultado da soma dos numeros e " + resposta);
}

public void calculaMedia(double n1, double n2){
System.out.println("A media dos numeros e " + (n1+n2)/2);
}

public int multiplicacao(){
int n1, n2;
System.out.println("Digite o primeiro numero inteiro da multiplicacao");
n1 = input.nextInt(); 
System.out.println("Digite o segundo numero inteiro da multiplicacao");
n2 = input.nextInt(); 
return n1 * n2;
}

public double divisao(double n1, double n2){
if (n2 != 0.0) {
return n1/n2;
}
return 0;
}

public void subtracao(){
int num1,num2, resposta;
System.out.println("Digite o primeiro numero da subtracao:");
num1 = input.nextInt(); 
System.out.println("Digite o segundo numero da subtracao:");
num2 = input.nextInt(); 
resposta = num1 - num2;
System.out.println("O resultado da subtracao dos numeros e " + resposta);
}	

public double ponderada(double n1, double n2, double p1, double p2){
return (n1*p1 + n2*p2)/(p1+p2);
}

public void calculaFatorial(int valor){
System.out.println("O resultado do fatorial do numero e " + fatorial(valor));
}

public int fatorial(int n){
int result;
if(n==0 || n==1){
return 1;
}
result = fatorial(n-1) * n;
return result;
}
}
