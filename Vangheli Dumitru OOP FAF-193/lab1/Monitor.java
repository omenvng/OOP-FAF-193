public class Monitor {

    public class Resolution {
        int x, y;
    }

    public class Dimension {
        int a,b;
    }

    public class Beauty {
        String color;
    }

    private Resolution res = new Resolution();
    private Dimension dim = new Dimension();
    private Beauty col = new Beauty();


    public Monitor(int res_X, int res_Y, int dim_A, int dim_B, String col_n) {
        res.x = res_X;
        res.y = res_Y; 
        dim.a = dim_A;
        dim.b = dim_B;
        col.color = col_n;
    }

    public void updateColor(String _col){
        col.color = _col;
    }

    public void updateDimension(int _a, int _b){
        dim.a = _a;
        dim.b = _b;
    }

    public void updateResolution(int _x, int _y){
        res.x = _x;
        res.y = _y;
    }

    public String getColor(){
        
        if (col.color.isEmpty()){
            System.out.println("String Color is empty!");
        }
        return col.color;
    }

    public Dimension getDimension(){
        return dim;
}
    public Resolution getResolution(){
        
        return res;
    }

}
 