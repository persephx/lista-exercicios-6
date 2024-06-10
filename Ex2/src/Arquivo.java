public class Arquivo {

    // ATRIBUTOS:
    private String nome;
    private int tamanho;
    private StringBuilder conteudo;

    // CONSTRUTOR:
    public Arquivo(String nome, String conteudo) {
        this.nome = nome;
        this.conteudo = new StringBuilder(conteudo);
        this.tamanho = conteudo.length();
    }

    // MÉTODOS:
    public void abrir(){
        System.out.println("Nome do arquivo: " + nome);
        System.out.println("Tamanho do arquivo: " + tamanho + " caracteres:");
        System.out.println("Conteúdo do arquivo:");
        System.out.println("----------------------------------------------");
        System.out.println(conteudo.toString());
        System.out.println("----------------------------------------------\n");
    }

    public void editar(String novoConteudo){
        conteudo.append(novoConteudo); // Adiciona o novo conteúdo ao final do conteúdo existente
        tamanho = conteudo.length(); // Atualiza o tamanho do arquivo com base no novo conteúdo
    }

    public void limpar(){
        conteudo.setLength(0); // Remove tudo do arquivo
        tamanho = 0; // Redefine o tamanho
    }

    public void renomear(String novoNome){
        this.nome = novoNome;
    }

    // GETTERS & SETTERS
    public String getNome() {
        return nome; // Retorna o nome do arquivo
    }

    public void setNome(String nome) {
        this.nome = nome; // Define um novo nome para o arquivo
    }

    public int getTamanho() {
        return tamanho; // Retorna o tamanho do arquivo
    }

    public String getConteudo(){
        return conteudo.toString();
    }
}

