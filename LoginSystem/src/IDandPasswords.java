import java.util.HashMap;

public class IDandPasswords {

    HashMap<String, String> logininfo = new HashMap<String, String>();

    IDandPasswords() {
        logininfo.put("Cxiy","Admin");
        logininfo.put("Turtle","Retard");
        logininfo.put("Test","Test");
    }

    protected HashMap getLoginInfo() {
        return logininfo;
    }
}
