package primeirob.exemplos.ListaSeis;

public class Cliente extends Pessoa {
    String nome;
    int idade;

    public void apresentarSe() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }

}
