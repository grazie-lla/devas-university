public abstract class Funcionario extends Pessoa{
    private int horasTrabalhadas;
    private double valorDaHora;

    public abstract void calcularSalario();


    public Funcionario(String nome, int matricula, int horasTrabalhadas, double valorDaHora) {
        super(nome, matricula);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorDaHora = valorDaHora;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorDaHora() {
        return valorDaHora;
    }

    public void setValorDaHora(double valorDaHora) {
        this.valorDaHora = valorDaHora;
    }
}
