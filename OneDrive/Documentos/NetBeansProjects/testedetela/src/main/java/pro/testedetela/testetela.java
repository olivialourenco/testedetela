package pro.testedetela;
import java.util.Vector;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ograc
 */
public class testetela extends javax.swing.JFrame {
    approd nomeprodp, quantidadep, tipoprodp;
    Vector <String> cp;
    public testetela() {
        initComponents(); 
        nomeprodp = new approd();
        quantidadep = new approd();
        tipoprodp = new approd();
        cp = new Vector<String>();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        quantidade = new javax.swing.JTextField();
        tipoprod = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista = new javax.swing.JList<>();
        save = new javax.swing.JButton();
        nomeprod = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        quantidade.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        getContentPane().add(quantidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 238, 37));

        tipoprod.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        getContentPane().add(tipoprod, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 238, 35));

        lista.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        jScrollPane1.setViewportView(lista);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 210, 305, 253));

        save.setBackground(new java.awt.Color(255, 199, 0));
        save.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 24)); // NOI18N
        save.setForeground(new java.awt.Color(121, 2, 1));
        save.setText("Salvar");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        getContentPane().add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 450, 110, 40));

        nomeprod.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        nomeprod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeprodActionPerformed(evt);
            }
        });
        getContentPane().add(nomeprod, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 238, 40));

        jLabel9.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 199, 0));
        jLabel9.setText("Cadastro de produtos");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 199, 0));
        jLabel3.setText("Quantidade:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        jLabel8.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 199, 0));
        jLabel8.setText("Tipo:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/80.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, 750, 390));

        jLabel11.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 199, 0));
        jLabel11.setText("Produtos cadastrados");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 460, 250, 50));

        jLabel12.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 199, 0));
        jLabel12.setText("Nome:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Design sem nome 21.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1620, 600));

        jLabel13.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 199, 0));
        jLabel13.setText("Nome:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomeprodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeprodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeprodActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
        int valor = JOptionPane.showConfirmDialog(null,"Confirma salvar?", "Opções", JOptionPane.YES_NO_CANCEL_OPTION);
        if (valor==0){
            prod p = new prod();
            p.setNomeprodP(nomeprod.getText());
            p.setQuantidadeP(quantidade.getText());
            p.setTipoprodP(tipoprod.getText());

            // Chama apenas uma vez o método insereproduto
            nomeprodp.insereproduto(p);

            cp.add("Nome do Produto: " + p.getNomeprodP());
            cp.add("Quantidade: " + p.getQuantidadeP());
            cp.add("Tipo de produto: " + p.getTipoprodP());
            cp.add("___________________________________"); // colocra linha de separação entre produtos

            lista.setListData(cp);

        }

    }//GEN-LAST:event_saveActionPerformed

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
            java.util.logging.Logger.getLogger(testetela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(testetela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(testetela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(testetela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new testetela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lista;
    private javax.swing.JTextField nomeprod;
    private javax.swing.JTextField quantidade;
    private javax.swing.JButton save;
    private javax.swing.JTextField tipoprod;
    // End of variables declaration//GEN-END:variables
}
