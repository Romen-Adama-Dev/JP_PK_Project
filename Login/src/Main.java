public class Main {

    /*
    This project that I designed, is using some of the knowledge adquirided on the Java PK subject.
    I decided to used HashMaps and super class, to developt a prototiped loggin page for the final project.
     */
    public static void main(String[] args) {

        IDandPasswords idandPasswords = new IDandPasswords();

        LoginPage loginPage = new LoginPage(idandPasswords.getLogAdmin());
        LoginPageS loginPageS = new LoginPageS(idandPasswords.getLoginInfo());
        LoginPageT loginPageT = new LoginPageT(idandPasswords.getTeachers());

    }
}
/*
    @author
    Romen Adama Caetano Ramirez
    Date: 17/01/2022
 */