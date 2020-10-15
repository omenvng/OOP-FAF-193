public class Main {

    public static void main(String[] Args)
    {
        
        Box box1 = new Box();
        Box box2 = new Box(4);
        Box box3 = new Box(2,3,4);

        System.out.println("Surface of box3 is " + box3.getSurface() + " and volume is "+ box3.getVolume());
        System.out.println("Surface of box2 is " + box2.getSurface() + " and volume is "+ box2.getVolume());
        System.out.println("Surface of box1 is " + box1.getSurface() + " and volume is "+ box1.getVolume());

        Queue   q1 = new Queue();
        Queue   q2 = new Queue(4);

        for(int i = 0; i < 10; i++){
            q1.push(i);
        }
        for(int i = 0; i < 10; i++){
            System.out.println(q1.pop());
        }
        System.out.print('\n');
        for(int i = 0; i < 6; i++){
            if(!q2.push(i))
                System.out.println("This queue doesn't fill so much numbers in it!");
        }
        for(int i = 0; i < 6; i++){
            Object temp = q2.pop();
            if(temp != null)
                System.out.println(temp);
            else 
                System.out.print("Empty queues matters!");
        }
    }
    
}
