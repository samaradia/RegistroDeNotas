public class Main {
    public static void main(String[] args) {
        Disciplina disciplina1 = new Disciplina("Matematica");
        disciplina1.adicionarNota(3);
        disciplina1.adicionarNota(7);
        disciplina1.adicionarNota(5);
        disciplina1.adicionarNota(9);


        System.out.println("Total de notas válidas: " + disciplina1.contarNotasValidas());
        System.out.printf("Média em %s: %.2f\n", disciplina1.getNome(), disciplina1.calcularMedia());

    }
}