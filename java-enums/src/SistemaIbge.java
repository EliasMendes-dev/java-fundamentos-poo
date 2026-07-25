public class SistemaIbge {

    public static void main(String[] args) {
        for (EstadoBrasileiro e : EstadoBrasileiro.values()) {
            System.out.println("Sigla: " + e.getSigla() + ", Nome: " + e.getNome() + ", Nome Maiúsculo: " + e.getNomeMaiusculo() + ", Código: " + e.getCodigo());
        }

        EstadoBrasileiro eb = EstadoBrasileiro.SAO_PAULO;
        System.out.println("Estado selecionado: " + eb.getNome() + " (" + eb.getSigla() + "), Código: " + eb.getCodigo());
    }
}
