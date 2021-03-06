package multisearch;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dadok
 */
public class MultiS extends javax.swing.JFrame {

    /**
     * Creates new form MultiS
     */
    public MultiS() {
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
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextRoot = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextName = new javax.swing.JTextField();
        jButtonSearch = new javax.swing.JButton();
        jButtonClear = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jCheckJpg = new javax.swing.JCheckBox();
        jCheckPng = new javax.swing.JCheckBox();
        jCheckAvi = new javax.swing.JCheckBox();
        jCheckMp3 = new javax.swing.JCheckBox();
        jCheckGif = new javax.swing.JCheckBox();
        jCheckMkv = new javax.swing.JCheckBox();
        jCheckWav = new javax.swing.JCheckBox();
        jCheckMp4 = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextResults = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(54, 33, 89));
        jPanel1.setName("Multimedia Search");

        jPanel3.setBackground(new java.awt.Color(54, 33, 89));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Enter starting directory:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Enter file name:");
        jLabel2.setMaximumSize(new java.awt.Dimension(147, 17));
        jLabel2.setMinimumSize(new java.awt.Dimension(147, 17));
        jLabel2.setPreferredSize(new java.awt.Dimension(147, 17));

        jButtonSearch.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonSearch.setText("Search");
        jButtonSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSearchMouseClicked(evt);
            }
        });

        jButtonClear.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonClear.setText("Clear");
        jButtonClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonClearMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextName)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextRoot)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextRoot, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jButtonSearch)
                .addGap(28, 28, 28)
                .addComponent(jButtonClear)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(110, 89, 222));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Choose file type:");

        jCheckJpg.setBackground(new java.awt.Color(110, 89, 222));
        jCheckJpg.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckJpg.setText(".jpg");

        jCheckPng.setBackground(new java.awt.Color(110, 89, 222));
        jCheckPng.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckPng.setText(".png");

        jCheckAvi.setBackground(new java.awt.Color(110, 89, 222));
        jCheckAvi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckAvi.setText(".avi");

        jCheckMp3.setBackground(new java.awt.Color(110, 89, 222));
        jCheckMp3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckMp3.setText(".mp3");

        jCheckGif.setBackground(new java.awt.Color(110, 89, 222));
        jCheckGif.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckGif.setText(".gif");

        jCheckMkv.setBackground(new java.awt.Color(110, 89, 222));
        jCheckMkv.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckMkv.setText(".mkv");
        jCheckMkv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckMkvActionPerformed(evt);
            }
        });

        jCheckWav.setBackground(new java.awt.Color(110, 89, 222));
        jCheckWav.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckWav.setText(".wav");

        jCheckMp4.setBackground(new java.awt.Color(110, 89, 222));
        jCheckMp4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckMp4.setText(".mp4");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckAvi)
                            .addComponent(jCheckJpg))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckMkv, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCheckPng, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jCheckGif)
                            .addGap(116, 116, 116)
                            .addComponent(jCheckMp4))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jCheckMp3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCheckWav))))
                .addGap(0, 50, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckJpg)
                    .addComponent(jCheckPng))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckAvi)
                    .addComponent(jCheckMkv))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckMp3)
                    .addComponent(jCheckWav))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckGif)
                    .addComponent(jCheckMp4))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jTextResults.setColumns(20);
        jTextResults.setRows(5);
        jScrollPane1.setViewportView(jTextResults);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckMkvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckMkvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckMkvActionPerformed

    private void jButtonSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSearchMouseClicked
        List<String> allResults = new ArrayList<String>();
         if (jCheckJpg.isSelected()){
             try (Stream<Path> walk = Files.walk(Paths.get(jTextRoot.getText()))) {
		List<String> extensionResult = walk.map(x -> x.toString()).filter(f -> f.endsWith(".jpg")).collect(Collectors.toList());    //Filter by extension
                List<String> result = getFileNamesFromListThatContains(extensionResult,jTextName.getText());                                //Filter by file name
                for(String item: result)allResults.add(item);
             }catch (IOException e) {e.printStackTrace();}}
         if (jCheckPng.isSelected()){
             try (Stream<Path> walk = Files.walk(Paths.get(jTextRoot.getText()))) {
		List<String> extensionResult = walk.map(x -> x.toString()).filter(f -> f.endsWith(".png")).collect(Collectors.toList());
                List<String> result = getFileNamesFromListThatContains(extensionResult,jTextName.getText());
                for(String item: result)allResults.add(item);
	} catch (IOException e) {e.printStackTrace();}}
         if (jCheckAvi.isSelected()){
             try (Stream<Path> walk = Files.walk(Paths.get(jTextRoot.getText()))) {
		List<String> extensionResult = walk.map(x -> x.toString()).filter(f -> f.endsWith(".avi")).collect(Collectors.toList());
                List<String> result = getFileNamesFromListThatContains(extensionResult,jTextName.getText());
                for(String item: result)allResults.add(item);
	} catch (IOException e) {e.printStackTrace();}}
         if (jCheckMkv.isSelected()){
             try (Stream<Path> walk = Files.walk(Paths.get(jTextRoot.getText()))) {
		List<String> extensionResult = walk.map(x -> x.toString()).filter(f -> f.endsWith(".mkv")).collect(Collectors.toList());
                List<String> result = getFileNamesFromListThatContains(extensionResult,jTextName.getText());
                for(String item: result)allResults.add(item);
	} catch (IOException e) {e.printStackTrace();}}
         if (jCheckMp3.isSelected()){
             try (Stream<Path> walk = Files.walk(Paths.get(jTextRoot.getText()))) {
		List<String> extensionResult = walk.map(x -> x.toString()).filter(f -> f.endsWith(".mp3")).collect(Collectors.toList());
                List<String> result = getFileNamesFromListThatContains(extensionResult,jTextName.getText());
                for(String item: result)allResults.add(item);
	} catch (IOException e) {e.printStackTrace();}}
         if (jCheckWav.isSelected()){
            try (Stream<Path> walk = Files.walk(Paths.get(jTextRoot.getText()))) {
		List<String> extensionResult = walk.map(x -> x.toString()).filter(f -> f.endsWith(".wav")).collect(Collectors.toList());
                List<String> result = getFileNamesFromListThatContains(extensionResult,jTextName.getText());
                for(String item: result)allResults.add(item);
	} catch (IOException e) {e.printStackTrace();}}
            if (jCheckGif.isSelected()){
            try (Stream<Path> walk = Files.walk(Paths.get(jTextRoot.getText()))) {
		List<String> extensionResult = walk.map(x -> x.toString()).filter(f -> f.endsWith(".gif")).collect(Collectors.toList());
                List<String> result = getFileNamesFromListThatContains(extensionResult,jTextName.getText());
                for(String item: result)allResults.add(item);
	} catch (IOException e) {e.printStackTrace();}}
            if (jCheckMp4.isSelected()){
            try (Stream<Path> walk = Files.walk(Paths.get(jTextRoot.getText()))) {
		List<String> extensionResult = walk.map(x -> x.toString()).filter(f -> f.endsWith(".mp4")).collect(Collectors.toList());
                List<String> result = getFileNamesFromListThatContains(extensionResult,jTextName.getText());
                for(String item: result)allResults.add(item);
	} catch (IOException e) {e.printStackTrace();}
            }
    String displayResult = "";
    for(String resultString :allResults){
        displayResult += resultString + "\n";
    }
    jTextResults.setText(displayResult);
    }//GEN-LAST:event_jButtonSearchMouseClicked

    private void jButtonClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonClearMouseClicked
       jTextResults.setText("");
       jTextName.setText("");
       jTextRoot.setText("");
