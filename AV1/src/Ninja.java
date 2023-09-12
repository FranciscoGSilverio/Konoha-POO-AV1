public class Ninja {
    String nome;
    int idade;
    String titulo;
    String ranking;

    public void mostraInfo(){
        System.out.println();
        System.out.println("Ninja adicionado:");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Ranking: " + this.ranking);
        System.out.println();
    }
}
