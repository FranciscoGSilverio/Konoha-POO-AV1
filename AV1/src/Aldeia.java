import java.util.Scanner;

public class Aldeia {

    String nome;
    int qtdMoradores;
    String regiao;

    Ninja[] ninjas = new Ninja[10];

    public void mostraInfo(){
        System.out.println();
        System.out.println("Nome: " + this.nome);
        System.out.println("Quantidade de moradores: " + this.qtdMoradores);
        System.out.println("Região: " + this.regiao);
        System.out.println();
    }

    public void adicionarNinja(Ninja ninja){
        Scanner sc = new Scanner(System.in);

        System.out.println();

        System.out.println("Entre com os dados do ninja:");
        System.out.print("Nome: ");
        ninja.nome = sc.nextLine();

        System.out.print("Idade: ");
        ninja.idade = sc.nextInt();

        sc.nextLine();

        System.out.print("Titulo: ");
        ninja.titulo = sc.nextLine();

        System.out.print("Ranking: ");
        ninja.ranking = sc.nextLine();

        System.out.println();

        ninja.mostraInfo();


        for(int i = 0; i < ninjas.length; i++){
            if(ninjas[i] == null){
                ninjas[i] = ninja;
                break;
            }
        }
    }

    public void rankingS(){
        System.out.println();
        System.out.println("Ninjas com ranking S:");
        for(int i = 0; i < ninjas.length; i++){
            if(ninjas[i] != null){
                if(ninjas[i].ranking.equals("S") || ninjas[i].ranking.equals("s")){
                    System.out.println( ninjas[i].nome);
                }
            }
        }
        System.out.println();
    }

    public void qtdTitulos(){
        int qtdGenning = 0;
        int qtdChunnin = 0;
        int qtdJounnin = 0;

        for(int i = 0; i < ninjas.length; i++){
            if(ninjas[i] != null){
                if(ninjas[i].titulo.equals("Gennin") || ninjas[i].titulo.equals("gennin")){
                    qtdGenning++;
                } else if(ninjas[i].titulo.equals("Chunnin") || ninjas[i].titulo.equals("chunnin")){
                    qtdChunnin++;
                } else if(ninjas[i].titulo.equals("Jounnin") || ninjas[i].titulo.equals("jounnin")){
                    qtdJounnin++;
                }
            }
        }
        System.out.println();
        System.out.println("Quantidade de ninjas com titulo Gennin: " + qtdGenning);
        System.out.println("Quantidade de ninjas com titulo Chunnin: " + qtdChunnin);
        System.out.println("Quantidade de ninjas com titulo Jounnin: " + qtdJounnin);
        System.out.println();
    }
}
