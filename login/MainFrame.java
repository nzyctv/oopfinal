
package login;

public class MainFrame extends javax.swing.JFrame {

    public MainFrame() {
        initComponents();
    }

 
    private void initComponents() {

        Frame1 = new javax.swing.JPanel();
        Panel1 = new javax.swing.JPanel();
        MainDetails = new javax.swing.JLabel();
        MainInquiry = new javax.swing.JLabel();
        Panel2 = new javax.swing.JPanel();
        MainSex = new javax.swing.JLabel();
        MainGenderClass = new javax.swing.JLabel();
        Panel3 = new javax.swing.JPanel();
        MainDate = new javax.swing.JLabel();
        MainReprotingdate = new javax.swing.JLabel();
        Panel4 = new javax.swing.JPanel();
        MainID = new javax.swing.JLabel();
        MainReportingID = new javax.swing.JLabel();
        Panel5 = new javax.swing.JPanel();
        MainEr = new javax.swing.JLabel();
        MainLatestER = new javax.swing.JLabel();
        Panel6 = new javax.swing.JPanel();
        MainClaimStatus = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        MainFlagStatus = new javax.swing.JLabel();
        Panel7 = new javax.swing.JPanel();
        MainNumStatus = new javax.swing.JLabel();
        MainSSNum = new javax.swing.JLabel();
        Panel8 = new javax.swing.JPanel();
        MainCoverage = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        MainStatus = new javax.swing.JLabel();
        Panel9 = new javax.swing.JPanel();
        AddContactInfo = new javax.swing.JLabel();
        Panel10 = new javax.swing.JPanel();
        MainHomeAdd = new javax.swing.JLabel();
        MainAdd = new javax.swing.JLabel();
        Panel11 = new javax.swing.JPanel();
        MainMailingAdd = new javax.swing.JLabel();
        Panel12 = new javax.swing.JPanel();
        MainLandline = new javax.swing.JLabel();
        Panel13 = new javax.swing.JPanel();
        MainMobNum = new javax.swing.JLabel();
        MainNum = new javax.swing.JLabel();
        Panel14 = new javax.swing.JPanel();
        MainEmail = new javax.swing.JLabel();
        MainSampleEmail = new javax.swing.JLabel();
        Panel15 = new javax.swing.JPanel();
        MainForeignAdd = new javax.swing.JLabel();
        Panel16 = new javax.swing.JPanel();
        MainForeingMailing = new javax.swing.JLabel();
        PanelDivider = new javax.swing.JPanel();
        SSSIcon = new javax.swing.JLabel();
        MainIntro1 = new javax.swing.JLabel();
        MainIntro2 = new javax.swing.JLabel();
        SidePanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Frame1.setBackground(new java.awt.Color(204, 204, 204));

        Panel1.setBackground(new java.awt.Color(64, 123, 153));

        MainDetails.setFont(new java.awt.Font("Segoe UI", 1, 12)); 
        MainDetails.setForeground(new java.awt.Color(255, 255, 255));
        MainDetails.setText("MEMBER DETAILS");

        MainInquiry.setFont(new java.awt.Font("Segoe UI", 1, 14));
        MainInquiry.setForeground(new java.awt.Color(255, 255, 255));
        MainInquiry.setText("Member Inquiry");

        javax.swing.GroupLayout Panel1Layout = new javax.swing.GroupLayout(Panel1);
        Panel1.setLayout(Panel1Layout);
        Panel1Layout.setHorizontalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(MainInquiry, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(278, 278, 278)
                .addComponent(MainDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(MainDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MainInquiry))
        );

        Panel2.setBackground(new java.awt.Color(255, 255, 255));

        MainSex.setFont(new java.awt.Font("Segoe UI", 0, 14)); 
        MainSex.setText("Sex:");

        MainGenderClass.setText("M");

        javax.swing.GroupLayout Panel2Layout = new javax.swing.GroupLayout(Panel2);
        Panel2.setLayout(Panel2Layout);
        Panel2Layout.setHorizontalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MainSex, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MainGenderClass, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138))
        );
        Panel2Layout.setVerticalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(MainSex, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addComponent(MainGenderClass, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Panel3.setBackground(new java.awt.Color(64, 123, 153));

        MainDate.setFont(new java.awt.Font("Segoe UI", 0, 14)); 
        MainDate.setForeground(new java.awt.Color(255, 255, 255));
        MainDate.setText("Reporting Date:");

        MainReprotingdate.setText("17-01-2023");

        javax.swing.GroupLayout Panel3Layout = new javax.swing.GroupLayout(Panel3);
        Panel3.setLayout(Panel3Layout);
        Panel3Layout.setHorizontalGroup(
            Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MainDate, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MainReprotingdate, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98))
        );
        Panel3Layout.setVerticalGroup(
            Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MainDate, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MainReprotingdate)))
        );

        Panel4.setBackground(new java.awt.Color(255, 255, 255));

        MainID.setFont(new java.awt.Font("Segoe UI", 0, 14)); 
        MainID.setText("Reporting ID:");

        MainReportingID.setText("00-0000000-0");

        javax.swing.GroupLayout Panel4Layout = new javax.swing.GroupLayout(Panel4);
        Panel4.setLayout(Panel4Layout);
        Panel4Layout.setHorizontalGroup(
            Panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MainID, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MainReportingID, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103))
        );
        Panel4Layout.setVerticalGroup(
            Panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(MainID, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addComponent(MainReportingID))
        );

        Panel5.setBackground(new java.awt.Color(64, 123, 153));

        MainEr.setFont(new java.awt.Font("Segoe UI", 1, 14));
        MainEr.setForeground(new java.awt.Color(255, 255, 255));
        MainEr.setText("Latest ER Name:");

        MainLatestER.setText("03-1111111-7");

        javax.swing.GroupLayout Panel5Layout = new javax.swing.GroupLayout(Panel5);
        Panel5.setLayout(Panel5Layout);
        Panel5Layout.setHorizontalGroup(
            Panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MainEr, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MainLatestER, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(129, 129, 129))
        );
        Panel5Layout.setVerticalGroup(
            Panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(MainEr, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addComponent(MainLatestER))
        );

        Panel6.setBackground(new java.awt.Color(255, 255, 255));

        MainClaimStatus.setFont(new java.awt.Font("Segoe UI", 0, 14)); 
        MainClaimStatus.setText("Claim Flag Status:");

        MainFlagStatus.setText("NO CLAIM");

        javax.swing.GroupLayout Panel6Layout = new javax.swing.GroupLayout(Panel6);
        Panel6.setLayout(Panel6Layout);
        Panel6Layout.setHorizontalGroup(
            Panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MainClaimStatus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MainFlagStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(117, 117, 117))
        );
        Panel6Layout.setVerticalGroup(
            Panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(MainClaimStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addComponent(jLabel23)
                .addComponent(MainFlagStatus))
        );

        Panel7.setBackground(new java.awt.Color(64, 123, 153));

        MainNumStatus.setFont(new java.awt.Font("Segoe UI", 0, 14)); 
        MainNumStatus.setForeground(new java.awt.Color(255, 255, 255));
        MainNumStatus.setText("SS Number Status:");

        MainSSNum.setText("SS Number Active");

        javax.swing.GroupLayout Panel7Layout = new javax.swing.GroupLayout(Panel7);
        Panel7.setLayout(Panel7Layout);
        Panel7Layout.setHorizontalGroup(
            Panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MainNumStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MainSSNum)
                .addGap(121, 121, 121))
        );
        Panel7Layout.setVerticalGroup(
            Panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(MainNumStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(MainSSNum))
        );

        Panel8.setBackground(new java.awt.Color(255, 255, 255));

        MainCoverage.setFont(new java.awt.Font("Segoe UI", 0, 14)); 
        MainCoverage.setText("Coverage Status:");

        MainStatus.setText("COVERED EMPLOYEE");

        javax.swing.GroupLayout Panel8Layout = new javax.swing.GroupLayout(Panel8);
        Panel8.setLayout(Panel8Layout);
        Panel8Layout.setHorizontalGroup(
            Panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MainCoverage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MainStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(86, 86, 86))
        );
        Panel8Layout.setVerticalGroup(
            Panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(MainCoverage, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addComponent(jLabel26)
                .addComponent(MainStatus))
        );

        Panel9.setBackground(new java.awt.Color(64, 123, 153));

        AddContactInfo.setFont(new java.awt.Font("Segoe UI", 1, 16)); 
        AddContactInfo.setForeground(new java.awt.Color(255, 255, 255));
        AddContactInfo.setText("ADDRESS & CONTACT INFORMATION");

        javax.swing.GroupLayout Panel9Layout = new javax.swing.GroupLayout(Panel9);
        Panel9.setLayout(Panel9Layout);
        Panel9Layout.setHorizontalGroup(
            Panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AddContactInfo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel9Layout.setVerticalGroup(
            Panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AddContactInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
        );

        Panel10.setBackground(new java.awt.Color(255, 255, 255));

        MainHomeAdd.setFont(new java.awt.Font("Segoe UI", 0, 14)); 
        MainHomeAdd.setText("Local Home Address:");

        MainAdd.setText("Sampaguita Village Trece Martirez ");

        javax.swing.GroupLayout Panel10Layout = new javax.swing.GroupLayout(Panel10);
        Panel10.setLayout(Panel10Layout);
        Panel10Layout.setHorizontalGroup(
            Panel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MainHomeAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MainAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        Panel10Layout.setVerticalGroup(
            Panel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(MainHomeAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addComponent(MainAdd))
        );

        Panel11.setBackground(new java.awt.Color(64, 123, 153));

        MainMailingAdd.setFont(new java.awt.Font("Segoe UI", 0, 14)); 
        MainMailingAdd.setText("Local Mailing Address:");

        javax.swing.GroupLayout Panel11Layout = new javax.swing.GroupLayout(Panel11);
        Panel11.setLayout(Panel11Layout);
        Panel11Layout.setHorizontalGroup(
            Panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MainMailingAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel11Layout.setVerticalGroup(
            Panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainMailingAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
        );

        Panel12.setBackground(new java.awt.Color(255, 255, 255));

        MainLandline.setFont(new java.awt.Font("Segoe UI", 0, 14)); 
        MainLandline.setText("Landline:");

        javax.swing.GroupLayout Panel12Layout = new javax.swing.GroupLayout(Panel12);
        Panel12.setLayout(Panel12Layout);
        Panel12Layout.setHorizontalGroup(
            Panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MainLandline, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel12Layout.setVerticalGroup(
            Panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainLandline, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
        );

        Panel13.setBackground(new java.awt.Color(64, 123, 153));

        MainMobNum.setFont(new java.awt.Font("Segoe UI", 0, 14)); 
        MainMobNum.setText("Mobile:");

        MainNum.setText("09123456789");

        javax.swing.GroupLayout Panel13Layout = new javax.swing.GroupLayout(Panel13);
        Panel13.setLayout(Panel13Layout);
        Panel13Layout.setHorizontalGroup(
            Panel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MainMobNum, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MainNum, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );
        Panel13Layout.setVerticalGroup(
            Panel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(MainMobNum, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addComponent(MainNum))
        );

        Panel14.setBackground(new java.awt.Color(255, 255, 255));

        MainEmail.setFont(new java.awt.Font("Segoe UI", 0, 14));
        MainEmail.setText("Email Address:");

        MainSampleEmail.setText("sample@gmail.com");

        javax.swing.GroupLayout Panel14Layout = new javax.swing.GroupLayout(Panel14);
        Panel14.setLayout(Panel14Layout);
        Panel14Layout.setHorizontalGroup(
            Panel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MainEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MainSampleEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );
        Panel14Layout.setVerticalGroup(
            Panel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(MainEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addComponent(MainSampleEmail))
        );

        Panel15.setBackground(new java.awt.Color(64, 123, 153));

        MainForeignAdd.setFont(new java.awt.Font("Segoe UI", 0, 14)); 
        MainForeignAdd.setText("Foreign Home Address:");

        javax.swing.GroupLayout Panel15Layout = new javax.swing.GroupLayout(Panel15);
        Panel15.setLayout(Panel15Layout);
        Panel15Layout.setHorizontalGroup(
            Panel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MainForeignAdd)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel15Layout.setVerticalGroup(
            Panel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainForeignAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
        );

        Panel16.setBackground(new java.awt.Color(255, 255, 255));

        MainForeingMailing.setFont(new java.awt.Font("Segoe UI", 0, 14)); 
        MainForeingMailing.setText("Foreign Mailing Address:");

        javax.swing.GroupLayout Panel16Layout = new javax.swing.GroupLayout(Panel16);
        Panel16.setLayout(Panel16Layout);
        Panel16Layout.setHorizontalGroup(
            Panel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MainForeingMailing, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel16Layout.setVerticalGroup(
            Panel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel16Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(MainForeingMailing, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        PanelDivider.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout PanelDividerLayout = new javax.swing.GroupLayout(PanelDivider);
        PanelDivider.setLayout(PanelDividerLayout);
        PanelDividerLayout.setHorizontalGroup(
            PanelDividerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        PanelDividerLayout.setVerticalGroup(
            PanelDividerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        SSSIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/icons/image_2023-01-17_183204357-removebg-preview (2).png"))); 

        MainIntro1.setFont(new java.awt.Font("Segoe UI", 1, 20)); 
        MainIntro1.setForeground(new java.awt.Color(255, 255, 255));
        MainIntro1.setText("Republic of the Philippines");

        MainIntro2.setFont(new java.awt.Font("Segoe UI", 1, 36)); 
        MainIntro2.setForeground(new java.awt.Color(255, 255, 255));
        MainIntro2.setText("Social Security System");

        javax.swing.GroupLayout Frame1Layout = new javax.swing.GroupLayout(Frame1);
        Frame1.setLayout(Frame1Layout);
        Frame1Layout.setHorizontalGroup(
            Frame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Panel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Panel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Panel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Panel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Panel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Panel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Panel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Panel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Panel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Panel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Panel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Panel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Panel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Panel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PanelDivider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Frame1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(SSSIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(Frame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MainIntro1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MainIntro2, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(397, Short.MAX_VALUE))
        );
        Frame1Layout.setVerticalGroup(
            Frame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Frame1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(Frame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(Frame1Layout.createSequentialGroup()
                        .addComponent(SSSIcon)
                        .addGap(25, 25, 25))
                    .addGroup(Frame1Layout.createSequentialGroup()
                        .addComponent(MainIntro1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(MainIntro2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(Panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Panel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Panel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Panel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Panel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Panel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Panel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Panel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Panel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Panel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Panel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Panel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Panel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Panel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelDivider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        SidePanel.setBackground(new java.awt.Color(0, 102, 153));

        javax.swing.GroupLayout SidePanelLayout = new javax.swing.GroupLayout(SidePanel);
        SidePanel.setLayout(SidePanelLayout);
        SidePanelLayout.setHorizontalGroup(
            SidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 87, Short.MAX_VALUE)
        );
        SidePanelLayout.setVerticalGroup(
            SidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 689, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Frame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Frame1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    
    private javax.swing.JLabel AddContactInfo;
    private javax.swing.JPanel Frame1;
    private javax.swing.JLabel MainAdd;
    private javax.swing.JLabel MainClaimStatus;
    private javax.swing.JLabel MainCoverage;
    private javax.swing.JLabel MainDate;
    private javax.swing.JLabel MainDetails;
    private javax.swing.JLabel MainEmail;
    private javax.swing.JLabel MainEr;
    private javax.swing.JLabel MainFlagStatus;
    private javax.swing.JLabel MainForeignAdd;
    private javax.swing.JLabel MainForeingMailing;
    private javax.swing.JLabel MainGenderClass;
    private javax.swing.JLabel MainHomeAdd;
    private javax.swing.JLabel MainID;
    private javax.swing.JLabel MainInquiry;
    private javax.swing.JLabel MainIntro1;
    private javax.swing.JLabel MainIntro2;
    private javax.swing.JLabel MainLandline;
    private javax.swing.JLabel MainLatestER;
    private javax.swing.JLabel MainMailingAdd;
    private javax.swing.JLabel MainMobNum;
    private javax.swing.JLabel MainNum;
    private javax.swing.JLabel MainNumStatus;
    private javax.swing.JLabel MainReportingID;
    private javax.swing.JLabel MainReprotingdate;
    private javax.swing.JLabel MainSSNum;
    private javax.swing.JLabel MainSampleEmail;
    private javax.swing.JLabel MainSex;
    private javax.swing.JLabel MainStatus;
    private javax.swing.JPanel Panel1;
    private javax.swing.JPanel Panel10;
    private javax.swing.JPanel Panel11;
    private javax.swing.JPanel Panel12;
    private javax.swing.JPanel Panel13;
    private javax.swing.JPanel Panel14;
    private javax.swing.JPanel Panel15;
    private javax.swing.JPanel Panel16;
    private javax.swing.JPanel Panel2;
    private javax.swing.JPanel Panel3;
    private javax.swing.JPanel Panel4;
    private javax.swing.JPanel Panel5;
    private javax.swing.JPanel Panel6;
    private javax.swing.JPanel Panel7;
    private javax.swing.JPanel Panel8;
    private javax.swing.JPanel Panel9;
    private javax.swing.JPanel PanelDivider;
    private javax.swing.JLabel SSSIcon;
    private javax.swing.JPanel SidePanel;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel26;
    
}
