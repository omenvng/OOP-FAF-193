
public class Student {

    protected class StudentData {
        int age;
        double mark;
        String name;
    }

   private StudentData data = new StudentData();

    public Student(String _name, int _age, double _mark){
        data.age = _age;
        data.name = _name; 
        data.mark = _mark;
    }
    
    public StudentData  getStudentData() {
        return data;
    }

    public void updateAge(int _age){
        data.age = _age;
    }

    public void updateMark(int _mark){
        data.mark = _mark;
    }
    
    public void updateAge(String _name){
        data.name = _name;
    }
}
