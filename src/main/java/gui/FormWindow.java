package gui;

import db.MovieService;
import db.PersonService;
import entities.Movie;
import entities.Person;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pawel
 */
public class FormWindow extends javax.swing.JFrame {
    private Person person;
    private Movie movie;
    private PersonService ps;
    private MovieService ms;
    private String passedName;
    private int passedId;
    /**
     * Creates new form FormWindow
     */
    public FormWindow(int movieId, String name) {
        setLocation(300,300);
        setVisible(true);   
        setResizable(false);
        setTitle("Super wypożyczalnia");
        initComponents();
        ms = new MovieService();
        ps = new PersonService();
        this.passedName = name;
        this.passedId = movieId;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TelephoneField = new javax.swing.JTextField();
        Adress = new javax.swing.JLabel();
        Telephone = new javax.swing.JLabel();
        Fullname = new javax.swing.JLabel();
        AdressField = new javax.swing.JTextField();
        FullnameField = new javax.swing.JTextField();
        rentalDays = new javax.swing.JLabel();
        rentalDaysField = new javax.swing.JTextField();
        rentalButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TelephoneField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        Adress.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Adress.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Adress.setText("Adres");

        Telephone.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Telephone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Telephone.setText("Telefon ");

        Fullname.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Fullname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Fullname.setText("Godność");

        AdressField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        FullnameField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        rentalDays.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rentalDays.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rentalDays.setText("Liczba dni");

        rentalDaysField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        rentalButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rentalButton.setText("RENT");
        rentalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rentalButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rentalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rentalDaysField, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(Fullname, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                            .addComponent(FullnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Adress, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Telephone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(rentalDays, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(26, 26, 26)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(TelephoneField, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                                .addComponent(AdressField, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Fullname, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FullnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Adress, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AdressField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Telephone, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TelephoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rentalDays, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rentalDaysField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(rentalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rentalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rentalButtonActionPerformed
        person = new Person(FullnameField.getText(),AdressField.getText(),Integer.parseInt(TelephoneField.getText()));
        ps.create(person);
        int ID = ps.readLast();
        ms.rent(ID, Integer.parseInt(rentalDaysField.getText()),passedId);
        MainWindow mw = new MainWindow(passedName);
        dispose();
    }//GEN-LAST:event_rentalButtonActionPerformed

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
            java.util.logging.Logger.getLogger(FormWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormWindow(0,null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Adress;
    private javax.swing.JTextField AdressField;
    private javax.swing.JLabel Fullname;
    private javax.swing.JTextField FullnameField;
    private javax.swing.JLabel Telephone;
    private javax.swing.JTextField TelephoneField;
    private javax.swing.JButton rentalButton;
    private javax.swing.JLabel rentalDays;
    private javax.swing.JTextField rentalDaysField;
    // End of variables declaration//GEN-END:variables
}