public class SistemaCadastro {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Elias", "123.456.789-00");

        pessoa1.setEndereco("Rua A, 123");

        System.out.println("Nome: " + pessoa1.getNome());
        System.out.println("CPF: " + pessoa1.getCpf());
        System.out.println("Endereço: " + pessoa1.getEndereco());
    }
}
