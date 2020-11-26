public class Eval {
    
    private int result;
    private String Exp;
    private int ValidExpression = -1;
    private int iterator = 0;

    private void Change(String Expr) {
        this.result = 0;
        this.iterator = 0;
        this.ValidExpression = -1;

        this.Exp = Expr.replaceAll("\\s+", "");

        int countf = this.Exp.length() - this.Exp.replace("(", "").length();
        int counts = this.Exp.length() - this.Exp.replace(")", "").length();
        this.ValidExpression = countf-counts;
    }

    private int Suma() {

        int result = this.Produs();

        while (this.iterator < this.Exp.length() )
        {
            if (this.Exp.charAt(this.iterator) == '+')
            {
                this.iterator++;
                result += this.Produs();
            }
           else if (this.Exp.charAt(this.iterator) == '-')
            { 
                this.iterator++;
                result -= this.Produs();
            }
            else break;
        }

        return result;

    }
    private int Produs(){
        int result = this.Termen();
        while (this.iterator < this.Exp.length() )
        {
            if (this.Exp.charAt(this.iterator) == '*')
            {
                this.iterator++;
                result *= this.Termen(); 
            }
           else if (this.Exp.charAt(this.iterator) == '/')
           {
                this.iterator++;
                result /= this.Termen(); 
            }  
           else break;
        }
        return result;
    }

    private int Termen(){
        int result1 = 0;
        if (this.Exp.charAt(this.iterator) == '(')
        {
            this.iterator++;
            result1 = this.Suma();
            this.iterator++;
        }
        
        while (this.iterator < this.Exp.length() && this.Exp.charAt(this.iterator) <= '9' && this.Exp.charAt(this.iterator) >= '0' )
        {
            Character temp = this.Exp.charAt(this.iterator);
            result1 = result1 * 10 + (temp - '0');
            this.iterator++;
        }
        return result1;
    }

    //Solve method
    public int Result() {
        if (Check())
            return -1;
        this.result = this.Suma();

        System.out.println(this.result);

        return this.result;
    }
    public int Result(String Expression) {
        this.Change(Expression);
        if (Check())
            return -1;

        this.result = this.Suma();

        System.out.println(this.result);

        return this.result;
    }

    // Helpful methods for constructors
    public boolean Check() {
        if (this.ValidExpression != 0)
            System.out.println("Well the string is wrong or missing, master!");
        else 
            System.out.println("Nice String Bro!"); 
        return (this.ValidExpression != 0);
    }
    public boolean Check(String Expression) {
        this.Change(Expression);

        if (this.ValidExpression != 0)
            System.out.println("Well the string is wrong, master!");
        else 
            System.out.println("Nice String Bro!");
        return (this.ValidExpression != 0);
    }

    //Constructors
    public Eval(String Expresion){
        this.Change(Expresion);
    }
    public Eval(){
    }
}
