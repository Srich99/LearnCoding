import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Let's Begin!");
        System.out.println("Hello, Java!");
        System.out.println("My Name is Srilakshmi\nI want to become a Java Full Stack Developer.");

        System.out.println("Program 3: \n");
        for(int i=0;i<3;i++){
            for(int j=0;j<5;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.println("Program 4: \n");
        ArrayList<String> tech= new ArrayList<>();
        tech.add("Java");
        tech.add("Spring Boot");
        tech.add("React");
        tech.add("AWS");

        for(String name: tech){
            System.out.println(name);
        }

        System.out.println("Program 5: \n");

        for(int i=1;i<=4;i++){
            for(int j=1;j<=(4-i);j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i)-1;k++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }
}