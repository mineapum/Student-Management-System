package student_managment;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;
import javax.swing.RowFilter;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Sovuthyna
 */
public final class Main_form extends javax.swing.JFrame {
    /**
     * Creates new form Main_form
     */
    public Main_form() {
        initComponents();
            SetIcons objs = new SetIcons();
            objs.SetIcons(this);
            objs.setTableHeaders(tbl_re_show);
            objs.setTableHeaders(jTable1_sc);
            objs.setTableHeaders(jTable1_ss);
            objs.setTableHeaders(JTable1_tc);
            objs.setTableHeaders(tbl_payment);
            objs.setTableHeaders(tbl_user_info);
            objs.setTableHeaders(tbl_payment_report);
            objs.setTableHeaders(tbl_score_report);
        }
    File f=null;
    Connection con;
    Statement stm;
    ResultSet rs;
    DefaultTableModel model,model2,model3,model4,model5,model6,model7,model8;

    @SuppressWarnings("unchecked")
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        lbl_user = new javax.swing.JLabel();
        lbl_clock = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lbl_logout = new javax.swing.JLabel();
        txt_user_id = new javax.swing.JTextField();
        lbl_user_level = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jp_home = new javax.swing.JPanel();
        lbl_home = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jp_register = new javax.swing.JPanel();
        lbl_register = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jpScore = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jpSubject = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jpTeacher = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jpResult = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jpPayment = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jpSetting = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jpAbout = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jpHelp = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanelHome = new javax.swing.JPanel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jPanelRegister = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_re_id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_re_firstname = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txt_re_lastname = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        cbo_re_gender = new javax.swing.JComboBox<>();
        jLabel37 = new javax.swing.JLabel();
        txt_re_dob = new com.toedter.calendar.JDateChooser();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        txt_re_batch = new javax.swing.JTextField();
        txt_re_email = new javax.swing.JTextField();
        txt_re_village = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        txt_re_commune = new javax.swing.JTextField();
        txt_re_district = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        lbl_re_photo = new javax.swing.JLabel();
        btn_re_browse = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_re_show = new javax.swing.JTable();
        btn_re_save = new javax.swing.JButton();
        btn_re_update = new javax.swing.JButton();
        btn_re_delete = new javax.swing.JButton();
        txt_re_search = new javax.swing.JTextField();
        txt_re_province = new javax.swing.JComboBox<>();
        txt_re_phone = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        txtPath = new javax.swing.JTextField();
        txt_exst = new javax.swing.JTextField();
        txt_f_name = new javax.swing.JTextField();
        fileID = new javax.swing.JTextField();
        jPanelScore = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txt_sc_quiz = new javax.swing.JTextField();
        txt_sc_attenden = new javax.swing.JTextField();
        txt_sc_total = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        txt_sc_midterm = new javax.swing.JTextField();
        txt_sc_assigment = new javax.swing.JTextField();
        txt_sc_final = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        cbo_sc_studentid = new javax.swing.JComboBox<>();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        cbo_sc_subjectid = new javax.swing.JComboBox<>();
        btn_sc_save = new javax.swing.JButton();
        btn_sc_update = new javax.swing.JButton();
        btn_sc_deleted = new javax.swing.JButton();
        btn_sc_new = new javax.swing.JButton();
        txt_sc_search = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1_sc = new javax.swing.JTable();
        txt_Sc_score = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jPanelSubject = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        txt_ss_subjectname = new javax.swing.JTextField();
        txt_ss_Description = new javax.swing.JTextField();
        btn_ss_save = new javax.swing.JButton();
        btn_ss_update = new javax.swing.JButton();
        btn_ss_deleted = new javax.swing.JButton();
        btn_ss_new = new javax.swing.JButton();
        cbo_ss_Teacherid = new javax.swing.JComboBox<>();
        txt_ss_Search = new javax.swing.JTextField();
        txt_ss_subjectid = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1_ss = new javax.swing.JTable();
        jSeparator5 = new javax.swing.JSeparator();
        jPanelTeacher = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        txt_tc_teachername = new javax.swing.JTextField();
        txt_tc_phonenumber = new javax.swing.JTextField();
        txt_tc_email = new javax.swing.JTextField();
        cbo_tc_gender = new javax.swing.JComboBox<>();
        dc_tc_dateofbirth = new com.toedter.calendar.JDateChooser();
        btn_tc_save = new javax.swing.JButton();
        btn_tc_update = new javax.swing.JButton();
        btn_tc_new = new javax.swing.JButton();
        btn_tc_delete = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        JTable1_tc = new javax.swing.JTable();
        txt_tc_search = new javax.swing.JTextField();
        txt_tc_teacherid = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jPanelResult = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        cbo_date_from = new com.toedter.calendar.JDateChooser();
        jLabel71 = new javax.swing.JLabel();
        cbo_date_to = new com.toedter.calendar.JDateChooser();
        jLabel72 = new javax.swing.JLabel();
        btn_find_report = new javax.swing.JButton();
        cbo_sort_pay = new javax.swing.JComboBox<>();
        btn_view_report = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        tbl_payment_report = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        btn_find_score = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        tbl_score_report = new javax.swing.JTable();
        btn_score_preview = new javax.swing.JButton();
        jLabel104 = new javax.swing.JLabel();
        cbo_date_from_sc = new com.toedter.calendar.JDateChooser();
        cbo_date_to_sc = new com.toedter.calendar.JDateChooser();
        jLabel105 = new javax.swing.JLabel();
        cbo_sort_sc = new javax.swing.JComboBox<>();
        cbo_sub_id = new javax.swing.JComboBox<>();
        jSeparator7 = new javax.swing.JSeparator();
        jPanelPayment = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        txt_pay_fname = new javax.swing.JTextField();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        txt_pay_lname = new javax.swing.JTextField();
        jLabel64 = new javax.swing.JLabel();
        cbo_payfor = new javax.swing.JComboBox<>();
        jLabel65 = new javax.swing.JLabel();
        cbo_pay_date = new com.toedter.calendar.JDateChooser();
        jLabel66 = new javax.swing.JLabel();
        cbo_pay_discount = new javax.swing.JComboBox<>();
        jLabel67 = new javax.swing.JLabel();
        txt_amount = new javax.swing.JTextField();
        txt_total_usd = new javax.swing.JTextField();
        jLabel68 = new javax.swing.JLabel();
        txt_total_kh = new javax.swing.JTextField();
        btn_pay_save = new javax.swing.JButton();
        btn_pay_delete = new javax.swing.JButton();
        btn_pay_new = new javax.swing.JButton();
        txt_pay_search = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbl_payment = new javax.swing.JTable();
        txt_pay_find = new javax.swing.JTextField();
        txt_pay_tax = new javax.swing.JTextField();
        jLabel69 = new javax.swing.JLabel();
        cbo_for_year = new javax.swing.JComboBox<>();
        jLabel70 = new javax.swing.JLabel();
        btn_pay_print = new javax.swing.JButton();
        txt_pay_id = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jPanelSetting = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel79 = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        jLabel80 = new javax.swing.JLabel();
        txt_user_password = new javax.swing.JPasswordField();
        cbo_status = new javax.swing.JComboBox<>();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        cbo_user_level = new javax.swing.JComboBox<>();
        jScrollPane9 = new javax.swing.JScrollPane();
        tbl_user_info = new javax.swing.JTable();
        btn_create = new javax.swing.JButton();
        btn_user_update = new javax.swing.JButton();
        btn_user_delete = new javax.swing.JButton();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        txt_study_price = new javax.swing.JTextField();
        txt_pay_taxs = new javax.swing.JTextField();
        txt_exchange_rate = new javax.swing.JTextField();
        btn_change = new javax.swing.JButton();
        txt_user_ids = new javax.swing.JTextField();
        jLabel106 = new javax.swing.JLabel();
        txt_user_password_re = new javax.swing.JPasswordField();
        jLabel107 = new javax.swing.JLabel();
        txt_user_email = new javax.swing.JTextField();
        jLabel108 = new javax.swing.JLabel();
        user_dob = new com.toedter.calendar.JDateChooser();
        txt_user_search = new javax.swing.JTextField();
        jPanelAbout = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTextPane3 = new javax.swing.JTextPane();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTextPane4 = new javax.swing.JTextPane();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        jTextPane5 = new javax.swing.JTextPane();
        jLabel103 = new javax.swing.JLabel();
        jPanelHelp = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jSeparator9 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Management System");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(0, 0, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1010, 650));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setForeground(new java.awt.Color(102, 102, 102));
        jPanel4.setMaximumSize(new java.awt.Dimension(1010, 650));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(new java.awt.Color(153, 204, 255));
        jPanel10.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(216, 237, 224));
        jPanel2.setForeground(new java.awt.Color(0, 102, 102));
        jPanel2.setPreferredSize(new java.awt.Dimension(1010, 52));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel31.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(51, 38, 130));
        jLabel31.setText("User Manager");
        jPanel2.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 0, 150, 52));

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user_groups_50px.png"))); // NOI18N
        jPanel2.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, -1, 52));

        lbl_user.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbl_user.setForeground(new java.awt.Color(51, 38, 130));
        lbl_user.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_user.setToolTipText("");
        jPanel2.add(lbl_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(742, 0, 98, 48));

        lbl_clock.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbl_clock.setForeground(new java.awt.Color(51, 51, 51));
        lbl_clock.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel2.add(lbl_clock, new org.netbeans.lib.awtextra.AbsoluteConstraints(461, 0, 237, 48));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/male_user_32px.png"))); // NOI18N
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(704, 0, -1, 48));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exit_20px.png"))); // NOI18N
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(979, 0, 30, 48));

        lbl_logout.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbl_logout.setForeground(new java.awt.Color(102, 102, 102));
        lbl_logout.setText("Log out");
        lbl_logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_logoutMouseClicked(evt);
            }
        });
        jPanel2.add(lbl_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(911, 0, 66, 48));

        txt_user_id.setBackground(new java.awt.Color(216, 237, 224));
        txt_user_id.setForeground(new java.awt.Color(216, 237, 224));
        txt_user_id.setBorder(null);
        txt_user_id.setCaretColor(new java.awt.Color(216, 237, 224));
        txt_user_id.setDisabledTextColor(new java.awt.Color(216, 237, 224));
        txt_user_id.setEnabled(false);
        jPanel2.add(txt_user_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 18, 49, -1));

        lbl_user_level.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbl_user_level.setForeground(new java.awt.Color(255, 51, 51));
        lbl_user_level.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel2.add(lbl_user_level, new org.netbeans.lib.awtextra.AbsoluteConstraints(846, 0, 55, 48));

        jPanel10.add(jPanel2);
        jPanel2.setBounds(0, 0, 1010, 52);

        jPanel4.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 60));

        jPanel3.setBackground(new java.awt.Color(231, 233, 235));

        jp_home.setBackground(new java.awt.Color(231, 233, 235));
        jp_home.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jp_home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jp_homeMouseClicked(evt);
            }
        });

        lbl_home.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_home.setText("Home");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home_25px.png"))); // NOI18N

        javax.swing.GroupLayout jp_homeLayout = new javax.swing.GroupLayout(jp_home);
        jp_home.setLayout(jp_homeLayout);
        jp_homeLayout.setHorizontalGroup(
            jp_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_homeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(lbl_home)
                .addContainerGap(108, Short.MAX_VALUE))
        );
        jp_homeLayout.setVerticalGroup(
            jp_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_homeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jp_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(lbl_home))
                .addContainerGap())
        );

        jp_register.setBackground(new java.awt.Color(231, 233, 235));
        jp_register.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jp_register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jp_registerMouseClicked(evt);
            }
        });

        lbl_register.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_register.setText("Register");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_registration_25px_2.png"))); // NOI18N

        javax.swing.GroupLayout jp_registerLayout = new javax.swing.GroupLayout(jp_register);
        jp_register.setLayout(jp_registerLayout);
        jp_registerLayout.setHorizontalGroup(
            jp_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_registerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(lbl_register)
                .addContainerGap(93, Short.MAX_VALUE))
        );
        jp_registerLayout.setVerticalGroup(
            jp_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_registerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jp_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(lbl_register))
                .addContainerGap())
        );

        jpScore.setBackground(new java.awt.Color(231, 233, 235));
        jpScore.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jpScore.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpScoreMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Score");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_scorecard_25px.png"))); // NOI18N

        javax.swing.GroupLayout jpScoreLayout = new javax.swing.GroupLayout(jpScore);
        jpScore.setLayout(jpScoreLayout);
        jpScoreLayout.setHorizontalGroup(
            jpScoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpScoreLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addContainerGap(113, Short.MAX_VALUE))
        );
        jpScoreLayout.setVerticalGroup(
            jpScoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpScoreLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpScoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addContainerGap())
        );

        jpSubject.setBackground(new java.awt.Color(231, 233, 235));
        jpSubject.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jpSubject.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpSubjectMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Subject");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_physics_book_25px.png"))); // NOI18N

        javax.swing.GroupLayout jpSubjectLayout = new javax.swing.GroupLayout(jpSubject);
        jpSubject.setLayout(jpSubjectLayout);
        jpSubjectLayout.setHorizontalGroup(
            jpSubjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpSubjectLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addContainerGap(99, Short.MAX_VALUE))
        );
        jpSubjectLayout.setVerticalGroup(
            jpSubjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpSubjectLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpSubjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addContainerGap())
        );

        jpTeacher.setBackground(new java.awt.Color(231, 233, 235));
        jpTeacher.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jpTeacher.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpTeacherMouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Teacher");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_user_shield_25px.png"))); // NOI18N

        javax.swing.GroupLayout jpTeacherLayout = new javax.swing.GroupLayout(jpTeacher);
        jpTeacher.setLayout(jpTeacherLayout);
        jpTeacherLayout.setHorizontalGroup(
            jpTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpTeacherLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addContainerGap(97, Short.MAX_VALUE))
        );
        jpTeacherLayout.setVerticalGroup(
            jpTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpTeacherLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9))
                .addContainerGap())
        );

        jpResult.setBackground(new java.awt.Color(231, 233, 235));
        jpResult.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jpResult.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpResultMouseClicked(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel21.setText("Result");

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_total_sales_25px.png"))); // NOI18N

        javax.swing.GroupLayout jpResultLayout = new javax.swing.GroupLayout(jpResult);
        jpResult.setLayout(jpResultLayout);
        jpResultLayout.setHorizontalGroup(
            jpResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpResultLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22)
                .addGap(18, 18, 18)
                .addComponent(jLabel21)
                .addContainerGap(109, Short.MAX_VALUE))
        );
        jpResultLayout.setVerticalGroup(
            jpResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpResultLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel22)
                    .addComponent(jLabel21))
                .addContainerGap())
        );

        jpPayment.setBackground(new java.awt.Color(231, 233, 235));
        jpPayment.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jpPayment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpPaymentMouseClicked(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel23.setText("Payment");

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_online_payment_25px.png"))); // NOI18N

        javax.swing.GroupLayout jpPaymentLayout = new javax.swing.GroupLayout(jpPayment);
        jpPayment.setLayout(jpPaymentLayout);
        jpPaymentLayout.setHorizontalGroup(
            jpPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPaymentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24)
                .addGap(18, 18, 18)
                .addComponent(jLabel23)
                .addContainerGap(88, Short.MAX_VALUE))
        );
        jpPaymentLayout.setVerticalGroup(
            jpPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPaymentLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jpSetting.setBackground(new java.awt.Color(231, 233, 235));
        jpSetting.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jpSetting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpSettingMouseClicked(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel25.setText("Settings");

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_settings_25px_1.png"))); // NOI18N

        javax.swing.GroupLayout jpSettingLayout = new javax.swing.GroupLayout(jpSetting);
        jpSetting.setLayout(jpSettingLayout);
        jpSettingLayout.setHorizontalGroup(
            jpSettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpSettingLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26)
                .addGap(18, 18, 18)
                .addComponent(jLabel25)
                .addContainerGap(93, Short.MAX_VALUE))
        );
        jpSettingLayout.setVerticalGroup(
            jpSettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpSettingLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpSettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel26)
                    .addComponent(jLabel25))
                .addContainerGap())
        );

        jpAbout.setBackground(new java.awt.Color(231, 233, 235));
        jpAbout.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jpAbout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpAboutMouseClicked(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel27.setText("About");

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_info_25px.png"))); // NOI18N

        javax.swing.GroupLayout jpAboutLayout = new javax.swing.GroupLayout(jpAbout);
        jpAbout.setLayout(jpAboutLayout);
        jpAboutLayout.setHorizontalGroup(
            jpAboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpAboutLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28)
                .addGap(18, 18, 18)
                .addComponent(jLabel27)
                .addContainerGap(107, Short.MAX_VALUE))
        );
        jpAboutLayout.setVerticalGroup(
            jpAboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpAboutLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpAboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel28)
                    .addComponent(jLabel27))
                .addContainerGap())
        );

        jpHelp.setBackground(new java.awt.Color(231, 233, 235));
        jpHelp.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jpHelp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpHelpMouseClicked(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel29.setText("Help");

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/help_25px.png"))); // NOI18N

        javax.swing.GroupLayout jpHelpLayout = new javax.swing.GroupLayout(jpHelp);
        jpHelp.setLayout(jpHelpLayout);
        jpHelpLayout.setHorizontalGroup(
            jpHelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpHelpLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel30)
                .addGap(18, 18, 18)
                .addComponent(jLabel29)
                .addContainerGap(120, Short.MAX_VALUE))
        );
        jpHelpLayout.setVerticalGroup(
            jpHelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpHelpLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpHelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel30)
                    .addComponent(jLabel29))
                .addContainerGap())
        );

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setText("System Version 1.0");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_home, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jp_register, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jpScore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jpSubject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jpTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jpResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jpPayment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jpSetting, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jpAbout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jpHelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel13))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jp_home, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jp_register, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jpScore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jpSubject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jpTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jpResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jpPayment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jpSetting, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jpAbout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jpHelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addContainerGap())
        );

        jPanel4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 210, 590));

        jPanel7.setBackground(new java.awt.Color(255, 255, 0));
        jPanel7.setLayout(new java.awt.CardLayout());

        jPanelHome.setBackground(new java.awt.Color(255, 255, 255));
        jPanelHome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel74.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/x250.jpg"))); // NOI18N
        jPanelHome.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 107, -1, -1));

        jLabel75.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(0, 102, 153));
        jLabel75.setText("Student Management System");
        jPanelHome.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 391, 321, -1));

        jLabel76.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(0, 102, 153));
        jLabel76.setText("WESTERN UNIVERSITY KAMPONG CHAM");
        jPanelHome.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 363, 443, 22));

        jLabel77.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(0, 102, 153));
        jLabel77.setText("WELCOME");
        jPanelHome.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 45, -1, -1));

        jLabel73.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(51, 51, 51));
        jLabel73.setText("Copyright 2021 - Western IT Developer. All Right Reserved");
        jPanelHome.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 426, -1, -1));

        jPanel7.add(jPanelHome, "card2");

        jPanelRegister.setBackground(new java.awt.Color(241, 241, 241));
        jPanelRegister.setMaximumSize(null);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Student Registration ");

        txt_re_id.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setText("Student ID");

        txt_re_firstname.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, txt_re_lastname, org.jdesktop.beansbinding.ObjectProperty.create(), txt_re_firstname, org.jdesktop.beansbinding.BeanProperty.create("nextFocusableComponent"));
        bindingGroup.addBinding(binding);

        txt_re_firstname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_re_firstnameKeyTyped(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel14.setText("First Name");

        txt_re_lastname.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, cbo_re_gender, org.jdesktop.beansbinding.ObjectProperty.create(), txt_re_lastname, org.jdesktop.beansbinding.BeanProperty.create("nextFocusableComponent"));
        bindingGroup.addBinding(binding);

        txt_re_lastname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_re_lastnameKeyTyped(evt);
            }
        });

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel36.setText("Last Name");

        cbo_re_gender.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        cbo_re_gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, txt_re_dob, org.jdesktop.beansbinding.ObjectProperty.create(), cbo_re_gender, org.jdesktop.beansbinding.BeanProperty.create("nextFocusableComponent"));
        bindingGroup.addBinding(binding);

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel37.setText("Gender");

        txt_re_dob.setDateFormatString("yyyy-MM-dd");
        txt_re_dob.setDoubleBuffered(false);
        txt_re_dob.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, txt_re_batch, org.jdesktop.beansbinding.ObjectProperty.create(), txt_re_dob, org.jdesktop.beansbinding.BeanProperty.create("nextFocusableComponent"));
        bindingGroup.addBinding(binding);

        txt_re_dob.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_re_dobKeyPressed(evt);
            }
        });

        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel38.setText("Date Of Birth");

        jLabel39.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel39.setText("Batch");

        jLabel40.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel40.setText("Email");

        jLabel41.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel41.setText("Village");

        txt_re_batch.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, txt_re_phone, org.jdesktop.beansbinding.ObjectProperty.create(), txt_re_batch, org.jdesktop.beansbinding.BeanProperty.create("nextFocusableComponent"));
        bindingGroup.addBinding(binding);

        txt_re_batch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_re_batchKeyTyped(evt);
            }
        });

        txt_re_email.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, txt_re_village, org.jdesktop.beansbinding.ObjectProperty.create(), txt_re_email, org.jdesktop.beansbinding.BeanProperty.create("nextFocusableComponent"));
        bindingGroup.addBinding(binding);

        txt_re_email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_re_emailFocusLost(evt);
            }
        });

        txt_re_village.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, txt_re_commune, org.jdesktop.beansbinding.ObjectProperty.create(), txt_re_village, org.jdesktop.beansbinding.BeanProperty.create("nextFocusableComponent"));
        bindingGroup.addBinding(binding);

        jLabel42.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel42.setText("Commune");

        txt_re_commune.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, txt_re_district, org.jdesktop.beansbinding.ObjectProperty.create(), txt_re_commune, org.jdesktop.beansbinding.BeanProperty.create("nextFocusableComponent"));
        bindingGroup.addBinding(binding);

        txt_re_district.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, txt_re_province, org.jdesktop.beansbinding.ObjectProperty.create(), txt_re_district, org.jdesktop.beansbinding.BeanProperty.create("nextFocusableComponent"));
        bindingGroup.addBinding(binding);

        jLabel43.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel43.setText("District");

        jLabel44.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel44.setText("Province");

        lbl_re_photo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_re_photo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_re_photo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        btn_re_browse.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_re_browse.setForeground(new java.awt.Color(0, 0, 102));
        btn_re_browse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/file_explorer_20px.png"))); // NOI18N
        btn_re_browse.setText("Browse");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, btn_re_save, org.jdesktop.beansbinding.ObjectProperty.create(), btn_re_browse, org.jdesktop.beansbinding.BeanProperty.create("nextFocusableComponent"));
        bindingGroup.addBinding(binding);

        btn_re_browse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_re_browseActionPerformed(evt);
            }
        });

        tbl_re_show.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        tbl_re_show.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tbl_re_show.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbl_re_show.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tbl_re_show.setFocusable(false);
        tbl_re_show.setGridColor(new java.awt.Color(204, 204, 204));
        tbl_re_show.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tbl_re_show.setName(""); // NOI18N
        tbl_re_show.setRowHeight(25);
        tbl_re_show.getTableHeader().setResizingAllowed(false);
        tbl_re_show.getTableHeader().setReorderingAllowed(false);
        tbl_re_show.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_re_showMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_re_show);

        btn_re_save.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btn_re_save.setForeground(new java.awt.Color(0, 0, 102));
        btn_re_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save_20px.png"))); // NOI18N
        btn_re_save.setText("Save");
        btn_re_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_re_saveActionPerformed(evt);
            }
        });

        btn_re_update.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btn_re_update.setForeground(new java.awt.Color(0, 0, 102));
        btn_re_update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/refresh_20px.png"))); // NOI18N
        btn_re_update.setText("Update");
        btn_re_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_re_updateActionPerformed(evt);
            }
        });

        btn_re_delete.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btn_re_delete.setForeground(new java.awt.Color(0, 0, 102));
        btn_re_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete_bin_20px.png"))); // NOI18N
        btn_re_delete.setText("Delete");
        btn_re_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_re_deleteActionPerformed(evt);
            }
        });

        txt_re_search.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txt_re_search.setForeground(new java.awt.Color(153, 153, 153));
        txt_re_search.setText("Search.Here...");
        txt_re_search.setToolTipText("");
        txt_re_search.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_re_searchFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_re_searchFocusLost(evt);
            }
        });
        txt_re_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_re_searchKeyReleased(evt);
            }
        });

        txt_re_province.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, btn_re_browse, org.jdesktop.beansbinding.ObjectProperty.create(), txt_re_province, org.jdesktop.beansbinding.BeanProperty.create("nextFocusableComponent"));
        bindingGroup.addBinding(binding);

        txt_re_phone.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, txt_re_email, org.jdesktop.beansbinding.ObjectProperty.create(), txt_re_phone, org.jdesktop.beansbinding.BeanProperty.create("nextFocusableComponent"));
        bindingGroup.addBinding(binding);

        txt_re_phone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_re_phoneKeyPressed(evt);
            }
        });

        jLabel45.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel45.setText("Phone");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 102));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add_20px.png"))); // NOI18N
        jButton1.setText("New");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtPath.setEditable(false);

        txt_exst.setEditable(false);

        txt_f_name.setEditable(false);

        fileID.setEditable(false);

        javax.swing.GroupLayout jPanelRegisterLayout = new javax.swing.GroupLayout(jPanelRegister);
        jPanelRegister.setLayout(jPanelRegisterLayout);
        jPanelRegisterLayout.setHorizontalGroup(
            jPanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRegisterLayout.createSequentialGroup()
                .addGroup(jPanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelRegisterLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanelRegisterLayout.createSequentialGroup()
                        .addGroup(jPanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelRegisterLayout.createSequentialGroup()
                                .addGroup(jPanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelRegisterLayout.createSequentialGroup()
                                        .addGap(64, 64, 64)
                                        .addComponent(jLabel39)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt_re_batch, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelRegisterLayout.createSequentialGroup()
                                        .addGroup(jPanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanelRegisterLayout.createSequentialGroup()
                                                .addGap(26, 26, 26)
                                                .addGroup(jPanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel3)
                                                    .addComponent(jLabel14)
                                                    .addComponent(jLabel36)
                                                    .addComponent(jLabel37)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelRegisterLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel38)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txt_re_lastname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cbo_re_gender, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_re_firstname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_re_dob, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_re_id, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(25, 25, 25)
                                .addGroup(jPanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel45)
                                    .addComponent(jLabel40)
                                    .addComponent(jLabel41)
                                    .addComponent(jLabel42)
                                    .addComponent(jLabel43)
                                    .addComponent(jLabel44)))
                            .addGroup(jPanelRegisterLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btn_re_save)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_re_update, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_re_delete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addGroup(jPanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelRegisterLayout.createSequentialGroup()
                                .addGroup(jPanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_re_village, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_re_email, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_re_phone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_re_province, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_re_district, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_re_commune, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_re_browse, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_re_photo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanelRegisterLayout.createSequentialGroup()
                                        .addComponent(txt_exst, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtPath, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_f_name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(txt_re_search))))
                .addContainerGap())
            .addGroup(jPanelRegisterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRegisterLayout.createSequentialGroup()
                        .addComponent(fileID, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(282, 282, 282))
                    .addGroup(jPanelRegisterLayout.createSequentialGroup()
                        .addComponent(jSeparator3)
                        .addContainerGap())))
        );
        jPanelRegisterLayout.setVerticalGroup(
            jPanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRegisterLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fileID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(jPanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRegisterLayout.createSequentialGroup()
                        .addGroup(jPanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelRegisterLayout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(jPanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_re_email, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel40))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_re_village, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel41))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_re_commune, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel42)))
                            .addComponent(lbl_re_photo, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_re_district, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel43)
                            .addComponent(btn_re_browse, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_re_province, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_re_batch, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel44)
                            .addComponent(txtPath)
                            .addComponent(txt_exst)
                            .addComponent(txt_f_name)))
                    .addGroup(jPanelRegisterLayout.createSequentialGroup()
                        .addGroup(jPanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_re_id, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_re_firstname, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_re_lastname, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel36))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbo_re_gender, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel37))
                        .addGap(6, 6, 6)
                        .addGroup(jPanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_re_dob, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_re_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel45)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_re_search, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_re_save, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_re_update, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_re_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel7.add(jPanelRegister, "card3");

        jPanelScore.setBackground(new java.awt.Color(241, 241, 241));
        jPanelScore.setPreferredSize(new java.awt.Dimension(800, 590));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel15.setText("Student ID");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel16.setText("Quiz");

        txt_sc_quiz.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, txt_sc_attenden, org.jdesktop.beansbinding.ObjectProperty.create(), txt_sc_quiz, org.jdesktop.beansbinding.BeanProperty.create("nextFocusableComponent"));
        bindingGroup.addBinding(binding);

        txt_sc_quiz.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_sc_quizKeyTyped(evt);
            }
        });

        txt_sc_attenden.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, txt_sc_assigment, org.jdesktop.beansbinding.ObjectProperty.create(), txt_sc_attenden, org.jdesktop.beansbinding.BeanProperty.create("nextFocusableComponent"));
        bindingGroup.addBinding(binding);

        txt_sc_attenden.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_sc_attendenKeyTyped(evt);
            }
        });

        txt_sc_total.setEditable(false);
        txt_sc_total.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txt_sc_total.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_sc_totalFocusGained(evt);
            }
        });
        txt_sc_total.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_sc_totalKeyTyped(evt);
            }
        });

        jLabel46.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel46.setText("Total");

        jLabel47.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel47.setText("Attendance");

        jLabel48.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel48.setText("Assignment");

        jLabel49.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel49.setText("Midterm");

        txt_sc_midterm.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, txt_sc_final, org.jdesktop.beansbinding.ObjectProperty.create(), txt_sc_midterm, org.jdesktop.beansbinding.BeanProperty.create("nextFocusableComponent"));
        bindingGroup.addBinding(binding);

        txt_sc_midterm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_sc_midtermKeyTyped(evt);
            }
        });

        txt_sc_assigment.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, txt_sc_midterm, org.jdesktop.beansbinding.ObjectProperty.create(), txt_sc_assigment, org.jdesktop.beansbinding.BeanProperty.create("nextFocusableComponent"));
        bindingGroup.addBinding(binding);

        txt_sc_assigment.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_sc_assigmentKeyTyped(evt);
            }
        });

        txt_sc_final.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, txt_sc_total, org.jdesktop.beansbinding.ObjectProperty.create(), txt_sc_final, org.jdesktop.beansbinding.BeanProperty.create("nextFocusableComponent"));
        bindingGroup.addBinding(binding);

        txt_sc_final.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_sc_finalKeyTyped(evt);
            }
        });

        jLabel50.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel50.setText("Final");

        cbo_sc_studentid.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, cbo_sc_studentid, org.jdesktop.beansbinding.ObjectProperty.create(), cbo_sc_studentid, org.jdesktop.beansbinding.BeanProperty.create("nextFocusableComponent"));
        bindingGroup.addBinding(binding);

        jLabel51.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(51, 51, 51));
        jLabel51.setText("Student Score");

        jLabel52.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel52.setText("Suject ID");

        cbo_sc_subjectid.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, txt_sc_quiz, org.jdesktop.beansbinding.ObjectProperty.create(), cbo_sc_subjectid, org.jdesktop.beansbinding.BeanProperty.create("nextFocusableComponent"));
        bindingGroup.addBinding(binding);

        btn_sc_save.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btn_sc_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save_20px.png"))); // NOI18N
        btn_sc_save.setText("Save");
        btn_sc_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sc_saveActionPerformed(evt);
            }
        });

        btn_sc_update.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btn_sc_update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/refresh_20px.png"))); // NOI18N
        btn_sc_update.setText("Update");
        btn_sc_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sc_updateActionPerformed(evt);
            }
        });

        btn_sc_deleted.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btn_sc_deleted.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete_bin_20px.png"))); // NOI18N
        btn_sc_deleted.setText("Deleted");
        btn_sc_deleted.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sc_deletedActionPerformed(evt);
            }
        });

        btn_sc_new.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btn_sc_new.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add_20px.png"))); // NOI18N
        btn_sc_new.setText("New");
        btn_sc_new.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sc_newActionPerformed(evt);
            }
        });

        txt_sc_search.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txt_sc_search.setForeground(new java.awt.Color(153, 153, 153));
        txt_sc_search.setText("Search.Here...");
        txt_sc_search.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_sc_searchFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_sc_searchFocusLost(evt);
            }
        });
        txt_sc_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_sc_searchKeyReleased(evt);
            }
        });

        jTable1_sc.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTable1_sc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1_sc.setToolTipText("");
        jTable1_sc.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable1_sc.setFocusable(false);
        jTable1_sc.setGridColor(new java.awt.Color(204, 204, 204));
        jTable1_sc.setRowHeight(25);
        jTable1_sc.getTableHeader().setResizingAllowed(false);
        jTable1_sc.getTableHeader().setReorderingAllowed(false);
        jTable1_sc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1_scMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1_sc);

        txt_Sc_score.setEditable(false);

        javax.swing.GroupLayout jPanelScoreLayout = new javax.swing.GroupLayout(jPanelScore);
        jPanelScore.setLayout(jPanelScoreLayout);
        jPanelScoreLayout.setHorizontalGroup(
            jPanelScoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelScoreLayout.createSequentialGroup()
                .addGap(330, 330, 330)
                .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(229, 229, 229)
                .addComponent(txt_Sc_score, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanelScoreLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanelScoreLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel15)
                .addGap(32, 32, 32)
                .addComponent(cbo_sc_studentid, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(jLabel48)
                .addGap(38, 38, 38)
                .addComponent(txt_sc_assigment, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanelScoreLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel52)
                .addGap(32, 32, 32)
                .addComponent(cbo_sc_subjectid, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91)
                .addComponent(jLabel49)
                .addGap(38, 38, 38)
                .addComponent(txt_sc_midterm, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanelScoreLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel16)
                .addGap(32, 32, 32)
                .addComponent(txt_sc_quiz, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116)
                .addComponent(jLabel50)
                .addGap(38, 38, 38)
                .addComponent(txt_sc_final, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanelScoreLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel47)
                .addGap(32, 32, 32)
                .addComponent(txt_sc_attenden, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113)
                .addComponent(jLabel46)
                .addGap(38, 38, 38)
                .addComponent(txt_sc_total, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanelScoreLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(btn_sc_save)
                .addGap(10, 10, 10)
                .addComponent(btn_sc_update)
                .addGap(6, 6, 6)
                .addComponent(btn_sc_deleted)
                .addGap(10, 10, 10)
                .addComponent(btn_sc_new)
                .addGap(66, 66, 66)
                .addComponent(txt_sc_search, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanelScoreLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelScoreLayout.setVerticalGroup(
            jPanelScoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelScoreLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanelScoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51)
                    .addComponent(txt_Sc_score, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(jPanelScoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbo_sc_studentid, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_sc_assigment, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelScoreLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanelScoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel48))))
                .addGap(6, 6, 6)
                .addGroup(jPanelScoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbo_sc_subjectid, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_sc_midterm, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelScoreLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanelScoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel52)
                            .addComponent(jLabel49))))
                .addGap(6, 6, 6)
                .addGroup(jPanelScoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_sc_quiz, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_sc_final, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelScoreLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanelScoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel50))))
                .addGap(6, 6, 6)
                .addGroup(jPanelScoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_sc_attenden, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_sc_total, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelScoreLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanelScoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel47)
                            .addComponent(jLabel46))))
                .addGap(18, 18, 18)
                .addGroup(jPanelScoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_sc_save, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_sc_update, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_sc_deleted, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_sc_new, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_sc_search, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel7.add(jPanelScore, "card4");

        jPanelSubject.setBackground(new java.awt.Color(241, 241, 241));

        jLabel53.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(51, 51, 51));
        jLabel53.setText("Student Subject ");

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel35.setText("Subject Name");

        jLabel54.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel54.setText("Description");

        jLabel55.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel55.setText("Teacher ID");

        txt_ss_subjectname.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        txt_ss_Description.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        btn_ss_save.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btn_ss_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save_20px.png"))); // NOI18N
        btn_ss_save.setText("Save");
        btn_ss_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ss_saveActionPerformed(evt);
            }
        });

        btn_ss_update.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btn_ss_update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/refresh_20px.png"))); // NOI18N
        btn_ss_update.setText("Update");
        btn_ss_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ss_updateActionPerformed(evt);
            }
        });

        btn_ss_deleted.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btn_ss_deleted.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete_bin_20px.png"))); // NOI18N
        btn_ss_deleted.setText("Deleted");
        btn_ss_deleted.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ss_deletedActionPerformed(evt);
            }
        });

        btn_ss_new.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btn_ss_new.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add_20px.png"))); // NOI18N
        btn_ss_new.setText("New");
        btn_ss_new.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ss_newActionPerformed(evt);
            }
        });

        cbo_ss_Teacherid.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        txt_ss_Search.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txt_ss_Search.setForeground(new java.awt.Color(153, 153, 153));
        txt_ss_Search.setText("Search.Here...");
        txt_ss_Search.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_ss_SearchFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_ss_SearchFocusLost(evt);
            }
        });
        txt_ss_Search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_ss_SearchKeyReleased(evt);
            }
        });

        txt_ss_subjectid.setEditable(false);

        jTable1_ss.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTable1_ss.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable1_ss.setFocusable(false);
        jTable1_ss.setGridColor(new java.awt.Color(204, 204, 204));
        jTable1_ss.setRowHeight(25);
        jTable1_ss.getTableHeader().setResizingAllowed(false);
        jTable1_ss.getTableHeader().setReorderingAllowed(false);
        jTable1_ss.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1_ssMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable1_ss);

        javax.swing.GroupLayout jPanelSubjectLayout = new javax.swing.GroupLayout(jPanelSubject);
        jPanelSubject.setLayout(jPanelSubjectLayout);
        jPanelSubjectLayout.setHorizontalGroup(
            jPanelSubjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSubjectLayout.createSequentialGroup()
                .addGroup(jPanelSubjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelSubjectLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator5))
                    .addGroup(jPanelSubjectLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelSubjectLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanelSubjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelSubjectLayout.createSequentialGroup()
                                .addComponent(btn_ss_save)
                                .addGap(10, 10, 10)
                                .addComponent(btn_ss_update)
                                .addGap(10, 10, 10)
                                .addComponent(btn_ss_deleted)
                                .addGap(10, 10, 10)
                                .addComponent(btn_ss_new)
                                .addGap(26, 26, 26)
                                .addComponent(txt_ss_Search))
                            .addGroup(jPanelSubjectLayout.createSequentialGroup()
                                .addComponent(txt_ss_subjectname, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt_ss_Description, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbo_ss_Teacherid, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelSubjectLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel35)
                        .addGap(180, 180, 180)
                        .addComponent(jLabel54)
                        .addGap(195, 195, 195)
                        .addComponent(jLabel55)
                        .addGap(0, 150, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelSubjectLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel53)
                        .addGap(265, 265, 265)
                        .addComponent(txt_ss_subjectid, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanelSubjectLayout.setVerticalGroup(
            jPanelSubjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSubjectLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanelSubjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_ss_subjectid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel53))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelSubjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel35)
                    .addComponent(jLabel54)
                    .addComponent(jLabel55))
                .addGap(6, 6, 6)
                .addGroup(jPanelSubjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_ss_subjectname, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_ss_Description, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbo_ss_Teacherid, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanelSubjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_ss_save, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ss_update, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ss_deleted, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ss_new, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_ss_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel7.add(jPanelSubject, "card5");

        jPanelTeacher.setBackground(new java.awt.Color(241, 241, 241));

        jLabel56.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(51, 51, 51));
        jLabel56.setText("Teacher Information");

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel34.setText("Teacher Name");

        jLabel57.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel57.setText("Gender");

        jLabel58.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel58.setText("Phone Number");

        jLabel59.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel59.setText("Date of Birth");

        jLabel60.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel60.setText("Email");

        txt_tc_teachername.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, cbo_tc_gender, org.jdesktop.beansbinding.ObjectProperty.create(), txt_tc_teachername, org.jdesktop.beansbinding.BeanProperty.create("nextFocusableComponent"));
        bindingGroup.addBinding(binding);

        txt_tc_phonenumber.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, txt_tc_email, org.jdesktop.beansbinding.ObjectProperty.create(), txt_tc_phonenumber, org.jdesktop.beansbinding.BeanProperty.create("nextFocusableComponent"));
        bindingGroup.addBinding(binding);

        txt_tc_email.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txt_tc_email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_tc_emailFocusLost(evt);
            }
        });

        cbo_tc_gender.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        cbo_tc_gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, dc_tc_dateofbirth, org.jdesktop.beansbinding.ObjectProperty.create(), cbo_tc_gender, org.jdesktop.beansbinding.BeanProperty.create("nextFocusableComponent"));
        bindingGroup.addBinding(binding);

        dc_tc_dateofbirth.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, txt_tc_phonenumber, org.jdesktop.beansbinding.ObjectProperty.create(), dc_tc_dateofbirth, org.jdesktop.beansbinding.BeanProperty.create("nextFocusableComponent"));
        bindingGroup.addBinding(binding);

        btn_tc_save.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btn_tc_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save_20px.png"))); // NOI18N
        btn_tc_save.setText("Save");
        btn_tc_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tc_saveActionPerformed(evt);
            }
        });

        btn_tc_update.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btn_tc_update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/refresh_20px.png"))); // NOI18N
        btn_tc_update.setText("Update");
        btn_tc_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tc_updateActionPerformed(evt);
            }
        });

        btn_tc_new.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btn_tc_new.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add_20px.png"))); // NOI18N
        btn_tc_new.setText("New");
        btn_tc_new.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tc_newActionPerformed(evt);
            }
        });

        btn_tc_delete.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btn_tc_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete_bin_20px.png"))); // NOI18N
        btn_tc_delete.setText("Deleted");
        btn_tc_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tc_deleteActionPerformed(evt);
            }
        });

        JTable1_tc.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        JTable1_tc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        JTable1_tc.setFocusable(false);
        JTable1_tc.setGridColor(new java.awt.Color(204, 204, 204));
        JTable1_tc.setRowHeight(25);
        JTable1_tc.getTableHeader().setResizingAllowed(false);
        JTable1_tc.getTableHeader().setReorderingAllowed(false);
        JTable1_tc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTable1_tcMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(JTable1_tc);

        txt_tc_search.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txt_tc_search.setForeground(new java.awt.Color(153, 153, 153));
        txt_tc_search.setText("Search.Here...");
        txt_tc_search.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_tc_searchFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_tc_searchFocusLost(evt);
            }
        });
        txt_tc_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_tc_searchKeyReleased(evt);
            }
        });

        txt_tc_teacherid.setEditable(false);

        javax.swing.GroupLayout jPanelTeacherLayout = new javax.swing.GroupLayout(jPanelTeacher);
        jPanelTeacher.setLayout(jPanelTeacherLayout);
        jPanelTeacherLayout.setHorizontalGroup(
            jPanelTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTeacherLayout.createSequentialGroup()
                .addGroup(jPanelTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelTeacherLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator6))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelTeacherLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btn_tc_save)
                        .addGap(10, 10, 10)
                        .addComponent(btn_tc_update)
                        .addGap(10, 10, 10)
                        .addComponent(btn_tc_delete)
                        .addGap(10, 10, 10)
                        .addComponent(btn_tc_new)
                        .addGap(37, 37, 37)
                        .addComponent(txt_tc_search))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelTeacherLayout.createSequentialGroup()
                        .addGroup(jPanelTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelTeacherLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel34)
                                .addGap(18, 18, 18)
                                .addComponent(txt_tc_teachername, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addComponent(jLabel58)
                                .addGap(21, 21, 21)
                                .addComponent(txt_tc_phonenumber, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelTeacherLayout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(jLabel57)
                                .addGap(18, 18, 18)
                                .addComponent(cbo_tc_gender, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(89, 89, 89)
                                .addComponent(jLabel60)
                                .addGap(21, 21, 21)
                                .addComponent(txt_tc_email, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelTeacherLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel59)
                                .addGap(18, 18, 18)
                                .addComponent(dc_tc_dateofbirth, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelTeacherLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTeacherLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel56)
                                .addGap(238, 238, 238)
                                .addComponent(txt_tc_teacherid, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelTeacherLayout.setVerticalGroup(
            jPanelTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTeacherLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanelTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_tc_teacherid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel56))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_tc_teachername, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_tc_phonenumber, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelTeacherLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanelTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel34)
                            .addComponent(jLabel58))))
                .addGap(6, 6, 6)
                .addGroup(jPanelTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbo_tc_gender, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_tc_email, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelTeacherLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanelTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel57)
                            .addComponent(jLabel60))))
                .addGap(6, 6, 6)
                .addGroup(jPanelTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel59)
                    .addComponent(dc_tc_dateofbirth, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_tc_save, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_tc_update, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_tc_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_tc_new, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_tc_search, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel7.add(jPanelTeacher, "card6");

        jPanelResult.setBackground(new java.awt.Color(241, 241, 241));
        jPanelResult.setPreferredSize(new java.awt.Dimension(800, 590));

        jLabel33.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(51, 51, 51));
        jLabel33.setText("Monthly Report");

        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTabbedPane1.setFocusable(false);
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        cbo_date_from.setDateFormatString("yyyy-MM-dd");
        cbo_date_from.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel71.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel71.setText("Between");

        cbo_date_to.setDateFormatString("yyyy-MM-dd");
        cbo_date_to.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel72.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel72.setText("To");

        btn_find_report.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btn_find_report.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search_more_20px.png"))); // NOI18N
        btn_find_report.setText("Find");
        btn_find_report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_find_reportActionPerformed(evt);
            }
        });

        cbo_sort_pay.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        cbo_sort_pay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ASC", "DESC" }));
        cbo_sort_pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_sort_payActionPerformed(evt);
            }
        });

        btn_view_report.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btn_view_report.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/print_20px.png"))); // NOI18N
        btn_view_report.setText("Print");
        btn_view_report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_view_reportActionPerformed(evt);
            }
        });

        tbl_payment_report.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tbl_payment_report.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_payment_report.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tbl_payment_report.setGridColor(new java.awt.Color(204, 204, 204));
        tbl_payment_report.setRowHeight(25);
        jScrollPane7.setViewportView(tbl_payment_report);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbo_date_from, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel72)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbo_date_to, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbo_sort_pay, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_find_report)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_view_report, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cbo_date_to, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cbo_date_from, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                                .addComponent(jLabel71, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_find_report, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_view_report, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbo_sort_pay, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Payment Report", jPanel5);

        btn_find_score.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btn_find_score.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search_more_20px.png"))); // NOI18N
        btn_find_score.setText("Find");
        btn_find_score.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_find_scoreActionPerformed(evt);
            }
        });

        tbl_score_report.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tbl_score_report.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_score_report.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tbl_score_report.setGridColor(new java.awt.Color(204, 204, 204));
        tbl_score_report.setRowHeight(25);
        jScrollPane6.setViewportView(tbl_score_report);

        btn_score_preview.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btn_score_preview.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/print_20px.png"))); // NOI18N
        btn_score_preview.setText("Print");
        btn_score_preview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_score_previewActionPerformed(evt);
            }
        });

        jLabel104.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel104.setText("Between");

        cbo_date_from_sc.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        cbo_date_to_sc.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel105.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel105.setText("To");

        cbo_sort_sc.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        cbo_sort_sc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ASC", "DESC" }));
        cbo_sort_sc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_sort_scActionPerformed(evt);
            }
        });

        cbo_sub_id.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        cbo_sub_id.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2" }));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel104, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbo_date_from_sc, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel105)
                        .addGap(6, 6, 6)
                        .addComponent(cbo_date_to_sc, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbo_sort_sc, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbo_sub_id, 0, 52, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_find_score, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_score_preview, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel105, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbo_date_to_sc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbo_date_from_sc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel104, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbo_sub_id, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbo_sort_sc, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_find_score, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_score_preview, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Score Report", jPanel6);

        javax.swing.GroupLayout jPanelResultLayout = new javax.swing.GroupLayout(jPanelResult);
        jPanelResult.setLayout(jPanelResultLayout);
        jPanelResultLayout.setHorizontalGroup(
            jPanelResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanelResultLayout.createSequentialGroup()
                .addGroup(jPanelResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelResultLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelResultLayout.createSequentialGroup()
                        .addGap(326, 326, 326)
                        .addComponent(jLabel33)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelResultLayout.setVerticalGroup(
            jPanelResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelResultLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel7.add(jPanelResult, "card7");

        jPanelPayment.setBackground(new java.awt.Color(241, 241, 241));

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 51, 51));
        jLabel20.setText("Student Payment");

        jLabel61.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel61.setText("Student ID");

        txt_pay_fname.setEditable(false);
        txt_pay_fname.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel62.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel62.setText("First Name");

        jLabel63.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel63.setText("Last Name");

        txt_pay_lname.setEditable(false);
        txt_pay_lname.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel64.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel64.setText("Payment For");

        cbo_payfor.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        cbo_payfor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Semester", "Year" }));
        cbo_payfor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_payforActionPerformed(evt);
            }
        });

        jLabel65.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel65.setText("Payment Date");

        cbo_pay_date.setDateFormatString("dd MMM-yyyy, hh:mm:ss a");
        cbo_pay_date.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel66.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel66.setText("Discount (%)");

        cbo_pay_discount.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        cbo_pay_discount.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Null", "30%", "50%", "100%" }));
        cbo_pay_discount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_pay_discountActionPerformed(evt);
            }
        });

        jLabel67.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel67.setText("Amount ($)");

        txt_amount.setEditable(false);
        txt_amount.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        txt_total_usd.setEditable(false);
        txt_total_usd.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel68.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel68.setText("Total ($) - KH");

        txt_total_kh.setEditable(false);
        txt_total_kh.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        btn_pay_save.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btn_pay_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/us_dollar_20px.png"))); // NOI18N
        btn_pay_save.setText("Pay");
        btn_pay_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pay_saveActionPerformed(evt);
            }
        });

        btn_pay_delete.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btn_pay_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete_bin_20px.png"))); // NOI18N
        btn_pay_delete.setText("Delete");
        btn_pay_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pay_deleteActionPerformed(evt);
            }
        });

        btn_pay_new.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btn_pay_new.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add_20px.png"))); // NOI18N
        btn_pay_new.setText("New");
        btn_pay_new.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pay_newActionPerformed(evt);
            }
        });

        txt_pay_search.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txt_pay_search.setForeground(new java.awt.Color(153, 153, 153));
        txt_pay_search.setText("Search.Here...");
        txt_pay_search.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_pay_searchFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_pay_searchFocusLost(evt);
            }
        });
        txt_pay_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_pay_searchKeyReleased(evt);
            }
        });

        tbl_payment.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tbl_payment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_payment.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tbl_payment.setFocusable(false);
        tbl_payment.setGridColor(new java.awt.Color(204, 204, 204));
        tbl_payment.setRowHeight(25);
        tbl_payment.getTableHeader().setResizingAllowed(false);
        tbl_payment.getTableHeader().setReorderingAllowed(false);
        tbl_payment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_paymentMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tbl_payment);

        txt_pay_find.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txt_pay_find.setForeground(new java.awt.Color(153, 153, 153));
        txt_pay_find.setText("Find.SID...");
        txt_pay_find.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_pay_findFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_pay_findFocusLost(evt);
            }
        });
        txt_pay_find.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_pay_findKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_pay_findKeyTyped(evt);
            }
        });

        txt_pay_tax.setEditable(false);
        txt_pay_tax.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel69.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel69.setText("Tax ($)");

        cbo_for_year.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        cbo_for_year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));

        jLabel70.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel70.setText("Pay for year");

        btn_pay_print.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btn_pay_print.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/print_20px.png"))); // NOI18N
        btn_pay_print.setText("Print");
        btn_pay_print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pay_printActionPerformed(evt);
            }
        });

        txt_pay_id.setEditable(false);

        javax.swing.GroupLayout jPanelPaymentLayout = new javax.swing.GroupLayout(jPanelPayment);
        jPanelPayment.setLayout(jPanelPaymentLayout);
        jPanelPaymentLayout.setHorizontalGroup(
            jPanelPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPaymentLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addGap(216, 216, 216)
                .addComponent(txt_pay_id, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
            .addGroup(jPanelPaymentLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanelPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPaymentLayout.createSequentialGroup()
                        .addGroup(jPanelPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelPaymentLayout.createSequentialGroup()
                                .addComponent(jLabel61)
                                .addGap(43, 43, 43)
                                .addComponent(txt_pay_find, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(jLabel65)
                                .addGap(18, 18, 18)
                                .addComponent(cbo_pay_date, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelPaymentLayout.createSequentialGroup()
                                .addComponent(jLabel62)
                                .addGap(43, 43, 43)
                                .addComponent(txt_pay_fname, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(jLabel66)
                                .addGap(18, 18, 18)
                                .addComponent(cbo_pay_discount, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelPaymentLayout.createSequentialGroup()
                                .addComponent(jLabel63)
                                .addGap(45, 45, 45)
                                .addComponent(txt_pay_lname, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(jLabel67)
                                .addGap(18, 18, 18)
                                .addComponent(txt_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(jLabel69)
                                .addGap(4, 4, 4)
                                .addComponent(txt_pay_tax, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelPaymentLayout.createSequentialGroup()
                        .addGroup(jPanelPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelPaymentLayout.createSequentialGroup()
                                .addComponent(btn_pay_save)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_pay_delete)
                                .addGap(6, 6, 6)
                                .addComponent(btn_pay_new)
                                .addGap(6, 6, 6)
                                .addComponent(btn_pay_print, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_pay_search, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelPaymentLayout.createSequentialGroup()
                                .addComponent(jLabel70)
                                .addGap(34, 34, 34)
                                .addComponent(cbo_for_year, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(jLabel64)
                                .addGap(4, 4, 4)
                                .addComponent(cbo_payfor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt_total_usd, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_total_kh, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(21, 21, 21))))
            .addGroup(jPanelPaymentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelPaymentLayout.setVerticalGroup(
            jPanelPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPaymentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(txt_pay_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPaymentLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel61))
                    .addComponent(txt_pay_find, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel65)
                    .addComponent(cbo_pay_date, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanelPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_pay_fname, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbo_pay_discount, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelPaymentLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanelPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel62)
                            .addComponent(jLabel66))))
                .addGap(6, 6, 6)
                .addGroup(jPanelPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_pay_lname, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_pay_tax, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelPaymentLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanelPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel63)
                            .addComponent(jLabel67)
                            .addComponent(jLabel69))))
                .addGap(6, 6, 6)
                .addGroup(jPanelPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbo_for_year, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbo_payfor, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_total_usd, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_total_kh, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelPaymentLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanelPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel70)
                            .addComponent(jLabel64)
                            .addComponent(jLabel68))))
                .addGap(11, 11, 11)
                .addGroup(jPanelPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_pay_save, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_pay_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_pay_new, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_pay_print, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_pay_search, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel7.add(jPanelPayment, "card8");

        jPanelSetting.setBackground(new java.awt.Color(241, 241, 241));
        jPanelSetting.setPreferredSize(new java.awt.Dimension(800, 590));

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 51, 51));
        jLabel19.setText("Settings");

        jLabel78.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel78.setText("Manage User Account");

        jLabel79.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel79.setText("Username");

        txt_username.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txt_username.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_usernameKeyTyped(evt);
            }
        });

        jLabel80.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel80.setText("Password");

        txt_user_password.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        cbo_status.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        cbo_status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Deactive" }));

        jLabel81.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel81.setText("Status");

        jLabel82.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel82.setText("User Level");

        cbo_user_level.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        cbo_user_level.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "User" }));
        cbo_user_level.setSelectedIndex(1);

        tbl_user_info.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tbl_user_info.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_user_info.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tbl_user_info.setFocusable(false);
        tbl_user_info.setGridColor(new java.awt.Color(204, 204, 204));
        tbl_user_info.setRowHeight(25);
        tbl_user_info.getTableHeader().setResizingAllowed(false);
        tbl_user_info.getTableHeader().setReorderingAllowed(false);
        tbl_user_info.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_user_infoMouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(tbl_user_info);

        btn_create.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_create.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add_20px.png"))); // NOI18N
        btn_create.setText("Create");
        btn_create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_createActionPerformed(evt);
            }
        });

        btn_user_update.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_user_update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/refresh_20px.png"))); // NOI18N
        btn_user_update.setText("Update");
        btn_user_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_user_updateActionPerformed(evt);
            }
        });

        btn_user_delete.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_user_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete_bin_20px.png"))); // NOI18N
        btn_user_delete.setText("Delete");
        btn_user_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_user_deleteActionPerformed(evt);
            }
        });

        jLabel83.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel83.setText("Extras function");

        jLabel84.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel84.setText("Price of study");

        jLabel85.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel85.setText("Tax");

        jLabel86.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel86.setText("Exchange Rate");

        txt_study_price.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        txt_pay_taxs.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        txt_exchange_rate.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        btn_change.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_change.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/refresh_20px.png"))); // NOI18N
        btn_change.setText("Change");
        btn_change.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_changeActionPerformed(evt);
            }
        });

        txt_user_ids.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel106.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel106.setText("Re-Password");

        txt_user_password_re.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel107.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel107.setText("Birth Date");

        txt_user_email.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txt_user_email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_user_emailFocusLost(evt);
            }
        });

        jLabel108.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel108.setText("Email");

        user_dob.setDateFormatString("yyyy-MM-dd");
        user_dob.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        txt_user_search.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txt_user_search.setForeground(new java.awt.Color(153, 153, 153));
        txt_user_search.setText("Search.Here...");
        txt_user_search.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_user_searchFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_user_searchFocusLost(evt);
            }
        });
        txt_user_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_user_searchKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanelSettingLayout = new javax.swing.GroupLayout(jPanelSetting);
        jPanelSetting.setLayout(jPanelSettingLayout);
        jPanelSettingLayout.setHorizontalGroup(
            jPanelSettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSettingLayout.createSequentialGroup()
                .addGroup(jPanelSettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSettingLayout.createSequentialGroup()
                        .addGap(362, 362, 362)
                        .addComponent(jLabel19))
                    .addGroup(jPanelSettingLayout.createSequentialGroup()
                        .addGap(315, 315, 315)
                        .addComponent(jLabel78))
                    .addGroup(jPanelSettingLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanelSettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelSettingLayout.createSequentialGroup()
                                .addGroup(jPanelSettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelSettingLayout.createSequentialGroup()
                                        .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(4, 4, 4)
                                        .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel108, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(4, 4, 4)
                                        .addComponent(txt_user_email, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelSettingLayout.createSequentialGroup()
                                        .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(txt_user_password, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(4, 4, 4)
                                        .addComponent(cbo_status, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelSettingLayout.createSequentialGroup()
                                        .addComponent(jLabel106, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(txt_user_password_re, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbo_user_level, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelSettingLayout.createSequentialGroup()
                                        .addComponent(jLabel107, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(user_dob, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_user_search, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(37, 37, 37)
                                .addGroup(jPanelSettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_create, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_user_update)
                                    .addComponent(btn_user_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_user_ids, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 772, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelSettingLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanelSettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_change)
                            .addGroup(jPanelSettingLayout.createSequentialGroup()
                                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanelSettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanelSettingLayout.createSequentialGroup()
                                        .addComponent(jLabel84)
                                        .addGap(16, 16, 16)
                                        .addComponent(txt_study_price, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelSettingLayout.createSequentialGroup()
                                        .addComponent(jLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28)
                                        .addComponent(txt_pay_taxs, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelSettingLayout.createSequentialGroup()
                                        .addComponent(jLabel86)
                                        .addGap(9, 9, 9)
                                        .addComponent(txt_exchange_rate, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(18, 18, 18))
        );
        jPanelSettingLayout.setVerticalGroup(
            jPanelSettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSettingLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel19)
                .addGap(6, 6, 6)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jLabel78)
                .addGap(19, 19, 19)
                .addGroup(jPanelSettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSettingLayout.createSequentialGroup()
                        .addGroup(jPanelSettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_user_email, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelSettingLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanelSettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel79)
                                    .addComponent(jLabel108))))
                        .addGap(6, 6, 6)
                        .addGroup(jPanelSettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelSettingLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel80))
                            .addComponent(txt_user_password, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelSettingLayout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jLabel81))
                            .addGroup(jPanelSettingLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(cbo_status, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(5, 5, 5)
                        .addGroup(jPanelSettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelSettingLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel106))
                            .addComponent(txt_user_password_re, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelSettingLayout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jLabel82))
                            .addGroup(jPanelSettingLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(cbo_user_level, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(5, 5, 5)
                        .addGroup(jPanelSettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelSettingLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel107))
                            .addComponent(user_dob, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_user_search, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelSettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelSettingLayout.createSequentialGroup()
                                .addComponent(jLabel83)
                                .addGap(18, 18, 18)
                                .addGroup(jPanelSettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelSettingLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel84))
                                    .addComponent(txt_study_price, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(jPanelSettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelSettingLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel85))
                                    .addComponent(txt_pay_taxs, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(jPanelSettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelSettingLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel86))
                                    .addComponent(txt_exchange_rate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addComponent(btn_change, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanelSettingLayout.createSequentialGroup()
                        .addComponent(btn_create, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btn_user_update, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(btn_user_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(txt_user_ids, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jPanel7.add(jPanelSetting, "card9");

        jPanelAbout.setBackground(new java.awt.Color(241, 241, 241));
        jPanelAbout.setMinimumSize(new java.awt.Dimension(800, 590));
        jPanelAbout.setPreferredSize(new java.awt.Dimension(800, 590));
        jPanelAbout.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 51, 51));
        jLabel18.setText("About us");
        jPanelAbout.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 11, -1, -1));
        jPanelAbout.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 44, 780, -1));

        jLabel87.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel87.setText("System Builder");
        jPanelAbout.add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 52, -1, -1));

        jLabel88.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel88.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user_20px.png"))); // NOI18N
        jLabel88.setText("Mr. CHUON Sovuthy");
        jPanelAbout.add(jLabel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 97, -1, -1));

        jLabel89.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel89.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user_20px.png"))); // NOI18N
        jLabel89.setText("Mr. CHHOEUN Chanthat");
        jPanelAbout.add(jLabel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(531, 97, -1, -1));

        jLabel90.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel90.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user_20px.png"))); // NOI18N
        jLabel90.setText("Mr. PUM Minea");
        jPanelAbout.add(jLabel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 97, -1, -1));

        jTextPane2.setEditable(false);
        jTextPane2.setBorder(null);
        jTextPane2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextPane2.setText("Project Member\nPOSITION\t: Developer\n\t: System Analyze\n\t: UX / UI Design\n\t: System Testing");
        jScrollPane10.setViewportView(jTextPane2);

        jPanelAbout.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 134, 250, 104));

        jTextPane3.setEditable(false);
        jTextPane3.setBorder(null);
        jTextPane3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextPane3.setText("Project Team Leader\nPOSITION\t: Programmer\n\t: System Analyze\n\t: Database Design\n\t: UX / UI Design\n");
        jScrollPane11.setViewportView(jTextPane3);

        jPanelAbout.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 134, 250, -1));

        jTextPane4.setEditable(false);
        jTextPane4.setBorder(null);
        jTextPane4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextPane4.setText("Project Member\nPOSITION\t: Developer\n\t: IT Assistance\n\t: System Testing\n\t: IT Technician");
        jScrollPane12.setViewportView(jTextPane4);

        jPanelAbout.add(jScrollPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(531, 134, 250, 104));

        jLabel91.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel91.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/phone_20px.png"))); // NOI18N
        jLabel91.setText("(855) 96688 2427");
        jPanelAbout.add(jLabel91, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 302, -1, -1));

        jLabel92.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel92.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/important_mail_20px.png"))); // NOI18N
        jLabel92.setText("chuon.sovuthy69@gmail.com");
        jPanelAbout.add(jLabel92, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 328, -1, -1));

        jLabel93.setFont(new java.awt.Font("Impact", 0, 16)); // NOI18N
        jLabel93.setForeground(new java.awt.Color(51, 51, 51));
        jLabel93.setText("Contact");
        jPanelAbout.add(jLabel93, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 249, -1, -1));

        jLabel94.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel94.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/facebook_circled_20px.png"))); // NOI18N
        jLabel94.setText("Chuon Sovuthy");
        jLabel94.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel94.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel94MouseClicked(evt);
            }
        });
        jPanelAbout.add(jLabel94, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 276, -1, -1));

        jLabel95.setFont(new java.awt.Font("Impact", 0, 16)); // NOI18N
        jLabel95.setForeground(new java.awt.Color(51, 51, 51));
        jLabel95.setText("Contact");
        jPanelAbout.add(jLabel95, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 249, -1, -1));

        jLabel96.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel96.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/facebook_circled_20px.png"))); // NOI18N
        jLabel96.setText("Pum Minea");
        jLabel96.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel96.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel96MouseClicked(evt);
            }
        });
        jPanelAbout.add(jLabel96, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 271, -1, -1));

        jLabel97.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel97.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/phone_20px.png"))); // NOI18N
        jLabel97.setText("(855) 69260247");
        jPanelAbout.add(jLabel97, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 297, -1, -1));

        jLabel98.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel98.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/important_mail_20px.png"))); // NOI18N
        jLabel98.setText("ahnea.alone@gmail.com");
        jPanelAbout.add(jLabel98, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 323, -1, -1));

        jLabel99.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel99.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/important_mail_20px.png"))); // NOI18N
        jLabel99.setText("chanthat998@gmail.com");
        jPanelAbout.add(jLabel99, new org.netbeans.lib.awtextra.AbsoluteConstraints(531, 323, -1, -1));

        jLabel100.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel100.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/phone_20px.png"))); // NOI18N
        jLabel100.setText("(855) 8693 225");
        jPanelAbout.add(jLabel100, new org.netbeans.lib.awtextra.AbsoluteConstraints(531, 297, -1, -1));

        jLabel101.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel101.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/facebook_circled_20px.png"))); // NOI18N
        jLabel101.setText("Chanthat");
        jLabel101.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel101.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel101MouseClicked(evt);
            }
        });
        jPanelAbout.add(jLabel101, new org.netbeans.lib.awtextra.AbsoluteConstraints(531, 271, -1, -1));

        jLabel102.setFont(new java.awt.Font("Impact", 0, 16)); // NOI18N
        jLabel102.setForeground(new java.awt.Color(51, 51, 51));
        jLabel102.setText("Contact");
        jPanelAbout.add(jLabel102, new org.netbeans.lib.awtextra.AbsoluteConstraints(531, 249, -1, -1));

        jTextPane5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextPane5.setText("The program was built by three founders, including Chuon Sovuthy, Pum Minea, Chhoeun Chantat an IT at Western University, with the goal of making score administration and reporting easier for students, as well as providing future references. In research, the next generation \n\nThis Java-based program maintains MySQL data and generates reports using Jasper Report, as well as a variety of other Open Soft libraries.");
        jScrollPane13.setViewportView(jTextPane5);

        jPanelAbout.add(jScrollPane13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 393, 771, 113));

        jLabel103.setFont(new java.awt.Font("Impact", 0, 16)); // NOI18N
        jLabel103.setForeground(new java.awt.Color(51, 51, 51));
        jLabel103.setText("Detail :");
        jPanelAbout.add(jLabel103, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 366, -1, -1));

        jPanel7.add(jPanelAbout, "card10");

        jPanelHelp.setBackground(new java.awt.Color(241, 241, 241));
        jPanelHelp.setPreferredSize(new java.awt.Dimension(800, 590));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 51));
        jLabel17.setText("System Help");

        jTextPane1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextPane1.setText("   System Features:\n\n\t- Login security\n\t- User forgot password feature\n\t- Student register feature\n\t- Score, subject, teacher, and payment feature\n\t- Report feature\n\t- Settings and etc...\n\n   Technologies and Products Used:\n\n\t- Netbean 8.1\n\t- MySQL database\n\t- Java JDK 1.8\n\t- Class library, Jcalendar, rs2.xml, jasper report, java-mail, and etc..\n\n   Hardware Requirements:\n\n\t- Processor: Intel Cerleron 1.6 Ghz\n\t- RAM: 4GB\n\t- Monitor: 14\" Color Monitor\n\t- Keyboard: 122 keys");
        jScrollPane8.setViewportView(jTextPane1);

        javax.swing.GroupLayout jPanelHelpLayout = new javax.swing.GroupLayout(jPanelHelp);
        jPanelHelp.setLayout(jPanelHelpLayout);
        jPanelHelpLayout.setHorizontalGroup(
            jPanelHelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHelpLayout.createSequentialGroup()
                .addGap(0, 342, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addGap(341, 341, 341))
            .addGroup(jPanelHelpLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelHelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8)
                    .addComponent(jSeparator9, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanelHelpLayout.setVerticalGroup(
            jPanelHelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHelpLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        jPanel7.add(jPanelHelp, "card11");

        jPanel4.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 800, 590));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getContentPane().add(jPanel1);

        bindingGroup.bind();

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked

        Login_form Lg = new Login_form();
        this.setVisible(false);
        Lg.setVisible(true);
        try{
            File clap =new File("test/soundEffect/wloh.wav");
            PlaySounds.PlaySoundEf(clap);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jp_homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_homeMouseClicked
        SetJP(jp_home,jPanelHome);
    }//GEN-LAST:event_jp_homeMouseClicked

    private void jp_registerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_registerMouseClicked
        SetJP(jp_register,jPanelRegister);
    }//GEN-LAST:event_jp_registerMouseClicked

    private void jpScoreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpScoreMouseClicked
        SetJP(jpScore, jPanelScore);
        try{
           SelectSTID();
        }catch (Exception e){
           JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jpScoreMouseClicked

    private void jpSubjectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpSubjectMouseClicked
        SetJP(jpSubject,jPanelSubject);
        try{
           TcID();
        }catch (Exception e){
           JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jpSubjectMouseClicked

    private void jpTeacherMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpTeacherMouseClicked
        SetJP(jpTeacher,jPanelTeacher);
    }//GEN-LAST:event_jpTeacherMouseClicked

    private void jpResultMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpResultMouseClicked
        SetJP(jpResult,jPanelResult);
        try{
           subID(); 
        }catch (Exception e){
           JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_jpResultMouseClicked

    private void jpPaymentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpPaymentMouseClicked
       SetJP(jpPayment,jPanelPayment); 
        String cbo_pay_for =cbo_payfor.getSelectedItem().toString();
        if(cbo_pay_for.equals("Semester")){
            
            con = ConDB.getConnection();
            String sql="SELECT tax from tbl_extra";
            try {
                stm=con.createStatement();
                rs=stm.executeQuery(sql);
                if(rs.next()){
                    float tax = rs.getFloat("tax");
                    txt_pay_tax.setText(String.valueOf(tax));
                }else{
                    JOptionPane.showMessageDialog(null, "Error Tax");
                }
                stm.close();
                rs.close();
                con.close();

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
            
        }else{
            txt_pay_tax.setText("0");
        }
    }//GEN-LAST:event_jpPaymentMouseClicked

    private void jpSettingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpSettingMouseClicked
        SetJP(jpSetting,jPanelSetting);
    }//GEN-LAST:event_jpSettingMouseClicked

    private void jpAboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpAboutMouseClicked
        SetJP(jpAbout,jPanelAbout);
    }//GEN-LAST:event_jpAboutMouseClicked

    private void jpHelpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpHelpMouseClicked
        SetJP(jpHelp,jPanelHelp);
    }//GEN-LAST:event_jpHelpMouseClicked

    private void lbl_logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_logoutMouseClicked

        Login_form Lg = new Login_form();
        this.setVisible(false);
        Lg.setVisible(true);
        try{
            File clap =new File("test/soundEffect/wloh.wav");
            PlaySounds.PlaySoundEf(clap);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_lbl_logoutMouseClicked

    private void btn_re_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_re_saveActionPerformed
        
        if(txt_re_firstname.getText().trim().isEmpty()){
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Please input FirstName","Message",JOptionPane.WARNING_MESSAGE);
            txt_re_firstname.requestFocus();
        }else if(txt_re_lastname.getText().trim().isEmpty()){
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Please input LastName","Message",JOptionPane.WARNING_MESSAGE);
            txt_re_lastname.requestFocus();
        }else if(txt_re_dob.getDate()==null){
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Please Select Date","Message",JOptionPane.WARNING_MESSAGE);
            txt_re_dob.requestFocus();
        }else if(txt_re_batch.getText().trim().isEmpty()){
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Please input Batch","Message",JOptionPane.WARNING_MESSAGE);
            txt_re_batch.requestFocus();
        }else if(txt_re_phone.getText().trim().isEmpty()){
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Please input Phone Number","Message",JOptionPane.WARNING_MESSAGE);
            txt_re_phone.requestFocus();
        }else if(txt_re_email.getText().trim().isEmpty()){
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Incorrect Email","Message",JOptionPane.WARNING_MESSAGE);
            txt_re_email.requestFocus();
        }else if(txt_re_village.getText().trim().isEmpty()){
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Please input Vaillage","Message",JOptionPane.WARNING_MESSAGE);
            txt_re_village.requestFocus();
        }else if(txt_re_commune.getText().trim().isEmpty()){
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Please input Commune","Message",JOptionPane.WARNING_MESSAGE);
            txt_re_commune.requestFocus();
        }else if(txt_re_district.getText().trim().isEmpty()){
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Please input District","Message",JOptionPane.WARNING_MESSAGE);
            txt_re_district.requestFocus();
        }else if(f == null){
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Please input Profile Photo","Message",JOptionPane.WARNING_MESSAGE);
            btn_re_browse.requestFocus();
        }else{
            //Check Folder ex
        try {
            MakeTemps();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
            
        con=ConDB.getConnection();
        PreparedStatement pst;
        
        int uid = Integer.parseInt(txt_user_id.getText().trim());
        SimpleDateFormat sdfm = new SimpleDateFormat("yyyy-MM-dd");
        String date = sdfm.format(txt_re_dob.getDate());
        
        try {
                BufferedImage img= ImageIO.read(f);
                String Location = "test/temps/"+txt_f_name.getText().trim();
                String exstension = txtPath.getText().trim().substring(txtPath.getText().trim().lastIndexOf('.')+1);
                txt_exst.setText(exstension);
                ImageIO.write(img, exstension, new File(Location));
                
            } catch (IOException ex) {
                Logger.getLogger(Main_form.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        String sql="INSERT INTO tbl_registration(user_id, first_name, last_name, gender, dob, batch, phone_number, email, village, commune, district, province, photo)"
               +"VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            pst=con.prepareStatement(sql);
            
            pst.setInt(1, uid);
            pst.setString(2, txt_re_firstname.getText().trim());
            pst.setString(3, txt_re_lastname.getText().trim());
            pst.setString(4, cbo_re_gender.getSelectedItem().toString());
            pst.setString(5, date);
            pst.setString(6, txt_re_batch.getText().trim());
            pst.setString(7, txt_re_phone.getText().trim());
            pst.setString(8, txt_re_email.getText().trim());
            pst.setString(9, txt_re_village.getText().trim());
            pst.setString(10, txt_re_commune.getText().trim());
            pst.setString(11, txt_re_district.getText().trim());
            pst.setString(12, txt_re_province.getSelectedItem().toString());
            String paths = txt_f_name.getText().trim();
            pst.setString(13, paths);
            
            int row = pst.executeUpdate();
            if(row > 0){
                JOptionPane.showMessageDialog(null, "Insert Success");
                Clear();
                pst.close();
                con.close();
            }else{
                JOptionPane.showMessageDialog(null, "Insert Fail");
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
            AutoID();
            SelectDt();
        }
    }//GEN-LAST:event_btn_re_saveActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        th= new Thread(r);
        th.start();
        con = ConDB.getConnection();
        String sql="SELECT user_id from tbl_user where username='"+lbl_user.getText().trim()+"'";
        try {
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
                if (rs.next()){
                    int u_id = rs.getInt("user_id");
                    txt_user_id.setText(String.valueOf(u_id));
                }
                rs.close();
                stm.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(Main_form.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(lbl_user_level.getText().trim().equals("Admin")){
            jpSetting.setVisible(true);
        }else{
            jpSetting.setVisible(false);
        }
        AutoID();
        SelectDt();
        jtable1sc();
        jtable1ss();
        JtableTc();
        SelectDataToCbo();
        Jtablepay();
        show_user();
        Loard_extra();
        
        fileID.setVisible(false);
        txt_f_name.setVisible(false);
        txtPath.setVisible(false);
        txt_exst.setVisible(false);
        btn_re_update.setEnabled(false);
        btn_re_delete.setEnabled(false);
        btn_sc_update.setEnabled(false);
        btn_sc_deleted.setEnabled(false);
        txt_Sc_score.setEnabled(false);
        txt_Sc_score.setVisible(false);
        btn_ss_update.setEnabled(false);
        btn_ss_deleted.setEnabled(false);
        txt_ss_subjectid.setVisible(false);
        btn_tc_save.setEnabled(true);
        btn_tc_update.setEnabled(false);
        btn_tc_delete.setEnabled(false);
        txt_tc_teacherid.setVisible(false);
        btn_pay_delete.setEnabled(false);
        btn_pay_print.setEnabled(false);
        txt_pay_id.setVisible(false);
        btn_pay_save.setEnabled(true);
        btn_user_delete.setEnabled(false);
        btn_user_update.setEnabled(false);
        txt_user_ids.setVisible(false);
        MakeTemps();
        try{
        File clap =new File("test/soundEffect/wish.wav");
        PlaySounds.PlaySoundEf(clap);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_formWindowOpened

    private void btn_re_browseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_re_browseActionPerformed
        JFileChooser chooser =  new JFileChooser();
        chooser.setAcceptAllFileFilterUsed(false);
        FileFilter ft = new FileNameExtensionFilter("Select Image", "jpg", "png");
        chooser.setFileFilter(ft);
        //chooser.showOpenDialog(null);       
        int userChoice = chooser.showOpenDialog(this);
        if(userChoice == JFileChooser.APPROVE_OPTION)
        {
            f = chooser.getSelectedFile();
            String paths = f.getAbsolutePath();
            txtPath.setText(paths);
            double Fsize = f.length()/1024;
            
            if(Fsize > 1024){
               String showSize = String.format("%.2f", (Fsize/1024));
               Toolkit.getDefaultToolkit().beep();
               JOptionPane.showMessageDialog(null, "File is Larger << "+showSize+" MB >> Please Choose another Image","Message",JOptionPane.ERROR_MESSAGE);
               txtPath.setText("");
               txt_f_name.setText("");
               txt_exst.setText("");
               f=null;
               lbl_re_photo.setIcon(null);
            }else{
            
            String exstension = txtPath.getText().trim().substring(txtPath.getText().trim().lastIndexOf('.')+1);
            txt_exst.setText(exstension);
            final String filename = UUID.randomUUID().toString().replaceAll("-", "")+"."+exstension;
            txt_f_name.setText(filename);
            
            BufferedImage img = null;
            try{
                img = ImageIO.read(new File(paths));
            }catch (IOException e){
                JOptionPane.showMessageDialog(null, e,"Message",JOptionPane.WARNING_MESSAGE);
            }
            Image dimg = img.getScaledInstance(lbl_re_photo.getWidth(), lbl_re_photo.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon icon = new ImageIcon(dimg);
            lbl_re_photo.setIcon(icon);
            }
        }    
    }//GEN-LAST:event_btn_re_browseActionPerformed

    private void txt_re_firstnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_re_firstnameKeyTyped
        char c = evt.getKeyChar();
        if(Character.isLetter(c) || Character.isISOControl(c)){
            evt = evt;  
        }else{
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_txt_re_firstnameKeyTyped

    private void txt_re_lastnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_re_lastnameKeyTyped
        char c = evt.getKeyChar();
        if(Character.isLetter(c) || Character.isISOControl(c)){
            evt = evt;  
        }else{
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_txt_re_lastnameKeyTyped

    private void txt_re_batchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_re_batchKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)){
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_txt_re_batchKeyTyped

    private void txt_re_dobKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_re_dobKeyPressed
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)){
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_txt_re_dobKeyPressed

    private void txt_re_phoneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_re_phoneKeyPressed

        int len = txt_re_phone.getText().trim().length();
        if(evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9'){
            if(len < 10){
                txt_re_phone.setEditable(true);
            }else{
                txt_re_phone.setEditable(false);
            }
        }else{
            if(evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE){
                txt_re_phone.setEditable(true);
            }else{
                txt_re_phone.setEditable(false);
            }
        }
    }//GEN-LAST:event_txt_re_phoneKeyPressed

    private void tbl_re_showMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_re_showMouseClicked
        try{
            btn_re_save.setEnabled(false);
            btn_re_update.setEnabled(true);
            btn_re_delete.setEnabled(true);
            model = (DefaultTableModel) tbl_re_show.getModel();
            int selectRowIndex = tbl_re_show.getSelectedRow();
            
            txt_re_id.setText(model.getValueAt(selectRowIndex, 0).toString());
            txt_user_id.setText(model.getValueAt(selectRowIndex, 1).toString());
            txt_re_firstname.setText(model.getValueAt(selectRowIndex, 2).toString());
            txt_re_lastname.setText(model.getValueAt(selectRowIndex, 3).toString());
            cbo_re_gender.setSelectedItem(model.getValueAt(selectRowIndex, 4).toString());
            String date = model.getValueAt(selectRowIndex, 5).toString();
            try {
                Date dt = new SimpleDateFormat("yyyy-MM-dd").parse(date);
                txt_re_dob.setDate(dt);
            } catch (ParseException ex) {
                Logger.getLogger(Main_form.class.getName()).log(Level.SEVERE, null, ex);
            }
            txt_re_batch.setText(model.getValueAt(selectRowIndex, 6).toString());
            txt_re_phone.setText(model.getValueAt(selectRowIndex, 7).toString());
            txt_re_email.setText(model.getValueAt(selectRowIndex, 8).toString());
            txt_re_village.setText(model.getValueAt(selectRowIndex, 9).toString());
            txt_re_commune.setText(model.getValueAt(selectRowIndex, 10).toString());
            txt_re_district.setText(model.getValueAt(selectRowIndex, 11).toString());
            txt_re_province.setSelectedItem(model.getValueAt(selectRowIndex, 12).toString());
            
            con=ConDB.getConnection();
            try{
                stm=con.createStatement();
                String sql="Select photo from tbl_registration where student_id='"+txt_re_id.getText().trim()+"'";
                rs=stm.executeQuery(sql);
                if(rs.next()){
                txtPath.setText(rs.getString("photo"));
                fileID.setText(rs.getString("photo"));
                String path= "test/temps/"+txtPath.getText().trim();
                
                BufferedImage img = null;
                try{
                    img = ImageIO.read(new File(path));
                }catch (IOException e){
                    JOptionPane.showMessageDialog(null, e,"Message",JOptionPane.WARNING_MESSAGE);
                }
                Image dimg = img.getScaledInstance(lbl_re_photo.getWidth(), lbl_re_photo.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon icon = new ImageIcon(dimg);
                lbl_re_photo.setIcon(icon);
                
                rs.close();
                stm.close();
                con.close();
                }
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, e,"Message",JOptionPane.WARNING_MESSAGE);
            }     
        }catch (HeadlessException e){
            JOptionPane.showMessageDialog(null, e,"Message",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_tbl_re_showMouseClicked

    private void btn_re_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_re_updateActionPerformed
        if(txt_re_firstname.getText().trim().isEmpty()){
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Please input FirstName","Message",JOptionPane.WARNING_MESSAGE);
            txt_re_firstname.requestFocus();
        }else if(txt_re_lastname.getText().trim().isEmpty()){
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Please input LastName","Message",JOptionPane.WARNING_MESSAGE);
            txt_re_lastname.requestFocus();
        }else if(txt_re_dob.getDate()==null){
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Please input Select Date","Message",JOptionPane.WARNING_MESSAGE);
            txt_re_dob.requestFocus();
        }else if(txt_re_batch.getText().trim().isEmpty()){
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Please input Batch","Message",JOptionPane.WARNING_MESSAGE);
            txt_re_batch.requestFocus();
        }else if(txt_re_phone.getText().trim().isEmpty()){
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Please input Phone Number","Message",JOptionPane.WARNING_MESSAGE);
            txt_re_phone.requestFocus();
        }else if(txt_re_email.getText().trim().isEmpty()){
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Incorrect Email","Message",JOptionPane.WARNING_MESSAGE);
            txt_re_email.requestFocus();
        }else if(txt_re_village.getText().trim().isEmpty()){
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Please input Vaillage","Message",JOptionPane.WARNING_MESSAGE);
            txt_re_village.requestFocus();
        }else if(txt_re_commune.getText().trim().isEmpty()){
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Please input Commune","Message",JOptionPane.WARNING_MESSAGE);
            txt_re_commune.requestFocus();
        }else if(txt_re_district.getText().trim().isEmpty()){
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Please input District","Message",JOptionPane.WARNING_MESSAGE);
            txt_re_district.requestFocus();
        }else{
            try {
            MakeTemps();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            con=ConDB.getConnection();
            PreparedStatement pst;

            int uid = Integer.parseInt(txt_user_id.getText().trim());
            SimpleDateFormat sdfm = new SimpleDateFormat("yyyy-MM-dd");
            String date = sdfm.format(txt_re_dob.getDate());
            
            if(f != null){
                
                try {
                    /////////
                    String LocationDL = "test/temps/"+fileID.getText().trim();
                    File fs = new File(LocationDL);
                    if(fs.exists()){
                        fs.delete();
                        fileID.setText("");
                    }
                    ////////
                    BufferedImage img= ImageIO.read(f);
                    String Location = "test/temps/"+txt_f_name.getText().trim();
                    String exstension = txtPath.getText().trim().substring(txtPath.getText().trim().lastIndexOf('.')+1);
                    txt_exst.setText(exstension);
                    ImageIO.write(img, exstension, new File(Location));
                
                } catch (IOException ex) {
                    Logger.getLogger(Main_form.class.getName()).log(Level.SEVERE, null, ex);
                } 
                
                String sql="UPDATE tbl_registration SET first_name=?, last_name=?, gender=?, dob=?, batch=?, phone_number=?, email=?, village=?, commune=?, district=?, province=?, photo=?"
                   +"WHERE student_id = ?";
                try {
                    pst=con.prepareStatement(sql);
                    
                    pst.setString(1, txt_re_firstname.getText().trim());
                    pst.setString(2, txt_re_lastname.getText().trim());
                    pst.setString(3, cbo_re_gender.getSelectedItem().toString());
                    pst.setString(4, date);
                    pst.setString(5, txt_re_batch.getText().trim());
                    pst.setString(6, txt_re_phone.getText().trim());
                    pst.setString(7, txt_re_email.getText().trim());
                    pst.setString(8, txt_re_village.getText().trim());
                    pst.setString(9, txt_re_commune.getText().trim());
                    pst.setString(10, txt_re_district.getText().trim());
                    pst.setString(11, txt_re_province.getSelectedItem().toString());
                    
                    String paths = txt_f_name.getText().trim();
                    pst.setString(12, paths);
                    
                    int ids = Integer.parseInt(txt_re_id.getText().trim());
                    pst.setInt(13, ids);

                    int row = pst.executeUpdate();
                    if(row > 0){
                        JOptionPane.showMessageDialog(null, "Update Success");
                        Clear();
                        pst.close();
                        con.close();
                        }else{
                            JOptionPane.showMessageDialog(null, "Update Fail");
                        }
                    
                    
                }catch (HeadlessException | NumberFormatException | SQLException e) {
                    Logger.getLogger(Main_form.class.getName()).log(Level.SEVERE, null, e);
                }
                
            }else{
                String sql2="UPDATE tbl_registration SET first_name=?, last_name=?, gender=?, dob=?, batch=?, phone_number=?, email=?, village=?, commune=?, district=?, province=?"
                            +"WHERE student_id = ?";
                try { 
                    pst=con.prepareStatement(sql2);
                    
                    pst.setString(1, txt_re_firstname.getText().trim());
                    pst.setString(2, txt_re_lastname.getText().trim());
                    pst.setString(3, cbo_re_gender.getSelectedItem().toString());
                    pst.setString(4, date);
                    pst.setString(5, txt_re_batch.getText().trim());
                    pst.setString(6, txt_re_phone.getText().trim());
                    pst.setString(7, txt_re_email.getText().trim());
                    pst.setString(8, txt_re_village.getText().trim());
                    pst.setString(9, txt_re_commune.getText().trim());
                    pst.setString(10, txt_re_district.getText().trim());
                    pst.setString(11, txt_re_province.getSelectedItem().toString());
                    int ids = Integer.parseInt(txt_re_id.getText().trim());
                    pst.setInt(12, ids);

                    int row = pst.executeUpdate();
                    if(row > 0){
                        JOptionPane.showMessageDialog(null, "Update Success");
                        Clear();
                        pst.close();
                        con.close();
                        }else{
                            JOptionPane.showMessageDialog(null, "Update Fail");
                        }
                } catch (SQLException ex) {
                    Logger.getLogger(Main_form.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            SelectDt();
            btn_re_save.setEnabled(true);
            btn_re_update.setEnabled(false);
            btn_re_delete.setEnabled(false);
            txt_pay_fname.setText("");
            txt_pay_lname.setText("");
        }
    }//GEN-LAST:event_btn_re_updateActionPerformed

    private void btn_re_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_re_deleteActionPerformed
        try{
            try {
            MakeTemps();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            con=ConDB.getConnection();
            PreparedStatement pst;
            
            int opt=JOptionPane.showConfirmDialog(null, "Do you want to Delete?", "Confirm", JOptionPane.YES_NO_OPTION);
            if(opt == 0){
                String sql="DELETE FROM tbl_registration WHERE student_id = ?";
                try {
                    pst = con.prepareStatement(sql);
                    int idss = Integer.parseInt(txt_re_id.getText().trim());
                    pst.setInt(1, idss);
                    
                    String LocationDL = "test/temps/"+fileID.getText().trim();
                    File fs = new File(LocationDL);
                    if(fs.exists()){
                        fs.delete();
                        fileID.setText("");
                    }
                    int row = pst.executeUpdate();
                        if(row > 0){
                            JOptionPane.showMessageDialog(null, "Delete Success");
                            Clear();
                            pst.close();
                            con.close();
                            SelectDt();
                            }else{
                                JOptionPane.showMessageDialog(null, "Delete Fail");
                            }
                } catch (NumberFormatException | SQLException e) {
                      JOptionPane.showMessageDialog(null, e);  
                }
                btn_re_update.setEnabled(false);
                btn_re_delete.setEnabled(false);
            }
        }catch (HeadlessException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btn_re_deleteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Clear();
        AutoID();
        btn_re_update.setEnabled(false);
        btn_re_delete.setEnabled(false);
        btn_re_save.setEnabled(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_re_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_re_searchKeyReleased
        String name= txt_re_search.getText();
        Search(name);
    }//GEN-LAST:event_txt_re_searchKeyReleased

    private void btn_sc_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sc_saveActionPerformed
      if(txt_sc_quiz.getText().trim().isEmpty()){
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Please input Quiz","Message",JOptionPane.WARNING_MESSAGE);
            txt_sc_quiz.requestFocus();
        }else if(txt_sc_attenden.getText().trim().isEmpty()){
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Please input Attenden","Message",JOptionPane.WARNING_MESSAGE);
            txt_sc_attenden.requestFocus();
        }else if(txt_sc_assigment.getText().isEmpty()){
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Please input Assigment","Message",JOptionPane.WARNING_MESSAGE);
            txt_sc_assigment.requestFocus();
        }else if(txt_sc_midterm.getText().trim().isEmpty()){
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Please input Midterm","Message",JOptionPane.WARNING_MESSAGE);
            txt_sc_midterm.requestFocus();
        }else if(txt_sc_final.getText().trim().isEmpty()){
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Please input Final","Message",JOptionPane.WARNING_MESSAGE);
            txt_sc_final.requestFocus();
        }else if(txt_sc_total.getText().trim().isEmpty()){
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Please input Total","Message",JOptionPane.WARNING_MESSAGE);
            txt_sc_total.requestFocus();
        }else if(cbo_sc_studentid.getItemCount()==0){
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Please Select Student ID","Message",JOptionPane.WARNING_MESSAGE);
            cbo_sc_studentid.requestFocus();
        }else if(cbo_sc_subjectid.getItemCount()==0){
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Please Select Subject ID","Message",JOptionPane.WARNING_MESSAGE);
            cbo_sc_subjectid.requestFocus();
        }else{
        
        SumScore();
        con=ConDB.getConnection();
        PreparedStatement pst;
         DateFormat ds= new SimpleDateFormat("yyyy-MM-dd");
         Date dt = new Date();
        String sql="INSERT INTO tbl_score( student_id, subject_id, quiz, attenden, midterm, assignment, final, total,for_month) VALUES (?,?,?,?,?,?,?,?,?)";
        try {
            pst=con.prepareStatement(sql);
            int cbo=Integer.parseInt(cbo_sc_studentid.getSelectedItem().toString());
            int cbo_subId=Integer.parseInt(cbo_sc_subjectid.getSelectedItem().toString());
            float quiz =Float.parseFloat(txt_sc_quiz.getText().trim());
            float attenden =Float.parseFloat(txt_sc_attenden.getText().trim());
            float assigment =Float.parseFloat(txt_sc_assigment.getText().trim());
            float finals =Float.parseFloat(txt_sc_midterm.getText().trim());
            float midterm =Float.parseFloat(txt_sc_final.getText().trim());
            float total =Float.parseFloat(txt_sc_total.getText().trim());
            pst.setInt(1, cbo);
            pst.setInt(2, cbo_subId);
            pst.setFloat(3, quiz);
            pst.setFloat(4, attenden);   
            pst.setFloat(5, assigment);
            pst.setFloat(6, finals);
            pst.setFloat(7, midterm);
            pst.setFloat(8, total);
            pst.setString(9, ds.format(dt));
            int row = pst.executeUpdate();
            if(row > 0){
                JOptionPane.showMessageDialog(null, "Insert Success");
                clearSc();
                jtable1sc();
                pst.close();
                con.close();
            }else{
                JOptionPane.showMessageDialog(null, "Insert Fail");
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
          
        }
        } 
    {                                     
    }//GEN-LAST:event_btn_sc_saveActionPerformed

    private void btn_sc_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sc_updateActionPerformed
       if(txt_sc_quiz.getText().trim().isEmpty()){
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Please input Quiz","Message",JOptionPane.WARNING_MESSAGE);
            txt_sc_quiz.requestFocus();
        }else if(txt_sc_attenden.getText().trim().isEmpty()){
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Please input Attenden","Message",JOptionPane.WARNING_MESSAGE);
            txt_sc_attenden.requestFocus();
        }else if(txt_sc_assigment.getText().trim().isEmpty()){
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Please input Assigment","Message",JOptionPane.WARNING_MESSAGE);
            txt_sc_assigment.requestFocus();
        }else if(txt_sc_midterm.getText().trim().isEmpty()){
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Please input Final","Message",JOptionPane.WARNING_MESSAGE);
            txt_sc_assigment.requestFocus();
        }else if(txt_sc_final.getText().trim().isEmpty()){
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Please input Midterm","Message",JOptionPane.WARNING_MESSAGE);
            txt_sc_final.requestFocus();
        }else if(txt_sc_total.getText().trim().isEmpty()){
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Please input Total","Message",JOptionPane.WARNING_MESSAGE);
            txt_sc_total.requestFocus();
        }else if(cbo_sc_studentid.getItemCount()==0){
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Please Select Student ID","Message",JOptionPane.WARNING_MESSAGE);
            cbo_sc_studentid.requestFocus();
        }else if(cbo_sc_subjectid.getItemCount()==0){
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Please Select Subject ID","Message",JOptionPane.WARNING_MESSAGE);
            cbo_sc_subjectid.requestFocus();
        }else{
        
        con=ConDB.getConnection();
        PreparedStatement pst;
        DateFormat ds = new SimpleDateFormat("yyy-MM-dd");
        Date dt = new Date();
        String sql="UPDATE tbl_score SET student_id=?,subject_id=?,quiz=?,attenden=?,midterm=?,assignment=?,final=?,total=?,for_month=? WHERE socre_id=? ";
        try {
            pst=con.prepareStatement(sql);
            int Scoreid =Integer.parseInt(txt_Sc_score.getText().trim());
            int cbo=Integer.parseInt(cbo_sc_studentid.getSelectedItem().toString());
            int cbo_subId=Integer.parseInt(cbo_sc_subjectid.getSelectedItem().toString());
            float quiz =Float.parseFloat(txt_sc_quiz.getText().trim());
            float attenden =Float.parseFloat(txt_sc_attenden.getText().trim());
            float assigment =Float.parseFloat(txt_sc_assigment.getText().trim());
            float finals =Float.parseFloat(txt_sc_midterm.getText().trim());
            float midterm =Float.parseFloat(txt_sc_final.getText().trim());
            float total =Float.parseFloat(txt_sc_total.getText().trim());
            pst.setInt(1, cbo);
            pst.setInt(2, cbo_subId);
            pst.setFloat(3, quiz);
            pst.setFloat(4, attenden);   
            pst.setFloat(5, assigment);
            pst.setFloat(6, finals);
            pst.setFloat(7, midterm);
            pst.setFloat(8, total);
            pst.setString(9, ds.format(dt));
            pst.setInt(10, Scoreid);        
            int row = pst.executeUpdate();
            if(row > 0){
                JOptionPane.showMessageDialog(null, "Update Success");
                btn_sc_update.setEnabled(false);
                btn_sc_deleted.setEnabled(false);
                btn_sc_save.setEnabled(true);
                clearSc();
                pst.close();
                con.close();
            }else{
                JOptionPane.showMessageDialog(null, "Update Fail");
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            
        }
            jtable1sc();
        }
        } 
    {             
    }//GEN-LAST:event_btn_sc_updateActionPerformed

    private void btn_sc_newActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sc_newActionPerformed
        clearSc();
        btn_sc_update.setEnabled(false);
        btn_sc_deleted.setEnabled(false);
        btn_sc_save.setEnabled(true);
    }//GEN-LAST:event_btn_sc_newActionPerformed

    private void txt_sc_quizKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_sc_quizKeyTyped
        char c=evt.getKeyChar();
        if (Character.isLetter(c) &&! evt.isAltDown()) {
            evt.consume();
        }else{
            if(txt_sc_quiz.getText().trim().length() >= 2){
                evt.consume();
            }
        }
    }//GEN-LAST:event_txt_sc_quizKeyTyped

    private void jTable1_scMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1_scMouseClicked
        btn_sc_save.setEnabled(false);
        btn_sc_update.setEnabled(true);
        btn_sc_deleted.setEnabled(true);
        model = (DefaultTableModel) jTable1_sc.getModel();
        int selectRowIndex = jTable1_sc.getSelectedRow();
            
            cbo_sc_studentid.setSelectedItem(model.getValueAt(selectRowIndex, 0).toString());
            cbo_sc_subjectid.setSelectedItem(model.getValueAt(selectRowIndex, 1).toString());
            txt_sc_quiz.setText(model.getValueAt(selectRowIndex, 2).toString());
            txt_sc_attenden.setText(model.getValueAt(selectRowIndex, 3).toString());
            txt_sc_assigment.setText(model.getValueAt(selectRowIndex, 4).toString());
            txt_sc_midterm.setText(model.getValueAt(selectRowIndex, 5).toString());
            txt_sc_final.setText(model.getValueAt(selectRowIndex, 6).toString());
            txt_sc_total.setText(model.getValueAt(selectRowIndex, 7).toString());
            txt_Sc_score.setText(model.getValueAt(selectRowIndex, 8).toString());
    }//GEN-LAST:event_jTable1_scMouseClicked

    private void txt_sc_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_sc_searchKeyReleased
        String Na = txt_sc_search.getText().trim();
        SearchSc(Na);
    }//GEN-LAST:event_txt_sc_searchKeyReleased

    private void txt_sc_attendenKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_sc_attendenKeyTyped
        char c=evt.getKeyChar();
        if (Character.isLetter(c) &&! evt.isAltDown()) {
            evt.consume();
        }else{
            if(txt_sc_attenden.getText().trim().length() >= 2){
                evt.consume();
            }
        }
    }//GEN-LAST:event_txt_sc_attendenKeyTyped

    private void txt_sc_assigmentKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_sc_assigmentKeyTyped
         char c=evt.getKeyChar();
        if (Character.isLetter(c) &&! evt.isAltDown()) {
            evt.consume();
        }else{
            if(txt_sc_assigment.getText().trim().length() >= 2){
                evt.consume();
            }
        }
    }//GEN-LAST:event_txt_sc_assigmentKeyTyped

    private void txt_sc_midtermKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_sc_midtermKeyTyped
         char c=evt.getKeyChar();
        if (Character.isLetter(c) &&! evt.isAltDown()) {
            evt.consume();
        }else{
            if(txt_sc_midterm.getText().trim().length() >= 2){
                evt.consume();
            }
        }
    }//GEN-LAST:event_txt_sc_midtermKeyTyped

    private void txt_sc_finalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_sc_finalKeyTyped
        char c=evt.getKeyChar();
        if (Character.isLetter(c) &&! evt.isAltDown()) {
            evt.consume();
        }else{
            if(txt_sc_final.getText().trim().length() >= 2){
                evt.consume();
            }
        }
    }//GEN-LAST:event_txt_sc_finalKeyTyped

    private void txt_sc_totalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_sc_totalKeyTyped
        char c=evt.getKeyChar();
        if (Character.isLetter(c) &&! evt.isAltDown()) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_sc_totalKeyTyped

    private void btn_sc_deletedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sc_deletedActionPerformed

            con=ConDB.getConnection();
            PreparedStatement pst;
            
            int opt=JOptionPane.showConfirmDialog(null, "Do you want to Delete?", "Confirm", JOptionPane.YES_NO_OPTION);
            if(opt == 0){
                String sql="DELETE FROM tbl_score WHERE socre_id=? ";
                try {
                    pst = con.prepareStatement(sql);
                    int idss = Integer.parseInt(txt_Sc_score.getText().trim());
                    pst.setInt(1, idss);
                    int row = pst.executeUpdate();
                        if(row > 0){
                            JOptionPane.showMessageDialog(null, "Delete Success");
                            clearSc();
                            pst.close();
                            con.close();
                            jtable1sc();
                            }else{
                                JOptionPane.showMessageDialog(null, "Delete Fail");
                            }
                } catch (NumberFormatException | SQLException e) {
                      JOptionPane.showMessageDialog(null, e);  
                }
                btn_sc_update.setEnabled(false);
                btn_sc_deleted.setEnabled(false);
                btn_sc_save.setEnabled(true);
            }
    }//GEN-LAST:event_btn_sc_deletedActionPerformed

    private void txt_sc_searchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_sc_searchFocusGained
        if(txt_sc_search.getText().trim().equals("Search.Here...")){
            txt_sc_search.setText("");
            txt_sc_search.setForeground(Color.black);
        }
    }//GEN-LAST:event_txt_sc_searchFocusGained

    private void txt_sc_searchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_sc_searchFocusLost
        if(txt_sc_search.getText().trim().equals("")){
            txt_sc_search.setText("Search.Here...");
            txt_sc_search.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txt_sc_searchFocusLost

    private void txt_re_searchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_re_searchFocusGained
        if(txt_re_search.getText().equals("Search.Here...")){
            txt_re_search.setText("");
            txt_re_search.setForeground(Color.black);
        }
    }//GEN-LAST:event_txt_re_searchFocusGained

    private void txt_re_searchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_re_searchFocusLost
       if(txt_re_search.getText().trim().equals("")){
           txt_re_search.setText("Search.Here...");
           txt_re_search.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txt_re_searchFocusLost

    private void btn_tc_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tc_updateActionPerformed
         if(txt_tc_teachername.getText().trim().isEmpty()){
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Please input TeacherName","Message",JOptionPane.WARNING_MESSAGE);
            txt_tc_teachername.requestFocus();
        }else if(dc_tc_dateofbirth.getDate()==null){
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Please input Select Date","Message",JOptionPane.WARNING_MESSAGE);
            dc_tc_dateofbirth.requestFocus();
        }else if(txt_tc_phonenumber.getText().trim().isEmpty()){
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Please input Phone Number","Message",JOptionPane.WARNING_MESSAGE);
            txt_tc_phonenumber.requestFocus();
        }else if(txt_tc_email.getText().trim().isEmpty()){
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Incorrect Email","Message",JOptionPane.WARNING_MESSAGE);
            txt_tc_email.requestFocus();
        }else{
        
        con=ConDB.getConnection();
        PreparedStatement pst;
        
        SimpleDateFormat sdfm = new SimpleDateFormat("yyyy-MM-dd");
        String date = sdfm.format(dc_tc_dateofbirth.getDate());
        
        String sql="UPDATE tbl_teacher SET teacher_name=?,gender=?,dob=?,phone_number=?,email=? WHERE teacher_id=?";
        try {
            pst=con.prepareStatement(sql);
            int teacherid =Integer.parseInt(txt_tc_teacherid.getText().trim());
            
            pst.setString(1, txt_tc_teachername.getText().trim());
            pst.setString(2, cbo_tc_gender.getSelectedItem().toString());
            pst.setString(3, date);
            pst.setString(4, txt_tc_phonenumber.getText().trim());
            pst.setString(5, txt_tc_email.getText().trim());
            pst.setInt(6, teacherid);
            
            int row = pst.executeUpdate();
            if(row > 0){
                JOptionPane.showMessageDialog(null, "Update Success");
                ClearTC();
                pst.close();
                con.close();
            }else{
                JOptionPane.showMessageDialog(null, "Update Fail");
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
          JtableTc();
          btn_tc_update.setEnabled(false);
          btn_tc_delete.setEnabled(false);
          btn_tc_save.setEnabled(true);
        }
        
    }//GEN-LAST:event_btn_tc_updateActionPerformed

    private void btn_tc_newActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tc_newActionPerformed
       ClearTC();
       btn_tc_save.setEnabled(true);
       btn_tc_update.setEnabled(false);
       btn_tc_delete.setEnabled(false);
    }//GEN-LAST:event_btn_tc_newActionPerformed

    private void btn_ss_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ss_saveActionPerformed
     if(txt_ss_subjectname.getText().trim().isEmpty()){
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Please input SubjectName","Message",JOptionPane.WARNING_MESSAGE);
            txt_ss_subjectname.requestFocus();
        }else if(txt_ss_Description.getText().trim().isEmpty()){
            txt_ss_Description.setText("N.A");
            Toolkit.getDefaultToolkit().beep();
        }else if(cbo_ss_Teacherid.getItemCount()==0){
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Please Select Teacher ID","Message",JOptionPane.WARNING_MESSAGE);
            cbo_ss_Teacherid.requestFocus();
        }else{
        
        con=ConDB.getConnection();
        PreparedStatement pst;
       
        String sql="INSERT INTO tbl_subject(subjcet_name, description, teacher_id) VALUES (?,?,?)";
        try {
            pst=con.prepareStatement(sql);
            int cbo=Integer.parseInt(cbo_ss_Teacherid.getSelectedItem().toString());
            pst.setString(1, txt_ss_subjectname.getText().trim());
            pst.setString(2, txt_ss_Description.getText().trim());
            pst.setInt(3, cbo);
            int row = pst.executeUpdate();
            if(row > 0){
                JOptionPane.showMessageDialog(null, "Insert Success");
                Clearss();
                jtable1ss();
                pst.close();
                con.close();
            }else{
                JOptionPane.showMessageDialog(null, "Insert Fail");
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
          
        }
        } 
    {         
    }//GEN-LAST:event_btn_ss_saveActionPerformed

    private void btn_ss_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ss_updateActionPerformed
        if(txt_ss_subjectname.getText().trim().isEmpty()){
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Please input SubjectName","Message",JOptionPane.WARNING_MESSAGE);
            txt_ss_subjectname.requestFocus();
        }else if(txt_ss_Description.getText().trim().isEmpty()){
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Please input Description","Message",JOptionPane.WARNING_MESSAGE);
            txt_sc_assigment.requestFocus();
        }else if(cbo_ss_Teacherid.getItemCount()==0){
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Please Select Teacher ID","Message",JOptionPane.WARNING_MESSAGE);
            cbo_ss_Teacherid.requestFocus();
        }else{
        
        con=ConDB.getConnection();
        PreparedStatement pst;
       
        String sql="UPDATE tbl_subject SET subjcet_name=?,description=?,teacher_id=? WHERE subject_id=?";
        try {
            pst=con.prepareStatement(sql);
            int subid =Integer.parseInt(txt_ss_subjectid.getText().trim());
            int cbo=Integer.parseInt(cbo_ss_Teacherid.getSelectedItem().toString());
            pst.setString(1, txt_ss_subjectname.getText().trim());
            pst.setString(2, txt_ss_Description.getText().trim());
            pst.setInt(3, cbo);
            pst.setInt(4, subid);
            int row = pst.executeUpdate();
            if(row > 0){
                JOptionPane.showMessageDialog(null, "Update Success");
                Clearss();
                pst.close();
                con.close();
            }else{
                JOptionPane.showMessageDialog(null, "update Fail");
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
          jtable1ss();
          btn_ss_update.setEnabled(false);
          btn_ss_deleted.setEnabled(false);
          btn_ss_save.setEnabled(true);
        }
        } 
    {       
    }//GEN-LAST:event_btn_ss_updateActionPerformed

    private void jTable1_ssMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1_ssMouseClicked
       btn_ss_save.setEnabled(false);
        btn_ss_update.setEnabled(true);
        btn_ss_deleted.setEnabled(true);
        model3 = (DefaultTableModel) jTable1_ss.getModel();
        int selectRowIndex = jTable1_ss.getSelectedRow();
            
            txt_ss_subjectid.setText(model3.getValueAt(selectRowIndex, 0).toString());
            txt_ss_subjectname.setText(model3.getValueAt(selectRowIndex, 1).toString());
            txt_ss_Description.setText(model3.getValueAt(selectRowIndex, 2).toString());
            cbo_ss_Teacherid.setSelectedItem(model3.getValueAt(selectRowIndex, 3).toString());
    }//GEN-LAST:event_jTable1_ssMouseClicked

    private void btn_ss_deletedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ss_deletedActionPerformed
         con=ConDB.getConnection();
            PreparedStatement pst;
            
            int opt=JOptionPane.showConfirmDialog(null, "Do you want to Delete?", "Confirm", JOptionPane.YES_NO_OPTION);
            if(opt == 0){
                String sql="DELETE FROM tbl_subject WHERE subject_id=? ";
                try {
                    pst = con.prepareStatement(sql);
                    int idss = Integer.parseInt(txt_ss_subjectid.getText().trim());
                    pst.setInt(1, idss);
                    int row = pst.executeUpdate();
                        if(row > 0){
                            JOptionPane.showMessageDialog(null, "Delete Success");
                            Clearss();
                            pst.close();
                            con.close();
                            jtable1ss();
                            }else{
                                JOptionPane.showMessageDialog(null, "Delete Fail");
                            }
                } catch (NumberFormatException | SQLException e) {
                      JOptionPane.showMessageDialog(null, e);  
                }
                btn_ss_update.setEnabled(false);
                btn_ss_deleted.setEnabled(false);
                btn_ss_save.setEnabled(true);
            }
    }//GEN-LAST:event_btn_ss_deletedActionPerformed

    private void btn_ss_newActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ss_newActionPerformed
       Clearss();
       btn_ss_save.setEnabled(true);
       btn_ss_deleted.setEnabled(false);
       btn_ss_update.setEnabled(false);
    }//GEN-LAST:event_btn_ss_newActionPerformed

    private void txt_ss_SearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ss_SearchKeyReleased
      String ss =txt_ss_Search.getText().trim();
        SearchSS(ss);
    }//GEN-LAST:event_txt_ss_SearchKeyReleased

    private void txt_ss_SearchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_ss_SearchFocusGained
         if(txt_ss_Search.getText().trim().equals("Search.Here...")){
            txt_ss_Search.setText("");
            txt_ss_Search.setForeground(Color.black);
        }
    }//GEN-LAST:event_txt_ss_SearchFocusGained

    private void txt_ss_SearchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_ss_SearchFocusLost
        if(txt_ss_Search.getText().trim().equals("")){
            txt_ss_Search.setText("Search.Here...");
            txt_ss_Search.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txt_ss_SearchFocusLost

    private void btn_tc_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tc_saveActionPerformed
        if(txt_tc_teachername.getText().trim().isEmpty()){
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Please input TeacherName","Message",JOptionPane.WARNING_MESSAGE);
            txt_tc_teachername.requestFocus();
        }else if(dc_tc_dateofbirth.getDate()==null){
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Please input Select Date","Message",JOptionPane.WARNING_MESSAGE);
            dc_tc_dateofbirth.requestFocus();
        }else if(txt_tc_phonenumber.getText().trim().isEmpty()){
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Please input Phone Number","Message",JOptionPane.WARNING_MESSAGE);
            txt_tc_phonenumber.requestFocus();
        }else if(txt_tc_email.getText().trim().isEmpty()){
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Incorrect Email", "Message", JOptionPane.ERROR_MESSAGE);
            txt_tc_email.requestFocus();
        }else{
        
        con=ConDB.getConnection();
        PreparedStatement pst;
        
        SimpleDateFormat sdfm = new SimpleDateFormat("yyyy-MM-dd");
        String date = sdfm.format(dc_tc_dateofbirth.getDate());
        
        String sql="INSERT INTO tbl_teacher(teacher_name, gender, dob, phone_number, email) VALUES (?,?,?,?,?)";
        try {
            pst=con.prepareStatement(sql);
            
            pst.setString(1, txt_tc_teachername.getText().trim());
            pst.setString(2, cbo_tc_gender.getSelectedItem().toString());
            pst.setString(3, date);
            pst.setString(4, txt_tc_phonenumber.getText().trim());
            pst.setString(5, txt_tc_email.getText().trim());
            int row = pst.executeUpdate();
            if(row > 0){
                JOptionPane.showMessageDialog(null, "Insert Success");
                ClearTC();
                pst.close();
                con.close();
            }else{
                JOptionPane.showMessageDialog(null, "Insert Fail");
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
          JtableTc();
        }
    }//GEN-LAST:event_btn_tc_saveActionPerformed

    private void JTable1_tcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTable1_tcMouseClicked
       btn_tc_save.setEnabled(false);
       btn_tc_update.setEnabled(true);
       btn_tc_delete.setEnabled(true);
       model4 = (DefaultTableModel) JTable1_tc.getModel();
        int selectRowIndex = JTable1_tc.getSelectedRow();
            
            txt_tc_teacherid.setText(model4.getValueAt(selectRowIndex, 0).toString());
            txt_tc_teachername.setText(model4.getValueAt(selectRowIndex, 1).toString());
            cbo_tc_gender.setSelectedItem(model4.getValueAt(selectRowIndex, 2).toString());
            String date = model4.getValueAt(selectRowIndex, 3).toString();
            try {
                Date dt = new SimpleDateFormat("yyy-MM-dd").parse(date);
                dc_tc_dateofbirth.setDate(dt);
            } catch (ParseException ex) {
                Logger.getLogger(Main_form.class.getName()).log(Level.SEVERE, null, ex);
            }
            txt_tc_phonenumber.setText(model4.getValueAt(selectRowIndex, 4).toString());
            txt_tc_email.setText(model4.getValueAt(selectRowIndex, 5).toString());
           
    }//GEN-LAST:event_JTable1_tcMouseClicked

    private void btn_tc_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tc_deleteActionPerformed
       con=ConDB.getConnection();
            PreparedStatement pst;
            
            int opt=JOptionPane.showConfirmDialog(null, "Do you want to Delete?", "Confirm", JOptionPane.YES_NO_OPTION);
            if(opt == 0){
                String sql="DELETE FROM tbl_teacher WHERE teacher_id=? ";
                try {
                    pst = con.prepareStatement(sql);
                    int idss = Integer.parseInt(txt_tc_teacherid.getText().trim());
                    pst.setInt(1, idss);
                    int row = pst.executeUpdate();
                        if(row > 0){
                            JOptionPane.showMessageDialog(null, "Delete Success");
                            ClearTC();
                            pst.close();
                            con.close();
                            JtableTc();
                            }else{
                                JOptionPane.showMessageDialog(null, "Delete Fail");
                            }
                } catch (NumberFormatException | SQLException e) {
                      JOptionPane.showMessageDialog(null, e);  
                }
                btn_tc_update.setEnabled(false);
                btn_tc_delete.setEnabled(false);
                btn_tc_save.setEnabled(true);
            }
    }//GEN-LAST:event_btn_tc_deleteActionPerformed

    private void txt_tc_searchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_tc_searchFocusGained
         if(txt_tc_search.getText().trim().equals("Search.Here...")){
            txt_tc_search.setText("");
            txt_tc_search.setForeground(Color.black);
        }
    }//GEN-LAST:event_txt_tc_searchFocusGained

    private void txt_tc_searchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_tc_searchFocusLost
        if(txt_tc_search.getText().trim().equals("")){
            txt_tc_search.setText("Search.Here...");
            txt_tc_search.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txt_tc_searchFocusLost

    private void txt_tc_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_tc_searchKeyReleased
        String ss =txt_tc_search.getText();
        SearchTc(ss);
    }//GEN-LAST:event_txt_tc_searchKeyReleased

    private void txt_tc_emailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_tc_emailFocusLost
        if(txt_tc_email.getText().trim().isEmpty()){
            
        }else{
            if(txt_tc_email.getText().trim().equals("N.A")){
                
            }else{
                String EMAIL_REGEX = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
                String email1 = txt_tc_email.getText().trim();
                Boolean b = email1.matches(EMAIL_REGEX);

                if(b==false){
                    txt_tc_email.setText(""); 
                    getToolkit().beep();
                }
            }
        }
    }//GEN-LAST:event_txt_tc_emailFocusLost

    private void txt_pay_searchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_pay_searchFocusGained
       if(txt_pay_search.getText().trim().equals("Search.Here...")){
            txt_pay_search.setText("");
            txt_pay_search.setForeground(Color.black);
        }
    }//GEN-LAST:event_txt_pay_searchFocusGained

    private void txt_pay_searchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_pay_searchFocusLost
       if(txt_pay_search.getText().trim().equals("")){
            txt_pay_search.setText("Search.Here...");
            txt_pay_search.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txt_pay_searchFocusLost

    private void txt_pay_findFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_pay_findFocusGained
        if(txt_pay_find.getText().trim().equals("Find.SID...")){
            txt_pay_find.setText("");
            txt_pay_find.setForeground(Color.black);
        }
    }//GEN-LAST:event_txt_pay_findFocusGained

    private void txt_pay_findFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_pay_findFocusLost
        
        if(txt_pay_find.getText().trim().equals("")){
            txt_pay_find.setText("Find.SID...");
            txt_pay_find.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txt_pay_findFocusLost

    private void txt_pay_findKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_pay_findKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)){
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_txt_pay_findKeyTyped

    private void txt_pay_findKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_pay_findKeyPressed
        char c = evt.getKeyChar();
        if(c == KeyEvent.VK_ENTER){
            Search_pay();
        }
    }//GEN-LAST:event_txt_pay_findKeyPressed

    private void txt_re_emailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_re_emailFocusLost
        if(txt_re_email.getText().trim().isEmpty()){
            
        }else{
            if(txt_re_email.getText().trim().equals("N.A")){
                
            }else{
                String EMAIL_REGEX = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
                String email1 = txt_re_email.getText().trim();
                Boolean b = email1.matches(EMAIL_REGEX);

                if(b==false){
                    txt_re_email.setText(""); 
                    getToolkit().beep();
                }
            }
        }
    }//GEN-LAST:event_txt_re_emailFocusLost

    private void cbo_pay_discountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_pay_discountActionPerformed
        Calculate();
    }//GEN-LAST:event_cbo_pay_discountActionPerformed

    private void cbo_payforActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_payforActionPerformed
        String cbo_pay_for =cbo_payfor.getSelectedItem().toString();
        if(cbo_pay_for.equals("Semester")){
            
            con = ConDB.getConnection();
            String sql="SELECT tax from tbl_extra";
            try {
                stm=con.createStatement();
                rs=stm.executeQuery(sql);
                if(rs.next()){
                    float tax = rs.getFloat("tax");
                    txt_pay_tax.setText(String.valueOf(tax));
                }else{
                    JOptionPane.showMessageDialog(null, "Error Tax");
                }
                stm.close();
                rs.close();
                con.close();

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
            
        }else{
            txt_pay_tax.setText("0");
        }
        Calculate();
    }//GEN-LAST:event_cbo_payforActionPerformed

    private void btn_pay_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pay_saveActionPerformed
       if(txt_pay_find.getText().trim().isEmpty()){
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Please input Student ID","Message",JOptionPane.WARNING_MESSAGE);
            txt_pay_find.requestFocus();
        }else if(txt_pay_fname.getText().trim().isEmpty()){
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Please input FirstName","Message",JOptionPane.WARNING_MESSAGE);
            txt_pay_fname.requestFocus();
        }else if(txt_pay_lname.getText().trim().isEmpty()){
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Please input LastName","Message",JOptionPane.WARNING_MESSAGE);
           txt_pay_lname.requestFocus();
        }else if(cbo_pay_date.getDate()==null){
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Please input Date","Message",JOptionPane.WARNING_MESSAGE);
            cbo_pay_date.requestFocus();
        }else if(txt_amount.getText().trim().isEmpty()){
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Please Select Discount","Message",JOptionPane.WARNING_MESSAGE);
            cbo_pay_discount.requestFocus();
        }else{
        
        con=ConDB.getConnection();
        PreparedStatement pst;
        
        int uid = Integer.parseInt(txt_pay_find.getText().trim());
        SimpleDateFormat sdfm = new SimpleDateFormat("yyyy-MM-dd");
        String date = sdfm.format(cbo_pay_date.getDate());
        float amount =Float.parseFloat(txt_amount.getText().trim());
        float tax =Float.parseFloat(txt_pay_tax.getText().trim());
        float totlausd= Float.parseFloat(txt_total_usd.getText().trim());
        float totalkh =Float.parseFloat(txt_total_kh.getText().trim());
        String sql="INSERT INTO tbl_payment( student_id, firstname,lastname,for_year,pay_for,payment_date,discount,amount,tax,total_usd,total_kh) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        try {
            pst=con.prepareStatement(sql);
            
            pst.setInt(1, uid);
            pst.setString(2, txt_pay_fname.getText().trim());
            pst.setString(3, txt_pay_lname.getText().trim());
            pst.setString(4, cbo_for_year.getSelectedItem().toString());
            pst.setString(5, cbo_payfor.getSelectedItem().toString());
            pst.setString(6, date);
            pst.setString(7, cbo_pay_discount.getSelectedItem().toString());
            pst.setFloat(8, amount);
            pst.setFloat(9, tax);
            pst.setFloat(10, totlausd);
            pst.setFloat(11, totalkh);
            
            int row = pst.executeUpdate();
            if(row > 0){
                JOptionPane.showMessageDialog(null, "Payment Success...");
                //Clearpay();
                pst.close();
                con.close();
            }else{
                JOptionPane.showMessageDialog(null, "Payment Fail...");
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
            Jtablepay();
            btn_pay_print.setEnabled(true);
            btn_pay_save.setEnabled(false);
            
        }
    }//GEN-LAST:event_btn_pay_saveActionPerformed

    private void btn_pay_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pay_deleteActionPerformed
        con=ConDB.getConnection();
            PreparedStatement pst;
            
            int opt=JOptionPane.showConfirmDialog(null, "Do you want to Delete?", "Confirm", JOptionPane.YES_NO_OPTION);
            if(opt == 0){
                String sql="DELETE FROM tbl_payment WHERE payment_id =?";
                try {
                    pst = con.prepareStatement(sql);
                    int idss = Integer.parseInt(txt_pay_id.getText().trim());
                    pst.setInt(1, idss);
                    int row = pst.executeUpdate();
                        if(row > 0){
                            JOptionPane.showMessageDialog(null, "Delete Success");
                            Clearpay();
                            Jtablepay();
                            pst.close();
                            con.close();
                            }else{
                                JOptionPane.showMessageDialog(null, "Delete Fail");
                            }
                } catch (NumberFormatException | SQLException e) {
                      JOptionPane.showMessageDialog(null, e);  
                }
                btn_pay_delete.setEnabled(false);
                btn_pay_save.setEnabled(true);
                btn_pay_print.setEnabled(false);
            }
    }//GEN-LAST:event_btn_pay_deleteActionPerformed

    private void tbl_paymentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_paymentMouseClicked

        btn_pay_delete.setEnabled(true);
        model5 = (DefaultTableModel) tbl_payment.getModel();
        int selectRowIndex = tbl_payment.getSelectedRow();
            
        txt_pay_id.setText(model5.getValueAt(selectRowIndex, 0).toString());
             
    }//GEN-LAST:event_tbl_paymentMouseClicked

    private void btn_pay_newActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pay_newActionPerformed
       Clearpay();
       btn_pay_save.setEnabled(true);
       btn_pay_print.setEnabled(false);
       btn_pay_delete.setEnabled(false);
    }//GEN-LAST:event_btn_pay_newActionPerformed

    private void txt_pay_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_pay_searchKeyReleased
        String ss =txt_pay_search.getText().trim();
        Searchpay(ss);
    }//GEN-LAST:event_txt_pay_searchKeyReleased

    private void btn_pay_printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pay_printActionPerformed
       try{
           printReport();
       }catch (Exception e){
           JOptionPane.showMessageDialog(null, e,"Message",JOptionPane.WARNING_MESSAGE);
       }
    }//GEN-LAST:event_btn_pay_printActionPerformed

    private void txt_sc_totalFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_sc_totalFocusGained
        SumScore();
    }//GEN-LAST:event_txt_sc_totalFocusGained

    private void btn_createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_createActionPerformed

        if(txt_username.getText().trim().isEmpty()){
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Please input Username","Message",JOptionPane.WARNING_MESSAGE);
            txt_username.requestFocus();
        }else if(txt_user_password.getText().trim().isEmpty()){
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Please input User password","Message",JOptionPane.WARNING_MESSAGE);
            txt_user_password.requestFocus();
        }else if(txt_user_password_re.getText().trim().isEmpty()){
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Pleas input Re-Password","Message",JOptionPane.WARNING_MESSAGE);
            txt_user_password_re.requestFocus();
        }else if(!txt_user_password.getText().trim().equals(txt_user_password_re.getText().trim())){
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Confirm password Incorect","Message",JOptionPane.WARNING_MESSAGE);
            txt_user_password_re.setText("");
        }else if(user_dob.getDate()==null){
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Pleas Input Birth Date","Message",JOptionPane.WARNING_MESSAGE);
            user_dob.requestFocus();
        }else if(txt_user_email.getText().trim().isEmpty()){
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Incorrect Email","Message",JOptionPane.WARNING_MESSAGE);
            txt_user_email.requestFocus();
        }else{
            
            con = ConDB.getConnection();
            String sqls="SELECT username from tbl_user where username = '"+txt_username.getText().trim()+"'";
            try {
                stm=con.createStatement();
                rs=stm.executeQuery(sqls);

                if(rs.next()){
                    getToolkit().beep();
                    JOptionPane.showMessageDialog(null, "<< "+txt_username.getText().trim()+" >> The User Name is Already...","Message",JOptionPane.WARNING_MESSAGE);
                    txt_username.setText("");
                    stm.close();
                    rs.close();
                    con.close();
                }else{
                        con=ConDB.getConnection();
                        PreparedStatement pst;
                        SimpleDateFormat sdfm = new SimpleDateFormat("yyyy-MM-dd");
                        String date = sdfm.format(user_dob.getDate());

                        String sql="INSERT INTO tbl_user(username, password, status, attempt_count, user_lavel, birth_date, user_email) VALUES(?,?,?,?,?,?,?)";
                        try {
                            pst=con.prepareStatement(sql);

                            pst.setString(1, txt_username.getText().trim());
                            pst.setString(2, txt_user_password.getText().trim());
                            pst.setString(3, cbo_status.getSelectedItem().toString());
                            pst.setInt(4, 0);
                            pst.setString(5, cbo_user_level.getSelectedItem().toString());
                            pst.setString(6, date);
                            pst.setString(7, txt_user_email.getText().trim());
                            int row = pst.executeUpdate();
                            if(row > 0){
                                JOptionPane.showMessageDialog(null, "Create Success");
                                Clear_user();
                                pst.close();
                                con.close();
                            }else{
                                JOptionPane.showMessageDialog(null, "Create Fail");
                            }
                        } catch (HeadlessException | SQLException e) {
                            JOptionPane.showMessageDialog(null, e);
                        }
                          show_user();
                    //////////////////
                }

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }

        }
    }//GEN-LAST:event_btn_createActionPerformed

    private void btn_user_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_user_updateActionPerformed
       if(txt_username.getText().trim().isEmpty()){
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Please input Username","Message",JOptionPane.WARNING_MESSAGE);
            txt_username.requestFocus();
        }else if(txt_user_password.getText().trim().isEmpty()){
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Please input User password","Message",JOptionPane.WARNING_MESSAGE);
            txt_user_password.requestFocus();
        }else{
            
                con=ConDB.getConnection();
                PreparedStatement pst;
                SimpleDateFormat sdfm = new SimpleDateFormat("yyyy-MM-dd");
                String date = sdfm.format(user_dob.getDate());
                String sql="UPDATE tbl_user SET username=?,password=?,status=?,attempt_count=?,user_lavel=?,birth_date=?,user_email=? WHERE user_id=?";
                try {
                    pst=con.prepareStatement(sql);
                    int userID =Integer.parseInt(txt_user_ids.getText().trim());

                    pst.setString(1, txt_username.getText().trim());
                    pst.setString(2, txt_user_password.getText().trim());
                    pst.setString(3, cbo_status.getSelectedItem().toString());
                    pst.setInt(4, 0);
                    pst.setString(5, cbo_user_level.getSelectedItem().toString());
                    pst.setString(6, date);
                    pst.setString(7, txt_user_email.getText().trim());
                    pst.setInt(8, userID);

                    int row = pst.executeUpdate();
                    if(row > 0){
                        JOptionPane.showMessageDialog(null, "Update Success");
                        Clear_user();
                        pst.close();
                        con.close();
                    }else{
                        JOptionPane.showMessageDialog(null, "Update Fail");
                    }
                } catch (HeadlessException | SQLException e) {
                    JOptionPane.showMessageDialog(null, e);
                }
                    show_user();
                    btn_user_update.setEnabled(false);
                    btn_user_delete.setEnabled(false);
                }
    }//GEN-LAST:event_btn_user_updateActionPerformed

    private void tbl_user_infoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_user_infoMouseClicked

        model6 = (DefaultTableModel) tbl_user_info.getModel();
        int selectRowIndex = tbl_user_info.getSelectedRow();
            
            txt_user_ids.setText(model6.getValueAt(selectRowIndex, 0).toString());
            txt_username.setText(model6.getValueAt(selectRowIndex, 1).toString());
            txt_user_password.setText(model6.getValueAt(selectRowIndex, 2).toString());
            cbo_status.setSelectedItem(model6.getValueAt(selectRowIndex, 3).toString());
            cbo_user_level.setSelectedItem(model6.getValueAt(selectRowIndex, 5).toString());
            String date = model6.getValueAt(selectRowIndex, 6).toString();
            try {
                Date dt = new SimpleDateFormat("yyyy-MM-dd").parse(date);
                user_dob.setDate(dt);
            } catch (ParseException ex) {
               JOptionPane.showMessageDialog(null, ex);
            }
            txt_user_email.setText(model6.getValueAt(selectRowIndex, 7).toString());
            
            if(cbo_user_level.getSelectedItem().toString().equals("User")){
                btn_user_delete.setEnabled(true);
                btn_user_update.setEnabled(true);
            }else{
                btn_user_delete.setEnabled(false);
                btn_user_update.setEnabled(true);
            }
    }//GEN-LAST:event_tbl_user_infoMouseClicked

    private void btn_find_reportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_find_reportActionPerformed
        if(cbo_date_from.getDate() == null)
        {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Please Select From Date","Message",JOptionPane.WARNING_MESSAGE);
            cbo_date_from.requestFocus();
        }else if(cbo_date_to.getDate() == null)
        {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Please Select To Date","Message",JOptionPane.WARNING_MESSAGE);
            cbo_date_to.requestFocus();
        }else{
            rpt_payment();
        }     
    }//GEN-LAST:event_btn_find_reportActionPerformed

    private void cbo_sort_payActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_sort_payActionPerformed
        if(cbo_date_from.getDate() == null)
        {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Please Select From Date","Message",JOptionPane.WARNING_MESSAGE);
            cbo_date_from.requestFocus();
        }else if(cbo_date_to.getDate() == null)
        {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Please Select To Date","Message",JOptionPane.WARNING_MESSAGE);
            cbo_date_to.requestFocus();
        }else{
            rpt_payment();
        }     
    }//GEN-LAST:event_cbo_sort_payActionPerformed

    private void btn_user_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_user_deleteActionPerformed
        con=ConDB.getConnection();
            PreparedStatement pst;
            
            int opt=JOptionPane.showConfirmDialog(null, "Do you want to Delete?", "Confirm", JOptionPane.YES_NO_OPTION);
            if(opt == 0){
                String sql="DELETE FROM tbl_user WHERE user_id=?";
                try {
                    pst = con.prepareStatement(sql);
                    int ids = Integer.parseInt(txt_user_ids.getText().trim());
                    pst.setInt(1, ids);
                    int row = pst.executeUpdate();
                        if(row > 0){
                            JOptionPane.showMessageDialog(null, "Delete Success");
                            Clear_user();
                            pst.close();
                            con.close();
                            jtable1ss();
                            }else{
                                JOptionPane.showMessageDialog(null, "Delete Fail");
                            }
                } catch (NumberFormatException | SQLException e) {
                      JOptionPane.showMessageDialog(null, e);  
                }
                   btn_user_delete.setEnabled(false);
                   btn_user_update.setEnabled(false);
                   show_user();
            }
    }//GEN-LAST:event_btn_user_deleteActionPerformed

    private void btn_find_scoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_find_scoreActionPerformed
         if(cbo_date_from_sc.getDate() == null)
        {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Please Select From Date","Message",JOptionPane.WARNING_MESSAGE);
            cbo_date_from_sc.requestFocus();
        }else if(cbo_date_to_sc.getDate() == null){
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Please Select To Date","Message",JOptionPane.WARNING_MESSAGE);
            cbo_date_to_sc.requestFocus();
        }else if(cbo_sub_id.getItemCount()==0){
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Please Select Subject ID","Message",JOptionPane.WARNING_MESSAGE);
            cbo_sub_id.requestFocus();
        }else{
            scoreRP();
        }     
    }//GEN-LAST:event_btn_find_scoreActionPerformed

    private void cbo_sort_scActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_sort_scActionPerformed
        if(cbo_date_from_sc.getDate() == null)
        {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Please Select From Date","Message",JOptionPane.WARNING_MESSAGE);
            cbo_date_from_sc.requestFocus();
        }else if(cbo_date_to_sc.getDate() == null)
        {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Please Select To Date","Message",JOptionPane.WARNING_MESSAGE);
            cbo_date_to_sc.requestFocus();
        }else{
             scoreRP();
        }     
    }//GEN-LAST:event_cbo_sort_scActionPerformed

    private void btn_view_reportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_view_reportActionPerformed
       try{
           Printpayment();
       }catch (Exception e){
           JOptionPane.showMessageDialog(null, e,"Message",JOptionPane.WARNING_MESSAGE);
       }    
    }//GEN-LAST:event_btn_view_reportActionPerformed

    private void btn_score_previewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_score_previewActionPerformed
       try{
           Printscore();
       }catch (Exception e){
           JOptionPane.showMessageDialog(null, e,"Message",JOptionPane.WARNING_MESSAGE);
       }       
    }//GEN-LAST:event_btn_score_previewActionPerformed

    private void btn_changeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_changeActionPerformed
        if(txt_study_price.getText().trim().isEmpty()){
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Please input Price","Message",JOptionPane.WARNING_MESSAGE);
            txt_study_price.requestFocus();
        }else if(txt_pay_taxs.getText().trim().isEmpty()){
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Please input Tax","Message",JOptionPane.WARNING_MESSAGE);
            txt_pay_taxs.requestFocus();
        }else if(txt_exchange_rate.getText().trim().isEmpty()){
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Please input Ex-change Rate","Message",JOptionPane.WARNING_MESSAGE);
            txt_exchange_rate.requestFocus();
        }else{
            
            con=ConDB.getConnection();
                PreparedStatement pst;
                    String sql="Update tbl_extra Set id=?, p_of_study=?, tax=?, ex_change_rt=?";
                try {
                    pst=con.prepareStatement(sql);
                    
                    float price= Float.parseFloat(txt_study_price.getText().trim());
                    float taxs= Float.parseFloat(txt_pay_taxs.getText().trim());
                    float ex_ch= Float.parseFloat(txt_exchange_rate.getText().trim());
                    
                    pst.setInt(1, 1);
                    pst.setFloat(2, price);
                    pst.setFloat(3, taxs);
                    pst.setFloat(4, ex_ch);

                    int row = pst.executeUpdate();
                    if(row > 0){
                        JOptionPane.showMessageDialog(null, "Update Success");
                        pst.close();
                        con.close();
                    }else{
                        JOptionPane.showMessageDialog(null, "Update Fail");
                    }
                } catch (HeadlessException | SQLException e) {
                    JOptionPane.showMessageDialog(null, e);
                }
        }
    }//GEN-LAST:event_btn_changeActionPerformed

    private void jLabel94MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel94MouseClicked
        try {
            Desktop.getDesktop().browse(new URL("https://web.facebook.com/thyna.com.kh").toURI());     
        } catch (IOException | URISyntaxException e) {
            JOptionPane.showMessageDialog(null, "No Internet Connection","Message",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jLabel94MouseClicked

    private void jLabel96MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel96MouseClicked
        try {
            Desktop.getDesktop().browse(new URL("https://m.facebook.com/ZzKPCzZ").toURI());     
        } catch (IOException | URISyntaxException e) {
            JOptionPane.showMessageDialog(null, "No Internet Connection","Message",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jLabel96MouseClicked

    private void jLabel101MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel101MouseClicked

        try {
            Desktop.getDesktop().browse(new URL("https://m.facebook.com/chanthat.chanthat.58").toURI());     
        } catch (IOException | URISyntaxException e) {
            JOptionPane.showMessageDialog(null, "No Internet Connection","Message",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jLabel101MouseClicked

    private void txt_user_emailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_user_emailFocusLost
        if(txt_user_email.getText().trim().isEmpty()){
            
        }else{
            if(txt_user_email.getText().trim().equals("N.A")){
                
            }else{
                String EMAIL_REGEX = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
                String email1 = txt_user_email.getText().trim();
                Boolean b = email1.matches(EMAIL_REGEX);

                if(b==false){
                    txt_user_email.setText(""); 
                    getToolkit().beep();
                }
            }
        }
    }//GEN-LAST:event_txt_user_emailFocusLost

    private void txt_user_searchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_user_searchFocusGained
        if(txt_user_search.getText().trim().equals("Search.Here...")){
            txt_user_search.setText("");
            txt_user_search.setForeground(Color.black);
        }
    }//GEN-LAST:event_txt_user_searchFocusGained

    private void txt_user_searchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_user_searchFocusLost
        if(txt_user_search.getText().trim().equals("")){
           txt_user_search.setText("Search.Here...");
           txt_user_search.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txt_user_searchFocusLost

    private void txt_user_searchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_user_searchKeyTyped
        String name= txt_user_search.getText().trim();
        SearchUser(name);
    }//GEN-LAST:event_txt_user_searchKeyTyped

    private void txt_usernameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_usernameKeyTyped
        char c = evt.getKeyChar();
        if(Character.isLetter(c) || Character.isISOControl(c) || Character.isDigit(c)){
            evt = evt;  
        }else{
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_txt_usernameKeyTyped
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main_form().setVisible(true);
            }
        });
    }

Thread th;
Runnable r = new Runnable() {
        @Override
        public void run() {
            try{
                while(true){
                    Date d = new Date();
                    SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy, hh:mm:ss a");
                    lbl_clock.setText(sdf.format(d));
                    Thread.sleep(1000);
                }
                }catch(InterruptedException e){
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            }
    };
    
private Collection data(){
    
    ArrayList<Datas> arr = new ArrayList<>();
    String fname=""+txt_pay_fname.getText().trim();
    String lname=""+txt_pay_lname.getText().trim();
    String years=""+cbo_for_year.getSelectedItem().toString();
    String payment_for=""+cbo_payfor.getSelectedItem().toString();
    String discount=""+cbo_pay_discount.getSelectedItem().toString();
    String amount=""+txt_amount.getText().trim();
    String tax=""+txt_pay_tax.getText().trim();
    String total_usd=""+txt_total_usd.getText().trim();
    String total_khr=""+txt_total_kh.getText().trim();
        
    Datas temp = new Datas(fname,lname,years,payment_for,discount,amount,tax,total_usd,total_khr);
    arr.add(temp);
    
    return arr;
}
private Collection datass(){
     ArrayList<Datas3> arrs=new ArrayList<>();
    for(int i=0; i<tbl_score_report.getRowCount(); i++){
        String scoreid = ""+tbl_score_report.getValueAt(i, 0);
        String studentid = ""+tbl_score_report.getValueAt(i, 1);
        String subjectid = ""+tbl_score_report.getValueAt(i, 2);
        String quiz = ""+tbl_score_report.getValueAt(i, 3);
        String attenden = ""+tbl_score_report.getValueAt(i, 4);
        String midterm = ""+tbl_score_report.getValueAt(i, 5);
        String assigment = ""+tbl_score_report.getValueAt(i, 6);
        String finals = ""+tbl_score_report.getValueAt(i, 7);
        String total = ""+tbl_score_report.getValueAt(i, 8);
        String formonth= ""+tbl_score_report.getValueAt(i, 9);
        Datas3 temps = new Datas3(scoreid, studentid, subjectid, quiz, attenden, midterm, assigment, finals, total, formonth);
        arrs.add(temps);
    }
    return arrs;
}
private Collection datas(){
    ArrayList<Datas2> arrs=new ArrayList<>();
    for(int i=0; i<tbl_payment_report.getRowCount(); i++){
        String payID = ""+tbl_payment_report.getValueAt(i, 0);
        String stID = ""+tbl_payment_report.getValueAt(i, 1);
        String fname = ""+tbl_payment_report.getValueAt(i, 2);
        String lname = ""+tbl_payment_report.getValueAt(i, 3);
        String f_year = ""+tbl_payment_report.getValueAt(i, 4);
        String p_for = ""+tbl_payment_report.getValueAt(i, 5);
        String pay_date = ""+tbl_payment_report.getValueAt(i, 6);
        String dsc = ""+tbl_payment_report.getValueAt(i, 7);
        String amount = ""+tbl_payment_report.getValueAt(i, 8);
        String tx = ""+tbl_payment_report.getValueAt(i, 9);
        String t_usd = ""+tbl_payment_report.getValueAt(i, 10);
        String t_kh = ""+tbl_payment_report.getValueAt(i, 11);
        Datas2 temps = new Datas2(payID, stID, fname, lname, f_year, p_for, pay_date, dsc, amount, tx, t_usd, t_kh);
        arrs.add(temps);
    }
    return arrs;
}
private void Printscore(){
    String subNames = null;
    String subName = ""+tbl_score_report.getValueAt(0, 2);
    int ab = Integer.parseInt(subName);
    con = ConDB.getConnection();
        try {
        String sql_1="SELECT subjcet_name From tbl_subject where subject_id="+ab+"";
            Statement stmt;
            stmt = con.createStatement();
            ResultSet rss;
            rss = stmt.executeQuery(sql_1);
                if(rss.next()){
                   subNames= rss.getString("subjcet_name");
                }
                stmt.close();
                rss.close();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, e.getMessage());
    }
        
     try {
        String rptPath = "test/reports/monthly_of_score.jrxml";
        JasperReport jp = JasperCompileManager.compileReport(rptPath);
        HashMap para = new HashMap();
        para.put("subjectname", subNames);
        para.put("pre_by", lbl_user.getText().trim()+"("+lbl_user_level.getText().trim()+")");
        JRBeanCollectionDataSource jcd = new JRBeanCollectionDataSource(datass());
        JasperPrint print = JasperFillManager.fillReport(jp, para, jcd);
        JasperViewer.viewReport(print,false);
        //JasperPrintManager.printReport(print, true);
    } catch (JRException e) {
        JOptionPane.showMessageDialog(this, e.getMessage());
    }
}
private void Printpayment(){
        try {
        String rptPath = "test/reports/monthly_report_py.jrxml";
        JasperReport jp = JasperCompileManager.compileReport(rptPath);
        HashMap para = new HashMap();
        para.put("prepare_by", lbl_user.getText().trim()+"("+lbl_user_level.getText().trim()+")");
        JRBeanCollectionDataSource jcd = new JRBeanCollectionDataSource(datas());
        JasperPrint print = JasperFillManager.fillReport(jp, para, jcd);
        JasperViewer.viewReport(print,false);
        //JasperPrintManager.printReport(print, true);
    } catch (JRException e) {
        JOptionPane.showMessageDialog(this, e.getMessage());
    }
}
private void printReport(){
    try {
        String rptPath = "test/reports/payment_rpt.jrxml";
        JasperReport jp = JasperCompileManager.compileReport(rptPath);
        HashMap para = new HashMap();
        para.put("payment_no", txt_pay_find.getText().trim());
        SimpleDateFormat sdfs = new SimpleDateFormat("dd MMM-yyyy, hh:mm:ss a");
        para.put("payment_date", sdfs.format(cbo_pay_date.getDate()));
        para.put("cashier", lbl_user.getText().trim()+"("+lbl_user_level.getText().trim()+")");
        JRBeanCollectionDataSource jcd = new JRBeanCollectionDataSource(data());
        JasperPrint print = JasperFillManager.fillReport(jp, para, jcd);
        //JasperViewer.viewReport(print,false);
        JasperPrintManager.printReport(print, false);
    } catch (JRException e) {
        JOptionPane.showMessageDialog(this, e.getMessage());
    }
}
private void scoreRP(){
    con = ConDB.getConnection();
    TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model8);
    tbl_score_report.setRowSorter(null);
    SimpleDateFormat sdfs = new SimpleDateFormat("yyyy-MM-dd");
    String Dates = sdfs.format(cbo_date_from_sc.getDate());
    String Dates2 = sdfs.format(cbo_date_to_sc.getDate());
    String Sort = cbo_sort_sc.getSelectedItem().toString();
    int a=Integer.parseInt(cbo_sub_id.getSelectedItem().toString());
    String sql="SELECT socre_id as ScoreID, student_id as StudentID, subject_id as SubjectID, quiz as Quiz, attenden as Attendance, midterm as Midterm, assignment as Assigment, final as Final, total as Total,for_month as Date FROM tbl_score Where for_month Between '"+Dates+"' And '"+Dates2+"' And subject_id="+a+" Order By socre_id "+Sort+"";
    try {
        stm=con.createStatement();
        rs=stm.executeQuery(sql);
        TableModel model8 = DbUtils.resultSetToTableModel(rs);
        tbl_score_report.setModel(model8);
        
        
        stm.close();
        rs.close();
        con.close();
        
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e);
    }
    
    
    for(int j=0; j<=9;j++){
        tbl_score_report.getColumnModel().getColumn(j).setPreferredWidth(100);
    }
    
    tbl_score_report.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    tbl_score_report.setDefaultEditor(Object.class, null);
}
private void rpt_payment(){
    con = ConDB.getConnection();
    TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model7);
    tbl_payment_report.setRowSorter(null);
    SimpleDateFormat sdfs = new SimpleDateFormat("yyyy-MM-dd");
    String Dates = sdfs.format(cbo_date_from.getDate());
    String Dates2 = sdfs.format(cbo_date_to.getDate());
    String Sort = cbo_sort_pay.getSelectedItem().toString();
    String sql="SELECT payment_id as PaymentID, student_id as StudentID, firstname as FirstName, lastname as LastName, for_year as ForYear, pay_for as PayFor, payment_date as PaymentDate, discount as Discount, amount as Amount, tax as Tax, total_usd as TotalUSD, total_kh as TotalKH FROM tbl_payment Where payment_date Between '"+Dates+"' And '"+Dates2+"' Order By payment_id "+Sort+"";
    try {
        stm=con.createStatement();
        rs=stm.executeQuery(sql);
        TableModel model7 = DbUtils.resultSetToTableModel(rs);
        tbl_payment_report.setModel(model7);
        
        
        stm.close();
        rs.close();
        con.close();
        
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e);
    }
    for(int j=0; j<=11;j++){
        tbl_payment_report.getColumnModel().getColumn(j).setPreferredWidth(100);
    }
    
    tbl_payment_report.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    tbl_payment_report.setDefaultEditor(Object.class, null);
}

