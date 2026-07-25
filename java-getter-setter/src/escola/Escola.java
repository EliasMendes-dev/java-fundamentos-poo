package escola;

public class Escola {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.setNome("Elias");
        aluno1.setIdade(23);
        aluno1.setSexo("Masculino");

        Aluno aluno2 = new Aluno();
        aluno2.setNome("José");
        aluno2.setIdade(23);
        aluno2.setSexo("Masculino");

        System.out.println("O aluno " + aluno1.getNome() + " tem " + aluno1.getIdade() + " anos e é do sexo " + aluno1.getSexo() + ".");
        System.out.println("O aluno " + aluno2.getNome() + " tem " + aluno2.getIdade() + " anos e é do sexo " + aluno2.getSexo() + ".");
    }
}
