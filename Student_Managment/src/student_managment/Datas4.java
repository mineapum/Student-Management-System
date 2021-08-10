
package student_managment;

/**
 *
 * @author Sovuthyna
 */
public class Datas4 {

    /**
     * @return the Emails
     */
    public String getEmails() {
        return Emails;
    }

    /**
     * @param Emails the Emails to set
     */
    public void setEmails(String Emails) {
        this.Emails = Emails;
    }

    /**
     * @return the Dobs
     */
    public String getDobs() {
        return Dobs;
    }

    /**
     * @param Dobs the Dobs to set
     */
    public void setDobs(String Dobs) {
        this.Dobs = Dobs;
    }

    public Datas4() {
    }

    public Datas4(String Emails, String Dobs) {
        this.Emails = Emails;
        this.Dobs = Dobs;
    }
    private String Emails,Dobs;
}