public void show_user(){
    con = ConDB.getConnection();
    TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model6);
    tbl_user_info.setRowSorter(null);
    String sql="SELECT user_id as UserID, username as UserName, password as Passowrd, status as Status, attempt_count as Log, user_lavel as UserLevel, birth_date as BirthDate, user_email as Email FROM tbl_user where user_lavel='"+lbl_user_level.getText()+"' and username='"+lbl_user.getText()+"' or user_lavel='User'";
    try {
        stm=con.createStatement();
        rs=stm.executeQuery(sql);
        TableModel model6 = DbUtils.resultSetToTableModel(rs);
        tbl_user_info.setModel(model6);
        
        
        stm.close();
        rs.close();
        con.close();
        
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e);
    }

    for(int j=0; j<=7;j++){
        tbl_user_info.getColumnModel().getColumn(j).setPreferredWidth(100);
    }
    
    tbl_user_info.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    tbl_user_info.setDefaultEditor(Object.class, null);
}
public void jtable1sc(){
    con = ConDB.getConnection();
    TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model2);
    jTable1_sc.setRowSorter(null);
    String sql="SELECT student_id as StudentID,subject_id as SubjectID, quiz as Quiz, attenden as Attendance, midterm as Midterm,assignment as Assignment, final as Final, total as Total, socre_id as ScoreID FROM tbl_score";
    try {
        stm=con.createStatement();
        rs=stm.executeQuery(sql);
        TableModel model2 = DbUtils.resultSetToTableModel(rs);
        jTable1_sc.setModel(model2);
        
        
        stm.close();
        rs.close();
        con.close();
        
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e);
    }
    
    for(int j=0; j<=8;j++){
        jTable1_sc.getColumnModel().getColumn(j).setPreferredWidth(100);
    }
    
    jTable1_sc.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    jTable1_sc.setDefaultEditor(Object.class, null);
}
public void jtable1ss(){
    con = ConDB.getConnection();
    TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model3);
    jTable1_ss.setRowSorter(null);
    String sql="SELECT subject_id as SubjectID, subjcet_name as SubjectName, description as Description, teacher_id as TeacherID FROM tbl_subject";
    try {
        stm=con.createStatement();
        rs=stm.executeQuery(sql);
        TableModel model3 = DbUtils.resultSetToTableModel(rs);
        jTable1_ss.setModel(model3);
        
        
        stm.close();
        rs.close();
        con.close();
        
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e);
    }
    
    for(int j=0; j<=3;j++){
        jTable1_ss.getColumnModel().getColumn(j).setPreferredWidth(100);
    }
    
    jTable1_ss.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    jTable1_ss.setDefaultEditor(Object.class, null);

}

