import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Teste03 {
    public static void main(String[] args) {
        Aluno aluno;
        Map<Integer, Aluno> lista = new HashMap<>();
        lista.put(555000,new Aluno(555000, "Renato NIvaldex", "SI"));
        lista.put(554500,new Aluno(554500, "Ismael Ligeirinho", "ADM"));
        lista.put(554500,new Aluno(554500, "Ana", "ADM"));

        System.out.println(lista.get(554500));

        Set<Integer> chave = lista.keySet();
        chave.forEach(c -> System.out.println(lista.get(c)));

    }
}
