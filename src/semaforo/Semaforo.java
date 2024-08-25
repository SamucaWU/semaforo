package semaforo;
import java.util.Scanner;
public class Semaforo {
        Scanner sc = new Scanner(System.in);
        //Boolean cor;
        String cores = "";
        int carros;
        //String pista;
        
    

public void corCorreta() {
        System.out.println("Qual cor está o sinal agora?");
        cores = sc.nextLine();
       if (cores.equalsIgnoreCase("verde")) {
        System.out.format("O sinal está %s, os carros podem passar\n", cores);

       }
        else if (cores.equalsIgnoreCase("amarelo")) {
        System.out.format("Os carros devem ficar atentos, pois o sinal está %s\n", cores);

       } 
        else if (cores.equalsIgnoreCase("vermelho")) {
                System.out.format("o sinal está %s, os carros devem parar\n", cores);

       } else {
        System.out.println("Não faz sentido");
        sc.close();
        
       }
       }
       



public void carroQuantidade() {
        System.out.println("Quantos carros passaram?");
        carros = sc.nextInt();

        if (carros > 10) {
                System.out.format("Passaram %d carros", carros);

        } if(carros <= 10 && carros > 0){
                System.out.format("Passaram menos de %d carro(s)", carros);

        } if(carros <= 0) {
                System.out.println("Não faz nem sentido!");
                sc.close();
        }
}
}