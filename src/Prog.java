import java.util.Scanner;

public class Prog {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        int y = scan.nextInt();
        sumDij(y);
    }
    public static void sumDij(int y){
        int sum = 0;
        while(y != 0){
            sum += (y % 10);//остаток деления
            y /= 10;//деление без остатка
        }
        System.out.println(sum);
    }
}