// TODO add your handling code here:
    }//GEN-LAST:event_jButtonClearMouseClicked

    public List<String> getFileNamesFromListThatContains(List<String> nameStrings,String matchingPart){
        List<String> fileNames = new ArrayList<String>();
        if(nameStrings.size()>0){
            for(String nameString :nameStrings){
                if(nameString.contains(".")){
                    String[] pathParts = nameString.split("\\\\");
                    String onlyNameString = pathParts[pathParts.length-1];                   
                    onlyNameString = onlyNameString.split("\\.")[0];
                    if(onlyNameString.contains(matchingPart))fileNames.add(nameString);
                }
            }
        }
        return fileNames;
    }
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
            java.util.logging.Logger.getLogger(MultiS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MultiS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MultiS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MultiS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MultiS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JCheckBox jCheckAvi;
    private javax.swing.JCheckBox jCheckGif;
    private javax.swing.JCheckBox jCheckJpg;
    private javax.swing.JCheckBox jCheckMkv;
    private javax.swing.JCheckBox jCheckMp3;
    private javax.swing.JCheckBox jCheckMp4;
    private javax.swing.JCheckBox jCheckPng;
    private javax.swing.JCheckBox jCheckWav;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextName;
    private javax.swing.JTextArea jTextResults;
    private javax.swing.JTextField jTextRoot;
    // End of variables declaration//GEN-END:variables
}
