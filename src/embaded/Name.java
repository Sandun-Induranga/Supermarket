package embaded;

import javax.persistence.Embeddable;

@Embeddable
public class Name {
    private String fName;
    private String sName;
    private String lName;

    public Name(String fName, String sName, String lName) {
        this.fName = fName;
        this.sName = sName;
        this.lName = lName;
    }

    public Name() {
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }
}
