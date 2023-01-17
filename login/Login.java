package login;
import javax.swing.JOptionPane;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Login extends javax.swing.JFrame {
    
     
    public Login() {
        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LoginPanel = new javax.swing.JPanel();
        LoginLb = new javax.swing.JLabel();
        IntroLb = new javax.swing.JLabel();
        UsernameLb = new javax.swing.JLabel();
        PasswordLb = new javax.swing.JLabel();
        LoginBt = new javax.swing.JButton();
        SignUp = new javax.swing.JLabel();
        Icon1 = new javax.swing.JLabel();
        Message1 = new javax.swing.JLabel();
        PasswordField = new javax.swing.JPasswordField();
        UsernameField = new javax.swing.JTextField();
        Usernameline = new javax.swing.JLabel();
        Passwordline = new javax.swing.JLabel();
        Icon2 = new javax.swing.JLabel();
        Icon3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LoginPanel.setBackground(new java.awt.Color(0, 102, 153));

        LoginLb.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        LoginLb.setForeground(new java.awt.Color(255, 255, 255));
        LoginLb.setText("Login");

        IntroLb.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        IntroLb.setForeground(new java.awt.Color(255, 255, 255));
        IntroLb.setText("Hello! Let's get started");

        UsernameLb.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        UsernameLb.setForeground(new java.awt.Color(255, 255, 255));
        UsernameLb.setText("Username");

        PasswordLb.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        PasswordLb.setForeground(new java.awt.Color(255, 255, 255));
        PasswordLb.setText("Password");

        LoginBt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LoginBt.setForeground(new java.awt.Color(0, 153, 255));
        LoginBt.setText("Login");
        LoginBt.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
        LoginBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginBtActionPerformed(evt);
            }
        });

        SignUp.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        SignUp.setForeground(new java.awt.Color(255, 255, 255));
        SignUp.setText("Sign up");
        SignUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignUpMouseClicked(evt);
            }
        });

        Icon1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Icon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/icons/customer_20px.png"))); // NOI18N

        Message1.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        Message1.setForeground(new java.awt.Color(255, 255, 255));
        Message1.setText("Don't have an account?");

        PasswordField.setBackground(new java.awt.Color(0, 102, 153));
        PasswordField.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        PasswordField.setForeground(new java.awt.Color(255, 255, 255));
        PasswordField.setBorder(null);

        UsernameField.setBackground(new java.awt.Color(0, 102, 153));
        UsernameField.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        UsernameField.setForeground(new java.awt.Color(255, 255, 255));
        UsernameField.setBorder(null);
        UsernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameFieldActionPerformed(evt);
            }
        });

        Usernameline.setForeground(new java.awt.Color(255, 255, 255));
        Usernameline.setText("_____________________________________________________________________________");

        Passwordline.setForeground(new java.awt.Color(255, 255, 255));
        Passwordline.setText("_____________________________________________________________________________");
        Passwordline.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        Icon2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Icon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/icons/eye_20px.png"))); // NOI18N
        Icon2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Icon2MouseClicked(evt);
            }
        });

        Icon3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Icon3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/icons/eye_20px.png"))); // NOI18N
        Icon3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Icon3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout LoginPanelLayout = new javax.swing.GroupLayout(LoginPanel);
        LoginPanel.setLayout(LoginPanelLayout);
        LoginPanelLayout.setHorizontalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LoginPanelLayout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(IntroLb, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(LoginPanelLayout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addComponent(LoginLb))
                    .addGroup(LoginPanelLayout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(Message1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LoginPanelLayout.createSequentialGroup()
                        .addComponent(LoginBt, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(LoginPanelLayout.createSequentialGroup()
                        .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UsernameField)
                            .addComponent(Usernameline, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
                            .addGroup(LoginPanelLayout.createSequentialGroup()
                                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PasswordLb, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(UsernameLb, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(Passwordline, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PasswordField))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Icon1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Icon2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Icon3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(24, 24, 24))))
        );
        LoginPanelLayout.setVerticalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LoginPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(LoginLb)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(IntroLb)
                        .addGap(10, 10, 10)
                        .addComponent(UsernameLb)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(UsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(LoginPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Icon1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Usernameline, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(32, 32, 32)
                .addComponent(PasswordLb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LoginPanelLayout.createSequentialGroup()
                        .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Passwordline, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Icon2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addComponent(LoginBt, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Message1)
                            .addComponent(SignUp)))
                    .addComponent(Icon3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void UsernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameFieldActionPerformed

    private void LoginBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginBtActionPerformed

        String username = UsernameField.getText ();
        String password = PasswordField.getPassword().toString();
                 
       try{ 
           File file = new File("C:\\oop\\Login.txt");
           FileReader fileread = new FileReader(file);
           BufferedReader buffread = new BufferedReader(fileread);
           String fl;
           
           while
               ((fl = buffread.readLine())!=null){
           }
           fileread.close();
           
        if (PasswordField.equals(password) && UsernameField.equals(username)){
           
            MainFrame main = new MainFrame();
            main.setVisible(true); 
            this.dispose();
          
        }
        else{
            JOptionPane.showMessageDialog(null, "Invalid Data. Please Try Again");
        }
    }
        catch (IOException e){
                
            }
            
    }//GEN-LAST:event_LoginBtActionPerformed
    
    private void Icon2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Icon2MouseClicked
        PasswordField.setEchoChar((char)0);
        Icon2.setVisible(false);
        Icon2.setEnabled(false);
        Icon3.setEnabled(true);
        Icon3.setEnabled(true);
    }//GEN-LAST:event_Icon2MouseClicked

    private void Icon3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Icon3MouseClicked
        PasswordField.setEchoChar((char)8226);
        Icon2.setVisible(true);
        Icon2.setEnabled(true);
        Icon3.setEnabled(false);
        Icon3.setEnabled(false);
    }//GEN-LAST:event_Icon3MouseClicked

    private void SignUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignUpMouseClicked
        SignUpLog sign = new SignUpLog();
        sign.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SignUpMouseClicked

    
    public static void main(String args[]) throws Exception{
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Icon1;
    private javax.swing.JLabel Icon2;
    private javax.swing.JLabel Icon3;
    private javax.swing.JLabel IntroLb;
    private javax.swing.JButton LoginBt;
    private javax.swing.JLabel LoginLb;
    private javax.swing.JPanel LoginPanel;
    private javax.swing.JLabel Message1;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JLabel PasswordLb;
    private javax.swing.JLabel Passwordline;
    private javax.swing.JLabel SignUp;
    private javax.swing.JTextField UsernameField;
    private javax.swing.JLabel UsernameLb;
    private javax.swing.JLabel Usernameline;
    // End of variables declaration//GEN-END:variables
}
