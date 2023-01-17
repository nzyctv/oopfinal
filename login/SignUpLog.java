package login;


import java.io.IOException;
import java.io.File;
import java.io.FileWriter;


public class SignUpLog extends javax.swing.JFrame {

    
    public SignUpLog() {
        initComponents();
    }


    private void initComponents() {

        LoginPanel = new javax.swing.JPanel();
        RegisterLb = new javax.swing.JLabel();
        IntroRegisterLb = new javax.swing.JLabel();
        UsernameLbRegister = new javax.swing.JLabel();
        RegisterPasswordLb = new javax.swing.JLabel();
        RegisterBt = new javax.swing.JButton();
        RegisterPasswordField = new javax.swing.JPasswordField();
        RegisterUsernameField = new javax.swing.JTextField();
        RegisterUsernameline = new javax.swing.JLabel();
        RegisterPasswordline = new javax.swing.JLabel();
        RegisterFirstnameLb = new javax.swing.JLabel();
        RegisterFirstnameField = new javax.swing.JTextField();
        RegisterLastnameLine = new javax.swing.JLabel();
        RegisterLastnameLb = new javax.swing.JLabel();
        RegisterLastnameField = new javax.swing.JTextField();
        RegisterFirstnameline = new javax.swing.JLabel();
        RegisterMessage = new javax.swing.JLabel();
        BacktoLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LoginPanel.setBackground(new java.awt.Color(0, 102, 153));

        RegisterLb.setFont(new java.awt.Font("Segoe UI", 0, 24));
        RegisterLb.setForeground(new java.awt.Color(255, 255, 255));
        RegisterLb.setText("Register");

        IntroRegisterLb.setFont(new java.awt.Font("Segoe UI", 0, 14)); 
        IntroRegisterLb.setForeground(new java.awt.Color(255, 255, 255));
        IntroRegisterLb.setText("Hello! Create your account");

        UsernameLbRegister.setFont(new java.awt.Font("Segoe UI", 1, 16)); 
        UsernameLbRegister.setForeground(new java.awt.Color(255, 255, 255));
        UsernameLbRegister.setText("Username");

        RegisterPasswordLb.setFont(new java.awt.Font("Segoe UI", 1, 16)); 
        RegisterPasswordLb.setForeground(new java.awt.Color(255, 255, 255));
        RegisterPasswordLb.setText("Password");

        RegisterBt.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        RegisterBt.setForeground(new java.awt.Color(0, 153, 255));
        RegisterBt.setText("Register");
        RegisterBt.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
        RegisterBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterBtActionPerformed(evt);
            }
        });

        RegisterPasswordField.setBackground(new java.awt.Color(0, 102, 153));
        RegisterPasswordField.setFont(new java.awt.Font("Segoe UI", 0, 13)); 
        RegisterPasswordField.setForeground(new java.awt.Color(255, 255, 255));
        RegisterPasswordField.setBorder(null);

        RegisterUsernameField.setBackground(new java.awt.Color(0, 102, 153));
        RegisterUsernameField.setFont(new java.awt.Font("Segoe UI", 0, 13)); 
        RegisterUsernameField.setForeground(new java.awt.Color(255, 255, 255));
        RegisterUsernameField.setBorder(null);
        RegisterUsernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterUsernameFieldActionPerformed(evt);
            }
        });

        RegisterUsernameline.setForeground(new java.awt.Color(255, 255, 255));
        RegisterUsernameline.setText("________________________________________________________________________________");

        RegisterPasswordline.setForeground(new java.awt.Color(255, 255, 255));
        RegisterPasswordline.setText("________________________________________________________________________________");
        RegisterPasswordline.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        RegisterFirstnameLb.setFont(new java.awt.Font("Segoe UI", 1, 16)); 
        RegisterFirstnameLb.setForeground(new java.awt.Color(255, 255, 255));
        RegisterFirstnameLb.setText("First Name");

        RegisterFirstnameField.setBackground(new java.awt.Color(0, 102, 153));
        RegisterFirstnameField.setFont(new java.awt.Font("Segoe UI", 0, 13)); 
        RegisterFirstnameField.setForeground(new java.awt.Color(255, 255, 255));
        RegisterFirstnameField.setBorder(null);
        RegisterFirstnameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterFirstnameFieldActionPerformed(evt);
            }
        });

        RegisterLastnameLine.setForeground(new java.awt.Color(255, 255, 255));
        RegisterLastnameLine.setText("________________________________________________________________________________");

        RegisterLastnameLb.setFont(new java.awt.Font("Segoe UI", 1, 16)); 
        RegisterLastnameLb.setForeground(new java.awt.Color(255, 255, 255));
        RegisterLastnameLb.setText("Last Name");

        RegisterLastnameField.setBackground(new java.awt.Color(0, 102, 153));
        RegisterLastnameField.setFont(new java.awt.Font("Segoe UI", 0, 13)); 
        RegisterLastnameField.setForeground(new java.awt.Color(255, 255, 255));
        RegisterLastnameField.setBorder(null);
        RegisterLastnameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterLastnameFieldActionPerformed(evt);
            }
        });

        RegisterFirstnameline.setForeground(new java.awt.Color(255, 255, 255));
        RegisterFirstnameline.setText("________________________________________________________________________________");
        RegisterFirstnameline.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        RegisterMessage.setForeground(new java.awt.Color(255, 255, 255));
        RegisterMessage.setText("Already signed up?");

        BacktoLogin.setFont(new java.awt.Font("Segoe UI", 1, 12)); 
        BacktoLogin.setForeground(new java.awt.Color(255, 255, 255));
        BacktoLogin.setText("Login");
        BacktoLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BacktoLoginMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout LoginPanelLayout = new javax.swing.GroupLayout(LoginPanel);
        LoginPanel.setLayout(LoginPanelLayout);
        LoginPanelLayout.setHorizontalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LoginPanelLayout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(RegisterMessage)
                        .addGap(18, 18, 18)
                        .addComponent(BacktoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(LoginPanelLayout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(IntroRegisterLb)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LoginPanelLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RegisterPasswordline)
                            .addComponent(RegisterFirstnameLb, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RegisterFirstnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RegisterLastnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RegisterPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UsernameLbRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RegisterPasswordLb, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RegisterLastnameLb, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RegisterUsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RegisterLastnameLine)
                            .addComponent(RegisterFirstnameline)
                            .addComponent(RegisterUsernameline)))
                    .addGroup(LoginPanelLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(RegisterBt, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(LoginPanelLayout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(RegisterLb)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        LoginPanelLayout.setVerticalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(RegisterLb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IntroRegisterLb)
                .addGap(12, 12, 12)
                .addComponent(UsernameLbRegister)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RegisterUsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RegisterUsernameline)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RegisterFirstnameLb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RegisterFirstnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RegisterFirstnameline)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RegisterLastnameLb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RegisterLastnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RegisterLastnameLine)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RegisterPasswordLb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RegisterPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RegisterPasswordline, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RegisterBt, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RegisterMessage)
                    .addComponent(BacktoLogin))
                .addContainerGap(26, Short.MAX_VALUE))
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
    }

    private void RegisterBtActionPerformed(java.awt.event.ActionEvent evt) {

        String regusername = RegisterUsernameField.getText ();
        String regpassword = String.valueOf(RegisterPasswordField.getPassword());
        
        File file = new File("C:\\oop\\Login.txt");
    
        try{
           FileWriter filewriter = new FileWriter(file,true);
           
           filewriter.write("______________________________________");
           filewriter.write(System.getProperty("line.separator"));
           filewriter.write(regusername);
           filewriter.write(System.getProperty("line.separator"));
           filewriter.write(regpassword);
           filewriter.write(System.getProperty("line.separator"));
           filewriter.write("______________________________________");
           filewriter.write(System.getProperty("line.separator"));

           filewriter.close();
         
           Login log = new Login();
           log.setVisible(true);
           this.dispose();
        }  
        catch(IOException ex){
    
        }
         
        
    }//RegisterBtActionPerformed
    
    private void RegisterUsernameFieldActionPerformed(java.awt.event.ActionEvent evt) {
        
    }//RegisterUsernameFieldActionPerformed

    private void RegisterFirstnameFieldActionPerformed(java.awt.event.ActionEvent evt) {
       
    }//RegisterFirstnameFieldActionPerformed

    private void RegisterLastnameFieldActionPerformed(java.awt.event.ActionEvent evt) {
       
    }//RegisterLastnameFieldActionPerformed

    private void BacktoLoginMouseClicked(java.awt.event.MouseEvent evt) {
        Login log = new Login();
        log.setVisible(true);
        this.dispose();
    }//BacktoLoginMouseClicked

    public static void main(String args[]) throws Exception {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUpLog().setVisible(true);
            }
        });
    }

   
    //variables
    private javax.swing.JLabel BacktoLogin;
    private javax.swing.JLabel IntroRegisterLb;
    private javax.swing.JPanel LoginPanel;
    private javax.swing.JButton RegisterBt;
    private javax.swing.JTextField RegisterFirstnameField;
    private javax.swing.JLabel RegisterFirstnameLb;
    private javax.swing.JLabel RegisterFirstnameline;
    private javax.swing.JTextField RegisterLastnameField;
    private javax.swing.JLabel RegisterLastnameLb;
    private javax.swing.JLabel RegisterLastnameLine;
    private javax.swing.JLabel RegisterLb;
    private javax.swing.JLabel RegisterMessage;
    private javax.swing.JPasswordField RegisterPasswordField;
    private javax.swing.JLabel RegisterPasswordLb;
    private javax.swing.JLabel RegisterPasswordline;
    private javax.swing.JTextField RegisterUsernameField;
    private javax.swing.JLabel RegisterUsernameline;
    private javax.swing.JLabel UsernameLbRegister;
   

    
}
