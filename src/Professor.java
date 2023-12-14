public final class Professor extends Funcionario{
    private String disciplina;
    public final void escolherDisciplina(){
        System.out.println("Professor da disciplina: " + disciplina);
    }
    @Override
    public void calcularSalario() {
        System.out.printf("Salário: R$%.2f%n", (getHorasTrabalhadas() * getValorDaHora()));
    }

    public Professor(String nome, int matricula, int horasTrabalhadas, double valorDaHora, String disciplina) {
        super(nome, matricula, horasTrabalhadas, valorDaHora);
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
}
