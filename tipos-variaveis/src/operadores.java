public class operadores {
    public static void main(String[] args) {
        
       boolean condicao1=true;

       boolean condicao2=false;

       if (condicao1 && condicao2 ){ //operador "E"
            System.out.println("as duas condições são verdadeiras");
       }

       if (condicao1 || condicao2) {   // operador 'OU'
            System.out.println("uma das condicoes é verdadeira");
 
       }
       if (condicao1 && ( 7 > 4 )) {   // operador 'OU'
            System.out.println("as duas são declarações verdadeiras");
 
       }

       System.out.println("Fim");
        

    }


}
/* String nomeUm =  "Sarah";
        String nomeDois = "Cristina";
        String nomeTres = new String("Sarah");

        System.out.println(nomeUm == nomeDois);
        System.out.println(nomeUm.equals(nomeTres)); //equals compara conteudos para objetos

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;
  

        if (numero1 < numero2)
            System.out.println("A condição acima é verdadeira");

        System.out.println("numeroUm é igual a numeroDois? " +simNao);

        simNao = numero1 != numero2;

        System.out.println("numeroUm é diferente de numeroDois? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("numeroUm é maior que numeroDois? " + simNao);

        
        
        //if(numero1 < nuemro2)
            //System.out.print("Número 1 menor que Número 2"); */
