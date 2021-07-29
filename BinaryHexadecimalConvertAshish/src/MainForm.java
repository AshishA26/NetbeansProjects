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

        lblDecBinHeading = new javax.swing.JLabel();
        lblDecToBin = new javax.swing.JLabel();
        txtDecToBin = new javax.swing.JTextField();
        BtnDecToBin = new javax.swing.JButton();
        lblDecToBinValue = new javax.swing.JLabel();
        txtBinToDec = new javax.swing.JTextField();
        lblBinToDec = new javax.swing.JLabel();
        txtDecToHex = new javax.swing.JTextField();
        lblDecToHex = new javax.swing.JLabel();
        txtHexToDec = new javax.swing.JTextField();
        lblHexToDec = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        lblDecHexHeading = new javax.swing.JLabel();
        BtnBinToDec = new javax.swing.JButton();
        BtnHexToDec = new javax.swing.JButton();
        BtnDecToHex = new javax.swing.JButton();
        lblHexToDecValue = new javax.swing.JLabel();
        lblBinToDecValue = new javax.swing.JLabel();
        lblDecToHexValue = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblDecBinHeading.setFont(new java.awt.Font("Tw Cen MT", 3, 14)); // NOI18N
        lblDecBinHeading.setForeground(new java.awt.Color(0, 0, 0));
        lblDecBinHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDecBinHeading.setText("Decimal and Binary");

        lblDecToBin.setFont(new java.awt.Font("Tw Cen MT", 3, 14)); // NOI18N
        lblDecToBin.setForeground(new java.awt.Color(0, 153, 255));
        lblDecToBin.setText("Enter a decimal number: ");

        txtDecToBin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDecToBin.setText("0");
        txtDecToBin.setToolTipText("");
        txtDecToBin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDecToBinActionPerformed(evt);
            }
        });

        BtnDecToBin.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        BtnDecToBin.setForeground(new java.awt.Color(255, 51, 51));
        BtnDecToBin.setText("Dec. to Bin.");
        BtnDecToBin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDecToBinActionPerformed(evt);
            }
        });

        lblDecToBinValue.setFont(new java.awt.Font("Tw Cen MT", 3, 14)); // NOI18N
        lblDecToBinValue.setForeground(new java.awt.Color(0, 0, 0));
        lblDecToBinValue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDecToBinValue.setText("...");

        txtBinToDec.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBinToDec.setText("0");
        txtBinToDec.setToolTipText("");
        txtBinToDec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBinToDecActionPerformed(evt);
            }
        });

        lblBinToDec.setFont(new java.awt.Font("Tw Cen MT", 3, 14)); // NOI18N
        lblBinToDec.setForeground(new java.awt.Color(0, 153, 255));
        lblBinToDec.setText("Enter a binary number:");

        txtDecToHex.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDecToHex.setText("0");
        txtDecToHex.setToolTipText("");
        txtDecToHex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDecToHexActionPerformed(evt);
            }
        });

        lblDecToHex.setFont(new java.awt.Font("Tw Cen MT", 3, 14)); // NOI18N
        lblDecToHex.setForeground(new java.awt.Color(0, 153, 255));
        lblDecToHex.setText("Enter a decimal number:");

        txtHexToDec.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtHexToDec.setText("0");
        txtHexToDec.setToolTipText("");
        txtHexToDec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHexToDecActionPerformed(evt);
            }
        });

        lblHexToDec.setFont(new java.awt.Font("Tw Cen MT", 3, 14)); // NOI18N
        lblHexToDec.setForeground(new java.awt.Color(0, 153, 255));
        lblHexToDec.setText("Enter a hexadecimal number:");

        lblTitle.setFont(new java.awt.Font("Tw Cen MT", 3, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(153, 0, 0));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("---Number Systems---");

        lblDecHexHeading.setFont(new java.awt.Font("Tw Cen MT", 3, 14)); // NOI18N
        lblDecHexHeading.setForeground(new java.awt.Color(0, 0, 0));
        lblDecHexHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDecHexHeading.setText("Decimal and Hexadecimal");

        BtnBinToDec.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        BtnBinToDec.setForeground(new java.awt.Color(255, 51, 51));
        BtnBinToDec.setText("Bin. to Dec.");
        BtnBinToDec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBinToDecActionPerformed(evt);
            }
        });

        BtnHexToDec.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        BtnHexToDec.setForeground(new java.awt.Color(255, 51, 51));
        BtnHexToDec.setText("Hex. to Dec.");
        BtnHexToDec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHexToDecActionPerformed(evt);
            }
        });

        BtnDecToHex.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        BtnDecToHex.setForeground(new java.awt.Color(255, 51, 51));
        BtnDecToHex.setText("Dec. to Hex.");
        BtnDecToHex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDecToHexActionPerformed(evt);
            }
        });

        lblHexToDecValue.setFont(new java.awt.Font("Tw Cen MT", 3, 14)); // NOI18N
        lblHexToDecValue.setForeground(new java.awt.Color(0, 0, 0));
        lblHexToDecValue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHexToDecValue.setText("...");

        lblBinToDecValue.setFont(new java.awt.Font("Tw Cen MT", 3, 14)); // NOI18N
        lblBinToDecValue.setForeground(new java.awt.Color(0, 0, 0));
        lblBinToDecValue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBinToDecValue.setText("...");

        lblDecToHexValue.setFont(new java.awt.Font("Tw Cen MT", 3, 14)); // NOI18N
        lblDecToHexValue.setForeground(new java.awt.Color(0, 0, 0));
        lblDecToHexValue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDecToHexValue.setText("...");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDecBinHeading, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDecHexHeading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BtnDecToHex)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblDecToHex)
                                    .addComponent(lblHexToDec))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtDecToHex, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(txtHexToDec, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblBinToDec)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtBinToDec, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblDecToBin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDecToBin, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BtnDecToBin)
                                    .addComponent(BtnBinToDec)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(BtnHexToDec)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDecToBinValue, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBinToDecValue, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDecToHexValue, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblHexToDecValue, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(16, 16, 16)
                .addComponent(lblDecBinHeading)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDecToBin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDecToBin)
                    .addComponent(BtnDecToBin, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDecToBinValue))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBinToDec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBinToDec)
                    .addComponent(BtnBinToDec, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBinToDecValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(lblDecHexHeading)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDecToHex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDecToHex)
                    .addComponent(BtnDecToHex, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDecToHexValue))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHexToDec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHexToDec)
                    .addComponent(BtnHexToDec, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHexToDecValue))
                .addGap(55, 55, 55))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDecToBinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDecToBinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDecToBinActionPerformed

    /*
    decToBin
    
    This method recieves a decimal number, converts it to a binary number and returns it.
    
    Parameters: int
    
    Return: String
    
     */
    public static String decToBin(int num) {

        // initialize variables and an array to store binary number
        int[] binaryArray = new int[1000];
        String binary = "";
        // count how many indexes there are in the array
        int i = 0;
        /*
        While loop takes the decimal number, finds whether it becomes a 1 or 0 when 
        doing modulus 2, adds it to the binary array, and then divides the decimal number by 2
        because binary has a base of 2
         */
        while (num > 0) {
            // store the remainders in the binary array
            binaryArray[i] = num % 2;
            num = num / 2;
            i = i + 1;
        }
        // add the binary array to a string in reverse order
        for (int j = i - 1; j >= 0; j = j - 1) {
            binary = binary + binaryArray[j];
        }
        // returns the binary string
        return binary;
    }


    private void BtnDecToBinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDecToBinActionPerformed
        // Gets user input, sends to the conversion function, takes the return and outputs it
        int decimal = Integer.parseInt(txtDecToBin.getText());
        String binary = decToBin(decimal);
        lblDecToBinValue.setText(binary);
    }//GEN-LAST:event_BtnDecToBinActionPerformed

    private void txtBinToDecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBinToDecActionPerformed


    }//GEN-LAST:event_txtBinToDecActionPerformed

    private void txtDecToHexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDecToHexActionPerformed


    }//GEN-LAST:event_txtDecToHexActionPerformed

    private void txtHexToDecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHexToDecActionPerformed

    }//GEN-LAST:event_txtHexToDecActionPerformed

    /*
    binToDec
    
    This method recieves a binary number, converts it to a decimal and returns it.
    
    Parameters: String
    
    Return: int
    
     */
    public static int binToDec(String binary) {
        // Intialize variables
        int decimal = 0;
        String revBinary = "";
        // Reverse binary number to make it easier to convert
        for (int i = binary.length() - 1; i >= 0; i = i - 1) {
            revBinary = revBinary + binary.charAt(i);
        }
        // Goes character by character, converting each to a number and then adds it to the total
        for (int i = 0; i < revBinary.length(); i = i + 1) {
            int tempChar = Character.getNumericValue(revBinary.charAt(i));
            decimal = decimal + (tempChar * (int) Math.pow(2, i));
        }
        // returns the decimal number
        return decimal;
    }

    private void BtnBinToDecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBinToDecActionPerformed
        // Gets user input, sends to the conversion function, takes the return and outputs it
        String binary = txtBinToDec.getText();
        int decimal = binToDec(binary);
        lblBinToDecValue.setText(String.valueOf(decimal));
    }//GEN-LAST:event_BtnBinToDecActionPerformed
    /*
    hexToDec
    
    This method recieves a hexadecimal number, converts it to decimal, and returns it.
    
    Parameters: String
    
    Return: int
    
     */
    public static int hexToDec(String hexadecimal) {
        // Initialize variables and hex string with all the characters
        int decimal = 0;
        String hstring = "0123456789ABCDEF";
        // Converts it to uppercase in case it is inputted as lowercase
        hexadecimal = hexadecimal.toUpperCase();
        /*
        Loops for the hexadecimal length. The loop takes each character, finds
        the index of it in the hex string that has all the characters, multiples
        the decimal number by 16 (hexadecimal has base of 16), and adds n 
        (from the string of characters)
         */
        for (int i = 0; i < hexadecimal.length(); i = i + 1) {
            char tempChar = hexadecimal.charAt(i);
            int n = hstring.indexOf(tempChar);
            decimal = 16 * decimal + n;
        }
        // returns the decimal value
        return decimal;
    }

    private void BtnHexToDecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHexToDecActionPerformed
        // Gets user input, sends to the conversion function, takes the return and outputs it
        String hexadecimal = txtHexToDec.getText();
        int decimal = hexToDec(hexadecimal);
        lblHexToDecValue.setText(String.valueOf(decimal));
    }//GEN-LAST:event_BtnHexToDecActionPerformed
    /*
    decToHex
    
    This method recieves a decimal number, converts it to hexadecimal, and returns it.
    
    Parameters: int
    
    Return: String
    
     */
    public static String decToHex(int num) {

        // initialize variables and hex array that holds all the values for hexadecimal
        String hexadecimal = "";
        int remainder;
        char hex[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

        /* 
        While the decimal number entered is still greater than 0, do the 
        number modulus 16 (because of the base 16 in hexadecimal). This
        will give a number between 0 and 15, and then use that number to find
        the position in the hex array. Add that to the hexadecimal string,
        and then divide the number by 16 to find the next value for the string.
         */
        while (num > 0) {
            remainder = num % 16;
            hexadecimal = hex[remainder] + hexadecimal;
            num = num / 16;
        }
        // returns the hexadecimal
        return hexadecimal;
    }
    private void BtnDecToHexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDecToHexActionPerformed
        // Gets user input, sends to the conversion function, takes the return and outputs it
        int decimal = Integer.parseInt(txtDecToHex.getText());
        String hexadecimal = decToHex(decimal);
        lblDecToHexValue.setText(hexadecimal);
    }//GEN-LAST:event_BtnDecToHexActionPerformed

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
    private javax.swing.JButton BtnBinToDec;
    private javax.swing.JButton BtnDecToBin;
    private javax.swing.JButton BtnDecToHex;
    private javax.swing.JButton BtnHexToDec;
    private javax.swing.JLabel lblBinToDec;
    private javax.swing.JLabel lblBinToDecValue;
    private javax.swing.JLabel lblDecBinHeading;
    private javax.swing.JLabel lblDecHexHeading;
    private javax.swing.JLabel lblDecToBin;
    private javax.swing.JLabel lblDecToBinValue;
    private javax.swing.JLabel lblDecToHex;
    private javax.swing.JLabel lblDecToHexValue;
    private javax.swing.JLabel lblHexToDec;
    private javax.swing.JLabel lblHexToDecValue;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtBinToDec;
    private javax.swing.JTextField txtDecToBin;
    private javax.swing.JTextField txtDecToHex;
    private javax.swing.JTextField txtHexToDec;
    // End of variables declaration//GEN-END:variables
}
