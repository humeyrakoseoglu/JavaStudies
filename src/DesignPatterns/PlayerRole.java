package DesignPatterns;

public class PlayerRole {
    public static void main(String[] args) {
        Student ali = new Student();
        ali.attendanceRole = new FullTimeStudent();
        ali.attendanceRole.absentDays = 150;
        System.out.println("Ali devamsizliktan kaldi mi? : "+ ali.attendanceRole.attendance());
        ali.attendanceRole = new PartTimeStudent();
        ali.attendanceRole.absentDays = 150;
        System.out.println("Ali devamsizliktan kaldi mi? : "+ ali.attendanceRole.attendance());

        ali.averagePoint = 2.50;
        ali.educationRole = new UndergraduateStudent();
        System.out.println("Ali mezun olabilir mi? : " + ali.educationRole.graduate( ali.averagePoint));
        ali.averagePoint = 2.50;
        ali.educationRole = new GraduateStudent();
        System.out.println("Ali mezun olabilir mi? : " + ali.educationRole.graduate( ali.averagePoint));
    }
}

abstract class AttendanceRole {
    public abstract boolean attendance();
    int absentDays;//devamsizlik gunleri
}
class FullTimeStudent extends AttendanceRole { // 100den uzeri devamsziliktan kalir
    @Override
    public boolean attendance() {
        if(absentDays >100) return true;
        return false;
    }
}

class PartTimeStudent extends AttendanceRole { // gun sayisina bakmadan devam
    @Override
    public boolean attendance() {
        return false;
    }
}

class Student {
    String name;
    AttendanceRole attendanceRole;
    double averagePoint;
    LevelRole educationRole;
}

abstract class LevelRole {
    public abstract boolean graduate(double not);
}

class UndergraduateStudent extends LevelRole {
    @Override
    public boolean graduate(double point) {
        if(point>2) return true;
        return false;
    }
}

class GraduateStudent extends LevelRole {
    @Override
    public boolean graduate(double point) {
        if(point>3) return true;
        return false;
    }
}