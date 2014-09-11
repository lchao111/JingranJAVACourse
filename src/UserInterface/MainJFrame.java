/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface;
import Business.Person;
import Business.Address;

/**
 *
 * @author graceshi
 */
public class MainJFrame extends javax.swing.JFrame {
     
    Person P=new Person();
    Address address=new Address();
    public MainJFrame() {
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

        jSplitPane = new javax.swing.JSplitPane();
        leftJPanel = new javax.swing.JPanel();
        createPersonJButton = new javax.swing.JButton();
        viewJButton = new javax.swing.JButton();
        creataddressJButton = new javax.swing.JButton();
        rightJPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.BorderLayout());

        createPersonJButton.setText("Create Person Information");
        createPersonJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createPersonJButtonActionPerformed(evt);
            }
        });

        viewJButton.setText("View");
        viewJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewJButtonActionPerformed(evt);
            }
        });

        creataddressJButton.setText("Create person Address");
        creataddressJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creataddressJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout leftJPanelLayout = new javax.swing.GroupLayout(leftJPanel);
        leftJPanel.setLayout(leftJPanelLayout);
        leftJPanelLayout.setHorizontalGroup(
            leftJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftJPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(leftJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(createPersonJButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(leftJPanelLayout.createSequentialGroup()
                        .addComponent(creataddressJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(viewJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        leftJPanelLayout.setVerticalGroup(
            leftJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftJPanelLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(createPersonJButton)
                .addGap(33, 33, 33)
                .addComponent(creataddressJButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(viewJButton)
                .addGap(74, 74, 74))
        );

        jSplitPane.setLeftComponent(leftJPanel);

        javax.swing.GroupLayout rightJPanelLayout = new javax.swing.GroupLayout(rightJPanel);
        rightJPanel.setLayout(rightJPanelLayout);
        rightJPanelLayout.setHorizontalGroup(
            rightJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 287, Short.MAX_VALUE)
        );
        rightJPanelLayout.setVerticalGroup(
            rightJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 296, Short.MAX_VALUE)
        );

        jSplitPane.setRightComponent(rightJPanel);

        getContentPane().add(jSplitPane, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createPersonJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createPersonJButtonActionPerformed
        CreatePersonJPanel cpj=new CreatePersonJPanel(P);
        jSplitPane.setRightComponent(cpj);
        
        
    }//GEN-LAST:event_createPersonJButtonActionPerformed

    private void viewJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewJButtonActionPerformed
       ViewPersonJPanel vpj=new ViewPersonJPanel(P,address);
       jSplitPane.setRightComponent(vpj);
    }//GEN-LAST:event_viewJButtonActionPerformed

    private void creataddressJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creataddressJButtonActionPerformed
       CreateAddressJPanel caj=new CreateAddressJPanel(address);
       jSplitPane.setRightComponent(caj);
        
    }//GEN-LAST:event_creataddressJButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton creataddressJButton;
    private javax.swing.JButton createPersonJButton;
    private javax.swing.JSplitPane jSplitPane;
    private javax.swing.JPanel leftJPanel;
    private javax.swing.JPanel rightJPanel;
    private javax.swing.JButton viewJButton;
    // End of variables declaration//GEN-END:variables
}
