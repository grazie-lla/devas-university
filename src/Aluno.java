public class Aluno extends Pessoa{
    private String graduacao;

    public final void escolherGraduacao(){
        System.out.println("Aluno da graduação: " + graduacao);
    }


    public Aluno(String nome, int matricula, String graduacao) {
        super(nome, matricula);
        this.graduacao = graduacao;
    }

    public String getGraduacao() {
        return graduacao;
    }

    public void setGraduacao(String graduacao) {
        this.graduacao = graduacao;
    }
}
