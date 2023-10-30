import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for(int i = 0; i <= 30; i++ ){
            System.out.print(i + " ");
        }
        System.out.println(" ");
        for (int j = 30; j >= 0; j--){
            System.out.print(j + " ");
        }
        System.out.println(" ");
        for(int k = -2; k <= 18; k++){
            k += 2;
            System.out.print(k + " ");
        }
        System.out.println(" ");
        for (int g = 11; g >= 0; g--){
            g -= 1;
            System.out.print(g + " ");
        }
    }
}