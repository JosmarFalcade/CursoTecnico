package appjava1;

public class Continue {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0)
                continue;

            System.out.println("Volta nº " + i);
        }
        System.out.println("Fim do programa! ");
    }

}
