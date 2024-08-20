import java.util.InputMismatchException;
import java.util.Scanner;

public class Main{
    public static void (String[] args){

    Scanner sc=new Scanner(System.in);

    try{
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println(x/y);

    }
    catch(InputMismatchException e){
        System.out.println(e.getclass().getName());
    }
    catch(Exception e){
        System.out.println(e);
    }
    sc.close();
}}
