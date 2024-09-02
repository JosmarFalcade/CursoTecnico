package appjava1;

public class FOR {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
            System.out.println("=============");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        int i = 0;
        for (; i < 10; i++){
            System.out.println("Sem controle " + i);
        }
        System.out.println("Valor final " + i);
        for (;i > 0 ;i -- ){
            System.out.println("Sem controle 2 " + i);
        }
/*         for (;;){
            System.out.println("Loop infinito");
        }
        for (;true;){
            System.out.println("Loop infinito");
        } alt shift A */

    }

}
