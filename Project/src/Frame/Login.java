/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Mafer
 */
public class Login extends javax.swing.JFrame {
    private Conectar cc;

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        cc = new Conectar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpIngreso = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCorre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        txtContra = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jlMenu1 = new javax.swing.JLabel();
        jlMenu2 = new javax.swing.JLabel();
        jlMenu3 = new javax.swing.JLabel();
        jlMenu4 = new javax.swing.JLabel();
        jlMenu5 = new javax.swing.JLabel();
        jlMenu6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1050, 575));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpIngreso.setBackground(new java.awt.Color(255, 255, 255));
        jpIngreso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jpIngreso.setForeground(new java.awt.Color(255, 255, 255));
        jpIngreso.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(238, 112, 82));
        jLabel1.setFont(new java.awt.Font("Kristen ITC", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(238, 112, 82));
        jLabel1.setText("Registrate");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jpIngreso.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 540, 110, 30));

        jLabel3.setBackground(new java.awt.Color(238, 112, 82));
        jLabel3.setFont(new java.awt.Font("Kristen ITC", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(238, 112, 82));
        jLabel3.setText("Email:");
        jpIngreso.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 60, 30));

        txtCorre.setFont(new java.awt.Font("Lucida Sans", 0, 16)); // NOI18N
        txtCorre.setForeground(new java.awt.Color(153, 153, 153));
        txtCorre.setText("Ingrese usuario");
        txtCorre.setBorder(null);
        jpIngreso.add(txtCorre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 210, 50));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_User_96px_2.png"))); // NOI18N
        jpIngreso.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 130, 110));
        jpIngreso.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 230, 10));
        jpIngreso.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 230, 10));

        txtContra.setFont(new java.awt.Font("Lucida Sans", 0, 16)); // NOI18N
        txtContra.setForeground(new java.awt.Color(153, 153, 153));
        txtContra.setText("***********");
        txtContra.setBorder(null);
        jpIngreso.add(txtContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 210, 50));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Enter_OFF.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Enter_ON.png"))); // NOI18N
        jButton1.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Enter_ON.png"))); // NOI18N
        jButton1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Enter_ON.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jpIngreso.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 470, 120, 40));

        jLabel6.setBackground(new java.awt.Color(238, 112, 82));
        jLabel6.setFont(new java.awt.Font("Kristen ITC", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(238, 112, 82));
        jLabel6.setText("Password:");
        jpIngreso.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 100, 30));

        getContentPane().add(jpIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 580));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlMenu1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Idea_96px.png"))); // NOI18N
        jlMenu1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jlMenu1MouseMoved(evt);
            }
        });
        jlMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlMenu1MouseExited(evt);
            }
        });
        jPanel1.add(jlMenu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 280, 195, 159));

        jlMenu2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/map.png"))); // NOI18N
        jlMenu2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jlMenu2MouseMoved(evt);
            }
        });
        jlMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlMenu2MouseExited(evt);
            }
        });
        jPanel1.add(jlMenu2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 195, 159));

        jlMenu3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/res.jpg"))); // NOI18N
        jlMenu3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jlMenu3MouseMoved(evt);
            }
        });
        jlMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlMenu3MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlMenu3MouseExited(evt);
            }
        });
        jPanel1.add(jlMenu3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 195, 159));

        jlMenu4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/images.png"))); // NOI18N
        jlMenu4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jlMenu4MouseMoved(evt);
            }
        });
        jlMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlMenu4MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlMenu4MouseExited(evt);
            }
        });
        jPanel1.add(jlMenu4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 40, 195, 159));

        jlMenu5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Today_96px.png"))); // NOI18N
        jlMenu5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jlMenu5MouseMoved(evt);
            }
        });
        jlMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlMenu5MouseExited(evt);
            }
        });
        jPanel1.add(jlMenu5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 195, 150));

        jlMenu6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icono_escalada.png"))); // NOI18N
        jlMenu6.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jlMenu6MouseMoved(evt);
            }
        });
        jlMenu6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlMenu6MouseExited(evt);
            }
        });
        jPanel1.add(jlMenu6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 195, 159));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 760, 530));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Expand_Arrow_32px.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, 50, 37));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Multiply_32px.png"))); // NOI18N
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, 40, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 760, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        this.setState(Login.ICONIFIED);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        int dialog = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null, "¿Desea salir del programa?", "Exit", dialog);
        if(result == 0){
            System.exit(0);
        }
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jlMenu2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMenu2MouseMoved
        // TODO add your handling code here:
        jlMenu2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153) ));
    }//GEN-LAST:event_jlMenu2MouseMoved

    private void jlMenu2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMenu2MouseExited
        // TODO add your handling code here:
        jlMenu2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255) ));
    }//GEN-LAST:event_jlMenu2MouseExited

    private void jlMenu3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMenu3MouseMoved
        // TODO add your handling code here:
        jlMenu3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153) ));
    }//GEN-LAST:event_jlMenu3MouseMoved

    private void jlMenu3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMenu3MouseExited
        // TODO add your handling code here:
        jlMenu3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255) ));
    }//GEN-LAST:event_jlMenu3MouseExited

    private void jlMenu4MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMenu4MouseMoved
        // TODO add your handling code here:
        jlMenu4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153) ));
    }//GEN-LAST:event_jlMenu4MouseMoved

    private void jlMenu4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMenu4MouseExited
        // TODO add your handling code here:
        jlMenu4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255) ));
    }//GEN-LAST:event_jlMenu4MouseExited

    private void jlMenu5MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMenu5MouseMoved
        // TODO add your handling code here:
        jlMenu5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153) ));
    }//GEN-LAST:event_jlMenu5MouseMoved

    private void jlMenu5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMenu5MouseExited
        // TODO add your handling code here:
        jlMenu5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255) ));
    }//GEN-LAST:event_jlMenu5MouseExited

    private void jlMenu6MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMenu6MouseMoved
        // TODO add your handling code here:
        jlMenu6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153) ));
    }//GEN-LAST:event_jlMenu6MouseMoved

    private void jlMenu6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMenu6MouseExited
        // TODO add your handling code here:
        jlMenu6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255) ));
    }//GEN-LAST:event_jlMenu6MouseExited

    private void jlMenu1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMenu1MouseMoved
        // TODO add your handling code here:
        jlMenu1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153) ));
    }//GEN-LAST:event_jlMenu1MouseMoved

    private void jlMenu1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMenu1MouseExited
        // TODO add your handling code here:
        jlMenu1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255) ));
    }//GEN-LAST:event_jlMenu1MouseExited

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        Registrarse regis = new Registrarse();
        regis.setVisible(true);
        
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String email = txtCorre.getText();
        String contra = txtContra.getText();
        List<Usuario> users = cc.mostrarUsuarios();
        boolean verf = false;
        
        for(Usuario u: users){
            if(u.getEmail().equals(email) & u.getpw().equals(contra)){
                verf = true;
            } else {
                verf = false;
            }
        }
        if(verf == false){
         
            JOptionPane.showMessageDialog(null, "El email o contraseña ingresado son incorrectos", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Bienvenido");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jlMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMenu3MouseClicked
        // TODO add your handling code here:
        Res res;
        try {
            res = new Res();
            res.setVisible(true);
        } catch (MalformedURLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (URISyntaxException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_jlMenu3MouseClicked

    private void jlMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMenu4MouseClicked
        try {
            // TODO add your handling code here:
            HotelesD ho = new HotelesD();
            ho.setVisible(true);
        } catch (MalformedURLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (URISyntaxException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }//GEN-LAST:event_jlMenu4MouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel jlMenu1;
    private javax.swing.JLabel jlMenu2;
    private javax.swing.JLabel jlMenu3;
    private javax.swing.JLabel jlMenu4;
    private javax.swing.JLabel jlMenu5;
    private javax.swing.JLabel jlMenu6;
    private javax.swing.JPanel jpIngreso;
    private javax.swing.JPasswordField txtContra;
    private javax.swing.JTextField txtCorre;
    // End of variables declaration//GEN-END:variables
}