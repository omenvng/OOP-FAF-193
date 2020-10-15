import java.util.ArrayList;

public class University  {

    protected class UniversityData {
        int FondYear;
        String university_name;
        ArrayList<Student> student_list = new ArrayList<Student>(0);
    }

    private UniversityData uniData = new UniversityData();

    public  University(int _year, String _name)
    {
        uniData.FondYear = _year;
        uniData.university_name = _name;
    }
    public void updateYear(int _age){
        uniData.FondYear = _age;
    }
    public void updateName(String _name){
        uniData.university_name = _name;
    }
    
    
    public void setStudent(Student _student){
        uniData.student_list.add(_student);
    }
    public ArrayList<Student> getStudents(){
        return uniData.student_list;
    }
    public UniversityData getData() {
        return uniData;
    }

    public double getAverageMark(){
        double sum = 0.f;
        for (Student student : uniData.student_list) sum += student.getStudentData().mark;
        return sum/uniData.student_list.size();
    }
}
