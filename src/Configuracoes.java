
public class Configuracoes {
    private int quantidadeDeNumeros;
    private int valorAposta;

    public Configuracoes() {
        this.quantidadeDeNumeros = 6;
        this.valorAposta = 5;
    }
    public void setQuantidadeDeNumeros(int quantidadeDeNumeros) {
        this.quantidadeDeNumeros = quantidadeDeNumeros;
    }
    public int getValorAposta() {
        return valorAposta;
    }
    public int getQuantidadeNumero(){
        return quantidadeDeNumeros;
    }
    public void mostraMenu(){
        System.out.println("CONFIGURACOES: ");
        System.out.println();
        System.out.println("Quantidade de numeros da aposta: " + getQuantidadeNumero());
        System.out.println("Valor de cada aposta R$ " + getValorAposta());
        System.out.println("Digite a quantidade de numeros do seu jogo");
    }

    public int calculaValorAposta() {
        if(quantidadeDeNumeros >= 6 && quantidadeDeNumeros <= 20){
            int[] valoresAposta = {5, 35, 140, 420, 1050, 2310, 4620, 8580, 15015, 25025, 40040, 61880, 92820, 135660, 193800};
            this.valorAposta = valoresAposta[quantidadeDeNumeros - 6];
            return valorAposta;
        }
        throw new IllegalArgumentException("Quantidade de numeros inválida. Digite uma aposta entre 6 e 20 numeros.");
    }
}

