/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UpdateMenuForm;

import com.admin.web.menu.WebMenuFrame;

/**
 *
 * @author admin
 */
public class UpdateMenuFormm extends javax.swing.JFrame {

    /**
     * Creates new form UpdateMenuFormm
     */
    public UpdateMenuFormm() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        uploadImage = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        uploadImage1 = new javax.swing.JButton();
        uploadImage2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(640, 480));
        setPreferredSize(new java.awt.Dimension(640, 480));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));
        jPanel1.setForeground(new java.awt.Color(255, 153, 0));
        jPanel1.setMinimumSize(new java.awt.Dimension(640, 480));
        jPanel1.setPreferredSize(new java.awt.Dimension(640, 20));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jTextArea1.setColumns(15);
        jTextArea1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jTextArea1.setRows(4);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 260, 100));

        jTextField1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jTextField1.setPreferredSize(new java.awt.Dimension(250, 25));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, 40));

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel2.setText("Category");
        jLabel2.setPreferredSize(new java.awt.Dimension(200, 25));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, -1, -1));

        jTextField2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jTextField2.setPreferredSize(new java.awt.Dimension(250, 25));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, 30));

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel4.setText("Description");
        jLabel4.setPreferredSize(new java.awt.Dimension(200, 25));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel5.setText("Price");
        jLabel5.setPreferredSize(new java.awt.Dimension(200, 25));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        jComboBox1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 250, -1));

        uploadImage.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        uploadImage.setText("Update");
        uploadImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadImageActionPerformed(evt);
            }
        });
        getContentPane().add(uploadImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 160, -1));

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel6.setText("Food Name");
        jLabel6.setPreferredSize(new java.awt.Dimension(200, 25));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jTextField3.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jTextField3.setText("LOGO");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 110, 90));

        uploadImage1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        uploadImage1.setText("Cancel");
        uploadImage1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadImage1ActionPerformed(evt);
            }
        });
        getContentPane().add(uploadImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, 160, -1));

        uploadImage2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        uploadImage2.setText("Upload");
        uploadImage2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadImage2ActionPerformed(evt);
            }
        });
        getContentPane().add(uploadImage2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, 160, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void uploadImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadImageActionPerformed
        // choose image from fileChooser
       
    }//GEN-LAST:event_uploadImageActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void uploadImage1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadImage1ActionPerformed
       WebMenuFrame webmenuframe= new WebMenuFrame();
       webmenuframe.setVisible(true);
    }//GEN-LAST:event_uploadImage1ActionPerformed

    private void uploadImage2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadImage2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uploadImage2ActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateMenuFormm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateMenuFormm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateMenuFormm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateMenuFormm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateMenuFormm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JButton uploadImage;
    private javax.swing.JButton uploadImage1;
    private javax.swing.JButton uploadImage2;
    // End of variables declaration//GEN-END:variables
}
