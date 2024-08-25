package design_panel;
import entities.Teacher;
import entities.University;

public class SignUp extends javax.swing.JFrame {

    public SignUp() {
        initComponents();
        this.setLocation(500,100);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        SignUp = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        departmentTextField = new javax.swing.JComboBox<>();
        teacher_signup = new javax.swing.JButton();
        back_button = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        uNameTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        salaryTextField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        addressTextField = new javax.swing.JTextArea();
        passwordField = new javax.swing.JPasswordField();
        phoneNumberTextField = new javax.swing.JTextField();
        empCodeTextField = new javax.swing.JTextField();
        confirmPasswordField = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();

        jLabel10.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel10.setText("Full name");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Employee Registration Portal");
        setName("Registration"); // NOI18N
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SignUp.setBackground(new java.awt.Color(0, 0, 0));
        SignUp.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        SignUp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SignUp.setText("SignUp Portal");
        SignUp.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        getContentPane().add(SignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 190, 40));

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel1.setText("User name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, 34));

        jLabel3.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel3.setText("Password");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, 70, 34));

        jLabel4.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel4.setText("Confirm Password");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, -1, 34));

        jLabel5.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel5.setText("Employee code");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, 34));

        departmentTextField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Select Department --", "Science", "Mathematics", "English", "History", "Geography", "Computer Science", "Physical Education", "Art and Design", "Music", "Languages", "Social Studies", "Engineering", "Business Studies", "Economics", "Psychology" }));
        departmentTextField.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        getContentPane().add(departmentTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 299, 34));

        teacher_signup.setBackground(new java.awt.Color(204, 204, 204));
        teacher_signup.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        teacher_signup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/user.png"))); // NOI18N
        teacher_signup.setText("SignUp");
        teacher_signup.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        teacher_signup.setIconTextGap(10);
        teacher_signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacher_signupActionPerformed(evt);
            }
        });
        getContentPane().add(teacher_signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 520, 120, 40));

        back_button.setBackground(new java.awt.Color(204, 204, 204));
        back_button.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        back_button.setText("Back");
        back_button.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        back_button.setIconTextGap(10);
        back_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(back_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 520, 120, 40));

        jLabel6.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel6.setText("Address");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, -1, 34));

        uNameTextField.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        uNameTextField.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        uNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uNameTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(uNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 299, 30));

        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel9.setText("Full name");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 300, 30));

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel7.setText("Department");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 80, 30));

        jLabel8.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel8.setText("Phone no");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, -1));

        jLabel11.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel11.setText("Salary");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, -1, -1));

        salaryTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salaryTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(salaryTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 300, 30));

        addressTextField.setColumns(20);
        addressTextField.setRows(5);
        jScrollPane2.setViewportView(addressTextField);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, 300, 60));
        getContentPane().add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 420, 300, 30));

        phoneNumberTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneNumberTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(phoneNumberTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 300, 30));
        getContentPane().add(empCodeTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 300, 30));
        getContentPane().add(confirmPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 470, 300, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/light-blue-background.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void teacher_signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacher_signupActionPerformed
        // TODO add your handling code here:  
    if (!uNameTextField.getText().isEmpty() &&
    !new String(passwordField.getPassword()).isEmpty() &&
    !new String(confirmPasswordField.getPassword()).isEmpty() &&
    !empCodeTextField.getText().isEmpty() &&
    !salaryTextField.getText().isEmpty() &&
    departmentTextField.getSelectedIndex() != 0 &&
    !addressTextField.getText().isEmpty() &&
    !phoneNumberTextField.getText().isEmpty()) {
    if (new String(passwordField.getPassword()).equals(new String(confirmPasswordField.getPassword()))) {

        // Validate phone number
        String phoneNumber = phoneNumberTextField.getText();
        if (phoneNumber.length() != 11 || !phoneNumber.matches("\\d{11}")) {
            University.showErrorMessage("Phone number must have exactly 11 digits.");
            return;
        }

        double salary;
        try {
            salary = Double.parseDouble(salaryTextField.getText());
        } catch (NumberFormatException e) {
            University.showErrorMessage("Invalid salary input. Please enter a valid number.");
            return;
        }

        Teacher teacher = new Teacher(uNameTextField.getText(),
            new String(passwordField.getPassword()),
            "", // Assuming there's a separate field for the name, add it here
            empCodeTextField.getText(),salary,departmentTextField.getSelectedItem().toString(),
            addressTextField.getText(),phoneNumber
        );

        University.addTeacher(teacher);
        University.showErrorMessage("Teacher successfully registered");

        this.setVisible(false);
        this.dispose();
        new Dashboard().setVisible(true);
        
    } else {
        University.showErrorMessage("Password and confirm password should be the same.");
    }
    } else {
    University.showErrorMessage("Please fill in all the required fields.");
    }
  
    }//GEN-LAST:event_teacher_signupActionPerformed

    private void back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_buttonActionPerformed
        // TODO add your handling code here:
       this.setVisible(false);
        this.dispose();
        new Welcome().setVisible(true);
    }//GEN-LAST:event_back_buttonActionPerformed

    private void uNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uNameTextFieldActionPerformed

    private void salaryTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salaryTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salaryTextFieldActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void phoneNumberTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneNumberTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneNumberTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SignUp;
    private javax.swing.JTextArea addressTextField;
    private javax.swing.JButton back_button;
    private javax.swing.JPasswordField confirmPasswordField;
    private javax.swing.JComboBox<String> departmentTextField;
    private javax.swing.JTextField empCodeTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField name;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField phoneNumberTextField;
    private javax.swing.JTextField salaryTextField;
    private javax.swing.JButton teacher_signup;
    private javax.swing.JTextField uNameTextField;
    // End of variables declaration//GEN-END:variables
}
