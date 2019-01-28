
package studentacc;

public class StudentAcc {

 
    public static void main(String[] args) {
        StudentInfo Bhrent = new StudentInfo("College of Information Technology and Computer Science","2nd Term","2018 - 2019");
        Bhrent.university = "Saint Louis University";
        Bhrent.setid("18-6123-757");
        Bhrent.setfamname("Caliging");
        Bhrent.setfirname("Bhrent");
        Bhrent.setacadprog("BSIT");
        Bhrent.settrack(" Web Tech");
        Bhrent.printmethod();
        System.out.println();
        
        StudentInfo Tito = new StudentInfo("College of Information Technology and Computer Science","2nd Term","2018 - 2019");
        Tito.setid("18-5828-879");
        Tito.setfamname("Badang");
        Tito.setfirname("Christian");
        Tito.setacadprog("BSIT");
        Tito.settrack(" Web Tech");
        Tito.printmethod();
        System.out.println();
    }
       
    
}
