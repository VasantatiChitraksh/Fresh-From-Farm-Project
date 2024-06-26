/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Consumer;

import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author chitr
 */
public class Order extends javax.swing.JFrame {

    /**
     * Creates new form Cart
     */
    public Order() {
        initComponents();
        jTextField1.addFocusListener(new FocusListener() {
    @Override
    public void focusGained(FocusEvent e) {
        if (jTextField1.getText().equals("Enter Token No")) {
            jTextField1.setText("");
            jTextField1.setForeground(Color.BLACK);
        }
    }
    @Override
    public void focusLost(FocusEvent e) {
        if (jTextField1.getText().isEmpty()) {
            jTextField1.setForeground(Color.GRAY);
            jTextField1.setText("Enter Token No");
        }
    }
    });
       jTextField8.addFocusListener(new FocusListener() {
    @Override
    public void focusGained(FocusEvent e) {
        if (jTextField8.getText().equals("Enter Quantity")) {
            jTextField8.setText("");
            jTextField8.setForeground(Color.BLACK);
        }
    }
    @Override
    public void focusLost(FocusEvent e) {
        if (jTextField8.getText().isEmpty()) {
            jTextField8.setForeground(Color.GRAY);
            jTextField8.setText("Enter Quantity");
        }
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

        jButton1 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jTextField8 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        jTextField2.setText("jTextField2");

        jTextField4.setText("jTextField4");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Order");
        setPreferredSize(new java.awt.Dimension(500, 450));

        jPanel1.setBackground(new java.awt.Color(0, 101, 101));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(246, 246, 246));
        jLabel1.setText("TOKEN NO : ");

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jCheckBox1.setBackground(new java.awt.Color(0, 102, 102));
        jCheckBox1.setForeground(new java.awt.Color(246, 246, 246));
        jCheckBox1.setLabel("Please Confirm Your order and check the total amount to be paid.");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("Fetch");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton3.setText("Pay");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(246, 246, 246));
        jLabel2.setText("CROP:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(246, 246, 246));
        jLabel3.setText("Available stock(kg)");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(246, 246, 246));
        jLabel4.setText("Price/Kg");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(246, 246, 246));
        jLabel5.setText("Date of Harvest");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(246, 246, 246));
        jLabel6.setText("Quantity(in kg)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField7)
                                    .addComponent(jTextField6)
                                    .addComponent(jTextField5)
                                    .addComponent(jTextField3)
                                    .addComponent(jTextField1)
                                    .addComponent(jTextField8, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(12, 12, 12)
                .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed
        float total;
        float amount;
        int cropnumber;
        String username;
        int k=-1;
        String phone_number;
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       homepage h = new homepage();
       String r = h.consumer_username;
       try {
            Connection c = DriverManager.getConnection(
                    "jdbc:mysql://sql6.freesqldatabase.com:3306/",
                    "sql6694056",
                    "qEzxzBSUYV");
            String q2="SELECT balance,phone_no FROM sql6694056.user_details WHERE username = '"+r+"'";
            Statement s = c.createStatement();
            ResultSet rs1 = s.executeQuery(q2);
            rs1.next();
            float balan=rs1.getFloat("balance");
            String cph = rs1.getString("phone_no");
            
            String q8="SELECT crop_name,price_per_kg FROM sql6694056.crops WHERE cropnumber = '"+cropnumber+"'";
            Statement s3 = c.createStatement();
            ResultSet rs5 = s3.executeQuery(q8);
            rs5.next();
            
            String q1 = "UPDATE sql6694056.user_details SET balance =(balance-?) WHERE username=?";
            PreparedStatement ps = c.prepareStatement(q1);
           
            String q3 = "UPDATE sql6694056.user_details SET balance =(balance+?) WHERE username='"+username+"'";
            PreparedStatement ps1 = c.prepareStatement(q3);
            
            String q4 = "INSERT INTO sql6694056.orders (consumer_username, farmer_username, cropnumber,crop_name, quantity,price_per_kg,amount,fphone_no,cphone_no) VALUES(?, ?, ?, ?,?,?,?,?,?)";
            PreparedStatement ps2 = c.prepareStatement(q4);
            
            String s7 = "UPDATE sql6694056.crops SET quantity = (quantity - ?) WHERE cropnumber = ?";
            PreparedStatement ps8 = c.prepareStatement(s7);
            
            
            if(k==1 && (balan-total>=0) && (amount<=Float.parseFloat(jTextField5.getText()))){
            ps.setFloat(1, total);
            ps.setString(2,r);
            ps.execute();
            
            ps1.setFloat(1,total);
            ps1.execute();
            ps2.setString(1, r);
            ps2.setString(2, username);
            ps2.setInt(3,cropnumber);
            ps2.setString(4, rs5.getString("crop_name"));
            ps2.setFloat(5,Float.parseFloat(jTextField8.getText()));
            ps2.setFloat(6,rs5.getFloat("price_per_kg"));
            ps2.setFloat(7, total);
            ps2.setString(8,phone_number);
            ps2.setString(9,cph);
            ps2.execute();
            
            ps8.setFloat(1,amount);
            ps8.setInt(2,cropnumber);
            ps8.execute();
            JOptionPane.showMessageDialog(null, "Order Placed Successfully \n Your balance is "+ Float.toString(balan-total));
            k=-1;
            }
            else if(k==-1){
                JOptionPane.showMessageDialog(null,"Please tick the checkbox");
            }
            else if((amount<=Float.parseFloat(jTextField5.getText()) && (amount>0))){
                JOptionPane.showMessageDialog(null, "Quantity invalid");
            }
            else{
                JOptionPane.showMessageDialog(null, "Insufficient Balance Can't place order");
            }
            c.close();
        }
      
       catch(java.lang.NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Quantity invalid");
        }
        catch(Exception e){
           JOptionPane.showMessageDialog(null, "Fill all required fields");
       }
       jCheckBox1.setSelected(false);
       jTextField1.setText(null);
       jTextField5.setText(null);
       jTextField3.setText(null);
       jTextField6.setText(null);
       jTextField7.setText(null);
       jTextField8.setText(null);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        k=k*(-1);
        amount = Float.parseFloat(jTextField8.getText());
        total = amount*Float.parseFloat(jTextField6.getText());
        JOptionPane.showMessageDialog(null,"Your Amount is "+ total);
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      if(jTextField1.getText().length()>0){
          
      
        try {
            Connection c = DriverManager.getConnection(
                    "jdbc:mysql://sql6.freesqldatabase.com:3306/",
                    "sql6694056",
                    "qEzxzBSUYV");
            Statement statement = c.createStatement();
            String n=jTextField1.getText();


            String query = "SELECT  c.username AS 'Username',u.balance AS 'Balance', c.cropnumber AS 'Token No.',u.full_name AS 'Full Name' ,c.crop_name AS 'Crop' ,c.quantity AS 'Quantity',c.price_per_kg AS 'Price Per KG',c.date_of_harvest AS 'Date of Harvest' ,u.phone_no AS 'Contact No.' FROM sql6694056.crops c JOIN sql6694056.user_details u  WHERE c.cropnumber=" + n;
            ResultSet resultSet = statement.executeQuery(query);
            resultSet.next();
            jTextField3.setText(resultSet.getString("Crop"));
            jTextField5.setText(Float.toString(resultSet.getFloat("Quantity")));
            jTextField6.setText(Float.toString(resultSet.getFloat("Price Per KG")));
            jTextField7.setText(resultSet.getString("Date of Harvest"));
            username=resultSet.getString("Username");
            cropnumber = Integer.parseInt(n);
            phone_number = resultSet.getString("Contact No.");
            c.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Enter a valid token no");
        }
      }
      else{
          JOptionPane.showMessageDialog(null, "Enter Valid Token no");
      }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Order().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
