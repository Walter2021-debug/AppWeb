/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazong;

/**
 *
 * @author Usuario
 */
public class Contacto extends javax.swing.JFrame {

    /**
     * Creates new form Contacto
     */
    public Contacto() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Contacto");
        this.etiqueta1.setText("Nombre del desarrollador: ");
        this.etiqueta2.setText("Email: ");
        this.etiqueta3.setText("Teléfono: ");
        this.etiqueta4.setText("Dirección: ");
        this.etiqueta6.setText("Linkedin: ");
        this.etiqueta7.setText("Walter Salmon Pico");
        this.etiqueta8.setText("daw21193@gmail.com");
        this.etiqueta9.setText("640608295");
        this.etiqueta10.setText("Plaza del mercado, nº5 1A, Castro Urdiales 39700 - Cantabria");
        this.etiqueta11.setText("https://www.linkedin.com/in/walter-salmon-pico-852823197/");
        this.boton1.setText("Cancelar");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedor = new javax.swing.JPanel();
        etiqueta1 = new javax.swing.JLabel();
        etiqueta2 = new javax.swing.JLabel();
        etiqueta3 = new javax.swing.JLabel();
        etiqueta4 = new javax.swing.JLabel();
        etiqueta6 = new javax.swing.JLabel();
        etiqueta7 = new javax.swing.JLabel();
        etiqueta8 = new javax.swing.JLabel();
        etiqueta9 = new javax.swing.JLabel();
        etiqueta10 = new javax.swing.JLabel();
        etiqueta11 = new javax.swing.JLabel();
        boton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        etiqueta1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        etiqueta1.setText("jLabel1");

        etiqueta2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        etiqueta2.setText("jLabel2");

        etiqueta3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        etiqueta3.setText("jLabel3");

        etiqueta4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        etiqueta4.setText("jLabel4");

        etiqueta6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        etiqueta6.setText("jLabel6");

        etiqueta7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        etiqueta7.setText("jLabel1");

        etiqueta8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        etiqueta8.setText("jLabel2");

        etiqueta9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        etiqueta9.setText("jLabel3");

        etiqueta10.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        etiqueta10.setText("jLabel4");

        etiqueta11.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        etiqueta11.setText("jLabel6");

        boton1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        boton1.setText("jButton1");
        boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contenedorLayout = new javax.swing.GroupLayout(contenedor);
        contenedor.setLayout(contenedorLayout);
        contenedorLayout.setHorizontalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiqueta1)
                    .addComponent(etiqueta2)
                    .addComponent(etiqueta3)
                    .addComponent(etiqueta4)
                    .addComponent(etiqueta6))
                .addGap(54, 54, 54)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiqueta11)
                    .addComponent(etiqueta10)
                    .addComponent(etiqueta9)
                    .addComponent(etiqueta8)
                    .addComponent(etiqueta7))
                .addContainerGap(360, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(boton1)
                .addGap(222, 222, 222))
        );
        contenedorLayout.setVerticalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiqueta1)
                    .addComponent(etiqueta7))
                .addGap(18, 18, 18)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiqueta2)
                    .addComponent(etiqueta8))
                .addGap(18, 18, 18)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiqueta3)
                    .addComponent(etiqueta9))
                .addGap(18, 18, 18)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiqueta4)
                    .addComponent(etiqueta10))
                .addGap(18, 18, 18)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiqueta6)
                    .addComponent(etiqueta11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(boton1)
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1ActionPerformed
        Menu menu = new Menu();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_boton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Contacto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Contacto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Contacto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Contacto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Contacto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton1;
    private javax.swing.JPanel contenedor;
    private javax.swing.JLabel etiqueta1;
    private javax.swing.JLabel etiqueta10;
    private javax.swing.JLabel etiqueta11;
    private javax.swing.JLabel etiqueta2;
    private javax.swing.JLabel etiqueta3;
    private javax.swing.JLabel etiqueta4;
    private javax.swing.JLabel etiqueta6;
    private javax.swing.JLabel etiqueta7;
    private javax.swing.JLabel etiqueta8;
    private javax.swing.JLabel etiqueta9;
    // End of variables declaration//GEN-END:variables
}
