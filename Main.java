import java.util.Scanner;

class Main {
    
    public static void main(String[] args) {

     boolean aux; 
     int option;
     Scanner input;
     double result;
     double varA, varB;
     int index;

    Functions run = new Functions(); // instance of the "Functions" class

        aux = false;
        while(aux == false){
           System.out.println("'1' para adição\n'2' para subtração\n'3' para multiplicação\n'4' para divisão\n'5' para potência\n'6' para raiz\n'7' para o seno\n'8' para o cosseno\n'9' para a tangente\naperte qualquer outra tecla para sair...");
           
           input = new Scanner(System.in);

           option = input.nextInt(); // choose the option

           switch(option){
           
            case 1: // option == 1
            System.out.println("Informe o valor 1:");
            varA = input.nextDouble();
            System.out.println("Informe o valor 2:");
            varB = input.nextDouble();
            result = run.plus(varA, varB);
            System.out.println(+ varA +" + " +varB+ " = "+ result);
            break;

            case 2: // option == 2
            System.out.println("Informe o valor 1:");
            varA = input.nextDouble();
            System.out.println("Informe o valor 2:");
            varB = input.nextDouble();
            result = run.subtract(varA, varB);
            System.out.println(+ varA +" - " +varB+ " = "+ result);
            break;

            case 3: // option == 3
            System.out.println("Informe o valor 1:");
            varA = input.nextDouble();
            System.out.println("Informe o valor 2:");
            varB = input.nextDouble();
            result = run.multiply(varA, varB);
            System.out.println(+ varA +" * " +varB+ " = "+ result);
            break;

            case 4: // option == 4
            System.out.println("Informe o valor 1:");
            varA = input.nextDouble();
            System.out.println("Informe o valor 2:");
            varB = input.nextDouble();
            result = run.division(varA, varB);
            System.out.println(+ varA +" / " +varB+ " = "+ result);
            break;

            case 5: // option == 5 
            System.out.println("Informe o valor 1:");
            varA = input.nextDouble();
            System.out.println("Informe o valor 2:");
            index = input.nextInt();
            result = run.exponecial(varA, index);
            System.out.println(+ varA +" ^ " +index+ " = "+ result);
            break;

            case 6: // option == 6
            System.out.println("Informe o valor 1:");
            varA = input.nextDouble();
            System.out.println("Informe o valor 2:");
            index = input.nextInt();
            result = run.squareRoot(varA, index);
            System.out.println(+ varA +" ^ " +index+ " = "+ result);
            break;

            case 7: // option == 7
            System.out.println("Informe o angulo:");
            varA = input.nextDouble();
            result = run.sin(varA);
            System.out.println("o seno de "+ varA+ " é " + result);
            break;

            case 8: // option == 8
            System.out.println("Informe o angulo:");
            varA = input.nextDouble();
            result = run.cos(varA);
            System.out.println("o cosseno de "+ varA+ " é " + result);
            break;

            case 9: // option == 9
            System.out.println("Informe o angulo:");
            varA = input.nextDouble();
            result = run.tan(varA);
            System.out.println("a tangente de "+ varA+ " é " + result);
            break;

            default: // stop loop
            aux = true;
            break;
        }
        }
    }


}