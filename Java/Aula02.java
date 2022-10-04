// public class Aula02{

//     public static void main(String[] args){

        
//         System.out.println("Ola Mundo!");
        
//     }
// }


// public class Aula02{

//     public static void main(String[] args){

//         String nome = "Hugo Massotti";

//         System.out.println(nome);
//     }
// }

// public class Aula02{

//     public static void main(String[] args){

//         double valorA = 10.5;
//         double valorB = 10.8;

//         double soma = valorA + valorB;
//         System.out.println(soma);

//         double multipcacao = valorA * valorB;
//         System.out.println(multiplicacao);

//         double divisao = valorA / valorB;
//         System.out.println(divisao);

//     }
// }


// public class Aula02{

//     public static void main(String[] args){

//         double nota1 = 67;

//         double nota2 = 42;

//         double nota3 = 36;

//         double media = (nota1 + nota2 + nota3) / 3;

//         double exame = 100 - media;

//         if (media >= 70) {
//         System.out.println("Voce esta aprovado!");
//         } else {
//        System.out.println("Voce esta de exame!" + (exame) + " É a nota que você precisa tirar no exame!");
//         }

//     }
// }

// import java.util.Scanner;

// public class Aula02{

//     public static void main(String[] args){
        
//         Scanner scan = new Scanner(System.in);

//         System.out.println("Digite seu Nome:");
//         String nome = scan.nextLine();

        

//         System.out.println("Digite a N1:");
//         double n1 = scan.nextDouble();
//         System.out.println("Digite a N2:");
//         double n2 = scan.nextDouble();
//         System.out.println("Digite a N3:");
//         double n3 = scan.nextDouble();

//         double res = (n1+n2+n3)/3;

//         System.out.println("Olá " + (nome) + ", sua média é:" + (res));
//     }
// }

// import java.util.Scanner;

// public class Aula02{

//     public static void main(String[] args){
        
//         Scanner scan = new Scanner(System.in);

//         System.out.println("Digite seu Nome:");
//         String nome = scan.nextLine();

        

//         System.out.println("Digite a N1:");
//         double n1 = scan.nextDouble();
//         System.out.println("Digite a N2:");
//         double n2 = scan.nextDouble();
//         System.out.println("Digite a N3:");
//         double n3 = scan.nextDouble();

//         double total = n1+n2+n3;
//         double media = total / 3;

//         if (media == 70) {} // igual
//         if (media >= 70) {} // maior ou igual
//         if (media <= 70) {} // menor ou igual
//         if (media < 70) {} // menor
//         if (media > 70) {} // maior
//         if (media != 70) {} // diferente

//         if (media >= 70) {
//             System.out.println("Voce esta aprovado!");
//         } else {
//             System.out.println("Voce esta de exame!" + (exame) + " É a nota que você precisa tirar no exame!");
//         }

//         System.out.println("Olá " + (nome) + ", sua média é:" + (media));
//     }
// }
import java.util.Scanner;

public class Aula02{

    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu sexo: 1 para masculino, 2 para feminino");

        //String sexo = (scan.nextInt() == 1 ? "Masculino" : "Feminino"); // operador ternario
        int inputSexo = scan.nextInt();
        String sexo;
        switch (inputSexo) {
            case 1: {
                sexo = "Masculino";           
                break;
            }
            case 2: {
                sexo = "Feminino";            
                break;
            }
        
            default: {
                sexo = "Outros";
                break;
            }
        }

        System.out.println("O sexo escolhidpo é: "+sexo);

        
        // int inputSexo = scan.nextInt();

        // String sexo;
        // if (inputSexo == 1){
        //     sexo = "Masculino";
        // } else {
        //     sexo = "Feminino"
        // }
        // System.out.println("O sexo escolhidpo é: "+ sexo);
    }

        

        
}