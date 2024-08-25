package design_panel;

import javax.swing.table.DefaultTableModel;





public class AttendancePortal extends javax.swing.JFrame {
  
    public AttendancePortal() {
        initComponents();
        this.setLocation(250,50);
        
        populateAttendanceTable(true);
        
         
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        attendanceTable = new javax.swing.JTable();
        Back = new javax.swing.JButton();
        MarkAtd = new javax.swing.JButton();
        UpdateAtd = new javax.swing.JButton();
        ClearField = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText(" Attendance Marking Portal");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 32, 244, 40));

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel2.setText("Course ");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select Course--", " ", "-Computer Science & IT-", " ", "Introduction to Programming", "Data Structures and Algorithms", "Operating Systems", "Database Management Systems", "Computer Networks", "Software Engineering", "Web Development", "Mobile Application Development", "Artificial Intelligence", "Machine Learning", "Cyber Security", "Cloud Computing", "Data Science", "Big Data Analytics", "Internet of Things (IoT)", " ", "-Business & Management-", " ", "Principles of Management", "Financial Accounting", "Marketing Management", "Human Resource Management", "Business Ethics", "Operations Management", "Strategic Management", "Entrepreneurship", "Organizational Behavior", "Supply Chain Management", "Project Management", "International Business", "Business Law", "Business Communication", "Economics for Managers", " ", "-Engineering-", " ", "Engineering Mathematics", "Thermodynamics", "Fluid Mechanics", "Materials Science", "Circuit Theory", "Control Systems", "Mechanical Vibrations", "Digital Signal Processing", "Renewable Energy Systems", "Structural Analysis", "Electromagnetic Theory", "Robotics", "Engineering Design", "Heat Transfer", "Mechanics of Materials", " ", "-Humanities & Social Sciences-", " ", "Introduction to Psychology", "Sociology", "Political Science", "Anthropology", "History of Modern World", "Philosophy", "Ethics", "Cultural Studies", "Environmental Studies", "International Relations", "Public Administration", "Gender Studies", "Art History", "Literature and Society", "Communication Skills" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setText("     Student Table");
        jLabel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        attendanceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Student Name", "Student ID", "Attendance"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(attendanceTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 92, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(31, 31, 31)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(231, 231, 231)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 800, 470));

        Back.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Back.setText("Back");
        Back.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        getContentPane().add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 580, 80, 30));

        MarkAtd.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        MarkAtd.setText("Mark Attendance");
        MarkAtd.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        MarkAtd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MarkAtdActionPerformed(evt);
            }
        });
        getContentPane().add(MarkAtd, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 580, 172, 31));

        UpdateAtd.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        UpdateAtd.setText("Update Attendence");
        UpdateAtd.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        UpdateAtd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateAtdActionPerformed(evt);
            }
        });
        getContentPane().add(UpdateAtd, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 580, 170, 30));

        ClearField.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        ClearField.setText("Clear");
        ClearField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        ClearField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearFieldActionPerformed(evt);
            }
        });
        getContentPane().add(ClearField, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 580, 90, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/java3.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MarkAtdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MarkAtdActionPerformed
        // TODO add your handling code here:
       DefaultTableModel model = (DefaultTableModel) attendanceTable.getModel();
        int[] selectedRows = attendanceTable.getSelectedRows();
        for (int i : selectedRows) {
            model.setValueAt("Present", i, 2);
        }
       
    }//GEN-LAST:event_MarkAtdActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) attendanceTable.getModel();
        model.setRowCount(0); // Clear existing rows
        
        // Example data; in real application, fetch from course selection
        String selectedCourse = (String) jComboBox1.getSelectedItem();
        if (selectedCourse != null && !selectedCourse.isEmpty()) {
            populateAttendanceTable(false); // Populate with data
        }
      
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
        new Dashboard().setVisible(true);
    }//GEN-LAST:event_BackActionPerformed

    private void UpdateAtdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateAtdActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) attendanceTable.getModel();
        int[] selectedRows = attendanceTable.getSelectedRows();
        for (int i : selectedRows) {
            model.setValueAt("Absent", i, 2); // Mark as absent
        }
    }//GEN-LAST:event_UpdateAtdActionPerformed

    private void ClearFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearFieldActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) attendanceTable.getModel();
        for (int i = 0; i < model.getRowCount(); i++) {
            model.setValueAt("", i, 2); // Clear attendance
        }
    
    }//GEN-LAST:event_ClearFieldActionPerformed

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
            java.util.logging.Logger.getLogger(AttendancePortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AttendancePortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AttendancePortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AttendancePortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AttendancePortal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton ClearField;
    private javax.swing.JButton MarkAtd;
    private javax.swing.JButton UpdateAtd;
    private javax.swing.JTable attendanceTable;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void populateAttendanceTable(boolean initialize) {
         DefaultTableModel attendanceModel = (DefaultTableModel) attendanceTable.getModel();

        // Clear existing rows
        if (!initialize) {
            attendanceModel.setRowCount(0);
        }

        
        if (!initialize) {
            attendanceModel.addRow(new Object[]{"Alice Johnson", "S123", ""});
            attendanceModel.addRow(new Object[]{"Bob Smith", "S124", ""});
            attendanceModel.addRow(new Object[]{"Catherine Green", "S125", ""});
            attendanceModel.addRow(new Object[]{"David Brown", "S126", ""});
            attendanceModel.addRow(new Object[]{"Eva White", "S127", ""});
            attendanceModel.addRow(new Object[]{"Frank Martin", "S128", ""});
            attendanceModel.addRow(new Object[]{"Grace Lewis", "S129", ""});
            attendanceModel.addRow(new Object[]{"Henry Walker", "S130", ""});
            attendanceModel.addRow(new Object[]{"Ivy Hall", "S131", ""});
            attendanceModel.addRow(new Object[]{"Jack Turner", "S132", ""});
            attendanceModel.addRow(new Object[]{"Karen Adams", "S133", ""});
            attendanceModel.addRow(new Object[]{"Liam Johnson", "S134", ""});
            attendanceModel.addRow(new Object[]{"Mia Anderson", "S135", ""});
            attendanceModel.addRow(new Object[]{"Noah Williams", "S136", ""});
            attendanceModel.addRow(new Object[]{"Olivia Thompson", "S137", ""});
            attendanceModel.addRow(new Object[]{"Paul Roberts", "S138", ""});
            attendanceModel.addRow(new Object[]{"Quinn King", "S139", ""});
            attendanceModel.addRow(new Object[]{"Rachel Lee", "S140", ""});
            attendanceModel.addRow(new Object[]{"Sam Wilson", "S141", ""});
            attendanceModel.addRow(new Object[]{"Tina Brooks", "S142", ""});
        }
    }
  
}
