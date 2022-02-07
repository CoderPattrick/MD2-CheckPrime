import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        System.out.println("Input Number u wanna check Prime:");
        Scanner input = new Scanner(System.in);
        int numb = input.nextInt();
        String text="";
        if(numb>1){
            for (int i = 2; i <=Math.sqrt(numb); i++) {
                if(numb%i==0){
                    text = "Not a Prime Number.";
                    break;
                }
            }
            if(text.equals("")){
                text = "A Prime Number.";
            }
        }else {
            text="Not a Prime Number.";
        }
        System.out.println(text);
    }
}
