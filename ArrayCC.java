import java.util.*;


public class ArrayCC {

    public static void main(String args[]){
        int marks[] = new int[10];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of Physics: ");      
        marks[0]= sc.nextInt();
        System.out.println("Enter marks of Chemistry: ");
        marks[1] = sc.nextInt();
        System.out.println("Enter marks of Maths: ");
        marks[2] = sc.nextInt();
        System.out.println("Marks of Physics: " + marks[0]);
        System.out.println("Marks of Chemistry: " + marks[1]);
        System.out.println("Marks of Maths: " + marks[2]);  


        marks[2] = marks[2] + 5;
        System.out.println("updated Marks of Maths: " + marks[2]);   
    }
}