/**
 * Marks
 */
public class Marks {
    static int rollNo = 0;
    String name;
    int marks = 0;
    int marksInPhyscis,marksInChemistry,marksInMathematics;
    double avg;
   
    public static void setRollNo() {
        rollNo++;
    }
   
    public static int getRollNo() {
        return rollNo;
    }
   
    void display(int r,String n,int p,int c,int mt)
    {
        System.out.println("roll no is "+r);
        System.out.println("name is : "+n);
        System.out.println("physics :"+p);
        System.out.println("chemistry : "+c);
        System.out.println("maths : "+mt);
        
    }
   
    

}