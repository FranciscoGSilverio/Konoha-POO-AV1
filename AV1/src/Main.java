import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Aldeia aldeia = new Aldeia();

        aldeia.nome = "Konoha";
        aldeia.qtdMoradores = 1000;
        aldeia.regiao = "País do Fogo";

        int opcao = 1;

        while (opcao != 0){
            System.out.println();
            System.out.println("1 - Mostrar informações da aldeia");
            System.out.println("2 - Mostrar ninjas com ranking S");
            System.out.println("3 - Mostrar os títulos");
            System.out.println("4 - Cadastrar novo ninja");
            System.out.println("0 - Sair");
            System.out.println();

            opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    aldeia.mostraInfo();
                    break;
                case 2:
                    aldeia.rankingS();
                    break;
                case 3:
                    aldeia.qtdTitulos();
                    break;
                case 4:
                    Ninja ninja = new Ninja();
                    aldeia.adicionarNinja(ninja);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default: break;
            }
        }
    }
}