public final class Atendente extends Funcionario{
    private String areaDeTrabalho;

    @Override
    public void calcularSalario() {
        System.out.printf("Salário: R$%.2f%n", getHorasTrabalhadas() * getValorDaHora());
    }

    public final void escolherAreaDeTrabalho(){
        System.out.println("Atendente da " + areaDeTrabalho);
    }
    public Atendente(String nome, int matricula, int horasTrabalhadas, double valorDaHora, String areaDeTrabalho) {
        super(nome, matricula, horasTrabalhadas, valorDaHora);
        this.areaDeTrabalho = areaDeTrabalho;
    }

    public String getAreaDeTrabalho() {
        return areaDeTrabalho;
    }

    public void setAreaDeTrabalho(String areaDeTrabalho) {
        this.areaDeTrabalho = areaDeTrabalho;
    }
}
