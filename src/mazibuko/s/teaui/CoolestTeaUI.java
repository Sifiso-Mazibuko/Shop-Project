//Sifiso Mazibuko 221340540

package mazibuko.s.teaui;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.CharArrayReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import mazibuko.s.coolesttea.Tea;

public class CoolestTeaUI extends javax.swing.JFrame {
    
    JFileChooser openFileChooser;
    JFileChooser saveFileChooser;
    ArrayList<Tea> detailsTea;
    
    public CoolestTeaUI() {
        initComponents();
        
        openFileChooser = new JFileChooser();
        openFileChooser.setFileFilter(new FileNameExtensionFilter("TXT FILES", "txt"));
        
        saveFileChooser = new JFileChooser();
        saveFileChooser.setFileFilter(new FileNameExtensionFilter("TXT FILE", "txt"));
        
        detailsTea = new ArrayList<Tea>();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        companyNameLabel = new javax.swing.JLabel();
        customerNameLabel = new javax.swing.JLabel();
        customerNameTextField = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        emailAddTextField = new javax.swing.JTextField();
        SubscribeCheckBox = new javax.swing.JCheckBox();
        subscribeLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        ReadPriceButton = new javax.swing.JButton();
        blackTeaCB = new javax.swing.JCheckBox();
        greetTeaCB = new javax.swing.JCheckBox();
        oogolongTeaCB = new javax.swing.JCheckBox();
        yelloTeaCB = new javax.swing.JCheckBox();
        puerhTeaCB = new javax.swing.JCheckBox();
        WriteDetailsButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Personal Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel1.setFocusable(false);

        companyNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        companyNameLabel.setText("Coolest Tea Sales");

        customerNameLabel.setText("Customer Name:");

        emailLabel.setText("Customer Email addres:");

        subscribeLabel.setText("Subscribe for giveaways and promo code?");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(companyNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(158, 158, 158))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(customerNameLabel)
                            .addComponent(emailLabel))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(customerNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                            .addComponent(emailAddTextField)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(SubscribeCheckBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(subscribeLabel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(companyNameLabel)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(customerNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customerNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel)
                    .addComponent(emailAddTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SubscribeCheckBox)
                    .addComponent(subscribeLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Shopping Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        textArea.setColumns(20);
        textArea.setRows(5);
        jScrollPane1.setViewportView(textArea);

        ReadPriceButton.setText("Show Price list...");
        ReadPriceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReadPriceButtonActionPerformed(evt);
            }
        });

        blackTeaCB.setText("Black Tea");

        greetTeaCB.setText("Green Tea");

        oogolongTeaCB.setText("Oolong Tea");

        yelloTeaCB.setText("Yellow Tea");

        puerhTeaCB.setText("Pu-erh Tea");
        puerhTeaCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puerhTeaCBActionPerformed(evt);
            }
        });

        WriteDetailsButton.setText("Process...");
        WriteDetailsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WriteDetailsButtonActionPerformed(evt);
            }
        });

        ExitButton.setText("Exit");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Select Tea:");

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\sifiso\\Desktop\\OOP216D AND OOR216D\\Self Study content\\Assignment picture\\background2.jpg")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(ReadPriceButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap(41, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(oogolongTeaCB)
                            .addComponent(greetTeaCB)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(WriteDetailsButton)
                                .addGap(18, 18, 18)
                                .addComponent(ExitButton))
                            .addComponent(puerhTeaCB)
                            .addComponent(yelloTeaCB)
                            .addComponent(blackTeaCB)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(346, 346, 346)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {blackTeaCB, greetTeaCB, oogolongTeaCB, puerhTeaCB, yelloTeaCB});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(ReadPriceButton)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(blackTeaCB, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(greetTeaCB, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(oogolongTeaCB, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(yelloTeaCB, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(puerhTeaCB, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(WriteDetailsButton)
                            .addComponent(ExitButton))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void puerhTeaCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puerhTeaCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_puerhTeaCBActionPerformed

    private void ReadPriceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReadPriceButtonActionPerformed
        //read contents of file
        
        int returnValue = openFileChooser.showOpenDialog(this);
        
        if(returnValue == JFileChooser.APPROVE_OPTION){
        
            try{
            
                File inputFile = openFileChooser.getSelectedFile();
                FileReader inputFileReader = new FileReader(inputFile);
                BufferedReader inputBR = new BufferedReader(inputFileReader);
                
                String line = inputBR.readLine();
                
                textArea.setText("");
                
                while(line != null){
                
                    textArea.append(line+"\n");
                    
                    line = inputBR.readLine();
                }
                
                inputBR.close();
                inputFileReader.close();
                
                JOptionPane.showMessageDialog(null, "File successfully read!");
            }
            catch(IOException e){
            
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        else {
        
            JOptionPane.showMessageDialog(null, "File not chosen successfully!");
        }
        
    }//GEN-LAST:event_ReadPriceButtonActionPerformed

    private void WriteDetailsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WriteDetailsButtonActionPerformed
        //USED TO GET VALUE AND CALL APPROPRICATE METHOD TO WRITE O A FILE
        
        String CustName = customerNameTextField.getText().trim();
        String EmailAddress = emailAddTextField.getText().trim();
        
        char type = ' ';
        double price = 0.0;
        int HowMany = 0;
        
        if(blackTeaCB.isSelected()){
            String message = "How many Black Tea do you want? ";
            HowMany = Integer.parseInt(JOptionPane.showInputDialog(null, message));
            
            price = 20.22;
            
            type = 'B';
        }
        else if(greetTeaCB.isSelected()){
        
            String message = "How many Green Tea do you want? ";
            HowMany = Integer.parseInt(JOptionPane.showInputDialog(null, message));
            
            price = 25.78;
            
            type = 'G';
        }
        else if(oogolongTeaCB.isSelected()){
        
            String message = "How many Oogolong Tea do you want? ";
            HowMany = Integer.parseInt(JOptionPane.showInputDialog(null, message));
            
            price = 30.87;
            
            type = 'O';
        }
        else if(yelloTeaCB.isSelected()){
        
            String message = "How many Yellow Tea do you want? ";
            HowMany = Integer.parseInt(JOptionPane.showInputDialog(null, message));
            
            price = 45.90;
            
            type = 'Y';
        }
        else if(puerhTeaCB.isSelected()){
        
            String message = "How many Pe-erh Tea do you want? ";
            HowMany = Integer.parseInt(JOptionPane.showInputDialog(null, message));
            
            price = 15.50;
            
            type = 'P';
        }
        
        Tea objTea = new Tea(CustName, EmailAddress, type, price, HowMany);
        
        detailsTea.add(objTea);
        
        //SaveTeaDetailsToAFile();
        
        
        int returnValue = saveFileChooser.showSaveDialog(this);
        
        if(returnValue == JFileChooser.APPROVE_OPTION){
        
            try{
            
                File outputFile = saveFileChooser.getSelectedFile();
                PrintWriter outputW = new PrintWriter(outputFile);
                
                for(int x = 0; x< detailsTea.size();x++){
                
                    String want = detailsTea.get(x).getUserName() + "#" + detailsTea.get(x).getEmailAddress()+"#"+
                            detailsTea.get(x).FindTeaDescription() +"#" + detailsTea.get(x).getPriceOfTeaType()
                            +"#" + detailsTea.get(x).getHowManyTea() + "#"+ detailsTea.get(x).getTotal() + "\n";
                    
                    outputW.write(want);
                }
                
                outputW.close();
                
                JOptionPane.showMessageDialog(null, "Successfully written!");
            }
            catch(IOException e){
            
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        else {
        
            JOptionPane.showMessageDialog(null, "File not chosen correctly!");
        }
        
    }//GEN-LAST:event_WriteDetailsButtonActionPerformed
 
    
    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
       
        
        System.exit(0);
    }//GEN-LAST:event_ExitButtonActionPerformed

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
            java.util.logging.Logger.getLogger(CoolestTeaUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CoolestTeaUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CoolestTeaUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CoolestTeaUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CoolestTeaUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExitButton;
    private javax.swing.JButton ReadPriceButton;
    private javax.swing.JCheckBox SubscribeCheckBox;
    private javax.swing.JButton WriteDetailsButton;
    private javax.swing.JCheckBox blackTeaCB;
    private javax.swing.JLabel companyNameLabel;
    private javax.swing.JLabel customerNameLabel;
    private javax.swing.JTextField customerNameTextField;
    private javax.swing.JTextField emailAddTextField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JCheckBox greetTeaCB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBox oogolongTeaCB;
    private javax.swing.JCheckBox puerhTeaCB;
    private javax.swing.JLabel subscribeLabel;
    private javax.swing.JTextArea textArea;
    private javax.swing.JCheckBox yelloTeaCB;
    // End of variables declaration//GEN-END:variables
}
