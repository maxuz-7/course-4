
package client1;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;

/**
 *
 * @author ���
 */
public class Frame1 extends javax.swing.JFrame {

    /** Creates new form Frame1 */
    public Frame1() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {//GEN-BEGIN:initComponents

        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jCheckBox1.setText("jCheckBox1");
        jCheckBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox1_itemStateChanged(evt);
            }
        });
        getContentPane().add(jCheckBox1);
        jCheckBox1.setBounds(45, 40, 74, 18);

        jCheckBox2.setText("jCheckBox2");
        jCheckBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox1_itemStateChanged(evt);
            }
        });
        getContentPane().add(jCheckBox2);
        jCheckBox2.setBounds(45, 181, 74, 18);

        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(274, 92, 160, 150);

        pack();
    }//GEN-END:initComponents

    private void jCheckBox1_itemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox1_itemStateChanged
        JCheckBox c=(JCheckBox)evt.getSource(); c.setBackground(Color.BLUE);
        if(this.jCheckBox1.isSelected() && this.jCheckBox2.isSelected()) 
            { jLabel1.setIcon(new ImageIcon("T6.gif"));}
        else if(this.jCheckBox1.isSelected()) {jLabel1.setIcon(new ImageIcon("T3.gif"));}
            else if(this.jCheckBox2.isSelected()) {jLabel1.setIcon(new ImageIcon("T3.gif"));}
                else jLabel1.setIcon(null);
    
    }//GEN-LAST:event_jCheckBox1_itemStateChanged

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
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

}