package provaprimeiraunidade;

/**
 *Escolha o Animal e ele dirá se é: Construa um algoritmo que seja capaz de concluir qual dentre os seguintes animais foi escolhido,
através de perguntas e respostas. Animais possíveis: leão, cavalo, homem, macaco, morcego,
baleia, avestruz, pinguim, pato, águia, tartaruga, crocodilo e cobra.
 * @author gleyson
 */
import java.util.Scanner;

public class PrimeiroQuesito {

    static void Quadrupede() {
        Scanner input = new Scanner(System.in);
        System.out.println("Qual o tipo de Quadrúprde?\n Digite:\n1 - Carnívoro\n2 - Hebívoros\n");
        int resposta = input.nextInt();

        switch (resposta) {
            case 1:
                System.out.println("O animal descrito é o Leão");
                break;
            case 2:
                System.out.println("O animal descrito é o Cavalo");
                break;
            default:
                System.out.println("Digite 1 ou 2 :/");
                Quadrupede();

        }
    }

    static void Bipede() {
        Scanner input = new Scanner(System.in);
        System.out.println("Qual o tipo de Quadrúprde?\n Digite:\n1 - Onívoro\n2 - Frutíveros\n");
        int resposta = input.nextInt();

        switch (resposta) {
            case 1:
                System.out.println("O animal descrito é um Ser Humano");
                break;
            case 2:
                System.out.println("O animal descrito é o Macaco");
                break;
            default:
                System.out.println("Digite 1 ou 2 :/");
                Bipede();

        }
    }

    static void Voadores() {
        System.out.println("O animal descrito é o Morcego");
    }

    static void Aquaticos() {
        System.out.println("O animal descrito é a Baleia");
    }

    static void mamifero() {

        Scanner input = new Scanner(System.in);
        System.out.println("Qual o tipo de mamífero?\n Digite:\n1 - Quadrúpede\n2 - Bípede\n3 -Voadres\n4 - Aquáticos");
        int resposta = input.nextInt();

        switch (resposta) {
            case 1:
                Quadrupede();
                break;
            case 2:
                Bipede();
                break;
            case 3:
                Voadores();
                break;
            case 4:
                Aquaticos();
                break;
            default:
                System.out.println("Digite 1, 2, 3 ou 4 :/");
                mamifero();
        }

    }

    static void avesNaoVoadoras() {
        Scanner input = new Scanner(System.in);
        System.out.println("Qual o tipo de Ave não voadora?\n Digite:\n1 - Tropicais\n2 - Polares\n");
        int resposta = input.nextInt();

        switch (resposta) {
            case 1:
                System.out.println("O animal descrito é o Avestruz");
                break;
            case 2:
                System.out.println("O animal descrito é o Pingüim");
                break;
            default:
                System.out.println("Digite 1 ou 2 :/");
                avesNaoVoadoras();

        }
    }

    static void avesNadadoras() {
        System.out.println("O animal descrito é o Pato");
    }

    static void avesDeRapina() {
        System.out.println("O animal descrito é a Águia");
    }

    static void aves() {

        Scanner input = new Scanner(System.in);
        System.out.println("Qual o tipo de Ave?\n Digite:\n1 - Não Voadoras\n2 - Nadadoras\n3 -Aves de Rapina\n");
        int resposta = input.nextInt();

        switch (resposta) {
            case 1:
                avesNaoVoadoras();
                break;
            case 2:
                avesNadadoras();
                break;
            case 3:
                avesDeRapina();
                break;
            default:
                System.out.println("Digite 1, 2 ou 3 :/");
                aves();
        }

    }

    static void comCasco() {
        System.out.println("O animal descrito é a Tartaruga");
    }

    static void reptilCarnivoro() {
        System.out.println("O animal descrito é Crocodilo");
    }

    static void reptilSemPatas() {
        System.out.println("O animal descrito é a Cobra");
    }

    static void reptil() {

        Scanner input = new Scanner(System.in);
        System.out.println("Qual o tipo de Reptil?\n Digite:\n1 - Com Casco\n2 - Carnívoro\n3 -Sem Patas\n");
        int resposta = input.nextInt();

        switch (resposta) {
            case 1:
                comCasco();
                break;
            case 2:
                reptilCarnivoro();
                break;
            case 3:
                reptilSemPatas();
                break;
            default:
                System.out.println("Digite 1, 2 ou 3 :/");
                reptil();
        }

    }

    static void escolha() {

        Scanner input = new Scanner(System.in);
        System.out.println("Escolha o tipo de Animal?\n Digite:\n1 - Mamiferos\n2 - Aves\n3 -Répteis\n");
        int resposta = input.nextInt();

        switch (resposta) {
            case 1:
                mamifero();
                break;
            case 2:
                aves();
                break;
            case 3:
                reptil();
                break;
            default:
                System.out.println("Digite 1, 2 ou 3 :/");
                escolha();
        }

    }

    static void desejaContinuar() {

        Scanner input = new Scanner(System.in);
        System.out.println("Deseja tentar outra vez?\nDigite:\n\n 1- Sim\n2- Não.");
        int resposta = input.nextInt();

        switch (resposta) {
            case 1:
                escolha();
                break;
            case 2:
                System.out.println("Até a Próxima :-) ");
            default:
                System.out.println("Digite 1 ou 2 :/");
                desejaContinuar();
        }

    }

    public static void main(String[] args) {

        escolha();

        desejaContinuar();

    }

}
