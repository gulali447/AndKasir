/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package andriawan.kasir.view;

import andriawan.kasir.controller.UserController;
import andriawan.kasir.controller.UserLoginController;
import andriawan.kasir.dao.impl.UserDaoImpl;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JToolBar;

/**
 *
 * @author andriawan
 */
public class LoginForm extends javax.swing.JFrame {

    /**
     * Creates new form Log
     */
    public LoginForm() {
        initComponents();
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                setVisible(true);
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginPanel = new javax.swing.JPanel();
        headerLogin = new javax.swing.JLabel();
        labelPengguna = new javax.swing.JLabel();
        txtFieldPengguna = new javax.swing.JTextField();
        labelPass = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();
        toolBarLogin = new javax.swing.JToolBar();
        hint = new javax.swing.JLabel();
        jabatan = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("App");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 255, 255));
        setBounds(new java.awt.Rectangle(300, 300, 0, 0));
        setName("LoginFrame"); // NOI18N
        setUndecorated(true);
        setResizable(false);

        loginPanel.setBackground(new java.awt.Color(255, 255, 255));

        headerLogin.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        headerLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerLogin.setText("Selamat Datang di Toko");

        labelPengguna.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelPengguna.setText("Pengguna");

        txtFieldPengguna.setMargin(new java.awt.Insets(0, 5, 0, 5));
        txtFieldPengguna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldPenggunaActionPerformed(evt);
            }
        });

        labelPass.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelPass.setText("Kata Sandi");

        txtPass.setMargin(new java.awt.Insets(0, 5, 0, 5));
        txtPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPassKeyPressed(evt);
            }
        });

        loginButton.setBackground(new java.awt.Color(102, 153, 255));
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("Masuk");
        loginButton.setBorder(null);
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        toolBarLogin.setBackground(new java.awt.Color(255, 255, 255));
        toolBarLogin.setRollover(true);
        toolBarLogin.setToolTipText("");
        toolBarLogin.setName("toolbarLogin"); // NOI18N

        hint.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        hint.setText("Kilik ( ALT + F4 ) untuk keluar");
        toolBarLogin.add(hint);

        jabatan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "admin", "kasir" }));

        jLabel1.setText("Jabatan");

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(toolBarLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(headerLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
                    .addComponent(labelPengguna, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPass)
                    .addComponent(labelPass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtFieldPengguna, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jabatan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(headerLogin)
                .addGap(28, 28, 28)
                .addComponent(labelPengguna)
                .addGap(18, 18, 18)
                .addComponent(txtFieldPengguna, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelPass)
                .addGap(18, 18, 18)
                .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jabatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(toolBarLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        toolBarLogin.getAccessibleContext().setAccessibleName("toolbarLogin");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public JLabel getHeaderLogin() {
        return headerLogin;
    }

    public void setHeaderLogin(JLabel headerLogin) {
        this.headerLogin = headerLogin;
    }

    public JLabel getHint() {
        return hint;
    }

    public void setHint(JLabel hint) {
        this.hint = hint;
    }

    public JLabel getLabelPass() {
        return labelPass;
    }

    public void setLabelPass(JLabel labelPass) {
        this.labelPass = labelPass;
    }

    public JLabel getLabelPengguna() {
        return labelPengguna;
    }

    public void setLabelPengguna(JLabel labelPengguna) {
        this.labelPengguna = labelPengguna;
    }

    public JButton getLoginButton() {
        return loginButton;
    }

    public void setLoginButton(JButton loginButton) {
        this.loginButton = loginButton;
    }

    public JPanel getLoginPanel() {
        return loginPanel;
    }

    public void setLoginPanel(JPanel loginPanel) {
        this.loginPanel = loginPanel;
    }

    public JToolBar getToolBarLogin() {
        return toolBarLogin;
    }

    public void setToolBarLogin(JToolBar toolBarLogin) {
        this.toolBarLogin = toolBarLogin;
    }

    public JTextField getTxtFieldPengguna() {
        return txtFieldPengguna;
    }

    public void setTxtFieldPengguna(JTextField txtFieldPengguna) {
        this.txtFieldPengguna = txtFieldPengguna;
    }

    public JPasswordField getTxtPass() {
        return txtPass;
    }

    public void setTxtPass(JPasswordField txtPass) {
        this.txtPass = txtPass;
    }

    private void txtFieldPenggunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldPenggunaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldPenggunaActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        UserLoginController userController;
        userController = new UserLoginController(new UserDaoImpl(), this);
        try {
            switch(jabatan.getSelectedIndex()){
                
            case 0:
                if (userController
                    .isValidAdminUser(
                            txtFieldPengguna.getText(), 
                            new String(txtPass.getPassword()))) {
                    new MainForm().setVisible(true);
                    setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null, "Password atau Username salah");
                }
                break;
            case 1:
                if(userController.
                    isValidKasirUser(
                            txtFieldPengguna.getText(), 
                            new String(txtPass.getPassword()))) {
                    UserController uc = new UserController();
                    ArrayList<String> as = uc.getUserLevel(txtFieldPengguna.getText(),
                            jabatan.getSelectedItem().toString());
                    KasirForm kf = new KasirForm();
                    kf.setVisible(true);
                    String kasir = txtFieldPengguna.getText();
                    kf.setLabelIdKasir(as.get(1));
                    kf.setTxtPetugasKasir(kasir);
                    
                    Date dt = new Date();
                    SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyy HH:mm");
                    String dateF = sdf.format(dt);
                    
                    kf.setTxtWaktuLogin(dateF);
                    
                    setVisible(false);
                }else{
                    JOptionPane.showMessageDialog(null, "Password atau Username salah");
                }
                break;
                
            default:
                JOptionPane.showMessageDialog(null, "Anda Penyusup");
            break;
            
            }
            
        } catch (NullPointerException h) {
            JOptionPane.showMessageDialog(null, "Error: Periksa opsi jabatan apakah sudah benar");
        } catch (SQLException sql) {
            JOptionPane.showMessageDialog(null, "Error: Kesalahan Database");
        }

    }//GEN-LAST:event_loginButtonActionPerformed

    private void txtPassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassKeyPressed
        try {
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                ActionEvent et = null;
                loginButtonActionPerformed(et);
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_txtPassKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel headerLogin;
    private javax.swing.JLabel hint;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JComboBox<String> jabatan;
    private javax.swing.JLabel labelPass;
    private javax.swing.JLabel labelPengguna;
    private javax.swing.JButton loginButton;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JToolBar toolBarLogin;
    private javax.swing.JTextField txtFieldPengguna;
    private javax.swing.JPasswordField txtPass;
    // End of variables declaration//GEN-END:variables
}
