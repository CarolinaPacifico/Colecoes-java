import java.util.HashSet;
import java.util.Set;

public class Teste02 {
    public static void main(String[] args) {
        Set<Aluno> lista = new HashSet<>();
        lista.add(new Aluno(555000, "Renato NIvaldex", "SI"));
        lista.add(new Aluno(555000, "Ismael Ligeirinho", "ADM"));
        lista.add(new Aluno(553484, "Patricia Arvore Binaria", "ENG"));
        lista.add(new Aluno(555916, "Mauro Gateway", "RED"));
        lista.add(new Aluno(552688, "Ismael Ligeirinho", "ADS"));

        lista.forEach(aluno -> System.out.println(aluno));
    }

}
