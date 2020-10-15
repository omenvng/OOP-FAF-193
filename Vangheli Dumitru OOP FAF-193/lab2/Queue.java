import java.util.ArrayList;

public class Queue {
    
    private int max_size = -1;
    private ArrayList<Object> queue_list = new ArrayList<Object>(0);

    public Queue(){
    }

    public Queue(int _size){
        this.max_size = _size;
    }

    public boolean push(Object _data){
        if (max_size > -1 && this.queue_list.size() <= this.max_size)
            this.queue_list.add(_data);
        else if (max_size > -1)
            return false;
        else 
            this.queue_list.add(_data);
        return true;
    }

    public Object pop() {
        if (this.queue_list.size() == 0)
            return null;
        Object temp = this.queue_list.get(0);
        this.queue_list.remove(0);
        return temp;
    }
}
