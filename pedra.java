import java.util.Random;
import java.util.Scanner;
public class pedrapaeltesoura
{
    public static void main(String[] args) {
        int contador=0, ganhador=0, pedraPapelTesoura, pc, contadorpc=0;
        
        Random ran = new Random();
        Scanner scan = new Scanner(System.in);

        while(contador<3 & contadorpc<3){
            if(contador<3 & contadorpc<3){
                System.out.println("\n=====\tJogador\t=====");
                System.out.println("0 - Pedra\n1 - Papel\n2 - Tesoura\n> ");
                pedraPapelTesoura = scan.nextInt();
                System.out.println("------------------------");
                System.out.println("=====\tMAQUINA\t=====");
                System.out.println("0 - Pedra\n2\n1 - Papel\n2 - Tesoura\n> ");
                pc = ran.nextInt(2)+0;
                System.out.println(pc);

                if(pedraPapelTesoura==0 & pc==0){
                    System.out.println("====\tEMPATE\t====");
                    System.out.println("...Jogue novamente...");
                }
                else if(pedraPapelTesoura==1 & pc==0){
                    contador++;
                    System.out.println("====\tJOGADOR GANHOU\t====");
                }
                else if(pedraPapelTesoura==1 & pc==1){
                    System.out.println("====\tEMPATE\t====");
                    System.out.println("...Jogue novamente...");
                }
                else if(pedraPapelTesoura==1 & pc==2){
                    contadorpc++;
                    System.out.println("====\tMAQUINA GANHOU\t====");
                }
                else if(pedraPapelTesoura==2 & pc==0){
                    contadorpc++;
                    System.out.println("====\tMAQUINA GANHOU\t====");
                }
                else if(pedraPapelTesoura==2 & pc==1){
                    contador++;
                    System.out.println("====\tJOGADOR GANHOU\t====");
                }
                else if(pedraPapelTesoura==0 & pc==1){
                    contadorpc++;
                    System.out.println("====\tMAQUINA GANHOU\t====");
                }
                else if(pedraPapelTesoura==0 & pc==2){
                    contador++;
                    System.out.println("====\tJOGADOR GANHOU\t====");
                }
                else if(pc==0 & pedraPapelTesoura==1){
                    contador++;
                    System.out.println("====\tJOGADOR GANHOU\t====");
                }
                else if(pc==0 & pedraPapelTesoura==2){
                    contadorpc++;
                    System.out.println("====\tMAQUINA GANHOU\t====");
                }
                else if(pc==1 & pedraPapelTesoura==0){
                    contadorpc++;
                    System.out.println("====\tMAQUINA GANHOU\t====");
                }
                else if(pc==1 & pedraPapelTesoura==1){
                    System.out.println("====\tEMPATE\t====");
                    System.out.println("...Jogue novamente...");
                }
                else if(pc==1 & pedraPapelTesoura==2){
                    contador++;
                    System.out.println("====\tJOGADOR GANHOU\t====");
                }
                else if(pc==2 & pedraPapelTesoura==0){
                    contador++;
                    System.out.println("====\tJOGADOR GANHOU\t====");
                }
                else if(pc==2 & pedraPapelTesoura==1){
                    contadorpc++;
                    System.out.println("====\tMAQUINA GANHOU\t====");
                }
                else if(pc==2 & pedraPapelTesoura==2){
                    System.out.println("====\tEMPATE\t====");
                    System.out.println("...Jogue novamente...");
                }
            }
            else{}
        }
        if(contador==3){
            System.out.println("\n========================================\n");
            System.out.println("\n\nO VENCEDOR FOI O JOGADOR\n\tPARABENS...\n");
            System.out.println("\n========================================\n");
        }else{
            System.out.println("\n========================================\n");
            System.out.println("\n\nO VENCEDOR FOI A MAQUINA\n\tMAIS SORTE NA PROXIMA...");
            System.out.println("\n========================================\n");
        }
    }
}
"# pedra-papel-tesoura" 
