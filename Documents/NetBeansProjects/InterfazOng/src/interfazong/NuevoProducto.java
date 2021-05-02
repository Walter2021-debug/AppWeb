/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazong;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author Usuario
 */
public class NuevoProducto extends javax.swing.JFrame implements ActionListener {

    /**
     * Creates new form NuevoProducto
     */
    public NuevoProducto() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Usuarios");
        menu = new JMenuBar();
        this.setJMenuBar(menu);
        opcion1 = new JMenu("Opciones");
        menu.add(opcion1);
        elemento1 = new JMenuItem("Perfil");
        elemento1.addActionListener(this);
        opcion1.add(elemento1);
        elemento2 = new JMenuItem("Contacto");
        elemento2.addActionListener(this);
        opcion1.add(elemento2);
        elemento4 = new JMenuItem("Usuarios");
        elemento4.addActionListener(this);
        opcion1.add(elemento4);
        elemento5 = new JMenuItem("Roles");
        elemento5.addActionListener(this);
        opcion1.add(elemento5);
        elemento6 = new JMenuItem("Permisos");
        elemento6.addActionListener(this);
        opcion1.add(elemento6);
        elemento7 = new JMenuItem("Productos");
        elemento7.addActionListener(this);
        opcion1.add(elemento7);
        elemento8 = new JMenuItem("Colaboradores");
        elemento8.addActionListener(this);
        opcion1.add(elemento8);
        elemento9 = new JMenuItem("Categorias");
        elemento9.addActionListener(this);
        opcion1.add(elemento9);
        elemento3 = new JMenuItem("Salir");
        elemento3.addActionListener(this);
        opcion1.add(elemento3);
        etiqueta1.setText("Nombre: ");
        caja1.setText("");
        etiqueta2.setText("Tipo de envase: ");
        caja2.setText("");
        etiqueta3.setText("Fecha de caducidad: ");
        caja3.setText("");
        boton1.setText("");
        etiqueta4.setText("Imagen: ");
        boton2.setText("Seleccionar imagen...");
        etiqueta6.setText("");
        etiqueta5.setText("QR: ");
        boton3.setText("Seleccionar qr...");
        etiqueta7.setText("");
        etiqueta8.setText("Colaborador: ");
        combo1.addItem("Seleccionar colaborador");
        etiqueta9.setText("Categoria: ");
        combo2.addItem("Seleccionar categoria");
        boton4.setText("Crear Producto");
        boton5.setText("Cancelar");
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
        etiqueta5 = new javax.swing.JLabel();
        caja1 = new javax.swing.JTextField();
        caja2 = new javax.swing.JTextField();
        caja3 = new javax.swing.JTextField();
        boton1 = new javax.swing.JButton();
        boton2 = new javax.swing.JButton();
        boton3 = new javax.swing.JButton();
        boton4 = new javax.swing.JButton();
        boton5 = new javax.swing.JButton();
        etiqueta6 = new javax.swing.JLabel();
        etiqueta7 = new javax.swing.JLabel();
        etiqueta8 = new javax.swing.JLabel();
        etiqueta9 = new javax.swing.JLabel();
        combo1 = new javax.swing.JComboBox<>();
        combo2 = new javax.swing.JComboBox<>();
        menu = new javax.swing.JMenuBar();
        opcion1 = new javax.swing.JMenu();
        elemento1 = new javax.swing.JMenuItem();
        elemento2 = new javax.swing.JMenuItem();
        elemento4 = new javax.swing.JMenuItem();
        elemento5 = new javax.swing.JMenuItem();
        elemento6 = new javax.swing.JMenuItem();
        elemento7 = new javax.swing.JMenuItem();
        elemento8 = new javax.swing.JMenuItem();
        elemento9 = new javax.swing.JMenuItem();
        elemento3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        etiqueta1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        etiqueta1.setText("jLabel1");

        etiqueta2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        etiqueta2.setText("jLabel1");

        etiqueta3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        etiqueta3.setText("jLabel1");

        etiqueta4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        etiqueta4.setText("jLabel1");

        etiqueta5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        etiqueta5.setText("jLabel1");

        caja1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        caja1.setText("jTextField1");

        caja2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        caja2.setText("jTextField1");

        caja3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        caja3.setText("jTextField1");

