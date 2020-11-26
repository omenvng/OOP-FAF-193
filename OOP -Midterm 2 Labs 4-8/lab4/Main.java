import java.util.Scanner;  
import java.io.FileInputStream;
import java.io.FileNotFoundException; 

class Main {

    public static void main(String[] Args) throws FileNotFoundException
    {
        Eval Solver  = new Eval();

        // Some basic examples 
        Solver.Result("1+ (3-2*3) - (3)");
        Solver.Check("1+2*3");
        Solver.Result("1+1+(3");
        Solver.Check("1+1+(3)*3");

        FileInputStream fis= new FileInputStream("Demo.txt");       
        Scanner sc=new Scanner(fis);    

        while(sc.hasNextLine())  
        {  
            String line = sc.nextLine(); //get line
            //  System.out.println(line);
            // Solver.Check(line);   // Check for validity (only) (may be commented)
            Solver.Result(line); // Get the result and check for validity 
        }
        sc.close();     //closes the scanner  
    }
}
