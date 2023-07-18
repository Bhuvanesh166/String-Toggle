import java.util.Scanner;

class Toggle{
    public static void toggle(String s){
        char ar[]=s.toCharArray();
        for (int i=0;i<s.length();i++){
            int a=(int)ar[i];
            int v=a^(1<<5);
            ar[i]=(char)v;
            System.out.print(ar[i]);
        }

    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String string=scanner.next();
        toggle(string);
    }
}
