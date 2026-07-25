package lanchonete;

import lanchonete.area.cliente.Cliente;
import lanchonete.atendimento.Atendente;
// import lanchonete.atendimento.cozinha.Almoxarife;
import lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
    public static void main(String[] args) {
        Cozinheiro cozinheiro = new Cozinheiro();
        // açoes que não precisam estarem disponiveis para toda a aplicação
        // cozinheiro.lavarIngreditentes();
        // cozinheiro.baterVitaminaLiquidificador();
        // cozinheiro.selecionarIngredientesVitamina();
        // cozinheiro.prepararLanche();
        // cozinheiro.prepararVitamina();
        // cozinheiro.prepararCombo();
        // açoes que estabelecimento precisa ter ciencia
        cozinheiro.adicionarSucoNoBalcao();
        cozinheiro.adicionarLanchenoBalcao();
        cozinheiro.adicionarComboNoBalcao();

        // Almoxarife almoxarife = new Almoxarife();
        // açoes que não precisam estarem disponiveis para toda a aplicação
        // almoxarife.controlarEntrada();
        // almoxarife.controlarSaida();
        // açoes que estabelecimento precisa ter ciencia
        //almoxarife.entregarIngredientes();
        //almoxarife.trocarGas();

        Atendente atendente = new Atendente();
        // açoes que não precisam estarem disponiveis para toda a aplicação
        // atendente.pegarLancheCozinha();
        atendente.receberPagamento();
        atendente.servindoMesa();
        // açoes que estabelecimento precisa ter ciencia
        // atendente.trocarGas();

        Cliente cliente = new Cliente();
        cliente.escolherlanche();
        cliente.fazerPedido();
        cliente.pagarConta();

        // não deveria, maso o estabelecimento ainda não definiu normas de atendimento
        // cliente.pegarPedidoBalcao();

        // está ação é muito sigilosa, que tal ser privada
        // cliente.consultarSaldoAplicativo();

        // já pensou os clientes ouvindo que o gás acabou
        // cozinheiro.pedirParaTrocarGas(atendente);
        // cozinheiro.pedirParaTrocarGas(almoxarife);
    }
}
