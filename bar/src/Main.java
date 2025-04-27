import java.util.Scanner;

import entities.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        Bill client = new Bill();

        System.out.print("Sexo: ");
        client.gender = sc.nextLine().toUpperCase().charAt(0);
        while(client.gender != 'F' && client.gender != 'M') {
            System.out.print("Valor invalido! Insira 'F' ou 'M': ");
            client.gender = sc.nextLine().toUpperCase().charAt(0);
        }

        System.out.print("Quantidade de cervejas: ");
        client.beer = sc.nextInt();

        System.out.print("Quantidade de refrigerantes: ");
        client.softDrink = sc.nextInt();

        System.out.print("Quantidade de espetinhos: ");
        client.barbecue = sc.nextInt();

        System.out.printf("%nRELATORIO:"+
            "%nConsumo = R$ %.2f", client.feeding());

        if(client.cover() > 0){
            System.out.printf("%nCover = %.2f", client.cover());
        } else {
            System.out.print("\nIsento de Cover");
        }

        System.out.printf("%nMIngresso = R$ %.2f"+
            "%n%nValor a pagar = R$ %.2f", client.ticket(), client.total());

        sc.close();
    }
}
