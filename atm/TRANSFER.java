/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg21kb1a0574.atm;

import java.awt.event.KeyEvent;
import java.sql.*;


/**
 *
 * @author admin
 */
public class TRANSFER extends javax.swing.JFrame {

    /**
     * Creates new form TRANSFER
     */
    public TRANSFER() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TRANSACTION");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ACC NO");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, 37));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CONFIRM ACC NO");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 139, -1));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 332, -1, -1));

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 219, 37));

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField2KeyPressed(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 219, 39));

        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField3KeyPressed(evt);
            }
        });
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, 219, 34));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg21kb1a0574/atm/wrong.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 24, -1));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("AMOUNT");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, -1, 34));

        jButton1.setBackground(new java.awt.Color(255, 255, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("EXIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 401, -1, -1));

        jButton2.setBackground(new java.awt.Color(255, 255, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("CLEAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, -1, -1));

        jButton3.setBackground(new java.awt.Color(255, 255, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("SUBMIT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(453, 401, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg21kb1a0574/atm/TRANSACTION.jpg"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, -20, 600, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try
        {
           if (jTextField1.getText().equals(""))	
             {
                 javax.swing.JOptionPane.showMessageDialog(null, "PLEASE ENTER ACCOUNTNO");
             }
           else if(jTextField2.getText().equals(""))
           {
                 javax.swing.JOptionPane.showMessageDialog(null, "PLEASE ENTER CONFIRM ACCOUNTNO");
           }
           else if(jTextField3.getText().equals(""))
           {
                 javax.swing.JOptionPane.showMessageDialog(null, "PLEASE ENTER AMOUNT");
           }
            else
            {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
                String Query = "SELECT ACCOUNTNO FROM PREETHI.RECORD";
                java.sql.Statement ps=con.createStatement();
                java.sql.ResultSet rs= ps.executeQuery(Query);
                if(rs.next())
                {
                    String acc=jTextField1.getText();
                    String cacc=jTextField2.getText();
                    double bal1= Double.parseDouble(jTextField3.getText());
                    String Query1 = "SELECT BALANCE FROM PREETHI.BALANCE WHERE ACCOUNTNO=?";
                    java.sql.PreparedStatement ps1 = con.prepareStatement(Query1);
                    ps1.setLong(1, Long.parseLong(rs.getString("ACCOUNTNO")));
                    java.sql.ResultSet rs1= ps1.executeQuery();
                    if(rs1.next())
                    {
                        double bal2=Double.parseDouble(rs1.getString("BALANCE"));
                        double bal =bal2-bal1;
                        String Query2="UPDATE PREETHI.BALANCE SET BALANCE=? WHERE ACCOUNTNO=?";
                        java.sql.PreparedStatement ps2 = con.prepareStatement(Query2);
                        ps2.setDouble(1,bal);
                        ps2.setLong(2,Long.parseLong(rs.getString("ACCOUNTNO")));
                        String Query3="SELECT TRANSACTIONID FROM PREETHI.TRANSACTION WHERE TRANSACTIONTYPE =?";
                        java.sql.PreparedStatement ps3=con.prepareStatement(Query3);
                        ps3.setString(1,"DEFAULT");
                        java.sql.ResultSet rs3= ps3.executeQuery();
                        if(rs3.next())
                        {
                            if(bal>500)
                            {
                                ps2.executeUpdate();
                                long tid = Long.parseLong(rs3.getString("TRANSACTIONID"));
                                long tid1=tid+1;
                                String Query4 = "DELETE FROM PREETHI.TRANSACTION WHERE TRANSACTIONID=?";
                                java.sql.PreparedStatement ps4=con.prepareStatement(Query4);
                                ps4.setLong(1,Long.parseLong(rs3.getString("TRANSACTIONID")));
                                ps4.executeUpdate();
                                String Query5="INSERT INTO PREETHI.TRANSACTION(ACCOUNTNO,TRANSACTIONID,TRANSFEREDTO,TRANSACTIONTYPE,AMOUNT)VALUES(?,?,?,?,?)";
                                String Query6="INSERT INTO PREETHI.TRANSACTION(TRANSACTIONID,TRANSACTIONTYPE)VALUES(?,?)"; 
                                java.sql.PreparedStatement ps5=con.prepareStatement(Query5);
                                ps5.setLong(1,Long.parseLong(rs.getString("ACCOUNTNO")));
                                ps5.setLong(2,tid);
                                ps5.setLong(3,Long.parseLong(acc));
                                ps5.setString(4,"TRANSFER");
                                ps5.setDouble(5,Double.parseDouble(jTextField3.getText()));
                                java.sql.PreparedStatement ps6=con.prepareStatement(Query6);
                                ps6.setLong(1,tid1);
                                ps6.setString(2,"DEFAULT");
                                ps5.executeUpdate();
                                ps6.executeUpdate();
                            }
                            else
                            {
                               javax.swing.JOptionPane.showMessageDialog(null,"insufficient balance"); 
                            }
                        }
                    }
                    String Query7="SELECT ACCOUNTNO FROM PREETHI.ACCOUNTS WHERE ACCOUNTNO=?";
                    PreparedStatement pstmt=con.prepareStatement(Query7);
                    pstmt.setLong(1,Long.parseLong(acc));
                    java.sql.ResultSet rs4= pstmt.executeQuery();
                    if(rs4.next())
                    {
                        String Query8="SELECT BALANCE FROM PREETHI.BALANCE WHERE ACCOUNTNO=?";
                        PreparedStatement pstmt1=con.prepareStatement(Query8);
                        pstmt1.setLong(1,Long.parseLong(acc));
                        java.sql.ResultSet rs5= pstmt1.executeQuery();
                        if(rs5.next())
                        {
                            double balance1=Double.parseDouble(rs5.getString("BALANCE"));
                            double balance2=Double.parseDouble(jTextField3.getText());
                            double balance=balance1+balance2;
                            String Query9= "UPDATE PREETHI.BALANCE SET BALANCE=? WHERE ACCOUNTNO=?";
                            java.sql.PreparedStatement pstmt2 = con.prepareStatement(Query9);
                            pstmt2.setDouble(1,balance);
                            pstmt2.setLong(2,Long.parseLong(jTextField1.getText()));
                            String Q1="SELECT TRANSACTIONID FROM PREETHI.TRANSACTION WHERE TRANSACTIONTYPE =?";
                            java.sql.PreparedStatement pstmt3=con.prepareStatement(Q1);
                            pstmt3.setString(1,"DEFAULT");
                            java.sql.ResultSet rs6= pstmt3.executeQuery();
                            if(rs6.next())
                            {
                                pstmt2.executeUpdate();
                                long trid = Long.parseLong(rs6.getString("TRANSACTIONID"));
                                long trid1=trid+1;
                                String Q2 = "DELETE FROM PREETHI.TRANSACTION WHERE TRANSACTIONID=?";
                                java.sql.PreparedStatement pstmt4=con.prepareStatement(Q2);
                                pstmt4.setString(1,rs6.getString("TRANSACTIONID"));
                                pstmt4.executeUpdate();
                                String Q3="INSERT INTO PREETHI.TRANSACTION(ACCOUNTNO,TRANSACTIONID,TRANSFEREDTO,TRANSACTIONTYPE,AMOUNT)VALUES(?,?,?,?,?)";
                                String Q4="INSERT INTO PREETHI.TRANSACTION(TRANSACTIONID,TRANSACTIONTYPE)VALUES(?,?)"; 
                                java.sql.PreparedStatement pstmt5=con.prepareStatement(Q3);
                                pstmt5.setLong(1,Long.parseLong(jTextField1.getText()));
                                pstmt5.setLong(2,trid);
                                pstmt5.setLong(3,Long.parseLong(rs.getString("ACCOUNTNO")));
                                pstmt5.setString(4,"CREDITED");
                                pstmt5.setDouble(5,Double.parseDouble(jTextField3.getText()));
                                java.sql.PreparedStatement pstmt6=con.prepareStatement(Q4);
                                pstmt6.setLong(1,trid1);
                                pstmt6.setString(2,"DEFAULT");
                                pstmt5.executeUpdate();
                                pstmt6.executeUpdate();
                        }
                        }
                        new TRANSACTION_FINAL().setVisible(true);
                        dispose();
                    }     
                }
             }  
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode()==KeyEvent.VK_ENTER)
            jTextField2.requestFocus();
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jTextField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyPressed
        // TODO add your handling code here:
         if (evt.getKeyCode()==KeyEvent.VK_ENTER)
            jTextField3.requestFocus();
    }//GEN-LAST:event_jTextField2KeyPressed

    private void jTextField3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyPressed
        // TODO add your handling code here:
         if (evt.getKeyCode()==KeyEvent.VK_ENTER){
             try
        {
           if (jTextField1.getText().equals(""))	
             {
                 javax.swing.JOptionPane.showMessageDialog(null, "PLEASE ENTER ACCOUNTNO");
             }
           else if(jTextField2.getText().equals(""))
           {
                 javax.swing.JOptionPane.showMessageDialog(null, "PLEASE ENTER CONFIRM ACCOUNTNO");
           }
           else if(jTextField3.getText().equals(""))
           {
                 javax.swing.JOptionPane.showMessageDialog(null, "PLEASE ENTER AMOUNT");
           }
            else
            {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
                String Query = "SELECT ACCOUNTNO FROM PREETHI.RECORD";
                java.sql.Statement ps=con.createStatement();
                java.sql.ResultSet rs= ps.executeQuery(Query);
                if(rs.next())
                {
                    String acc=jTextField1.getText();
                    String cacc=jTextField2.getText();
                    double bal1= Double.parseDouble(jTextField3.getText());
                    String Query1 = "SELECT BALANCE FROM PREETHI.BALANCE WHERE ACCOUNTNO=?";
                    java.sql.PreparedStatement ps1 = con.prepareStatement(Query1);
                    ps1.setLong(1, Long.parseLong(rs.getString("ACCOUNTNO")));
                    java.sql.ResultSet rs1= ps1.executeQuery();
                    if(rs1.next())
                    {
                        double bal2=Double.parseDouble(rs1.getString("BALANCE"));
                        double bal =bal2-bal1;
                        String Query2="UPDATE PREETHI.BALANCE SET BALANCE=? WHERE ACCOUNTNO=?";
                        java.sql.PreparedStatement ps2 = con.prepareStatement(Query2);
                        ps2.setDouble(1,bal);
                        ps2.setLong(2,Long.parseLong(rs.getString("ACCOUNTNO")));
                        String Query3="SELECT TRANSACTIONID FROM PREETHI.TRANSACTION WHERE TRANSACTIONTYPE =?";
                        java.sql.PreparedStatement ps3=con.prepareStatement(Query3);
                        ps3.setString(1,"DEFAULT");
                        java.sql.ResultSet rs3= ps3.executeQuery();
                        if(rs3.next())
                        {
                            if(bal>500)
                            {
                                ps2.executeUpdate();
                                long tid = Long.parseLong(rs3.getString("TRANSACTIONID"));
                                long tid1=tid+1;
                                String Query4 = "DELETE FROM PREETHI.TRANSACTION WHERE TRANSACTIONID=?";
                                java.sql.PreparedStatement ps4=con.prepareStatement(Query4);
                                ps4.setLong(1,Long.parseLong(rs3.getString("TRANSACTIONID")));
                                ps4.executeUpdate();
                                String Query5="INSERT INTO PREETHI.TRANSACTION(ACCOUNTNO,TRANSACTIONID,TRANSFEREDTO,TRANSACTIONTYPE,AMOUNT)VALUES(?,?,?,?,?)";
                                String Query6="INSERT INTO PREETHI.TRANSACTION(TRANSACTIONID,TRANSACTIONTYPE)VALUES(?,?)"; 
                                java.sql.PreparedStatement ps5=con.prepareStatement(Query5);
                                ps5.setLong(1,Long.parseLong(rs.getString("ACCOUNTNO")));
                                ps5.setLong(2,tid);
                                ps5.setLong(3,Long.parseLong(acc));
                                ps5.setString(4,"TRANSFER");
                                ps5.setDouble(5,Double.parseDouble(jTextField3.getText()));
                                java.sql.PreparedStatement ps6=con.prepareStatement(Query6);
                                ps6.setLong(1,tid1);
                                ps6.setString(2,"DEFAULT");
                                ps5.executeUpdate();
                                ps6.executeUpdate();
                            }
                            else
                            {
                               javax.swing.JOptionPane.showMessageDialog(null,"insufficient balance"); 
                            }
                        }
                    }
                    String Query7="SELECT ACCOUNTNO FROM PREETHI.ACCOUNTS WHERE ACCOUNTNO=?";
                    PreparedStatement pstmt=con.prepareStatement(Query7);
                    pstmt.setLong(1,Long.parseLong(acc));
                    java.sql.ResultSet rs4= pstmt.executeQuery();
                    if(rs4.next())
                    {
                        String Query8="SELECT BALANCE FROM PREETHI.BALANCE WHERE ACCOUNTNO=?";
                        PreparedStatement pstmt1=con.prepareStatement(Query8);
                        pstmt1.setLong(1,Long.parseLong(acc));
                        java.sql.ResultSet rs5= pstmt1.executeQuery();
                        if(rs5.next())
                        {
                            double balance1=Double.parseDouble(rs5.getString("BALANCE"));
                            double balance2=Double.parseDouble(jTextField3.getText());
                            double balance=balance1+balance2;
                            String Query9= "UPDATE PREETHI.BALANCE SET BALANCE=? WHERE ACCOUNTNO=?";
                            java.sql.PreparedStatement pstmt2 = con.prepareStatement(Query9);
                            pstmt2.setDouble(1,balance);
                            pstmt2.setLong(2,Long.parseLong(jTextField1.getText()));
                            String Q1="SELECT TRANSACTIONID FROM PREETHI.TRANSACTION WHERE TRANSACTIONTYPE =?";
                            java.sql.PreparedStatement pstmt3=con.prepareStatement(Q1);
                            pstmt3.setString(1,"DEFAULT");
                            java.sql.ResultSet rs6= pstmt3.executeQuery();
                            if(rs6.next())
                            {
                                pstmt2.executeUpdate();
                                long trid = Long.parseLong(rs6.getString("TRANSACTIONID"));
                                long trid1=trid+1;
                                String Q2 = "DELETE FROM PREETHI.TRANSACTION WHERE TRANSACTIONID=?";
                                java.sql.PreparedStatement pstmt4=con.prepareStatement(Q2);
                                pstmt4.setString(1,rs6.getString("TRANSACTIONID"));
                                pstmt4.executeUpdate();
                                String Q3="INSERT INTO PREETHI.TRANSACTION(ACCOUNTNO,TRANSACTIONID,TRANSFEREDTO,TRANSACTIONTYPE,AMOUNT)VALUES(?,?,?,?,?)";
                                String Q4="INSERT INTO PREETHI.TRANSACTION(TRANSACTIONID,TRANSACTIONTYPE)VALUES(?,?)"; 
                                java.sql.PreparedStatement pstmt5=con.prepareStatement(Q3);
                                pstmt5.setLong(1,Long.parseLong(jTextField1.getText()));
                                pstmt5.setLong(2,trid);
                                pstmt5.setLong(3,Long.parseLong(rs.getString("ACCOUNTNO")));
                                pstmt5.setString(4,"CREDITED");
                                pstmt5.setDouble(5,Double.parseDouble(jTextField3.getText()));
                                java.sql.PreparedStatement pstmt6=con.prepareStatement(Q4);
                                pstmt6.setLong(1,trid1);
                                pstmt6.setString(2,"DEFAULT");
                                pstmt5.executeUpdate();
                                pstmt6.executeUpdate();
                        }
                        }
                        new TRANSACTION_FINAL().setVisible(true);
                        dispose();
                    }     
                }
             }  
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
         }
    }//GEN-LAST:event_jTextField3KeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jTextField1.setText(null);
        jTextField2.setText(null);
        jTextField3.setText(null);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       new WELCOME_TO_CSE_BANK().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(TRANSFER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TRANSFER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TRANSFER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TRANSFER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TRANSFER().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
