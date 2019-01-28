package studentacc;

public class StudentInfo {
    String university;
    String college;
    String term;
    String sy;
    private String id;
    private String famname;
    private String firname;
    private String acadprog;
    private String track;
    
    public StudentInfo(String college, String term, String sy)
    {
        this.university = ("University of the Cordilleras");
        this.college = college;
        this.term = term;
        this.sy = sy;
    }
    public void printmethod(){
        System.out.println(university);
        System.out.println(college);
        System.out.println(term+", S.Y. "+sy);
        System.out.println("Student Info:");
        System.out.println("ID NUM: "+id);
        System.out.println("NAME: "+famname+ ", "+firname);
        System.out.println("Academic Program: "+acadprog+" -"+track);
    }
    public void setid(String id){
        this.id = id;
    }
    public String getid(){
        return this.id;
    }
    public void setfamname(String famname){
        this.famname = famname;
    }
    public String getfamname(){
        return this.famname;
    }
    public void setfirname(String firname){
        this.firname = firname;
    }
    public String getfirname(){
        return this.firname;
    }
    public void setacadprog(String acadprog){
        this.acadprog = acadprog;
    }
    public String getacadprog(){
        return this.acadprog;
    }
    public void settrack(String track){
        this.track = track;
    }
    public String gettrack(){
        return this.track;
    }
}
