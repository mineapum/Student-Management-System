
package student_managment;

/**
 *
 * @author Minea
 */
public class Datas3 {

    /**
     * @return the scoreid
     */
    public String getScoreid() {
        return scoreid;
    }

    /**
     * @param scoreid the scoreid to set
     */
    public void setScoreid(String scoreid) {
        this.scoreid = scoreid;
    }

    /**
     * @return the studentid
     */
    public String getStudentid() {
        return studentid;
    }

    /**
     * @param studentid the studentid to set
     */
    public void setStudentid(String studentid) {
        this.studentid = studentid;
    }

    /**
     * @return the subjectid
     */
    public String getSubjectid() {
        return subjectid;
    }

    /**
     * @param subjectid the subjectid to set
     */
    public void setSubjectid(String subjectid) {
        this.subjectid = subjectid;
    }

    /**
     * @return the quiz
     */
    public String getQuiz() {
        return quiz;
    }

    /**
     * @param quiz the quiz to set
     */
    public void setQuiz(String quiz) {
        this.quiz = quiz;
    }

    /**
     * @return the attenden
     */
    public String getAttenden() {
        return attenden;
    }

    /**
     * @param attenden the attenden to set
     */
    public void setAttenden(String attenden) {
        this.attenden = attenden;
    }

    /**
     * @return the midterm
     */
    public String getMidterm() {
        return midterm;
    }

    /**
     * @param midterm the midterm to set
     */
    public void setMidterm(String midterm) {
        this.midterm = midterm;
    }

    /**
     * @return the assigment
     */
    public String getAssigment() {
        return assigment;
    }

    /**
     * @param assigment the assigment to set
     */
    public void setAssigment(String assigment) {
        this.assigment = assigment;
    }

    /**
     * @return the finals
     */
    public String getFinals() {
        return finals;
    }

    /**
     * @param finals the finals to set
     */
    public void setFinals(String finals) {
        this.finals = finals;
    }

    /**
     * @return the total
     */
    public String getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(String total) {
        this.total = total;
    }

    /**
     * @return the formonth
     */
    public String getFormonth() {
        return formonth;
    }

    /**
     * @param formonth the formonth to set
     */
    public void setFormonth(String formonth) {
        this.formonth = formonth;
    }

    public Datas3() {
    }

    public Datas3(String scoreid, String studentid, String subjectid, String quiz, String attenden, String midterm, String assigment, String finals, String total, String formonth) {
        this.scoreid = scoreid;
        this.studentid = studentid;
        this.subjectid = subjectid;
        this.quiz = quiz;
        this.attenden = attenden;
        this.midterm = midterm;
        this.assigment = assigment;
        this.finals = finals;
        this.total = total;
        this.formonth = formonth;
    }
    private String scoreid,studentid,subjectid,quiz,attenden,midterm,assigment,finals,total,formonth;
}
