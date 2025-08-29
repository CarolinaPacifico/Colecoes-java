import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Teste01 {
    public static void main(String[] args) {
        List<Aluno> lista = new ArrayList<>();
        lista.add(new Aluno(557800, "Renato NIvaldex", "SI"));
        lista.add(new Aluno(559222, "Ismael Ligeirinho", "ADM"));
        lista.add(new Aluno(553484, "Patricia Arvore Binaria", "ENG"));
        lista.add(new Aluno(555916, "Mauro Gateway", "RED"));
        lista.add(new Aluno(552688, "Selmini Java", "ADS"));

        lista.forEach(aluno -> System.out.println(aluno));


        lista.sort(Comparator.comparing(Aluno::getNome).reversed().thenComparing(Aluno::getRm));
        System.out.println();
        lista.forEach(aluno -> System.out.println(aluno));
    }
}
