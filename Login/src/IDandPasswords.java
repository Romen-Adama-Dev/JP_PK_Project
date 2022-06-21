import java.util.HashMap;
/*
    This is the Hashmap destined to save all the passwords and users login data
 */
public final class IDandPasswords {
    /*
    logininfo = info about students
    loginadmin = info about admins
    logateach = info about teachers
     */
    HashMap<String,String> logininfo = new HashMap<String,String>();
    HashMap<String,String> logadmin = new HashMap<String,String>();
    HashMap<String,String> logateach = new HashMap<String,String>();

    IDandPasswords(){

        logininfo.put("r.caetano@student.pk.edu.pl","1234");
        logininfo.put("Kazimierz","PASSWORD");
        logininfo.put("test","test");
        logadmin.put("admin","admin");
        logateach.put("Kazimierz","Kazimierz");
    }

    public HashMap getLoginInfo(){
        return logininfo;
    }
    public HashMap getLogAdmin(){
        return logadmin;
    }
    public HashMap getTeachers(){return logateach; }
}
/*
    @author
    Romen Adama Caetano Ramirez
    Date: 17/01/2022
 */