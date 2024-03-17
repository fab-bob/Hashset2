import java.util.HashSet;

/*Scrivere una funzione che restituisca un HashSet riempito
Creare un oggetto dello stesso tipo inserito nell'HashSet e popolarlo
Verificare che l' elemento sia parte del Set e stampare il risultato*/
public class Main {
    public static void main(String[] args) {
        Integer num = 11;

        HashSet<Integer> numbersFromZerotoTen = fillHashSet();
        numbersFromZerotoTen.add(num);
        if (numbersFromZerotoTen.contains(11)) {
            System.out.println(numbersFromZerotoTen);

        }
    }
    public static HashSet<Integer> fillHashSet () {
        HashSet<Integer> numbers = new HashSet<>();
        for (int i = 0; i <= 10; i++) {
            numbers.add(i);
        }
        return numbers;
    }
}

