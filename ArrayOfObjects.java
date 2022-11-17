import java.util.Scanner;
class Employee{
    String name;
    int salary;
    String doj;
    void SetData(String name,int salary,String doj)
    {
        this.name=name;
        this.salary=salary;
        this.doj=doj;
    }
    void display()
    {
        System.out.println("name is : "+name);
        System.out.println("salary is : "+salary);
        System.out.println("date of joining is : "+doj);
    }

public class ArrayOfObjects {
   
        
    }
    public static void main(String[] args) {
        Employee arr[] = new Employee[3];
        Scanner sc = new Scanner(System.in);
        
        for(int i=0;i<3;i++)
        {
            arr[i] = new Employee();
            String name = sc.next();
            int sal = sc.nextInt();
            String dj = sc.next();
            arr[i].SetData(name, sal, dj);
            
            
        }
        for(int j = 0;j<3;j++)
        {
            arr[j].display();
            System.out.println();
        }
    }
    
}
