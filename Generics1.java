public class Generics1 {
    public static void main(String[] args) {
        Integer[] skaiciai = {1,2,3};
        String[] zodziai = {"Hello", "World"};

        printElements(skaiciai);
        printElements(zodziai);
    }
    public static <T> void printElements(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }
}
