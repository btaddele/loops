import java.util.Scanner;

public class loop {
    public static void main(String []args){
        int numbers;
        int num = 0;
        int user;
        int count;
        int sum = 0;
        int inp;
        int sum_user = 0;
        int hight;
        int base;
        int integer;
        int factorial =1;


        Scanner input = new Scanner(System.in);

       System.out.println("Numbers from 1-10: ");
        for (int x=1; x<=10; x++){
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.println("Numbers from 1-10 backward: ");
        for (int x=10; x>=1; x--){
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.println("All the odd numbers from 1-20: ");
        for(int x=1; x<=20; x++){
           if(x % 2 != 0) {
               System.out.print(x + " ");
           }
        }
        System.out.println();
        System.out.println("All the even numbers from 1-20: ");
        for(int x=1; x<=20; x++){
            if(x % 2 == 0){
                System.out.print(x + " ");
            }
        }
        System.out.println();
        System.out.print("Enter a number: ");
        user = input.nextInt();
        for(int x=user; x>=1; x--){
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.print("Sum all values from 1-10: ");
        for(int x=1; x<=10; x++){
            sum=sum+x;

        }
        System.out.print(sum + " ");
        System.out.println();


        System.out.print("Enter a number: ");
        inp = input.nextInt();
        for(int x=1; x<=inp; x++){
            sum_user = sum_user + inp;
        }
        System.out.println(sum_user);


        System.out.print("Enter a hight: ");
        hight = input.nextInt();
        System.out.print("Enter a base: ");
        base = input.nextInt();
        input.nextLine();
        for(int h=1; h<=hight; h++){
            for(int b=1; b<=base; b++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int h=1; h<=hight; h++){
            for(int x=1; x<=h; x++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int h=hight; h>0; h--){
            for(int x=0; x<=hight; x++){
                if(x<h){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        System.out.print("enter an integer: ");
        integer = input.nextInt();

        for (int x=1; x<=integer; x++){
            factorial = x * factorial;


        }
        System.out.println(factorial);


















    }
}
