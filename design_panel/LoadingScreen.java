
package design_panel;

public class LoadingScreen extends javax.swing.JFrame {

    /**
     * Creates new form LoadingScreen
     */
    public LoadingScreen() {
        initComponents();
        this.setLocation(310,60);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ProgressBar = new javax.swing.JProgressBar();
        Loadingnum = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        icon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(ProgressBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 420, 220, 22));

        Loadingnum.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Loadingnum.setForeground(new java.awt.Color(255, 255, 255));
        Loadingnum.setText("   99 %");
        getContentPane().add(Loadingnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 380, 61, 30));

        name.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        name.setForeground(new java.awt.Color(255, 255, 255));
        name.setText("   Attendane Management Application");
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 460, 50));

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/java2.jpg"))); // NOI18N
        getContentPane().add(icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -4, 800, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(LoadingScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoadingScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoadingScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoadingScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoadingScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel Loadingnum;
    public javax.swing.JProgressBar ProgressBar;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel name;
    // End of variables declaration//GEN-END:variables
}
