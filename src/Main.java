import java.util.*;

public class Main {
    public static void main(String[]args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Hello Player, Do you want to play a game? (y/n)");
        String yesOrNo = myObj.nextLine();
        System.out.println("You answer was " +yesOrNo);
    }
}
