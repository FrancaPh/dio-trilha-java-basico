import java.util.List;

class iPhone {
    private String nomeUsuario;
    private String modelo;
    private int capacidadeArmazenamento;
    private ReprodutorMusical reprodutorMusical;
    private AparelhoTelefonico aparelhoTelefonico;
    private NavegadorInternet navegadorInternet;

    // Construtor, getters e setters
}

class ReprodutorMusical {
    private List<Musica> listaMusicas;
    private Musica musicaAtual;
    private Equalizador equalizador;
    private int volume;
    private String modoReproducao;

    public void tocarMusica(Musica musica) {
        // Lógica para tocar uma música
    }

    public void pausarMusica() {
        // Lógica para pausar a música
    }

    public void selecionarMusica(int indice) {
        // Lógica para selecionar uma música da lista
    }

    public void ajustarEqualizador(ConfiguracaoEqualizador configuracao) {
        // Lógica para ajustar o equalizador
    }

    public void definirVolume(int novoVolume) {
        // Lógica para definir o volume
    }

    public void setModoReproducao(String novoModo) {
        // Lógica para definir o modo de reprodução
    }
}

class AparelhoTelefonico {
    private List<Contato> listaContatos;
    private ChamadaTelefonica chamadaAtual;
    private List<ChamadaTelefonica> historicoChamadas;
    private GravadorVoz gravadorVoz;
    private boolean vivaVozAtivado;

    public void ligarPara(Contato contato) {
        // Lógica para realizar uma ligação para o contato
    }

    public void atenderChamada() {
        // Lógica para atender uma chamada
    }

    public void iniciarCorreioVoz() {
        // Lógica para iniciar o correio de voz
    }

    public void visualizarHistoricoChamadas() {
        // Lógica para visualizar o histórico de chamadas
    }

    public void gravarMensagemVoz(String mensagem) {
        // Lógica para gravar uma mensagem de voz
    }

    public void ativarVivaVoz() {
        // Lógica para ativar o viva-voz
    }

    public void desativarVivaVoz() {
        // Lógica para desativar o viva-voz
    }
}

class NavegadorInternet {
    private List<PaginaWeb> abasAbertas;
    private PaginaWeb paginaAtual;
    private List<PaginaWeb> historicoPaginas;
    private List<URL> favoritos;
    private boolean modoLeituraAtivado;

    public void exibirPagina(URL url) {
        // Lógica para exibir uma página web
    }

    public void adicionarNovaAba(URL url) {
        // Lógica para adicionar uma nova aba com a página web especificada
    }

    public void atualizarPagina() {
        // Lógica para atualizar a página atual
    }

    public void visualizarHistoricoPaginas() {
        // Lógica para visualizar o histórico de páginas visitadas
    }

    public void adicionarFavorito(URL url) {
        // Lógica para adicionar uma página aos favoritos
    }

    public void removerFavorito(URL url) {
        // Lógica para remover uma página dos favoritos
    }

    public void ativarModoLeitura() {
        // Lógica para ativar o modo de leitura
    }

    public void desativarModoLeitura() {
        // Lógica para desativar o modo de leitura
    }
}
