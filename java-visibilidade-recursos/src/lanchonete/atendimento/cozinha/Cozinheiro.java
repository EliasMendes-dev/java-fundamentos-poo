package lanchonete.atendimento.cozinha;

import lanchonete.atendimento.Atendente;

public class Cozinheiro {

    public void adicionarLanchenoBalcao() {
        System.out.println("ADICIONANDO LANCHE NATURAL HAMBURGUER NO BALCÃO");
    }

    public void adicionarSucoNoBalcao() {
        System.out.println("ADICIONANDO SUCO NO BALCÃO");
    }

    public void adicionarComboNoBalcao() {
        adicionarLanchenoBalcao();
        adicionarSucoNoBalcao();
    }

    private void prepararLanche() {
        System.out.println("PREPARANDO LANCHE NATURAL HAMBURGUER");
    }

    private void prepararVitamina() {
        System.out.println("PREPARANDO VITAMINA");
    }

    private void prepararCombo() {
        prepararLanche();
        prepararVitamina();
    }

    private void selecionarIngredientesLanche() {
        System.out.println("SELECIONANDO INGREDIENTES PARA O LANCHE");
    }

    private void selecionarIngredientesVitamina() {
        System.out.println("SELECIONANDO INGREDIENTES PARA A VITAMINA");
    }

    private void lavarIngreditentes() {
        System.out.println("LAVANDO INGREDIENTES");
    }

    private void baterVitaminaLiquidificador() {
        System.out.println("BATENDO VITAMINA NO LIQUIDIFICADOR");
    }

    private void fritarIngredientesLanche() {
        System.out.println("FRITANDO INGREDIENTES PARA O LANCHE");
    }

    /* public void pedirParaTrocarGas(Atendente meuAmigo) {
        meuAmigo.trocarGas();
    } */

    private void pedirParaTrocarGas(Almoxarife almoxarife) {
        almoxarife.trocarGas();
    }

    private void pedirIngredientes(Almoxarife almoxarife) {
        almoxarife.entregarIngredientes();
    }

}
