public class Box {
    private int height;
    private int width;
    private int depth;

    public Box(){
        this.height = this.width =  this.depth = 1;
    }
    
    public Box(int _data)
    {
        this.height = this.width = this.depth = _data;
    }
    public Box(int _H, int _W, int _D)
    {
        this.height = _H;
        this.width = _W;
        this.depth = _D;
    }

    public double getSurface(){
        return 2.f * (  this.height * this.width +
                        this.width  * this.depth +
                        this.depth  * this.height  );
    }

    public double getVolume(){
        return this.height * this.width * this.depth;
    }

}