public void JtableTc(){
     con = ConDB.getConnection();
    TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model4);
    JTable1_tc.setRowSorter(null);
    String sql="SELECT teacher_id as TeacherID, teacher_name as TeacherName, gender as Gender, dob as DateOfBirth, phone_number as PhoneNumber, email as Email FROM tbl_teacher";
    try {
        stm=con.createStatement();
        rs=stm.executeQuery(sql);
        TableModel model4 = DbUtils.resultSetToTableModel(rs);
        JTable1_tc.setModel(model4);
        
        
        stm.close();
        rs.close();
        con.close();
        
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e);
    } 
    for(int j=0; j<=5;j++){
        JTable1_tc.getColumnModel().getColumn(j).setPreferredWidth(100);
    }
    
    JTable1_tc.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    JTable1_tc.setDefaultEditor(Object.class, null);

}
public void ClearTC(){
    txt_tc_teachername.setText("");
    txt_tc_email.setText("");
    txt_tc_phonenumber.setText("");
    dc_tc_dateofbirth.setDate(null);
}
public void clearSc(){
    txt_sc_quiz.setText("");
    txt_sc_assigment.setText("");
    txt_sc_attenden.setText("");
    txt_sc_midterm.setText("");
    txt_sc_total.setText("");
    txt_sc_final.setText("");
}
public void Clearss(){
    txt_ss_subjectname.setText("");
    txt_ss_Description.setText("");
    txt_ss_subjectid.setText("");
}
public void Clearpay(){
    txt_pay_find.setText("");
    txt_pay_fname.setText("");
    txt_pay_lname.setText("");
    txt_amount.setText("0");
    cbo_pay_date.setDate(null);
    txt_total_kh.setText("0");
    txt_total_usd.setText("0");
    
}
public void Clear(){
    txt_re_firstname.setText("");
    txt_re_lastname.setText("");
    txt_re_dob.setDate(null);
    txt_re_batch.setText("");
    txt_re_phone.setText("");
    txt_re_email.setText("");
    txt_re_village.setText("");
    txt_re_commune.setText("");
    txt_re_district.setText("");
    lbl_re_photo.setIcon(null);
    txt_f_name.setText("");
    txt_exst.setText("");
    txtPath.setText("");
    f =null;
}

