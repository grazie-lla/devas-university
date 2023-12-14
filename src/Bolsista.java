public final class Bolsista extends Aluno {
    private double valorDaBolsa;

    public final void mostrarValorDaBolsa(){
        System.out.printf("Valor da bolsa: %.2f", valorDaBolsa);
    }

    public Bolsista(String nome, int matricula, String graduacao, double valorDaBolsa) {
        super(nome, matricula, graduacao);
        this.valorDaBolsa = valorDaBolsa;
    }

    public double getValorDaBolsa() {
        return valorDaBolsa;
    }

    public void setValorDaBolsa(double valorDaBolsa) {
        this.valorDaBolsa = valorDaBolsa;
    }
}
