
package student_managment;

import java.awt.Cursor;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.ThreadLocalRandom;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

/**
 *
 * @author Minea
 */
public final class Forgot_Password extends javax.swing.JFrame {
    /**
     * Creates new form Forgot_Password
     */
    public Forgot_Password() {
        initComponents();
        SetIcons objs = new SetIcons();
        objs.SetIcons(this);
    }
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    String sql;
    private int RandomCode;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_next = new javax.swing.JButton();
        btn_close = new javax.swing.JButton();
        txt_dob = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 204));
        jLabel1.setText("Forgot Password");

        txt_email.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("Email");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setText("Birth Date");

        btn_next.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btn_next.setText("Next");
        btn_next.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nextActionPerformed(evt);
            }
        });

        btn_close.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btn_close.setText("Back");
        btn_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_closeActionPerformed(evt);
            }
        });

        txt_dob.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Please input your information of email and birth date here,");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel2)
                        .addGap(58, 58, 58)
                        .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(160, 160, 160)
                            .addComponent(btn_next, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_close, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(63, 63, 63)
                            .addComponent(jLabel3)
                            .addGap(27, 27, 27)
                            .addComponent(txt_dob, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addComponent(jLabel4)
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2))
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_dob, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_next, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_close, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nextActionPerformed
        if(txt_email.getText().isEmpty()){
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Please input your Register Email","Message",JOptionPane.WARNING_MESSAGE);
            txt_email.requestFocus();
        }else if(txt_email.getText().trim().equals("N.A") || txt_email.getText().trim().equals("n.a")){
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Incorect Email","Message",JOptionPane.WARNING_MESSAGE);
            txt_email.setText("");
        }else if(txt_dob.getDate()==null){
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Please input your Register Birth Date","Message",JOptionPane.WARNING_MESSAGE);
            txt_dob.requestFocus();
        }else{
            con=ConDB.getConnection();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String date = sdf.format(txt_dob.getDate());
            String email = txt_email.getText().trim();
            
                try {
                    sql="Select user_email from tbl_user where user_email='"+email+"'";
                    pst=con.prepareStatement(sql);
                    rs=pst.executeQuery();
                    
                    if(rs.next()){
                        sql="Select birth_date from tbl_user where birth_date='"+date+"'";
                        pst=con.prepareStatement(sql);
                        rs=pst.executeQuery();
                            if(rs.next()){
                                
                                SimpleDateFormat sdfs = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
                                Date dt = new Date();
                                String s = sdfs.format(dt);
                                RandomCode = ThreadLocalRandom.current().nextInt(100000, 999999);
                                String sqls="INSERT INTO tbl_forgot_pass(digital_code,expire_date_time) VALUES("+RandomCode+",'"+s+"')";
                                try {
                                    Statement st=con.createStatement();
                                    st.executeUpdate(sqls);
                                    
                                } catch (SQLException e) {
                                    JOptionPane.showMessageDialog(null, e);   
                                } 
                                try {
                                    btn_next.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
                                    sendMail(txt_email.getText().trim());
                                    this.dispose();
                                    Confirm cnf = new Confirm();
                                    cnf.setVisible(true);
                                    dataCon();
                                } catch (Exception e) {
                                    JOptionPane.showMessageDialog(null, e);
                                }finally{
                                    btn_next.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
                                }
                            }else{
                                Toolkit.getDefaultToolkit().beep();
                                JOptionPane.showMessageDialog(null, "Birth Date is not avilble...","Message",JOptionPane.WARNING_MESSAGE);
                                txt_dob.requestFocus();
                            }
                    }else{
                        Toolkit.getDefaultToolkit().beep();
                        JOptionPane.showMessageDialog(null, "Email is not avilable...","Message",JOptionPane.WARNING_MESSAGE);
                        txt_email.requestFocus();
                    }
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, e);
                }
        }
    }//GEN-LAST:event_btn_nextActionPerformed

    private void btn_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_closeActionPerformed
        this.dispose();
        Login_form lg = new Login_form();
        lg.setVisible(true);
    }//GEN-LAST:event_btn_closeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Forgot_Password().setVisible(true);
            }
        });
    }
    /////////////
        public void sendMail(String recepient) throws Exception {
        //System.out.println("Preparing to send email");
        Properties properties = new Properties();

        //Enable authentication
        properties.put("mail.smtp.auth", "true");
        //Set TLS encryption enabled
        properties.put("mail.smtp.starttls.enable", "true");
        //Set SMTP host
        properties.put("mail.smtp.host", "smtp.gmail.com");
        //Set smtp port
        properties.put("mail.smtp.port", "587");

        //Your gmail address
        String myAccountEmail = "itcambodia321@gmail.com";
        //Your gmail password
        String password="Khmer2021";        

        //Create a session with account credentials
        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(myAccountEmail, password);
            }
        });

        //Prepare email message
        Message message = prepareMessage(session, myAccountEmail, recepient);

        //Send mail
        Transport.send(message);
        //System.out.println("Message sent successfully");
    }
    private Message prepareMessage(Session session, String myAccountEmail, String recepient) {
        try {
            //// get value from forgot password
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(myAccountEmail));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepient));
            message.setSubject("Student Management System");
            String htmlCode = "<h5>User Account</h5><br><h3 style='color:blue;'>Password reset code</h3><br><p>Please use this code to reset the password for the Student Management System user account.<br>Here is your code: <b>"+RandomCode+"</b><br><br>Thanks,<br>From System Admin</p>";
            message.setContent(htmlCode, "text/html");
            return message;
        } catch (MessagingException ex) {
           JOptionPane.showMessageDialog(null, ex,"Message",JOptionPane.WARNING_MESSAGE);
        }
        return null;
    } 
    
    @SuppressWarnings("empty-statement")
    private Collection dataCon(){
        SimpleDateFormat sdfk = new SimpleDateFormat("yyyy-MM-dd");
        String khs= sdfk.format(txt_dob.getDate());;
        
        ArrayList<Datas4> arr = new ArrayList<>();
        String Emails=""+txt_email.getText().trim();
        String Dobs=""+khs;
        
        Datas4 sd = new Datas4(Emails, Dobs);
        arr.add(sd);
        return arr;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_close;
    private javax.swing.JButton btn_next;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    public static com.toedter.calendar.JDateChooser txt_dob;
    public static javax.swing.JTextField txt_email;
    // End of variables declaration//GEN-END:variables
}
