public class Main {
    public static void main(String[] args) {
        Arquivo meuArquivo = new Arquivo("\nmeuArquivo.txt", "");

        meuArquivo.abrir();
//Editando arquivo:
        System.out.println("ADICIONANDO CONTEÚDO:");
        meuArquivo.editar("\nPalmeiras não tem Mundial.");
        meuArquivo.abrir();
//Renomeando arquivo:
        System.out.println("RENOMEANDO CONTEÚDO:");
        meuArquivo.renomear("novoNomeArquivo.txt");
        meuArquivo.abrir();
//Limoando arquivo:
        System.out.println("LIMPANDO CONTEÚDO:");
        meuArquivo.limpar();
        meuArquivo.abrir();

    }
}
