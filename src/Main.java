import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Escolha o grupo para verificar informações: 1 - Professores, 2 - Atendentes ou 3 - Alunos");
        int grupo = input.nextInt();

        switch (grupo){
            case 1:
                mostrarProfessores();
                break;
            case 2:
                mostrarAtendentes();
                break;
            case 3:
                mostrarAlunos();
                break;
            default:
                System.out.println("Opção inválida! Escolha um número de 1 a 3!");
        }


    }

    public static void mostrarProfessores(){
        Professor professorA = new Professor("João", 1234, 120, 16.4, "Lógica de programação");
        Professor professorB = new Professor("Joana", 2638, 150, 16.4, "POO");
        System.out.println("Nome: " + professorA.getNome());
        professorA.autorizarAcesso();
        professorA.escolherDisciplina();
        professorA.calcularSalario();
        System.out.println("----------------");
        System.out.println("Nome: " + professorB.getNome());
        professorB.autorizarAcesso();
        professorB.escolherDisciplina();
        professorB.calcularSalario();
    }
    public static void mostrarAtendentes(){
        Atendente atendenteA =  new Atendente("Laís", 9861, 220, 8.9, "biblioteca");
        Atendente atendenteB =  new Atendente("Marcos", 7263, 180, 8.9, "recepção");
        System.out.println("Nome: " + atendenteA.getNome());
        atendenteA.autorizarAcesso();
        atendenteA.escolherAreaDeTrabalho();
        atendenteA.calcularSalario();
        System.out.println("----------------");
        System.out.println("Nome: " + atendenteB.getNome());
        atendenteB.autorizarAcesso();
        atendenteB.escolherAreaDeTrabalho();
        atendenteB.calcularSalario();
    }
    public static void mostrarAlunos(){
        Aluno alunoA = new Aluno("Luís", 7652, "Ciência da computação");
        Bolsista alunoB = new Bolsista("Carolina", 8262, "Engenharia da computação", 1290.00);
        System.out.println("Nome: " + alunoA.getNome());
        alunoA.autorizarAcesso();
        alunoA.escolherGraduacao();
        System.out.println("----------------");
        System.out.println("Nome: " + alunoB.getNome());
        alunoB.autorizarAcesso();
        alunoB.escolherGraduacao();
        alunoB.mostrarValorDaBolsa();
    }
}