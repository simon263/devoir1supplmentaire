/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devoir1supplementaire;

import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jacqu
 */
public class frmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form frmPrincipal
     */
    public frmPrincipal() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnNbAnnees = new javax.swing.JButton();
        lblNbSemaines = new javax.swing.JLabel();
        txtNb = new javax.swing.JTextField();
        btnTriangle = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTriangle = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNbBugs = new javax.swing.JTextField();
        txtNbAnnees = new javax.swing.JTextField();
        btnCalculerPrime = new javax.swing.JButton();
        lblPrime = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel1.setText("Exercice n°1");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel2.setText("Exercice n°2");

        btnNbAnnees.setText("Nb années");
        btnNbAnnees.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNbAnneesMouseClicked(evt);
            }
        });

        lblNbSemaines.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNbSemaines.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255), 3));

        txtNb.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnTriangle.setText("Triangle");
        btnTriangle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTriangleMouseClicked(evt);
            }
        });

        tblTriangle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T"
            }
        ));
        jScrollPane2.setViewportView(tblTriangle);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel3.setText("Exercice n°3");

        jLabel4.setText("Nb bugs corrigés");

        jLabel5.setText("Nb années");

        txtNbBugs.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtNbAnnees.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnCalculerPrime.setText("Calculer prime");
        btnCalculerPrime.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCalculerPrimeMouseClicked(evt);
            }
        });

        lblPrime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPrime.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255), 3));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblNbSemaines, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnNbAnnees)))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnCalculerPrime, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNbBugs, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNbAnnees, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(lblPrime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNb, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTriangle, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(btnNbAnnees)
                    .addComponent(txtNb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTriangle))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNbSemaines, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtNbBugs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtNbAnnees, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnCalculerPrime)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblPrime, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNbAnneesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNbAnneesMouseClicked

        // A vous de jouer
        //EXERCICE 1
        double cumul=31000000;
        double i=31000000;
        int nbannée=1;
        while(cumul<=150000000){
             
            i=i*0.8;
            cumul=cumul+i;
            nbannée=nbannée+1;
            
      
            
            
            
        lblNbSemaines.setText(String.valueOf(nbannée));
            
       }        
         
    }//GEN-LAST:event_btnNbAnneesMouseClicked

    private void btnTriangleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTriangleMouseClicked

        // A vous de jouer
          if(txtNb.getText().compareTo("")==0){
                JOptionPane.showMessageDialog(this,"entrer un nombre de bug");
                }
          else{
            DefaultTableModel dtm =new DefaultTableModel();
            dtm =(DefaultTableModel) tblTriangle.getModel();
            Vector v;
       
        
        
            for(int i=1;i<Integer.parseInt(txtNb.getText());i++){
            
        
                for (int j=1;j <Integer.parseInt(txtNb.getText())-i ;j++){
                    v= new Vector();
                    v.add(" ");
                    dtm.addRow(v);
                    int nbligne=1;
        
                    for(int k=1; k<Integer.parseInt(txtNb.getText());k++){
                        v=new Vector();
                        v.add("*");
                        dtm.addRow(v);
                        nbligne=nbligne+2;
                        if(k>1){
                            int e=0;
                            while(e<nbligne-1){
                            
                                v.add("*");
                                dtm.addRow(v);
                                e=e+1;
                                }
                            }
                     
                            
                        } 
                         
                        }
                        }
                        tblTriangle.setModel(dtm);
                        }
        
        
        
        
        
    }//GEN-LAST:event_btnTriangleMouseClicked

    private void btnCalculerPrimeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCalculerPrimeMouseClicked
        
        // A vous de jouer
        //exercice 3
         double primebug;
         int nbanné =300;
         int newanné;
         if(txtNbBugs.getText().compareTo("")==0){
                JOptionPane.showMessageDialog(this,"entrer un nombre de bug");
          }
            else  if(txtNbAnnees.getText().compareTo("")==0){
                JOptionPane.showMessageDialog(this,"entrer un nombre d'années");
                }
        else{ 
                    primebug=Integer.parseInt(txtNbBugs.getText())*0.04;
                    if(primebug>400){
                        primebug=400;
                    }
                    if ((Integer.parseInt(txtNbAnnees.getText())>4)){
                        int i=0;
                        newanné=(Integer.parseInt(txtNbAnnees.getText())-4);
                        while (i <newanné){
                            nbanné=nbanné+30;
                        } 
                    }
                    double total=primebug+nbanné;
                    lblPrime.setText(String.valueOf("Prime:"+" "+total+" "+"euros"));
                    }
                   
                     
                   
         
    }//GEN-LAST:event_btnCalculerPrimeMouseClicked

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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculerPrime;
    private javax.swing.JButton btnNbAnnees;
    private javax.swing.JButton btnTriangle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblNbSemaines;
    private javax.swing.JLabel lblPrime;
    private javax.swing.JTable tblTriangle;
    private javax.swing.JTextField txtNb;
    private javax.swing.JTextField txtNbAnnees;
    private javax.swing.JTextField txtNbBugs;
    // End of variables declaration//GEN-END:variables
}
