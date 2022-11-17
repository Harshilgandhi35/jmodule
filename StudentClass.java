import java.util.Scanner;
public class StudentClass extends Marks {
    public static void main(String[] args) {
        int no;
        Scanner sc = new Scanner(System.in);
        System.out.println("how many student : ");
        no = sc.nextInt();
        Physics p = new Physics();
        Chemistry c = new Chemistry();
        Maths m = new Maths();
       int r =0;
    
        for(int i = 0;i<no;i++)
        {
          m.setRollNo();
          r = m.getRollNo();

          System.out.println("roll no is "+r);
          System.out.println("enter name ");
          m.name = sc.next();
          System.out.println("enter physics marks");
          m.marksInPhyscis = sc.nextInt();
          System.out.println("enter chemistry marks");
          m.marksInChemistry = sc.nextInt();
          System.out.println("enter maths marks");
          m.marksInMathematics = sc.nextInt();
          m.marks = m.marksInChemistry+m.marksInMathematics+m.marksInPhyscis;
          m.display(r,m.name,m.marksInPhyscis,m.marksInChemistry,m.marksInMathematics);
          System.out.println("average marks are : "+m.marks/3); 
          


        }
    }
}
