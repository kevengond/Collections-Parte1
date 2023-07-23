import java.util.ArrayList;
import java.util.Comparator;

public class TestaListaAula{
   
    public static void main(String[] args) {
        
        Aula a1 = new Aula("redes de computadores", 50);
        Aula a2 = new Aula("arquitetura", 30);
        Aula a3 = new Aula("emprededorismo", 40);

        ArrayList<Aula> aulas = new ArrayList<>();
        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);
        
        /*aqui sera printado o endereço de armazenamento das aulas pois nao ha uma sobreescrita do metodo to string */
        System.out.println(aulas);

        aulas.sort(Comparator.comparing(Aula::getTempo));

    }

}