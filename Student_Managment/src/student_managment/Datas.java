
package student_managment;

/**
 *
 * @author Sovuthyna
 */
public class Datas {

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
     * @return the years
     */
    public String getYears() {
        return years;
    }

    /**
     * @param years the years to set
     */
    public void setYears(String years) {
        this.years = years;
    }

    /**
     * @return the payment_for
     */
    public String getPayment_for() {
        return payment_for;
    }

    /**
     * @param payment_for the payment_for to set
     */
    public void setPayment_for(String payment_for) {
        this.payment_for = payment_for;
    }

    /**
     * @return the discount
     */
    public String getDiscount() {
        return discount;
    }

    /**
     * @param discount the discount to set
     */
    public void setDiscount(String discount) {
        this.discount = discount;
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
     * @return the tax
     */
    public String getTax() {
        return tax;
    }

    /**
     * @param tax the tax to set
     */
    public void setTax(String tax) {
        this.tax = tax;
    }

    /**
     * @return the total_usd
     */
    public String getTotal_usd() {
        return total_usd;
    }

    /**
     * @param total_usd the total_usd to set
     */
    public void setTotal_usd(String total_usd) {
        this.total_usd = total_usd;
    }

    /**
     * @return the total_khr
     */
    public String getTotal_khr() {
        return total_khr;
    }

    /**
     * @param total_khr the total_khr to set
     */
    public void setTotal_khr(String total_khr) {
        this.total_khr = total_khr;
    }
    
    private String fname,lname,years,payment_for,discount,amount,tax,total_usd,total_khr;

    public Datas() {
    }

    public Datas(String fname, String lname, String years, String payment_for, String discount, String amount, String tax, String total_usd, String total_khr) {
        this.fname = fname;
        this.lname = lname;
        this.years = years;
        this.payment_for = payment_for;
        this.discount = discount;
        this.amount = amount;
        this.tax = tax;
        this.total_usd = total_usd;
        this.total_khr = total_khr;
    }
    
}
