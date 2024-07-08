public static void main(String[] args) {
        String opcao;
        double numero1;
        double numero2;
        Scanner s1 = new Scanner (System.in);
        Scanner s2 = new Scanner (System.in);
        Scanner s3 = new Scanner (System.in);
             
        
         do{
             System.out.println("Selecione uma opção:");
             System.out.println("[+] para realizar uma soma");
             System.out.println("[-] para realizar uma subtracao");
             System.out.println("[*] para realizar uma multiplicação");
             System.out.println("[/] para realizar uma divisão");
             System.out.println("[s] para finalizar o programa");
             opcao =s1.nextLine();
             
             
            if (opcao.equals("+")){
                System.out.println("Digite o 1º numero: ");
                numero1 = s2.nextDouble();
                System.out.println("Digite o 2º numero: ");
                numero2 = s3.nextDouble();
                Calculadora1 calculo = new Calculadora1();
                double resultadoSoma = calculo.somar(numero1, numero2);
                System.out.println("O resultado da soma é: "+resultadoSoma);
                System.out.println("------------------------------------------------------------------------");
            }
            if (opcao.equals("-")){
                System.out.println("Digite o 1º numero: ");
                numero1 = s2.nextDouble();
                System.out.println("Digite o 2º numero: ");
                numero2 = s3.nextDouble();
                Calculadora1 calculo = new Calculadora1();
                double resultadoSoma = calculo.subtrair(numero1, numero2);
                System.out.println("O resultado da soma é: "+resultadoSoma);
                System.out.println("------------------------------------------------------------------------");
                
            }
            if(opcao.equals("*")){
                System.out.println("Digite o 1º numero: ");
                numero1 = s2.nextDouble();
                System.out.println("Digite o 2º numero: ");
                numero2 = s3.nextDouble();
                Calculadora1 calculo = new Calculadora1();
                double resultadoSoma = calculo.multiplicar(numero1, numero2);
                System.out.println("O resultado da soma é: "+resultadoSoma);
                System.out.println(“------------------------------------------------------------------------");
            }
            if(opcao.equals("/")){
                System.out.println("Digite o 1º numero: ");
                numero1 = s2.nextDouble();
                System.out.println("Digite o 2º numero: ");
                numero2 = s3.nextDouble();
                Calculadora1 calculo = new Calculadora1();
                double resultadoSoma = calculo.dividir(numero1, numero2);
                System.out.println("O resultado da soma é: "+resultadoSoma);
                System.out.println("------------------------------------------------------------------------");
            }
         }
         
         while (!opcao.equals("s"));
        System.out.println("O programa foi finalizado com sucesso!");
    }