        boton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icon_calendar.png"))); // NOI18N
        boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1ActionPerformed(evt);
            }
        });

        boton2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        boton2.setText("jButton1");
        boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton2ActionPerformed(evt);
            }
        });

        boton3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        boton3.setText("jButton1");
        boton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton3ActionPerformed(evt);
            }
        });

        boton4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        boton4.setText("jButton1");
        boton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton4ActionPerformed(evt);
            }
        });

        boton5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        boton5.setText("jButton1");
        boton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton5ActionPerformed(evt);
            }
        });

        etiqueta6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        etiqueta6.setText("jLabel1");

        etiqueta7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        etiqueta7.setText("jLabel1");

        etiqueta8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        etiqueta8.setText("jLabel1");

        etiqueta9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        etiqueta9.setText("jLabel1");

        combo1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        combo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        combo2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        combo2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout contenedorLayout = new javax.swing.GroupLayout(contenedor);
        contenedor.setLayout(contenedorLayout);
        contenedorLayout.setHorizontalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(etiqueta8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(etiqueta2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(etiqueta3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(etiqueta4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(etiqueta5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(etiqueta1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(etiqueta9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(51, 51, 51)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorLayout.createSequentialGroup()
                        .addComponent(boton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(boton5))
                    .addGroup(contenedorLayout.createSequentialGroup()
                        .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(combo1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(etiqueta6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(caja1)
                            .addComponent(boton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                            .addComponent(boton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(caja3)
                            .addComponent(caja2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiqueta7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(combo2, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(140, 140, 140))
        );
        contenedorLayout.setVerticalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(caja1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiqueta1))
                .addGap(28, 28, 28)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(caja2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiqueta2))
                .addGap(28, 28, 28)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(caja3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiqueta3)
                    .addComponent(boton1))
                .addGap(28, 28, 28)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiqueta4)
                    .addComponent(boton2))
                .addGap(18, 18, 18)
                .addComponent(etiqueta6)
                .addGap(18, 18, 18)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton3)
                    .addComponent(etiqueta5))
                .addGap(18, 18, 18)
                .addComponent(etiqueta7)
                .addGap(39, 39, 39)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiqueta8)
                    .addComponent(combo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiqueta9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton4)
                    .addComponent(boton5))
                .addGap(30, 30, 30))
        );

        menu.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        opcion1.setText("File");

        elemento1.setText("jMenuItem1");
        opcion1.add(elemento1);

        elemento2.setText("jMenuItem1");
        opcion1.add(elemento2);

        elemento4.setText("jMenuItem1");
        opcion1.add(elemento4);

        elemento5.setText("jMenuItem1");
        opcion1.add(elemento5);

        elemento6.setText("jMenuItem1");
        opcion1.add(elemento6);

        elemento7.setText("jMenuItem1");
        opcion1.add(elemento7);

        elemento8.setText("jMenuItem1");
        opcion1.add(elemento8);

        elemento9.setText("jMenuItem1");
        opcion1.add(elemento9);

        elemento3.setText("jMenuItem1");
        opcion1.add(elemento3);

        menu.add(opcion1);

        setJMenuBar(menu);

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
        // TODO add your handling code here:
       /* SELECCION DE LA FECHA Y INTRODUCCION DE LA CADENA EN LA CAJA3, ANTES 
          DE ESO ABRIR UN PANEL CON UNA TABLA PARA SELECCIONAR LA FECHA
        */
    }//GEN-LAST:event_boton1ActionPerformed

    private void boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton2ActionPerformed
        // TODO add your handling code here:
        // SELECCION DE LA IMAGEN DEL PRODUCTO Y MOSTRAR LA RUTA EN LA ETIQUETA6
    }//GEN-LAST:event_boton2ActionPerformed

    private void boton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton3ActionPerformed
        // TODO add your handling code here:
        // SELECCION DE LA IMAGEN DE LA IMAGEN DEL CODIGO QR Y MOSTRAR LA RUTA EN LA ETIQUETA7
    }//GEN-LAST:event_boton3ActionPerformed

    private void boton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton4ActionPerformed
        // TODO add your handling code here:
        // CREACION DEL PRODUCTO, VALIDAR Y ENVIAR LA INFORMACIÓN AL SERVIDOR MEDIANTE SOCKETS
    }//GEN-LAST:event_boton4ActionPerformed

    private void boton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton5ActionPerformed
        Menu menu = new Menu();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_boton5ActionPerformed
    
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
            java.util.logging.Logger.getLogger(NuevoProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NuevoProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NuevoProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NuevoProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NuevoProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton1;
    private javax.swing.JButton boton2;
    private javax.swing.JButton boton3;
    private javax.swing.JButton boton4;
    private javax.swing.JButton boton5;
    private javax.swing.JTextField caja1;
    private javax.swing.JTextField caja2;
    private javax.swing.JTextField caja3;
    private javax.swing.JComboBox<String> combo1;
    private javax.swing.JComboBox<String> combo2;
    private javax.swing.JPanel contenedor;
    private javax.swing.JMenuItem elemento1;
    private javax.swing.JMenuItem elemento2;
    private javax.swing.JMenuItem elemento3;
    private javax.swing.JMenuItem elemento4;
    private javax.swing.JMenuItem elemento5;
    private javax.swing.JMenuItem elemento6;
    private javax.swing.JMenuItem elemento7;
    private javax.swing.JMenuItem elemento8;
    private javax.swing.JMenuItem elemento9;
    private javax.swing.JLabel etiqueta1;
    private javax.swing.JLabel etiqueta2;
    private javax.swing.JLabel etiqueta3;
    private javax.swing.JLabel etiqueta4;
    private javax.swing.JLabel etiqueta5;
    private javax.swing.JLabel etiqueta6;
    private javax.swing.JLabel etiqueta7;
    private javax.swing.JLabel etiqueta8;
    private javax.swing.JLabel etiqueta9;
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenu opcion1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        Perfil perfil = new Perfil();
        Contacto contacto = new Contacto();
        Roles roles = new Roles();
        Permisos permisos = new Permisos();
        Productos productos = new Productos();
        Colaboradores colaboradores = new Colaboradores();
        Categorias categorias = new Categorias();
        Login login = new Login();
        
        if (e.getSource()==elemento1) {
            perfil.setVisible(true);
            this.dispose();
        }
        if (e.getSource()==elemento2) {
            contacto.setVisible(true);
            this.dispose();
        }
        if (e.getSource() == elemento5) {
            roles.setVisible(true);
            this.dispose();
        }
        if (e.getSource() == elemento6) {
            permisos.setVisible(true);
            this.dispose();
        }
        if (e.getSource() == elemento7) {
            productos.setVisible(true);
            this.dispose();
        }
        if (e.getSource() == elemento8) {
            colaboradores.setVisible(true);
            this.dispose();
        }
        if (e.getSource() == elemento9) {
            categorias.setVisible(true);
            this.dispose();
        }
        if (e.getSource()==elemento3) {
            login.setVisible(true);
            this.dispose();
        }
    }
}
