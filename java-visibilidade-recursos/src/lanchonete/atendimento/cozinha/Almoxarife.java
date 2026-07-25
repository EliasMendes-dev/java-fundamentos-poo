package lanchonete.atendimento.cozinha;

public class Almoxarife {

    private void controlarEntrada() {
        System.out.println("Controlando entrada de itens");
    }

    private void controlarSaida() {
        System.out.println("Controlando saída de itens");
    }

    void entregarIngredientes() {
        System.out.println("Entregando Clientes");
        controlarSaida();
    }

    void trocarGas() {
        System.out.println("Almoxarife trocando o gás");
    }

}
