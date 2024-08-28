import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();

        curso.setTitulo("Curso Java");
        curso.setDescricao("Curso Java Descrição");
        curso.setCargaHoraria(9);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Mentoria descrição java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso);
        System.out.println(mentoria);
    }
}