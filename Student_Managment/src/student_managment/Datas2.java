
package student_managment;

/**
 *
 * @author Sovuthyna
 */
public class Datas2 {

    /**
     * @return the payID
     */
    public String getPayID() {
        return payID;
    }

    /**
     * @param payID the payID to set
     */
    public void setPayID(String payID) {
        this.payID = payID;
    }

    /**
     * @return the stID
     */
    public String getStID() {
        return stID;
    }

    /**
     * @param stID the stID to set
     */
    public void setStID(String stID) {
        this.stID = stID;
    }

    /**
     * @return the fname
     */
    public String getFname() {
        return fname;
    }

    /**
     * @param fname the fname to set
     */
    public void setFname(String fname) {
        this.fname = fname;
    }

    /**
     * @return the lname
     */
    public String getLname() {
        return lname;
    }

    /**
     * @param lname the lname to set
     */
    public void setLname(String lname) {
        this.lname = lname;
    }

    /**
     * @return the f_year
     */
    public String getF_year() {
        return f_year;
    }

    /**
     * @param f_year the f_year to set
     */
    public void setF_year(String f_year) {
        this.f_year = f_year;
    }

    /**
     * @return the p_for
     */
    public String getP_for() {
        return p_for;
    }

    /**
     * @param p_for the p_for to set
     */
    public void setP_for(String p_for) {
        this.p_for = p_for;
    }

    /**
     * @return the pay_date
     */
    public String getPay_date() {
        return pay_date;
    }

    /**
     * @param pay_date the pay_date to set
     */
    public void setPay_date(String pay_date) {
        this.pay_date = pay_date;
    }

    /**
     * @return the dsc
     */
    public String getDsc() {
        return dsc;
    }

    /**
     * @param dsc the dsc to set
     */
    public void setDsc(String dsc) {
        this.dsc = dsc;
    }

    /**
     * @return the amount
     */
    public String getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }

    /**
     * @return the tx
     */
    public String getTx() {
        return tx;
    }

    /**
     * @param tx the tx to set
     */
    public void setTx(String tx) {
        this.tx = tx;
    }

    /**
     * @return the t_usd
     */
    public String getT_usd() {
        return t_usd;
    }

    /**
     * @param t_usd the t_usd to set
     */
    public void setT_usd(String t_usd) {
        this.t_usd = t_usd;
    }

    /**
     * @return the t_kh
     */
    public String getT_kh() {
        return t_kh;
    }

    /**
     * @param t_kh the t_kh to set
     */
    public void setT_kh(String t_kh) {
        this.t_kh = t_kh;
    }

    public Datas2() {
    }

    public Datas2(String payID, String stID, String fname, String lname, String f_year, String p_for, String pay_date, String dsc, String amount, String tx, String t_usd, String t_kh) {
        this.payID = payID;
        this.stID = stID;
        this.fname = fname;
        this.lname = lname;
        this.f_year = f_year;
        this.p_for = p_for;
        this.pay_date = pay_date;
        this.dsc = dsc;
        this.amount = amount;
        this.tx = tx;
        this.t_usd = t_usd;
        this.t_kh = t_kh;
    }
    private String payID,stID,fname,lname,f_year,p_for,pay_date,dsc,amount,tx,t_usd,t_kh;
}
