/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package coba1;

/**
 *
 * @author Acer
 */
public class lthn10 extends javax.swing.JFrame {

    /**
     * Creates new form soal
     */
    public lthn10() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        eData1 = new javax.swing.JTextField();
        eData2 = new javax.swing.JTextField();
        eHasil = new javax.swing.JTextField();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        menPersegiPanjang = new javax.swing.JMenu();
        meltLuasPP = new javax.swing.JMenuItem();
        meltKelilingPP = new javax.swing.JMenuItem();
        menSegitiga = new javax.swing.JMenu();
        meltLuasS = new javax.swing.JMenuItem();
        meltKelilingS = new javax.swing.JMenuItem();
        menLingkaran = new javax.swing.JMenu();
        meltLuasL = new javax.swing.JMenuItem();
        meltKelilingL = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Data 1");

        jLabel2.setText("Data 2");

        jLabel3.setText("Hasil");

        eHasil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eHasilActionPerformed(evt);
            }
        });

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        menPersegiPanjang.setText("PersegiPanjang");

        meltLuasPP.setText("Luas");
        meltLuasPP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meltLuasPPActionPerformed(evt);
            }
        });
        menPersegiPanjang.add(meltLuasPP);

        meltKelilingPP.setText("Keliling");
        meltKelilingPP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meltKelilingPPActionPerformed(evt);
            }
        });
        menPersegiPanjang.add(meltKelilingPP);

        jMenuBar2.add(menPersegiPanjang);

        menSegitiga.setText("Segitiga");

        meltLuasS.setText("Luas");
        meltLuasS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meltLuasSActionPerformed(evt);
            }
        });
        menSegitiga.add(meltLuasS);

        meltKelilingS.setText("Keliling");
        meltKelilingS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meltKelilingSActionPerformed(evt);
            }
        });
        menSegitiga.add(meltKelilingS);

        jMenuBar2.add(menSegitiga);

        menLingkaran.setText("Lingkaran");

        meltLuasL.setText("Luas");
        meltLuasL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meltLuasLActionPerformed(evt);
            }
        });
        menLingkaran.add(meltLuasL);

        meltKelilingL.setText("Keliling");
        meltKelilingL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meltKelilingLActionPerformed(evt);
            }
        });
        menLingkaran.add(meltKelilingL);

        jMenuBar2.add(menLingkaran);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(eData2, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                        .addComponent(eData1))
                    .addComponent(eHasil, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(eData1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(eData2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(eHasil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eHasilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eHasilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eHasilActionPerformed

    private void meltLuasPPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meltLuasPPActionPerformed
        int length = Integer.parseInt(eData1.getText());
        int width = Integer.parseInt(eData2.getText());
        double area = length * width;
        eHasil.setText("Luas Persegi Panjang: " + area);
    }//GEN-LAST:event_meltLuasPPActionPerformed

    private void meltKelilingPPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meltKelilingPPActionPerformed
        int length = Integer.parseInt(eData1.getText());
        int width = Integer.parseInt(eData2.getText());
        double perimeter = 2 * (length + width);
        eHasil.setText("Keliling Persegi Panjang: " + perimeter);
    }//GEN-LAST:event_meltKelilingPPActionPerformed

    private void meltLuasSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meltLuasSActionPerformed
        int base = Integer.parseInt(eData1.getText());
        int height = Integer.parseInt(eData2.getText());
        double area = 0.5 * base * height;
        eHasil.setText("Luas Segitiga: " + area);
    }//GEN-LAST:event_meltLuasSActionPerformed

    private void meltKelilingSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meltKelilingSActionPerformed
        int base = Integer.parseInt(eData1.getText());
        int side = Integer.parseInt(eData2.getText());
        double perimeter = base + 2 * side; // Assuming isosceles triangle for simplicity
        eHasil.setText("Keliling Segitiga: " + perimeter);
    }//GEN-LAST:event_meltKelilingSActionPerformed

    private void meltLuasLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meltLuasLActionPerformed
        int radius = Integer.parseInt(eData1.getText());
        double area = Math.PI * radius * radius;
        eHasil.setText("Luas Lingkaran: " + area);
    }//GEN-LAST:event_meltLuasLActionPerformed

    private void meltKelilingLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meltKelilingLActionPerformed
        int radius = Integer.parseInt(eData1.getText());
        double perimeter = 2 * Math.PI * radius;
        eHasil.setText("Keliling Lingkaran: " + perimeter);
    }//GEN-LAST:event_meltKelilingLActionPerformed

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
            java.util.logging.Logger.getLogger(lthn10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(lthn10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(lthn10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(lthn10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new lthn10().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField eData1;
    private javax.swing.JTextField eData2;
    private javax.swing.JTextField eHasil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem meltKelilingL;
    private javax.swing.JMenuItem meltKelilingPP;
    private javax.swing.JMenuItem meltKelilingS;
    private javax.swing.JMenuItem meltLuasL;
    private javax.swing.JMenuItem meltLuasPP;
    private javax.swing.JMenuItem meltLuasS;
    private javax.swing.JMenu menLingkaran;
    private javax.swing.JMenu menPersegiPanjang;
    private javax.swing.JMenu menSegitiga;
    // End of variables declaration//GEN-END:variables
}
