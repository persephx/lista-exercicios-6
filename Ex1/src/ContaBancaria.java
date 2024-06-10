public class ContaBancaria {
    /*  Nome da Classe --> UpperCamelCase
        Métodos e atirbutos --> LowerCamelCase --> verbos
--------------------------------------------------------------------------------------------------    */

    // --- ATRIBUTOS --- :
    private int numero;    //private ou public --> Modificadores de acesso
    private double saldo;
    private String titular;

    // --- CONSTRUTOR ---:
    public ContaBancaria(int numero, String titular) {
        this.numero = numero;
        this.saldo = 0.0;
        this.titular = titular;
    }

    // --- MÉTODOS ---:
    public boolean depositar(double valor) {
        if (valor <= 0)
            return false;
        this.saldo += valor;
        return true;
    }

    public boolean sacar(double valor) {
        if (valor >= this.saldo || valor < 0)
            return false;

        this.saldo -= valor;
        return true;
    }

    // --- GETTER AND SETTERS --- :
    public double getSaldo() {    //Para fazer visualização
        return this.saldo;
    }
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular){
        this.titular = titular;
    }

    //--- TO STRING --- :
    @Override
    public String toString() {
        return "ContaBancaria{" +
                "numero=" + numero +
                ", saldo=" + saldo +
                ", titular='" + titular + '\'' +
                '}';
    }


}

