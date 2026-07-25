public enum EstadoBrasileiro {

    SAO_PAULO("SP", "São Paulo", 11),
    RIO_DE_JANEIRO("RJ", "Rio de Janeiro", 12),
    BRASILIA("DF", "Brasília", 13),
    MINAS_GERAIS("MG", "Minas Gerais", 14),
    BAHIA("BA", "Bahia", 15),
    PARANA("PR", "Paraná", 16),
    RIO_GRANDE_DO_SUL("RS", "Rio Grande do Sul", 17),
    SANTA_CATARINA("SC", "Santa Catarina", 18);

    private final String sigla;
    private final String nome;
    private final int codigo;

    private EstadoBrasileiro(String sigla, String nome, int codigo) {
        this.sigla = sigla;
        this.nome = nome;
        this.codigo = codigo;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }

    public String getNomeMaiusculo() {
        return nome.toUpperCase();
    }

    public int getCodigo() {
        return codigo;
    }
}
