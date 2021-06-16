import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num1, num2, op;
        
        System.out.print("Digite o primeiro numero: ");
        num1 = input.nextInt();
        System.out.print("Digite o segundo numero: ");
        num2 = input.nextInt();
        System.out.println("---Digite a opção---");
        System.out.println("1: somar.");
        System.out.println("2: subtrair.");
        System.out.println("3: multiplicar.");
        System.out.println("4: dividir.");
        op = input.nextInt();
        
        switch (op) {
            case 1:
                num1 = num1+num2;
                break;
            case 2:
                num1 = num1-num2;
                break;
            case 3:
                num1 = num1*num2;
                break;
            case 4:
                num1 = num1/num2;
                break;
            default:
                break;
        }
        System.out.println("Valor final:"+num1);
        
    }
}
