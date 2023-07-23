import java.util.*;


public class Testandoarrays{
    public static void main(String[] args) {
        String curso1 ="Tire proveito da nova versao do java";
        String curso2 ="Estimulando o conhecimento";
        String curso3 ="Certificação java SE progamer";

        ArrayList<String> cursos = new ArrayList<>();
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);
        //removendo elementos da lista
        cursos.remove(1);

        System.out.println(cursos);
        System.out.println("O primeiro curso e o "+ cursos.get(0));
        //printando o codigo do 1 indice
        /*  O método size retorna o total de elementos. Como estamos acessando até i <= cursos.size()
        temos um problema: Uma exception do tipo IndexOutOfBoundsException é lançada!
        for (int i = 0; i <= cursos.size(); i++) {
            System.out.println("Aula : " + cursos.get(i));
        }
        */

        Collections.sort(cursos);

        System.out.println(cursos);
    }
}