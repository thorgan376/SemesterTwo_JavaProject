
import java.awt.Component;
import static java.lang.Integer.parseInt;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class Membermanage extends javax.swing.JFrame {
    DefaultTableModel tableModel;
    /**
     * Creates new form Bookmanage
     */
    public Membermanage() {
        initComponents();
        this.setLocationRelativeTo(null);
        tableModel = (DefaultTableModel) tblMember.getModel();
        showMember();
        
    }
    
    public void showMember(){
        List<Member> memberList = MemberModify.findAll();
        
        tableModel.setRowCount(0);
        memberList.forEach(member -> {
            tableModel.addRow(new Object[] {member.getMemberId(), member.getMemberName(), 
                member.getGender(), member.getEmail(), member.getPhoneNumber(), member.getAge(), member.getAccountBalance()});
        });
    }
    public void showMember(List<Member> member){
        
        tableModel.setRowCount(0);
        member.forEach(member2 -> {
            tableModel.addRow(new Object[] {member2.getMemberId(), member2.getMemberName(), 
                member2.getGender(), member2.getEmail(), member2.getPhoneNumber(), member2.getAge(), member2.getAccountBalance()});
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        root = new javax.swing.JPanel();
        Home = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMember = new javax.swing.JTable();
        reset = new javax.swing.JButton();
        searchField = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        searchChoice = new javax.swing.JComboBox<>();
        delete = new javax.swing.JButton();
        AddMember = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        age = new javax.swing.JTextField();
        phone = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        male = new javax.swing.JRadioButton();
        name = new javax.swing.JTextField();
        female = new javax.swing.JRadioButton();
        add = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 630));
        setPreferredSize(new java.awt.Dimension(1000, 630));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel3.setBackground(new java.awt.Color(51, 0, 102));

        jButton1.setBackground(new java.awt.Color(85, 65, 118));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Home");
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(85, 65, 118));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Add member");
        jButton2.setBorderPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        logout.setBackground(new java.awt.Color(51, 0, 102));
        logout.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.setText("Log out");
        logout.setBorder(null);
        logout.setBorderPainted(false);
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(logout)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 307, Short.MAX_VALUE)
                .addComponent(logout)
                .addContainerGap())
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 200, 585);

        root.setBackground(new java.awt.Color(255, 255, 255));
        root.setLayout(new java.awt.CardLayout());

        Home.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(153, 102, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 85, Short.MAX_VALUE)
        );

        tblMember.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Name", "Gender", "Email", "Phone number", "Age", "Account balance"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblMember.setGridColor(new java.awt.Color(255, 255, 255));
        tblMember.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMemberMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblMember);
        if (tblMember.getColumnModel().getColumnCount() > 0) {
            tblMember.getColumnModel().getColumn(0).setResizable(false);
            tblMember.getColumnModel().getColumn(1).setResizable(false);
            tblMember.getColumnModel().getColumn(2).setResizable(false);
            tblMember.getColumnModel().getColumn(3).setResizable(false);
            tblMember.getColumnModel().getColumn(4).setResizable(false);
            tblMember.getColumnModel().getColumn(5).setResizable(false);
            tblMember.getColumnModel().getColumn(6).setResizable(false);
        }

        reset.setBackground(new java.awt.Color(0, 0, 0));
        reset.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        reset.setForeground(new java.awt.Color(255, 255, 255));
        reset.setText("Reset");
        reset.setBorderPainted(false);
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        searchField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        searchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchFieldKeyReleased(evt);
            }
        });

        search.setBackground(new java.awt.Color(0, 0, 0));
        search.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        search.setForeground(new java.awt.Color(255, 255, 255));
        search.setText("Search");
        search.setBorderPainted(false);
        search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchMouseClicked(evt);
            }
        });
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        searchChoice.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        searchChoice.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Search by id", "Search by name" }));

        delete.setBackground(new java.awt.Color(0, 0, 0));
        delete.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setText("Delete");
        delete.setBorderPainted(false);
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout HomeLayout = new javax.swing.GroupLayout(Home);
        Home.setLayout(HomeLayout);
        HomeLayout.setHorizontalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(delete)
                .addGap(18, 18, 18)
                .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(search)
                .addGap(18, 18, 18)
                .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(searchChoice, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        HomeLayout.setVerticalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reset)
                    .addComponent(search)
                    .addComponent(searchChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        root.add(Home, "card2");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Name");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Gender");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Email");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Phone number");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Age");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Account balance");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("100.000");

        age.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageActionPerformed(evt);
            }
        });

        phone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneActionPerformed(evt);
            }
        });

        email.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });

        buttonGroup1.add(male);
        male.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        male.setText("Male");
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleActionPerformed(evt);
            }
        });

        name.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        buttonGroup1.add(female);
        female.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        female.setText("Female");
        female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleActionPerformed(evt);
            }
        });

        add.setBackground(new java.awt.Color(0, 0, 0));
        add.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add.setForeground(new java.awt.Color(255, 255, 255));
        add.setText("Add");
        add.setBorderPainted(false);
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AddMemberLayout = new javax.swing.GroupLayout(AddMember);
        AddMember.setLayout(AddMemberLayout);
        AddMemberLayout.setHorizontalGroup(
            AddMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddMemberLayout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addGroup(AddMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddMemberLayout.createSequentialGroup()
                        .addGroup(AddMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(165, 165, 165)
                        .addGroup(AddMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddMemberLayout.createSequentialGroup()
                                .addGroup(AddMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(AddMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(phone, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                                        .addComponent(email, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel7)
                                    .addGroup(AddMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(add)
                                        .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(188, 188, 188))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddMemberLayout.createSequentialGroup()
                                .addGroup(AddMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(AddMemberLayout.createSequentialGroup()
                                        .addComponent(male, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(female, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(187, 187, 187))))
                    .addGroup(AddMemberLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        AddMemberLayout.setVerticalGroup(
            AddMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddMemberLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(AddMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(AddMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(male)
                    .addComponent(female)
                    .addComponent(jLabel2))
                .addGap(46, 46, 46)
                .addGroup(AddMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(AddMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(AddMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(AddMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(add)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        root.add(AddMember, "card4");

        getContentPane().add(root);
        root.setBounds(200, 0, 800, 590);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
           root.removeAll();
           root.add(Home);
           root.repaint();
           root.revalidate();
           
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
           root.removeAll();
           root.add(AddMember);
           root.repaint();
           root.revalidate();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_logoutMouseClicked

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        loginscreen log = new loginscreen();
        log.show();
        dispose();
    }//GEN-LAST:event_logoutActionPerformed

    private void tblMemberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMemberMouseClicked
        // TODO add your handling code here:
        if(evt.getClickCount() == 2){
            int index = tblMember.getSelectedRow();
            TableModel model = tblMember.getModel();
            String id = model.getValueAt(index, 0).toString();
            memberFrame mf = new memberFrame(id);
            mf.show();
        }
    }//GEN-LAST:event_tblMemberMouseClicked

    private void ageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageActionPerformed

    private void phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maleActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_femaleActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        try{
            long x = Long.parseLong(phone.getText());
            String fname = "";
            fname = name.getText();
            String fgender = "";
            if(male.isSelected()){
                fgender = "male";
            }if(female.isSelected()){
                fgender = "female";
            }
            if("".equals(fgender) || "".equals(fname)){
                Component frame = null;
                JOptionPane.showMessageDialog(frame, "Input invalid");
                return;
            }
            String femail = email.getText();
            String fphone = phone.getText();
            int fage = parseInt(age.getText());
            Member member = new Member(fname, fgender, femail, fphone, fage);
            MemberModify.insert(member);
            showMember();
        }catch(Exception ex){
            Component frame = null;
            JOptionPane.showMessageDialog(frame, "Input invalid");
        }
        
    }//GEN-LAST:event_addActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        showMember();
    }//GEN-LAST:event_resetActionPerformed

    private void searchFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_searchFieldKeyReleased

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
        String choice = searchChoice.getSelectedItem().toString();
        if(choice.equals("Search by id")){
            showMember(MemberModify.memberSearchId(searchField.getText()));
        }if(choice.equals("Search by name")){
            showMember(MemberModify.memberSearchName(searchField.getText()));
        }
        
    }//GEN-LAST:event_searchActionPerformed

    private void searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_searchMouseClicked

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        int index = tblMember.getSelectedRow();
        TableModel tblmodel = tblMember.getModel();
        String id = tblmodel.getValueAt(index, 0).toString();
        MemberModify.delete(id);
        showMember();
    }//GEN-LAST:event_deleteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Membermanage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Membermanage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Membermanage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Membermanage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
            java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Membermanage().setVisible(true);
            }
        });
        /* Create and display the form */
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AddMember;
    private javax.swing.JPanel Home;
    private javax.swing.JButton add;
    private javax.swing.JTextField age;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton delete;
    private javax.swing.JTextField email;
    private javax.swing.JRadioButton female;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton logout;
    private javax.swing.JRadioButton male;
    private javax.swing.JTextField name;
    private javax.swing.JTextField phone;
    private javax.swing.JButton reset;
    private javax.swing.JPanel root;
    private javax.swing.JButton search;
    private javax.swing.JComboBox<String> searchChoice;
    private javax.swing.JTextField searchField;
    private javax.swing.JTable tblMember;
    // End of variables declaration//GEN-END:variables
}
