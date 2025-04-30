import java.util.Scanner;

import entities.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        Champion[] champion = new Champion[2];
        String[] posicao = new String[2];
        posicao[0] = "primeiro";
        posicao[1] = "segundo";
        
        for(int i=0; i<2; i++) {

            System.out.println("Digite os dados do "+posicao[i]+" campeao: ");
            System.out.print("Nome: ");
            String name = sc.nextLine();

            System.out.print("Vida inicial: ");
            int life = sc.nextInt();

            System.out.print("Ataque: ");
            int attack = sc.nextInt();

            System.out.print("Armadura: ");
            int armor = sc.nextInt();
            sc.nextLine();

            System.out.println();
            champion[i] = new Champion(name, life, attack, armor);
        }

        System.out.print("Quantos turnos você deseja executar? ");
        int round = sc.nextInt();
        System.out.println();

        for(int i=0; i<round; i++){

            champion[0].takeDamage(champion[1]);
            champion[1].takeDamage(champion[0]);

            System.out.println("Resultado do turno "+(i+1)+":");
            System.out.print(champion[0].status());
            System.out.println(champion[1].status());

            if (champion[0].getLife() == 0 || champion[1].getLife() == 0) {
                break;
            }

        }

        System.out.println("FIM DO COMBATE");

        sc.close();
    }
}
