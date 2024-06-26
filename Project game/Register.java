
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.EmptyStackException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


/**
 *
 * @author Hp
 */
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    public Register() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        Start_money = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        WOMEN = new javax.swing.JRadioButton();
        MEN = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Email = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tel = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        player_name1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Pass = new javax.swing.JPasswordField();
        jRadioButton1 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Register");

        jPanel1.setBackground(new java.awt.Color(153, 0, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Start_money.setBackground(new java.awt.Color(0, 0, 0));
        Start_money.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Start_money.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(Start_money, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 470, 130, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Player name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 150, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Money start");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 470, 150, 30));

        buttonGroup1.add(WOMEN);
        WOMEN.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        WOMEN.setText("WOMEN");
        jPanel1.add(WOMEN, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, -1, -1));

        buttonGroup1.add(MEN);
        MEN.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        MEN.setText("MEN");
        jPanel1.add(MEN, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Tel");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 100, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Email");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, 100, 30));

        Email.setBackground(new java.awt.Color(0, 0, 0));
        Email.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Email.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 410, 210, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Gender");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 100, 30));

        tel.setBackground(new java.awt.Color(0, 0, 0));
        tel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tel.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(tel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 210, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Password");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 140, 30));

        name.setBackground(new java.awt.Color(0, 0, 0));
        name.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        name.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 210, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Name");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 110, 30));

        player_name1.setBackground(new java.awt.Color(0, 0, 0));
        player_name1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        player_name1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(player_name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 210, 30));

        jPanel2.setBackground(new java.awt.Color(102, 0, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 0, 51), new java.awt.Color(51, 0, 51), new java.awt.Color(51, 0, 51), new java.awt.Color(51, 0, 51)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(153, 0, 153));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton1.setText("REGISTER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 530, 140, 50));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("REGISTER");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 170, 40));

        Pass.setBackground(new java.awt.Color(0, 0, 0));
        Pass.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Pass.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(Pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 210, 30));

        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, 30, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 480, 650));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 689, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private JFrame frame;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String ch = "";
        String ch02 = "";
        
        ch = player_name1.getText();
        ch02 = Pass.getText();
        
        System.out.print(ch + ch02);
        
            if(ch != ""&&ch02 != ""){     
                String Regis = "";
                String playername = player_name1.getText();      
                Regis = Regis + player_name1.getText() + "\n";
                Regis = Regis + Pass.getText() + "\n";
                Regis = Regis + name.getText() + "\n";
                Regis = Regis + tel.getText() + "\n";

                if(MEN.isSelected())
                {Regis = Regis + "MEN" + "\n";}
                else if(WOMEN.isSelected())
                {Regis = Regis + "WOMEN" + "\n";}

                Regis = Regis + Email.getText() + "\n";
                Regis = Regis + Start_money.getText() + "\n";              

                try {
                    BufferedReader Read = new BufferedReader(new FileReader("src\\main\\java\\Member\\"+playername+".txt"));            
                    if(Read.readLine().equals(null)){             
                            try {
                                FileWriter Register = new FileWriter("src\\main\\java\\Member\\"+playername+".txt");                    
                                Register.write(Regis);
                                Register.close();
                                

                                } catch (IOException ex) {
                                    Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
                                }  	                
                        }else{                  
                            frame = new JFrame("Exit");
                            JOptionPane.showMessageDialog(frame,"This name is not available.","Alert",JOptionPane.WARNING_MESSAGE);                                
                        }            
                } catch (FileNotFoundException ex) {

                    FileWriter Register = null;
                    try {
                        Register = new FileWriter("src\\main\\java\\Member\\"+playername+".txt");
                    } catch (IOException ex1) {
                        Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex1);
                    }       
                    try {
                        Register.write(Regis);
                    } catch (IOException ex1) {
                        Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex1);
                    }
                    try {
                        Register.close();
                    } catch (IOException ex1) {
                        Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex1);
                    }
                    JOptionPane.showMessageDialog(this, "Register complete.","!!!!",JOptionPane.PLAIN_MESSAGE);  
                    setVisible(false);     

                } catch (IOException ex) {
                    Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
                }

   
                                          
            }else {
                    JOptionPane.showMessageDialog(this, "Please complete the information.","Warning !",JOptionPane.PLAIN_MESSAGE);  
                   
            }
 
        
 
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        if(jRadioButton1.isSelected()){
        Pass.setEchoChar((char)0);
        }else{
        Pass.setEchoChar('*');
        }
    }//GEN-LAST:event_jRadioButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Email;
    private javax.swing.JRadioButton MEN;
    private javax.swing.JPasswordField Pass;
    private javax.swing.JTextField Start_money;
    private javax.swing.JRadioButton WOMEN;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField player_name1;
    private javax.swing.JTextField tel;
    // End of variables declaration//GEN-END:variables
}