public void AutoID(){
    con=ConDB.getConnection();
        String sql="SELECT MAX(student_id) AS sid FROM tbl_registration";
        try {
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while(rs.next()){
                int i = rs.getInt("sid");
                int j=  i+1;
                txt_re_id.setText(String.valueOf(j));
                txt_re_id.setEditable(false);
            }
            stm.close();
            rs.close();
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
}

private void SelectDt()
{
    con = ConDB.getConnection();
    TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model);
        tbl_re_show.setRowSorter(null);
    String sql="SELECT student_id as 'Student ID', user_id as 'User ID',"+
            "first_name as 'First Name', last_name as 'Last Name', gender as 'Gender',"+
            "dob as 'Date Of Birth', batch as 'Batch', phone_number as 'Phone Number',"+
            "email as 'Email', village as 'Village', commune as 'Commune', district as 'District',"+
            "province as 'Province', photo as 'Photo' FROM tbl_registration";
    try {
        stm=con.createStatement();
        rs=stm.executeQuery(sql);
        TableModel models = DbUtils.resultSetToTableModel(rs);
        tbl_re_show.setModel(models);
        
        
        stm.close();
        rs.close();
        con.close();
        
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e);
    }
    for(int j=0; j<=13;j++){
        tbl_re_show.getColumnModel().getColumn(j).setPreferredWidth(90);
    }
    
    tbl_re_show.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    tbl_re_show.setDefaultEditor(Object.class, null);
    
}
private void SelectDataToCbo(){
    con = ConDB.getConnection();
    String sql ="SELECT * FROM tbl_province";
        try {
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while(rs.next()){
                txt_re_province.addItem(rs.getString("province"));
            }
            stm.close();
        
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    
}
public void Searchpay(String st){
     model5 = (DefaultTableModel) tbl_payment.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model5);
        tbl_payment.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(st));
}
public void SearchTc(String st){
        model4 = (DefaultTableModel) JTable1_tc.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model4);
        JTable1_tc.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(st));
}
public void SearchSc(String st){
        model2 = (DefaultTableModel) jTable1_sc.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model2);
        jTable1_sc.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(st));
}
public void SearchUser(String st){
        model6 = (DefaultTableModel) tbl_user_info.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model6);
        tbl_user_info.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(st));
}
public void SearchSS(String str){
    model3 = (DefaultTableModel) jTable1_ss.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model3);
        jTable1_ss.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(str));
}
public void Search(String str){
        model = (DefaultTableModel) tbl_re_show.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model);
        tbl_re_show.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(str));
}
private void Search_pay(){
    con = ConDB.getConnection();
        if(txt_pay_find.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please Input Student ID...","Message",JOptionPane.WARNING_MESSAGE);
        }else{
            
        try {
            int St_id = Integer.parseInt(txt_pay_find.getText().trim());
            String sql_1="SELECT first_name, last_name From tbl_registration Where student_id='"+St_id+"'";
            Statement stmt;
            stmt = con.createStatement();
            ResultSet rss;
            rss = stmt.executeQuery(sql_1);
                if(rss.next()){
                    String fname = rss.getString("first_name");
                    String lname = rss.getString("last_name");
                    txt_pay_fname.setText(fname);
                    txt_pay_lname.setText(lname);
                }else{
                    getToolkit().beep();
                    JOptionPane.showMessageDialog(null, "<< "+txt_pay_find.getText().trim()+" >> Your ID is not found, please try another ID","Message",JOptionPane.ERROR_MESSAGE);
                }
                stmt.close();
                rss.close();
        } catch (SQLException ex) {
            Logger.getLogger(Main_form.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
private void Calculate(){
    
        con = ConDB.getConnection();
            String sql="SELECT * from tbl_extra";
            
            String cbo_pay_for =cbo_payfor.getSelectedItem().toString();
            String cbo_dis = cbo_pay_discount.getSelectedItem().toString();
            float tax = Float.parseFloat(txt_pay_tax.getText().trim());
            float discount, amount;
            
            try {
                stm=con.createStatement();
                rs=stm.executeQuery(sql);
                
                if(rs.next()){
                    float one_year = rs.getFloat("p_of_study");
                    float usd = rs.getFloat("ex_change_rt");
                    txt_pay_tax.setText(String.valueOf(tax));
                    
                    if (cbo_dis.equals("30%") && cbo_pay_for.equals("Year")) {
                    discount=((one_year*30)/100);
                    amount=one_year-discount;
                    txt_amount.setText(String.valueOf(amount));
                    txt_total_usd.setText(String.valueOf(amount+tax));
                    txt_total_kh.setText(String.valueOf((amount+tax)*usd));
                  }else if(cbo_dis.equals("50%") && cbo_pay_for.equals("Year")) {
                    discount=((one_year*50)/100);
                    amount=one_year-discount;
                    txt_amount.setText(String.valueOf(amount));
                    txt_total_usd.setText(String.valueOf(amount+tax));
                    txt_total_kh.setText(String.valueOf((amount+tax)*usd));
                  }else if(cbo_dis.equals("100%") && cbo_pay_for.equals("Year")) {
                    discount=((one_year*100)/100);
                    amount=one_year-discount;
                    txt_amount.setText(String.valueOf(amount));
                    txt_total_usd.setText(String.valueOf(amount+tax));
                    txt_total_kh.setText(String.valueOf((amount+tax)*usd));
                  }else if(cbo_dis.equals("30%") && cbo_pay_for.equals("Semester")) {
                    discount=((one_year*30)/100);
                    amount=(one_year-discount)/2;
                    txt_amount.setText(String.valueOf(amount));
                    txt_total_usd.setText(String.valueOf(amount+tax));
                    txt_total_kh.setText(String.valueOf((amount+tax)*usd));
                  }else if(cbo_dis.equals("50%") && cbo_pay_for.equals("Semester")) {
                    discount=((one_year*50)/100);
                    amount=(one_year-discount)/2;
                    txt_amount.setText(String.valueOf(amount));
                    txt_total_usd.setText(String.valueOf(amount+tax));
                    txt_total_kh.setText(String.valueOf((amount+tax)*usd));
                  }else if(cbo_dis.equals("100%") && cbo_pay_for.equals("Semester")) {
                    discount=((one_year*100)/100);
                    amount=(one_year-discount)/2;
                    txt_amount.setText(String.valueOf(amount));
                    txt_total_usd.setText(String.valueOf(amount));
                    txt_total_kh.setText(String.valueOf((amount)*usd));
                    txt_pay_tax.setText("0");
                  }else if(cbo_dis.equals("Null") && cbo_pay_for.equals("Semester")) {
                    amount=one_year/2;
                    txt_amount.setText(String.valueOf(amount));
                    txt_total_usd.setText(String.valueOf(amount));
                    txt_total_kh.setText(String.valueOf((amount)*usd));
                    txt_pay_tax.setText("0");
                  }else if(cbo_dis.equals("Null") && cbo_pay_for.equals("Year")) {
                    txt_amount.setText(String.valueOf(one_year));
                    txt_total_usd.setText(String.valueOf(one_year));
                    txt_total_kh.setText(String.valueOf((one_year)*usd));
                    txt_pay_tax.setText("0");
                  }  
    
                }else{
                    JOptionPane.showMessageDialog(null, "Please Check Extra..");
                }
                stm.close();
                rs.close();
                con.close();

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }  
}
private void subID(){
   cbo_sub_id.removeAllItems();
    con = ConDB.getConnection();
        try {
        String sql_1="SELECT subject_id From tbl_subject";
            Statement stmt;
            stmt = con.createStatement();
            ResultSet rss;
            rss = stmt.executeQuery(sql_1);
                while(rss.next()){
                    int sid= rss.getInt("subject_id");
                    cbo_sub_id.addItem(String.valueOf(sid));
                    
                }
                stmt.close();
                rss.close();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e);
    }
}
private void TcID(){
    cbo_ss_Teacherid.removeAllItems();
    con = ConDB.getConnection();
        try {
        String sql_1="SELECT teacher_id From tbl_teacher";
            Statement stmt;
            stmt = con.createStatement();
            ResultSet rss;
            rss = stmt.executeQuery(sql_1);
                while(rss.next()){
                    int sid= rss.getInt("teacher_id");
                    cbo_ss_Teacherid.addItem(String.valueOf(sid));
                    
                }
                stmt.close();
                rss.close();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e);
    }
}
private void SelectSTID(){
    cbo_sc_studentid.removeAllItems();
    cbo_sc_subjectid.removeAllItems();
    con = ConDB.getConnection();
        try {
            String sql_1="SELECT student_id From tbl_registration";
            Statement stmt;
            stmt = con.createStatement();
            ResultSet rss;
            rss = stmt.executeQuery(sql_1);
                while(rss.next()){
                    int sid= rss.getInt("student_id");
                    cbo_sc_studentid.addItem(String.valueOf(sid));
                }
                stmt.close();
                rss.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
    }
         con = ConDB.getConnection();
        try {
        String sql_1="SELECT subject_id From  tbl_subject";
            Statement stmt;
            stmt = con.createStatement();
            ResultSet rss;
            rss = stmt.executeQuery(sql_1);
                while(rss.next()){
                    int sid= rss.getInt("subject_id");
                    cbo_sc_subjectid.addItem(String.valueOf(sid));
                }
                stmt.close();
                rss.close();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e);
    }
}
public void Jtablepay(){
    con = ConDB.getConnection();
    TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model5);
    tbl_payment.setRowSorter(null);
    String sql="SELECT payment_id as PaymentID, student_id as StudentID, firstname as FirstName, lastname as LastName, for_year as Year, pay_for as PayFor, payment_date as PaymentDate, discount as Discount, amount as Amount, tax as Tax,total_usd as TotalUSD, total_kh as TotalKH  FROM tbl_payment Order by payment_id DESC";
    try {
        stm=con.createStatement();
        rs=stm.executeQuery(sql);
        TableModel model5 = DbUtils.resultSetToTableModel(rs);
        tbl_payment.setModel(model5);
        
        
        stm.close();
        rs.close();
        con.close();
        
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e);
    }
    for(int j=0; j<=11;j++){
        tbl_payment.getColumnModel().getColumn(j).setPreferredWidth(100);
    }

    tbl_payment.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    tbl_payment.setDefaultEditor(Object.class, null);
}
private void SumScore(){
    if(!txt_sc_quiz.getText().trim().isEmpty() && !txt_sc_attenden.getText().trim().isEmpty() && !txt_sc_assigment.getText().trim().isEmpty() && !txt_sc_midterm.getText().trim().isEmpty() && !txt_sc_final.getText().trim().isEmpty()){
        float quiz =Float.parseFloat(txt_sc_quiz.getText().trim());
        float attenden =Float.parseFloat(txt_sc_attenden.getText().trim());
        float assigment =Float.parseFloat(txt_sc_assigment.getText().trim());
        float finals =Float.parseFloat(txt_sc_midterm.getText().trim());
        float midterm =Float.parseFloat(txt_sc_final.getText().trim());

        float total_sc  = (quiz+attenden+assigment+finals+midterm);
        txt_sc_total.setText(String.valueOf(total_sc));
    }
}
private void Clear_user()
{
    txt_username.setText("");
    txt_user_password.setText("");
    txt_user_password_re.setText("");
    user_dob.setDate(null);
    txt_user_email.setText("");
}
private void Loard_extra(){
    con = ConDB.getConnection();
    String sql="SELECT * from tbl_extra";
    try {
        stm=con.createStatement();
        rs=stm.executeQuery(sql);
        
        if(rs.next()){
        
        float price = rs.getFloat("p_of_study");
        float tax = rs.getFloat("tax");
        float ex_ch=rs.getFloat("ex_change_rt");
        
        txt_study_price.setText(String.valueOf(price));
        txt_pay_taxs.setText(String.valueOf(tax));
        txt_exchange_rate.setText(String.valueOf(ex_ch));
        }else{
            JOptionPane.showMessageDialog(null, "Error Extra");
        }
        
        stm.close();
        rs.close();
        con.close();
        
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e);
    }
}
public void MakeTemps(){
    File theFolder = new File("test/temps");
            if(!theFolder.exists()){
                theFolder.mkdir();
            }
}
public void SetJP(JPanel jp_list, JPanel jp_menu){
    	jp_home.setBackground(new Color(231,233,235));
        jp_register.setBackground(new Color(231,233,235));
        jpScore.setBackground(new Color(231,233,235));
        jpSubject.setBackground(new Color(231,233,235));
        jpTeacher.setBackground(new Color(231,233,235));
        jpResult.setBackground(new Color(231,233,235));
        jpPayment.setBackground(new Color(231,233,235));
        jpSetting.setBackground(new Color(231,233,235));
        jpAbout.setBackground(new Color(231,233,235));
        jpHelp.setBackground(new Color(231,233,235));
        
        jPanelHome.setVisible(false);
        jPanelRegister.setVisible(false);
        jPanelScore.setVisible(false);
        jPanelSubject.setVisible(false);
        jPanelTeacher.setVisible(false);
        jPanelResult.setVisible(false);
        jPanelPayment.setVisible(false);
        jPanelSetting.setVisible(false);
        jPanelAbout.setVisible(false);
        jPanelHelp.setVisible(false);

	jp_list.setBackground(new Color(193,193,193));
	jp_menu.setVisible(true);
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTable1_tc;
    private javax.swing.JButton btn_change;
    private javax.swing.JButton btn_create;
    private javax.swing.JButton btn_find_report;
    private javax.swing.JButton btn_find_score;
    private javax.swing.JButton btn_pay_delete;
    private javax.swing.JButton btn_pay_new;
    private javax.swing.JButton btn_pay_print;
    private javax.swing.JButton btn_pay_save;
    private javax.swing.JButton btn_re_browse;
    private javax.swing.JButton btn_re_delete;
    private javax.swing.JButton btn_re_save;
    private javax.swing.JButton btn_re_update;
    private javax.swing.JButton btn_sc_deleted;
    private javax.swing.JButton btn_sc_new;
    private javax.swing.JButton btn_sc_save;
    private javax.swing.JButton btn_sc_update;
    private javax.swing.JButton btn_score_preview;
    private javax.swing.JButton btn_ss_deleted;
    private javax.swing.JButton btn_ss_new;
    private javax.swing.JButton btn_ss_save;
    private javax.swing.JButton btn_ss_update;
    private javax.swing.JButton btn_tc_delete;
    private javax.swing.JButton btn_tc_new;
    private javax.swing.JButton btn_tc_save;
    private javax.swing.JButton btn_tc_update;
    private javax.swing.JButton btn_user_delete;
    private javax.swing.JButton btn_user_update;
    private javax.swing.JButton btn_view_report;
    private com.toedter.calendar.JDateChooser cbo_date_from;
    private com.toedter.calendar.JDateChooser cbo_date_from_sc;
    private com.toedter.calendar.JDateChooser cbo_date_to;
    private com.toedter.calendar.JDateChooser cbo_date_to_sc;
    private javax.swing.JComboBox<String> cbo_for_year;
    private com.toedter.calendar.JDateChooser cbo_pay_date;
    private javax.swing.JComboBox<String> cbo_pay_discount;
    private javax.swing.JComboBox<String> cbo_payfor;
    private javax.swing.JComboBox<String> cbo_re_gender;
    private javax.swing.JComboBox<String> cbo_sc_studentid;
    private javax.swing.JComboBox<String> cbo_sc_subjectid;
    private javax.swing.JComboBox<String> cbo_sort_pay;
    private javax.swing.JComboBox<String> cbo_sort_sc;
    private javax.swing.JComboBox<String> cbo_ss_Teacherid;
    private javax.swing.JComboBox<String> cbo_status;
    private javax.swing.JComboBox<String> cbo_sub_id;
    private javax.swing.JComboBox<String> cbo_tc_gender;
    private javax.swing.JComboBox<String> cbo_user_level;
    private com.toedter.calendar.JDateChooser dc_tc_dateofbirth;
    private javax.swing.JTextField fileID;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanelAbout;
    private javax.swing.JPanel jPanelHelp;
    private javax.swing.JPanel jPanelHome;
    private javax.swing.JPanel jPanelPayment;
    private javax.swing.JPanel jPanelRegister;
    private javax.swing.JPanel jPanelResult;
    private javax.swing.JPanel jPanelScore;
    private javax.swing.JPanel jPanelSetting;
    private javax.swing.JPanel jPanelSubject;
    private javax.swing.JPanel jPanelTeacher;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1_sc;
    private javax.swing.JTable jTable1_ss;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JTextPane jTextPane3;
    private javax.swing.JTextPane jTextPane4;
    private javax.swing.JTextPane jTextPane5;
    private javax.swing.JPanel jpAbout;
    private javax.swing.JPanel jpHelp;
    private javax.swing.JPanel jpPayment;
    private javax.swing.JPanel jpResult;
    private javax.swing.JPanel jpScore;
    private javax.swing.JPanel jpSetting;
    private javax.swing.JPanel jpSubject;
    private javax.swing.JPanel jpTeacher;
    private javax.swing.JPanel jp_home;
    private javax.swing.JPanel jp_register;
    private javax.swing.JLabel lbl_clock;
    private javax.swing.JLabel lbl_home;
    private javax.swing.JLabel lbl_logout;
    private javax.swing.JLabel lbl_re_photo;
    private javax.swing.JLabel lbl_register;
    public static javax.swing.JLabel lbl_user;
    public static javax.swing.JLabel lbl_user_level;
    private javax.swing.JTable tbl_payment;
    private javax.swing.JTable tbl_payment_report;
    private javax.swing.JTable tbl_re_show;
    private javax.swing.JTable tbl_score_report;
    private javax.swing.JTable tbl_user_info;
    private javax.swing.JTextField txtPath;
    private javax.swing.JTextField txt_Sc_score;
    private javax.swing.JTextField txt_amount;
    private javax.swing.JTextField txt_exchange_rate;
    private javax.swing.JTextField txt_exst;
    private javax.swing.JTextField txt_f_name;
    private javax.swing.JTextField txt_pay_find;
    private javax.swing.JTextField txt_pay_fname;
    private javax.swing.JTextField txt_pay_id;
    private javax.swing.JTextField txt_pay_lname;
    private javax.swing.JTextField txt_pay_search;
    private javax.swing.JTextField txt_pay_tax;
    private javax.swing.JTextField txt_pay_taxs;
    private javax.swing.JTextField txt_re_batch;
    private javax.swing.JTextField txt_re_commune;
    private javax.swing.JTextField txt_re_district;
    private com.toedter.calendar.JDateChooser txt_re_dob;
    private javax.swing.JTextField txt_re_email;
    private javax.swing.JTextField txt_re_firstname;
    private javax.swing.JTextField txt_re_id;
    private javax.swing.JTextField txt_re_lastname;
    private javax.swing.JTextField txt_re_phone;
    private javax.swing.JComboBox<String> txt_re_province;
    private javax.swing.JTextField txt_re_search;
    private javax.swing.JTextField txt_re_village;
    private javax.swing.JTextField txt_sc_assigment;
    private javax.swing.JTextField txt_sc_attenden;
    private javax.swing.JTextField txt_sc_final;
    private javax.swing.JTextField txt_sc_midterm;
    private javax.swing.JTextField txt_sc_quiz;
    private javax.swing.JTextField txt_sc_search;
    private javax.swing.JTextField txt_sc_total;
    private javax.swing.JTextField txt_ss_Description;
    private javax.swing.JTextField txt_ss_Search;
    private javax.swing.JTextField txt_ss_subjectid;
    private javax.swing.JTextField txt_ss_subjectname;
    private javax.swing.JTextField txt_study_price;
    private javax.swing.JTextField txt_tc_email;
    private javax.swing.JTextField txt_tc_phonenumber;
    private javax.swing.JTextField txt_tc_search;
    private javax.swing.JTextField txt_tc_teacherid;
    private javax.swing.JTextField txt_tc_teachername;
    private javax.swing.JTextField txt_total_kh;
    private javax.swing.JTextField txt_total_usd;
    private javax.swing.JTextField txt_user_email;
    private javax.swing.JTextField txt_user_id;
    private javax.swing.JTextField txt_user_ids;
    private javax.swing.JPasswordField txt_user_password;
    private javax.swing.JPasswordField txt_user_password_re;
    private javax.swing.JTextField txt_user_search;
    private javax.swing.JTextField txt_username;
    private com.toedter.calendar.JDateChooser user_dob;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
