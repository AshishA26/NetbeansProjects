/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ashish
 */
public class MainForm extends javax.swing.JFrame {

    /**
     * Creates new form MainForm
     */
    public MainForm() {
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

        txtAmount = new javax.swing.JTextField();
        lblAmount = new javax.swing.JLabel();
        BtnCalculateConversion = new javax.swing.JButton();
        lblOutput = new javax.swing.JLabel();
        lblInstructions = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        lblDrobzits = new javax.swing.JLabel();
        lblInstructions1 = new javax.swing.JLabel();
        lblDrobzitAmount = new javax.swing.JLabel();
        lblClickwickAmount = new javax.swing.JLabel();
        lblClickwicks = new javax.swing.JLabel();
        lblGazoontights = new javax.swing.JLabel();
        lblGazoontightAmount = new javax.swing.JLabel();
        lblFrazoints = new javax.swing.JLabel();
        lblFrazointAmount = new javax.swing.JLabel();
        lblBlointoints = new javax.swing.JLabel();
        lblBlointointAmount = new javax.swing.JLabel();
        lblVrobits = new javax.swing.JLabel();
        lblVrobitAmount = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtAmount.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtAmount.setToolTipText("");
        txtAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAmountActionPerformed(evt);
            }
        });

        lblAmount.setFont(new java.awt.Font("Tw Cen MT", 3, 18)); // NOI18N
        lblAmount.setForeground(new java.awt.Color(0, 153, 255));
        lblAmount.setText("Amount of vrobits:");

        BtnCalculateConversion.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        BtnCalculateConversion.setForeground(new java.awt.Color(255, 51, 51));
        BtnCalculateConversion.setText("Calculate Conversion");
        BtnCalculateConversion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCalculateConversionActionPerformed(evt);
            }
        });

        lblOutput.setFont(new java.awt.Font("Tw Cen MT", 3, 24)); // NOI18N
        lblOutput.setForeground(new java.awt.Color(0, 0, 0));
        lblOutput.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblInstructions.setFont(new java.awt.Font("Tw Cen MT", 3, 14)); // NOI18N
        lblInstructions.setForeground(new java.awt.Color(0, 0, 0));
        lblInstructions.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInstructions.setText("Enter the amount of vrobits you have a click Calculate Conversion!");

        lblTitle.setFont(new java.awt.Font("Tw Cen MT", 3, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(153, 0, 0));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Vrobit Conversion Calculator");

        lblDrobzits.setFont(new java.awt.Font("Tw Cen MT", 3, 18)); // NOI18N
        lblDrobzits.setForeground(new java.awt.Color(0, 153, 255));
        lblDrobzits.setText("Drobzits:");

        lblInstructions1.setFont(new java.awt.Font("Tw Cen MT", 3, 14)); // NOI18N
        lblInstructions1.setForeground(new java.awt.Color(0, 0, 0));
        lblInstructions1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInstructions1.setText("Please find the converted currency below:");

        lblDrobzitAmount.setFont(new java.awt.Font("Tw Cen MT", 3, 18)); // NOI18N
        lblDrobzitAmount.setForeground(new java.awt.Color(153, 0, 0));
        lblDrobzitAmount.setText("0");

        lblClickwickAmount.setFont(new java.awt.Font("Tw Cen MT", 3, 18)); // NOI18N
        lblClickwickAmount.setForeground(new java.awt.Color(153, 0, 0));
        lblClickwickAmount.setText("0");

        lblClickwicks.setFont(new java.awt.Font("Tw Cen MT", 3, 18)); // NOI18N
        lblClickwicks.setForeground(new java.awt.Color(0, 153, 255));
        lblClickwicks.setText("Clickwicks:");

        lblGazoontights.setFont(new java.awt.Font("Tw Cen MT", 3, 18)); // NOI18N
        lblGazoontights.setForeground(new java.awt.Color(0, 153, 255));
        lblGazoontights.setText("Gazoontights:");

        lblGazoontightAmount.setFont(new java.awt.Font("Tw Cen MT", 3, 18)); // NOI18N
        lblGazoontightAmount.setForeground(new java.awt.Color(153, 0, 0));
        lblGazoontightAmount.setText("0");

        lblFrazoints.setFont(new java.awt.Font("Tw Cen MT", 3, 18)); // NOI18N
        lblFrazoints.setForeground(new java.awt.Color(0, 153, 255));
        lblFrazoints.setText("Frazoints:");

        lblFrazointAmount.setFont(new java.awt.Font("Tw Cen MT", 3, 18)); // NOI18N
        lblFrazointAmount.setForeground(new java.awt.Color(153, 0, 0));
        lblFrazointAmount.setText("0");

        lblBlointoints.setFont(new java.awt.Font("Tw Cen MT", 3, 18)); // NOI18N
        lblBlointoints.setForeground(new java.awt.Color(0, 153, 255));
        lblBlointoints.setText("Blointoints:");

        lblBlointointAmount.setFont(new java.awt.Font("Tw Cen MT", 3, 18)); // NOI18N
        lblBlointointAmount.setForeground(new java.awt.Color(153, 0, 0));
        lblBlointointAmount.setText("0");

        lblVrobits.setFont(new java.awt.Font("Tw Cen MT", 3, 18)); // NOI18N
        lblVrobits.setForeground(new java.awt.Color(0, 153, 255));
        lblVrobits.setText("Vrobits:");

        lblVrobitAmount.setFont(new java.awt.Font("Tw Cen MT", 3, 18)); // NOI18N
        lblVrobitAmount.setForeground(new java.awt.Color(153, 0, 0));
        lblVrobitAmount.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblInstructions, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(BtnCalculateConversion, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(lblAmount)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblInstructions1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblGazoontights)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblGazoontightAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblFrazoints)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblFrazointAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblBlointoints)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblBlointointAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblVrobits)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblVrobitAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblDrobzits)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblDrobzitAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblClickwicks)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblClickwickAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(154, 154, 154))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblOutput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblInstructions)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAmount))
                .addGap(37, 37, 37)
                .addComponent(BtnCalculateConversion, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblInstructions1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDrobzits)
                    .addComponent(lblDrobzitAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblClickwicks)
                    .addComponent(lblClickwickAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblGazoontights)
                    .addComponent(lblGazoontightAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFrazoints)
                    .addComponent(lblFrazointAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBlointoints)
                    .addComponent(lblBlointointAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblVrobits)
                    .addComponent(lblVrobitAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAmountActionPerformed

    private void BtnCalculateConversionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCalculateConversionActionPerformed
        // Get amount of vrobits from user
        String amountString = txtAmount.getText();

        // Declare variables
        int amount;
        int vrobit;
        int drobzit;
        int clickwick;
        int gazoontight;
        int frazoint;
        int blointoint;
        int vrobitRemainder;

        // Check if able to parse amount as int, if not able to output a message saying invalid input
        try {
            amount = Integer.parseInt(amountString);
            // Check if amount is less than 0, if it is output a message saying invalid input
            if (amount < 0) {
                throw new NumberFormatException();
            }

            // Calculate the number of drobzits: amount of vrobits / 100000.
            drobzit = amount / 100000;

            // Calculate the remaining vrobits: amount of vrobits % 100000.
            vrobitRemainder = amount % 100000;

            // Calculate the number of clickwicks: remaining vrobits / 50000.
            clickwick = vrobitRemainder / 50000;

            // Calculate the remaining vrobits: previous remaining vrobits % 50000.
            vrobitRemainder = vrobitRemainder % 50000;

            // Calculate the number of gazoontights: remaining vrobits / 10000.
            gazoontight = vrobitRemainder / 10000;

            // Calculate the remaining vrobits: previous remaining vrobits % 10000.
            vrobitRemainder = vrobitRemainder % 10000;

            // Calculate the number of frazoints: remaining vrobits / 1000.
            frazoint = vrobitRemainder / 1000;

            // Calculate the remaining vrobits: previous remaining vrobits % 1000.
            vrobitRemainder = vrobitRemainder % 1000;

            // Calculate the number of blointoints: remaining vrobits / 500.
            blointoint = vrobitRemainder / 500;

            // Calculate the number of vrobits: remaining vrobits % 500.
            vrobit = vrobitRemainder % 500;

            // Output the number of drobzits, clickwicks, gazoontights, frazoints, blointoints, and vrobits to the user.
            // Output friendly thank you message
            lblDrobzitAmount.setText(String.valueOf(drobzit));
            lblClickwickAmount.setText(String.valueOf(clickwick));
            lblGazoontightAmount.setText(String.valueOf(gazoontight));
            lblFrazointAmount.setText(String.valueOf(frazoint));
            lblBlointointAmount.setText(String.valueOf(blointoint));
            lblVrobitAmount.setText(String.valueOf(vrobit));
            lblOutput.setText("Thank you for converting your vrobits!");

            // If an error is caught, print out a message telling the user what they entered is invalid
        } catch (NumberFormatException e) {
            lblOutput.setText("Sorry, invalid number. Try again.");
        }
    }//GEN-LAST:event_BtnCalculateConversionActionPerformed

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCalculateConversion;
    private javax.swing.JLabel lblAmount;
    private javax.swing.JLabel lblBlointointAmount;
    private javax.swing.JLabel lblBlointoints;
    private javax.swing.JLabel lblClickwickAmount;
    private javax.swing.JLabel lblClickwicks;
    private javax.swing.JLabel lblDrobzitAmount;
    private javax.swing.JLabel lblDrobzits;
    private javax.swing.JLabel lblFrazointAmount;
    private javax.swing.JLabel lblFrazoints;
    private javax.swing.JLabel lblGazoontightAmount;
    private javax.swing.JLabel lblGazoontights;
    private javax.swing.JLabel lblInstructions;
    private javax.swing.JLabel lblInstructions1;
    private javax.swing.JLabel lblOutput;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblVrobitAmount;
    private javax.swing.JLabel lblVrobits;
    private javax.swing.JTextField txtAmount;
    // End of variables declaration//GEN-END:variables
}
